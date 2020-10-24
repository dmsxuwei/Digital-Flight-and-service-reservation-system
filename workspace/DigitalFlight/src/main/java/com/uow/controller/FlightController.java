package com.uow.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.uow.po.Flight;
import com.uow.service.FlightService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "FlightController", tags = { "flight" })
@RequestMapping("flight")
@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;

	@ApiOperation("flight")
	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	@ResponseBody
	public List<Flight> signin() throws Exception {
		return flightService.selectByExample();
	}

}
