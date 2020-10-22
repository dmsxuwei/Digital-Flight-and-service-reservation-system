package com.uow.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @param request
 * @return
 * @throws Exception
 */
@Api(value = "BasedataController", tags = { "" })
@RequestMapping("basedata")
@RestController
public class BasedataController {

	@ApiOperation("")
	@RequestMapping(value="/getBoolean", method = RequestMethod.POST)
	@ResponseBody
	public String getBoolean(HttpServletRequest request) throws Exception {
		String json="["
				+ "{\"id\":\"0\",\"text\":\"False\"},"
				+ "{\"id\":\"1\",\"text\":\"True\"}"
				+ "]";
		return json;
	}
	
}

