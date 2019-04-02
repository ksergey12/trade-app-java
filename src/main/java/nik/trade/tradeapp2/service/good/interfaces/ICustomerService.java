package nik.trade.tradeapp2.service.good.interfaces;

import nik.trade.tradeapp2.model.Customer;
import nik.trade.tradeapp2.model.Good;

import java.util.List;

public interface ICustomerService {
    Customer create(Customer customer);
    Customer get(String id);
    Customer update(Customer customer);
    void delete(String id);
    List<Customer> getAll();
}
