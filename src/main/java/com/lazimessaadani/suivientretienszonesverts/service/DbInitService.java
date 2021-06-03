package com.lazimessaadani.suivientretienszonesverts.service;

import com.lazimessaadani.suivientretienszonesverts.entities.Personnel;
import com.lazimessaadani.suivientretienszonesverts.entities.TypeZoneVert;
import com.lazimessaadani.suivientretienszonesverts.entities.ZoneVert;
import com.lazimessaadani.suivientretienszonesverts.repositories.PersonnelRepository;
import com.lazimessaadani.suivientretienszonesverts.repositories.TypeZoneVertRepository;
import com.lazimessaadani.suivientretienszonesverts.repositories.ZoneVertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalTime;
import java.util.Date;
import java.util.stream.Stream;



@Service
@Transactional
public class DbInitService implements IDbInitService{

    @Autowired
    TypeZoneVertRepository typeZoneVertRepository;

    @Autowired
    ZoneVertRepository zoneVertRepository;

    @Autowired
    PersonnelRepository personnelRepository;

    @Override
    public void initTypeZoneVert() {
        Stream.of("Grands espaces verts", "Parcs de quartier", "Parcs historique", "Bois et Espaces semi-naturels", "Jardins familliaux")
                .forEach(name->{
                    TypeZoneVert type = new TypeZoneVert();
                    type.setNom(name);
                    type.setDescription("Description: "+name);
                    typeZoneVertRepository.save(type);
                });
    }

    @Override
    public void initZoneVerts() {
        typeZoneVertRepository.findAll()
                .forEach(typeZoneVert -> {
                    Stream.of("PARC DE LA LIGUE ARABE", "PARC DE LA PALESTINE", "PARC CASA NEARSHORE", "PARC IFRIQUIA", "PARC ARCHÉOLOGIQUE DE SIDI ABDERRAHMANE")
                            .forEach(name->{
                                ZoneVert zoneVert = new ZoneVert();
                                zoneVert.setNom(name);
                                zoneVert.setTypeZone(typeZoneVert);
                                zoneVert.setAnneeDemarage(2021);
                                zoneVert.setSurface(69.800);
                                zoneVert.setVille("Casablanca");
                                zoneVert.setCreatedDate(new Date());
                                zoneVertRepository.save(zoneVert);
                            });
                });
    }

    @Override
    public void initPersonnels() {
        Personnel personnel = new Personnel();
        personnel.setNom("Es-saadani");
        personnel.setPrenom("Mohamed");
        personnel.setDateNaissance(new Date());
        personnel.setDateEmbauche(new Date());
        personnel.setCin("AE1784");
        personnel.setSalaire(100000D);
        personnel.setCreatedDate(new Date());
        personnelRepository.save(personnel);

        Personnel personnel2 = new Personnel();
        personnel2.setNom("Es-saadani");
        personnel2.setPrenom("Hicham");
        personnel2.setDateNaissance(new Date());
        personnel2.setDateEmbauche(new Date());
        personnel2.setCin("BE1384");
        personnel2.setSalaire(100000D);
        personnel.setCreatedDate(new Date());
        personnelRepository.save(personnel2);

        Personnel personnel3 = new Personnel();
        personnel3.setNom("Ouahbi");
        personnel3.setPrenom("Youssef");
        personnel3.setDateNaissance(new Date());
        personnel3.setDateEmbauche(new Date());
        personnel3.setCin("CC9839");
        personnel3.setSalaire(90000D);
        personnel.setCreatedDate(new Date());
        personnelRepository.save(personnel3);
    }
}
