package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "manufacturer")
public class Manufacturer extends AbstractPersistable<Integer> {
    @Column(name = "name", length = 100, unique = true, nullable = false)
    private String name;
    @Column(name = "site", length = 200)
    private String site;
    @OneToMany(mappedBy = "manufacturer")
    private List<Item> items;
}
