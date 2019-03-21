package nik.trade.tradeapp2.repository;

import nik.trade.tradeapp2.model.Customer;
import nik.trade.tradeapp2.model.Good;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepisitory extends MongoRepository<Customer, String> {


    List<Customer> findByName(String name);
    List<Customer> findByPhone(int phone);
    List<Customer> findByAddres(String addres);
}