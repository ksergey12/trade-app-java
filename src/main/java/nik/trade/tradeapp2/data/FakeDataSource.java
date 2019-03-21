package nik.trade.tradeapp2.data;

import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.model.Good;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class FakeDataSource {

        private List<Good> goods = new ArrayList<>(
                Arrays.asList(
                        new Good("1","Dishware",20,"Nove posta","Gala"),
                        new Good("2","Dishware2",33,"Nove posta","Faity"),
                        new Good("3","Dishware3",18,"Ukrposta","MG"),
                        new Good("4","Dishware4",21,"Nove posta","Ashan")
        ));

        public List<Good> getGoods() {
            return goods;
        }
}
