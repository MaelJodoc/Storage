package com.example.storage.service;

import com.example.storage.model.Stockroom;
import com.example.storage.repository.StockroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockroomServiceImpl {
    private final StockroomRepository repository;

    @Autowired
    public StockroomServiceImpl(StockroomRepository repository) {
        this.repository = repository;
    }

    public Stockroom save(Stockroom stockroom) {
        return repository.save(stockroom);
    }
}
