package nik.trade.tradeapp2.data;

import nik.trade.tradeapp2.model.*;
import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.repository.GoodRepisitory;
import nik.trade.tradeapp2.repository.OrderRepository;
import nik.trade.tradeapp2.service.good.impl.CustomerServiceImpl;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class FakeDataSource {
    @Autowired
    GoodServiceImpl goodService;
    @Autowired
    CustomerServiceImpl customerService;

    private List<Good> goods = new ArrayList<>(
                Arrays.asList(
                        new Good("Dishware",20, "","Gala"),
                        new Good("Dishware2",33,"","Faity"),
                        new Good("Dishware3",18,"","MG"),
                        new Good("Dishware4",21,"","Ashan")
        ));

    private List<Customer> customers = new ArrayList<>(
            Arrays.asList(
                new Customer("Roma","Kolovyiska",857,"Lida"),
                    new Customer("Niva","Holovna",691,"Katya")

            ));


    public List<Good> getGoods() {
            return goods;
        }
      //  public List<Order> getOrders(){ return orders; }
    @PostConstruct
    void init(){
            // customerService.createAll(customers);
       //goodService.createAll(goods);

    }

}
