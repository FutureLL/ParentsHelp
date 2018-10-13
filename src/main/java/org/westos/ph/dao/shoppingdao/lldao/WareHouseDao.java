package org.westos.ph.dao.shoppingdao.lldao;

import org.westos.ph.bean.shoppingbean.llbean.WareHouse;

import java.util.List;
//定义MyBatis映射文件
public interface WareHouseDao {
    //商品展示
    List<WareHouse> listAllWareHouse();

    //用于搜索商品
    List<WareHouse> search(String classes);

    //用于支付

}
