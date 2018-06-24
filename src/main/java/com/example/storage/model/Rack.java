package com.example.storage.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Смена on 23.06.2018.
 */
@Entity(name = "rack")
public class Rack extends AbstractPersistable<Integer> {
    @Column(name = "name", length = 30)
    private String name;

    @OneToMany(mappedBy = "rack")
    private List<RackAssociation> rackAssociations;

    @ManyToOne
    @JoinColumn(name = "stockroom_id")
    private Stockroom stockroom;
}
