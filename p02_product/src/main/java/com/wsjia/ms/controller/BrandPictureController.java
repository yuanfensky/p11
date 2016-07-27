package com.wsjia.ms.controller;

import com.wsjia.ms.base.service.BaseManager;
import com.wsjia.ms.model.BrandPicture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pc on 2016/7/25.
 */
@RestController
@RequestMapping("/brandPicture")
public class BrandPictureController {

    @Autowired
    private BaseManager baseManager;

    @RequestMapping("/findById/{id}")
    private BrandPicture finBrandById(@PathVariable("id") String id){
        return (BrandPicture)baseManager.getObject(BrandPicture.class.getName(),id);
    }
}
