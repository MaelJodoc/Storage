package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type")
public class Type extends AbstractPersistable<Integer> {
    @Column(name = "name", length = 100)
    private String name;
    @OneToMany(mappedBy = "type")
    private List<Item> items;
}
