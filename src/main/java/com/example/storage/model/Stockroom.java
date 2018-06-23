package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Смена on 23.06.2018.
 */
@Entity
@Table(name = "stockroom")
public class Stockroom extends AbstractPersistable<Long> {
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "stockroom")
    private List<Rack> racks;
}
