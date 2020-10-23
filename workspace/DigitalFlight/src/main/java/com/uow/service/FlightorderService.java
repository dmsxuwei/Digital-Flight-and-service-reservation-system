package com.uow.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uow.dao.FlightorderMapper;
import com.uow.po.Flightorder;


@Service
public class FlightorderService {

	@Autowired
	private FlightorderMapper flightorderMapper;

	public int insert(Flightorder record) {
		return flightorderMapper.insert(record);
	}

	public Flightorder selectByPrimaryKey(String flightorderid) {
		return flightorderMapper.selectByPrimaryKey(flightorderid);
	}

	public List<Flightorder> selectByExample() {
		return flightorderMapper.selectByExample(null);
	}

}
