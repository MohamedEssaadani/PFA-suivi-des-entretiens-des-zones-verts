package com.lazimessaadani.suivientretienszonesverts.service;


import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

public interface IDbInitService {
    public void initTypeZoneVert();
    public void initZoneVerts();
    public void initPersonnels();
    public void initTaches();
}
