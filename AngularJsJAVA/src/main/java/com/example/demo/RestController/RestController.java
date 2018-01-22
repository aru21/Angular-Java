package com.example.demo.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.Pojo.Customer;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	List<Customer> cust = new ArrayList<Customer>();
	
	@RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
	public List<Customer> getResource(){
		System.out.println("inside getAll");
			return cust;
	}
	
	@RequestMapping(value="/postcustomer", method=RequestMethod.POST)
	public String postCustomer(@RequestBody Customer customer){
		cust.add(customer);
		
		return "Sucessful!";
	}
}