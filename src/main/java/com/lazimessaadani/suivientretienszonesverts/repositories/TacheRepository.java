package com.lazimessaadani.suivientretienszonesverts.repositories;
import com.lazimessaadani.suivientretienszonesverts.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
public interface TacheRepository extends JpaRepository <Tache, Long>{

}
