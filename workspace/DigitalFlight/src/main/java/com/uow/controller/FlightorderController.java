package com.uow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uow.po.Flightorder;
import com.uow.service.FlightorderService;
import com.uow.util.MapCache;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "FlightorderController", tags = { "flightorder" })
@RequestMapping("flightorder")
@RestController
public class FlightorderController {

	@Autowired
	private FlightorderService flightorderService;

	@ApiOperation("order")
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	@ResponseBody
	public int order(@RequestParam(name = "secretid", required = true) String secretid,
			@RequestParam(name = "flightid", required = true) String flightid) throws Exception {
		String customerid = (String) MapCache.get(secretid);
		if (customerid == null || "".equals(customerid)) {
			return 0;
		} else {
			flightorderService.order(flightid, customerid);
			return 1;
		}
	}

	@ApiOperation("myorder")
	@RequestMapping(value = "/myorder", method = RequestMethod.POST)
	@ResponseBody
	public List<Flightorder> myorder(@RequestParam(name = "secretid", required = true) String secretid) throws Exception {
		String customerid = (String) MapCache.get(secretid);
		if (customerid == null || "".equals(customerid)) {
			return null;
		} else {
			return flightorderService.selectByCustomerid(customerid);
		}
	}

	@ApiOperation("delorder")
	@RequestMapping(value = "/delorder", method = RequestMethod.POST)
	@ResponseBody
	public int delorder(@RequestParam(name = "secretid", required = true) String secretid,
			@RequestParam(name = "flightOrder", required = true) String flightorderid) throws Exception {
		String customerid = (String) MapCache.get(secretid);
		if (customerid == null || "".equals(customerid)) {
			return 0;
		} else {
			flightorderService.deleteByPrimaryKey(flightorderid);
			return 1;
		}
	}

}
