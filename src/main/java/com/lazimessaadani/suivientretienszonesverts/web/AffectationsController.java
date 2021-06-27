package com.lazimessaadani.suivientretienszonesverts.web;

import com.lazimessaadani.suivientretienszonesverts.entities.Affectation;
import com.lazimessaadani.suivientretienszonesverts.repositories.AffectationRepository;
import com.lazimessaadani.suivientretienszonesverts.repositories.PersonnelRepository;
import com.lazimessaadani.suivientretienszonesverts.repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class AffectationsController {
    @Autowired
    AffectationRepository affectationRepository;

    @Autowired
    PersonnelRepository personnelRepository;

    @Autowired
    TacheRepository tacheRepository;

    @PostMapping("/affectations")
    public ResponseEntity<Affectation> affecter(@RequestBody Long personnel,@RequestBody Long tache,@RequestBody Date dateRealisation){
        try{
            Affectation affectation = new Affectation();
            affectation.setPersonnel(personnelRepository.findById(personnel).get());
            affectation.setTache(tacheRepository.findById(tache).get());
            affectation.setDateRealisation(dateRealisation);
            affectation.setEffectué(false);

            Affectation savedAffecation = affectationRepository.save(affectation);

            return new ResponseEntity<>(savedAffecation, HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
