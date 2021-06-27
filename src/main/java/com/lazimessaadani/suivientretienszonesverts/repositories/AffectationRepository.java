package com.lazimessaadani.suivientretienszonesverts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazimessaadani.suivientretienszonesverts.entities.Affectation;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AffectationRepository extends JpaRepository<Affectation, Long> {

}
