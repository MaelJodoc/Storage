package com.example.storage.repository.datajpa;

import com.example.storage.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Смена on 23.06.2018.
 */
public interface CrudItemRepository extends JpaRepository<Item, Long> {

}
