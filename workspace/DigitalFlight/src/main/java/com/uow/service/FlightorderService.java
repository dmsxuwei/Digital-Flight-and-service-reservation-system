package com.uow.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uow.dao.FlightMapper;
import com.uow.dao.FlightorderMapper;
import com.uow.po.Flight;
import com.uow.po.Flightorder;
import com.uow.po.FlightorderExample;

@Service
public class FlightorderService {

	@Autowired
	private FlightorderMapper flightorderMapper;

	@Autowired
	private FlightMapper flightMapper;

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

	public List<Map<String, Object>> selectByCustomerid(String customerid) {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		FlightorderExample example = new FlightorderExample();
		example.createCriteria().andCustomeridEqualTo(customerid);
		List<Flightorder> list = flightorderMapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			Flightorder flightorder = list.get(i);
			Map map = new HashMap<String, String>();
			map.put("flightorderid", flightorder.getFlightOrder());
			Flight flight = flightMapper.selectByPrimaryKey(flightorder.getFlightid());
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
			map.put("departure", flight.getDepartureCity() + "/" + sdf.format(flight.getDepartureTime()));
			map.put("arrival", flight.getArrivalCity() + "/" + sdf.format(flight.getArrivalTime()));
			map.put("airfare", flight.getAirFare());
			map.put("airline", flight.getAirline());
			result.add(map);

		}
		return result;
	}

	public int deleteByPrimaryKey(String flightOrder) {
		return flightorderMapper.deleteByPrimaryKey(flightOrder);
	}

}
