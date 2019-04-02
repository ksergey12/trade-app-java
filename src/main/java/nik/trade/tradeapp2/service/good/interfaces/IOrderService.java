package nik.trade.tradeapp2.service.good.interfaces;

import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.model.Order;

import java.util.List;

public interface IOrderService {
    Order create(Order order);
    Order get(String id);
    Order update(Order order);
    void delete(String id);
    List<Order> getAll();
}
