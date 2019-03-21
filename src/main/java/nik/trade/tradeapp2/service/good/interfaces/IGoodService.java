package nik.trade.tradeapp2.service.good.interfaces;

import nik.trade.tradeapp2.model.Good;

import java.util.List;

public interface IGoodService  {
    Good create(Good good);
    Good get(String id);
    Good update(Good good);
    void delete(String id);
    List<Good> getAll();
}
