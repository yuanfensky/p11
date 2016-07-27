package com.wsjia.ms.controller;

import com.wsjia.ms.base.service.BaseManager;
import com.wsjia.ms.model.ProductPicture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by pc on 2016/7/25.
 */
@RestController
@RequestMapping("/productPicture")
public class ProductPictureController {

    @Autowired
    private BaseManager baseManager;

    @RequestMapping("/findById/{id}")
    public ProductPicture findById(@PathVariable("id") String id){
        return (ProductPicture)baseManager.getObject(ProductPicture.class.getName(),id);
    }

}
