package com.xiaopengwei.entity;

import javax.persistence.*;

@Entity
@Table(name = "e_shop")
public class EShop {
    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
