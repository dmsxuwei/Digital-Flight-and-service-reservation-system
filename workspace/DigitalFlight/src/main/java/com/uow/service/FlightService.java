package com.uow.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uow.dao.FlightMapper;
import com.uow.po.Flight;

@Service
public class FlightService {

	@Autowired
	private FlightMapper FlightMapper;

	public int insert(Flight record) {
		return FlightMapper.insert(record);
	}

	public Flight selectByPrimaryKey(String Flightid) {
		return FlightMapper.selectByPrimaryKey(Flightid);
	}

	public List<Flight> selectByExample() {
		return FlightMapper.selectByExample(null);
	}

}
