package org.westos.ph.controller.shoppingcontroller.llcontroller;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.westos.ph.bean.shoppingbean.llbean.WareHouse;
import org.westos.ph.service.shoppingservice.llservice.WareHouseService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/llhtml")

public class WareHouseController {

    @Autowired
    private WareHouseService wareHouseService;

    @RequestMapping("/wareHouseList")
    @ResponseBody
    public List<WareHouse> wareHouseList() {
        return wareHouseService.listAllWareHouse();
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<WareHouse> search(HttpServletRequest request) {
        String classes = request.getParameter("classes");
        System.out.println(classes);
        //输入的为空
        if (StringUtils.equals("", classes) || classes == null) {
            return wareHouseList();
        }
        return wareHouseService.search(classes);
    }

//    @RequestMapping("/paygood.do")
//    @ResponseBody
//    public

}
