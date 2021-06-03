package com.lazimessaadani.suivientretienszonesverts.repositories;

import com.lazimessaadani.suivientretienszonesverts.entities.ZoneVert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ZoneVertRepository extends JpaRepository<ZoneVert, Long> {
}
