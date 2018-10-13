package org.westos.ph.service.shoppingservice.llservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.westos.ph.bean.shoppingbean.llbean.WareHouse;
import org.westos.ph.dao.shoppingdao.lldao.WareHouseDao;

import java.util.List;

@Service
public class WareHouseServiceImpl implements WareHouseService{

    @Autowired
    private WareHouseDao wareHouseDao;

    @Override
    public List<WareHouse> listAllWareHouse() {
        return wareHouseDao.listAllWareHouse();
    }

    @Override
    public List<WareHouse> search(String classes) {
        return wareHouseDao.search(classes);
    }
}
