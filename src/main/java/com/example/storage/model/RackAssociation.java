package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by Смена on 23.06.2018.
 */
@Entity
@Table(name = "rack_item")
public class RackAssociation extends AbstractPersistable<Long> {
    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "rack_id")
    private Rack rack;

}

