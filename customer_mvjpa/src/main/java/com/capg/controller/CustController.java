package com.capg.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.capg.entities.Customer;
import com.capg.service.ICustomerService;

@Controller
public class CustController {
    private static Logger Log= LoggerFactory.getLogger(CustController.class);

    @Autowired
    private ICustomerService customerService;


    @GetMapping("/hi")
  public ModelAndView sayHi() {
        Log.info("inside hello");
        return new ModelAndView("hellopage",  "message", "Welcome Customer");
    }

    @GetMapping("/find")
    public ModelAndView findPage() {
        return new ModelAndView("findcustomer");
    }


    @GetMapping("/processfindcust")
    public ModelAndView customerDetails(@RequestParam("cusid" )int custId) {
        Customer customer=customerService.findById(custId);
        return new ModelAndView("customerdetails", "customer", customer);
    }
    
    
    
    
    
    @GetMapping("/update")
    public ModelAndView updatePage() {
        return new ModelAndView("update");
    }
    
    @GetMapping("/processupdate")
    public ModelAndView updateCustomer(@RequestParam("cusid") int custId, @RequestParam("cusname") String custName) {
        Customer customer=new Customer();
        
	    customer.setCustId(custId);
        customer.setCustName(custName);
        customer=customerService.updateCustomer(customer);
        return new ModelAndView("customerdetails",  "customer", customer);
    }   

    @GetMapping("/register")
    public ModelAndView registerPage() {
        return new ModelAndView("customerregistration");
    }

    @GetMapping("/processregister")
    public ModelAndView registerCustomer(@RequestParam("cusname") String custName) {
        Customer customer=new Customer();
        customer.setCustName(custName);
        customer=customerService.register(customer);
        return new ModelAndView("customerdetails","customer", customer);
    }
    
    
   

}
