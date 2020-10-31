package com.uow.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uow.dao.CustomerMapper;
import com.uow.po.Customer;
import com.uow.po.CustomerExample;
import com.uow.po.CustomerExample.Criteria;

@Service
public class CustomerService {
	
	

	@Autowired
	private CustomerMapper customerMapper;
	
	
	public Customer selectCustomerByUsername(String username) {
		
		CustomerExample example=new CustomerExample();
		Criteria criteria=example.createCriteria();	
		criteria.andUsernameEqualTo(username);
		List<Customer> customers= customerMapper.selectByExample(example);
		if(customers.size()!=1) {
			return null;
		}else {
			return customers.get(0);
		}
	}

	public Customer selectCustomerByPasswordAndUsername(String username,String password) {
		
		CustomerExample example=new CustomerExample();
		Criteria criteria=example.createCriteria();	
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<Customer> customers= customerMapper.selectByExample(example);
		if(customers.size()!=1) {
			return null;
		}else {
			return customers.get(0);
		}
	}
	
	public int insert(Customer record) {
		return customerMapper.insert(record);
	}

	public Customer selectByPrimaryKey(String customerid) {
		return customerMapper.selectByPrimaryKey(customerid);
	}

	public List<Customer> selectByExample() {
		return customerMapper.selectByExample(null);
	}

}
