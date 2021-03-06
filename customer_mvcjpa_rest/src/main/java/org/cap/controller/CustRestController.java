package org.cap.controller;

import java.util.List;

import org.cap.dto.CustomerDto;

import org.cap.entities.Customer;

import org.cap.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustRestController {
	
	
	@Autowired
	private ICustomerService custService;
	
	@GetMapping("/customers/find/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") int custId) {
        Customer customer = custService.fetchById(custId);
        if(customer==null){
            ResponseEntity<Customer> response= new ResponseEntity<>(HttpStatus.NOT_FOUND);
           return response;
        }
        ResponseEntity<Customer> response = new ResponseEntity<>(customer, HttpStatus.OK);
        return response;
    }
	
	
	@PostMapping("/customers/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDto dto) {
        Customer customer = convert(dto);
        customer = custService.add(customer);
        ResponseEntity<Customer> response = new ResponseEntity<>(customer, HttpStatus.OK);
        return response;
    }

    Customer convert(CustomerDto dto) {
       Customer customer=new Customer();
       customer.setCustName(dto.getCustName());
        return customer;
    }
    
    
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> fetchAll() {
 List<Customer> customers=custService.fetchAll();
        ResponseEntity<List<Customer>> response = new ResponseEntity<>(customers, HttpStatus.OK);
        return response;
    }
    
    
    
    @PutMapping("/customers/update/{id}")
    public ResponseEntity<Customer>updateCustomer(@RequestBody CustomerDto dto ,@PathVariable("id") int custId){
       Customer customer = convert(dto);
       customer.setCustId(custId);
        customer = custService.update(customer);
        ResponseEntity<Customer> response = new ResponseEntity<>(customer, HttpStatus.OK);
        return response;
    }


    @DeleteMapping("/customers/delete/{id}")
    public ResponseEntity<String> deleteCustomers(@PathVariable("id") int custId){
       String result= custService.delete(custId);
       ResponseEntity<String> response=new ResponseEntity<>(result, HttpStatus.OK);
       return response;
    }

   

    

}
