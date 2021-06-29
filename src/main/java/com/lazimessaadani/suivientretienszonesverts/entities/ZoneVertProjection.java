package com.lazimessaadani.suivientretienszonesverts.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.rest.core.config.Projection;


import java.util.Date;

@Projection(name="zoneVertProjection", types = {ZoneVert.class})
public interface ZoneVertProjection {
    public Long getId();
    public String getNom();
    public String getAdresse();
    public String getVille();
    public String getPhoto();
    public Double getLongitude();
    public Double getLatitude();
    public Double getSurface();
    public Integer getAnneeDemarage();
    public Date getCreatedDate();
    public TypeZoneVert getTypeZone();
}
