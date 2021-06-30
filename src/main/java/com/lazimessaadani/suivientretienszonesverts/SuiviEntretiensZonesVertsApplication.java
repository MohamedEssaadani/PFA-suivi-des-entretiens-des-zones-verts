package com.lazimessaadani.suivientretienszonesverts;

import com.lazimessaadani.suivientretienszonesverts.entities.Personnel;
import com.lazimessaadani.suivientretienszonesverts.entities.Tache;
import com.lazimessaadani.suivientretienszonesverts.entities.TypeZoneVert;
import com.lazimessaadani.suivientretienszonesverts.service.IDbInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class SuiviEntretiensZonesVertsApplication implements CommandLineRunner, RepositoryRestConfigurer {

    @Autowired
    private IDbInitService dbInitService;

    public static void main(String[] args) {
        SpringApplication.run(SuiviEntretiensZonesVertsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dbInitService.initTypeZoneVert();
        dbInitService.initZoneVerts();
        dbInitService.initPersonnels();
        dbInitService.initTaches();
    }

    //to return ids in json
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Personnel.class);
        config.exposeIdsFor(Tache.class);
        config.exposeIdsFor(TypeZoneVert.class);

    }

}
