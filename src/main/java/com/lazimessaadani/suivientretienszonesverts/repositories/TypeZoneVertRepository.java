package com.lazimessaadani.suivientretienszonesverts.repositories;

import com.lazimessaadani.suivientretienszonesverts.entities.TypeZoneVert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface TypeZoneVertRepository extends JpaRepository<TypeZoneVert, Long> {
}
