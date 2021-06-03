package com.lazimessaadani.suivientretienszonesverts;

import com.lazimessaadani.suivientretienszonesverts.service.IDbInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuiviEntretiensZonesVertsApplication implements CommandLineRunner {

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
    }
}
