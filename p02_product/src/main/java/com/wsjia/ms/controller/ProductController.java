package com.wsjia.ms.controller;

import com.wsjia.ms.base.service.BaseManager;
import com.wsjia.ms.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pc on 2016/7/25.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

        @Autowired
        private BaseManager baseManager;

        @RequestMapping("/findById/{id}")
        public Product findById(@PathVariable("id") String id){
            return (Product)baseManager.getObject(Product.class.getName(),id);
        }

}
