package com.example.storage.repository;

import com.example.storage.model.Stockroom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StockroomRepository extends CrudRepository<Stockroom, Integer> {
    @Query("SELECT s FROM Stockroom s JOIN FETCH s.racks WHERE s.id=rack.id")
    Iterable<Stockroom> findAllWithRacks();
}
