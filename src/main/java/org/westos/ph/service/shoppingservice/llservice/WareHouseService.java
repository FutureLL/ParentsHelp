package org.westos.ph.service.shoppingservice.llservice;

import org.springframework.stereotype.Service;
import org.westos.ph.bean.shoppingbean.llbean.WareHouse;

import java.util.List;

@Service
public interface WareHouseService {

    //用来展示物品信息
    List<WareHouse> listAllWareHouse();

    //用于搜索商品
    List<WareHouse> search(String classes);
}
