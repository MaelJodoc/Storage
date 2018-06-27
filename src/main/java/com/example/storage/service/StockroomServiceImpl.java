package com.example.storage.service;

import com.example.storage.model.Stockroom;
import com.example.storage.repository.StockroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

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

    public Iterable<Stockroom> findAllWithoutRacks() {
        Iterable<Stockroom> stockrooms = repository.findAll();
        stockrooms.forEach(stockroom -> stockroom.setRacks(new ArrayList<>()));
        return stockrooms;
    }


    @Deprecated
    @Transactional
    public Iterable<Stockroom> findAllWithRacksDeprecated() {
        Iterable<Stockroom> stockrooms = repository.findAll();
        stockrooms.forEach(stockroom -> stockroom.getRacks().iterator());
        return stockrooms;
    }

    public Iterable<Stockroom> findAllWithRacks() {
        return repository.findAllWithRacks();
    }


}
