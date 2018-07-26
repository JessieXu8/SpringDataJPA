package com.oocl.SpringDataJPA.one.to.one.repositories;

import com.oocl.SpringDataJPA.one.to.one.entities.Leader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepository extends JpaRepository<Leader,Long> {
}
