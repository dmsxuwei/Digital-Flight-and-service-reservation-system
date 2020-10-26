package com.uow.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.uow.dao.FlightorderMapper;
import com.uow.po.Flightorder;
import com.uow.po.FlightorderExample;

@Service
public class FlightorderService {

	@Autowired
	private FlightorderMapper flightorderMapper;

	@Transactional
	public void order(String flightid, String customerid) {
		Flightorder flightorder = new Flightorder();
		flightorder.setFlightOrder(UUID.randomUUID().toString().replace("-", ""));
		flightorder.setFlightid(flightid);
		flightorder.setCustomerid(customerid);
		flightorderMapper.insert(flightorder);
	}

	public int insert(Flightorder record) {
		return flightorderMapper.insert(record);
	}

	public Flightorder selectByPrimaryKey(String flightorderid) {
		return flightorderMapper.selectByPrimaryKey(flightorderid);
	}

	public List<Flightorder> selectByCustomerid(String customerid) {
		FlightorderExample example = new FlightorderExample();
		example.createCriteria().andCustomeridEqualTo(customerid);
		return flightorderMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String flightOrder) {
		return flightorderMapper.deleteByPrimaryKey(flightOrder);
	}

}
