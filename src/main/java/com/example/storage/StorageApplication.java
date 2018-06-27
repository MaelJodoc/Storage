package com.example.storage;


import com.example.storage.model.Stockroom;
import com.example.storage.service.StockroomServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class StorageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StorageApplication.class, args);
        StockroomServiceImpl bean = context.getBean(StockroomServiceImpl.class);
        /*Stockroom stockroom = bean.save(new Stockroom("64", "new", new ArrayList<>()));
        bean.save(new Stockroom("64", "new", new ArrayList<>()));
        bean.save(new Stockroom("64", "new", new ArrayList<>()));
        bean.save(new Stockroom("64", "new", new ArrayList<>()));*/
        System.out.println(bean.findAllWithRacks());

    }
}
