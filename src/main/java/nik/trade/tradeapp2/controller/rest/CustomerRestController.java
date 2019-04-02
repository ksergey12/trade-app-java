package nik.trade.tradeapp2.controller.rest;

import nik.trade.tradeapp2.model.Customer;
import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.service.good.impl.CustomerServiceImpl;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping("/api/customer/list")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

}
