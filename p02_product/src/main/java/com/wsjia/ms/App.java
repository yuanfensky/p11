package com.wsjia.ms;

import com.wsjia.ms.dao.BrandDao;
import com.wsjia.ms.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2016/7/25.
 */
@SpringBootApplication
/*@Import(WebConfig.class)*/
public class App {


    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
