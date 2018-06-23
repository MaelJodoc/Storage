package com.example.storage.repository.datajpa;

import com.example.storage.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Смена on 23.06.2018.
 */
public class DataJpaItemRepositoryImpl implements ItemRepository {
    @Autowired
    CrudItemRepository crudItemRepository;
}
