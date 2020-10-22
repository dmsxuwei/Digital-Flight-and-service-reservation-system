package com.uow.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@ApiOperation("")
	@RequestMapping(value = "/getCustomer", method = RequestMethod.POST)
	@ResponseBody
	public List<Customer> getCustomer(HttpServletRequest request) throws Exception {
		return customerService.selectByExample();
	}

}
