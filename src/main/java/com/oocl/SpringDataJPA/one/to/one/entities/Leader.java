package com.oocl.SpringDataJPA.one.to.one.entities;

import javax.persistence.*;

@Entity
@Table(name = "leader")
public class Leader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "klass_id")
    private Klass klass;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Leader(String name, Klass klass) {
        this.name = name;
        this.klass = klass;
    }

    public Leader() {
    }
}
