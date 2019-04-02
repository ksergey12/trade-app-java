package nik.trade.tradeapp2.repository;

import nik.trade.tradeapp2.model.Customer;
import nik.trade.tradeapp2.model.Good;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepisitory extends MongoRepository<Customer, String> {
    List<Customer> findByName(String name);
    List<Customer> findByAddres(String addres);
    List<Customer> findByPhone(int phone);
}
