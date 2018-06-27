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
public class Stockroom extends AbstractPersistable<Integer> {
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "stockroom")
    private List<Rack> racks;

    public Stockroom(String name, String description, List<Rack> racks) {
        this.name = name;
        this.description = description;
        this.racks = racks;
    }

    public Stockroom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Rack> getRacks() {
        return racks;
    }

    public void setRacks(List<Rack> racks) {
        this.racks = racks;
    }

    @Override
    public String toString() {
        return "Stockroom{" +
                "id="+getId()+
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", racks=" + racks +
                '}';
    }
}
