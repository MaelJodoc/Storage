package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Смена on 23.06.2018.
 */
@Entity
@Table(name = "item")
public class Item extends AbstractPersistable<Long> {
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "manufacturer", length = 50)
    private String manufacturer;
    @Column(name = "custom_code", length = 50)
    private String customCode;
    @Column(name = "mmk_code", length = 50)
    private String mmkCode;
    @Column(name = "unit", length = 20)
    private String unit;
    @Column(name = "quantity_per_unit")
    private int quantityPerUnit;
    @Column(name = "min_units")
    private int minUnits;
    @Column(name = "medium_units")
    private int mediumUnits;
    @Column(name = "many_units")
    private int manyUnits;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "item")
    private List<RackAssociation> rackAssociations;

}
