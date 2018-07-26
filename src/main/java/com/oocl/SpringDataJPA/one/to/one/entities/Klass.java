package com.oocl.SpringDataJPA.one.to.one.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "klass")
public class Klass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String klassname;

    @JsonIgnore
    @OneToOne(mappedBy = "klass",cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
    private Leader leader;

    public Klass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKlassname() {
        return klassname;
    }

    public void setKlassname(String klassname) {
        this.klassname = klassname;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public Klass(String klassname, Leader leader) {
        this.klassname = klassname;
        this.leader = leader;
    }

}
