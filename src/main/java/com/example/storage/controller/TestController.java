package com.example.storage.controller;

import com.example.storage.model.Stockroom;
import com.example.storage.service.StockroomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class TestController {
    @Autowired
    private StockroomServiceImpl stockroomService;
}
