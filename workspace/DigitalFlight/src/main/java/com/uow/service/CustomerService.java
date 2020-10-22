package com.uow.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uow.dao.CustomerMapper;
import com.uow.po.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	
	public List<Customer> selectByExample(){
		return customerMapper.selectByExample(null);
	}

}
