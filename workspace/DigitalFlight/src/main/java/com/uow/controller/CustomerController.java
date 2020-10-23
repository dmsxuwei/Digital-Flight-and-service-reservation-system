package com.uow.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uow.po.Customer;
import com.uow.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "CustomerController", tags = { "customer" })
@RequestMapping("customer")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@ApiOperation("signin")
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	@ResponseBody
	public int signin(@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "password", required = true) String password) throws Exception {
		Customer customer = new Customer();
		customer.setCustomerid(UUID.randomUUID().toString().replace("-", ""));
		customer.setUsername(username);
		customer.setPassword(password);
		return customerService.insert(customer);
	}

	@ApiOperation("login")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "password", required = true) String password) throws Exception {

		Customer customer = customerService.selectCustomerByPasswordAndUsername(username, password);
		if (customer != null) {
			return UUID.randomUUID().toString().replace("-", "");
		}
		return "";

	}

}
