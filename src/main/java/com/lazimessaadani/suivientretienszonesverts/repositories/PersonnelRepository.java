package com.lazimessaadani.suivientretienszonesverts.repositories;

import com.lazimessaadani.suivientretienszonesverts.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
