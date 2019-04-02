package nik.trade.tradeapp2.controller.rest;

import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodRestController {
    @Autowired
    GoodServiceImpl goodService;

    @RequestMapping("/api/good/list")
    public List<Good> getAll(){
        return goodService.getAll();
    }





}
