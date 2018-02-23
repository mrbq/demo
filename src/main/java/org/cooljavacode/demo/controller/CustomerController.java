package org.cooljavacode.demo.controller;

import org.cooljavacode.demo.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController(value = "/customers")
public class CustomerController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getCustomers()  {

        Customer customer = new Customer();

        customer.setFirstName("firstName");
        customer.setLastName("lastName");

        return new ResponseEntity<>(Arrays.asList(customer), HttpStatus.OK);
    }


}
