package com.wsjia.ms.controller;

import com.wsjia.ms.base.service.BaseManager;
import com.wsjia.ms.model.Brand;
import org.eclipse.jetty.plus.jndi.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by pc on 2016/7/25.
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BaseManager baseManager;

    @RequestMapping("/findById/{id}")
    public Brand finBrandById(@PathVariable("id") String id){
        return  (Brand)baseManager.getObject(Brand.class.getName(),id);
    }

    @RequestMapping("/findAll/{serial}")
    public List findAll(@PathVariable("serial") String serial){
        LinkedHashMap<String,Object>  map = new LinkedHashMap<>();
        map.put("serial",serial);
        return baseManager.listObject("select brand from Brand brand where brand.serial=:serial",map);
    }

}
