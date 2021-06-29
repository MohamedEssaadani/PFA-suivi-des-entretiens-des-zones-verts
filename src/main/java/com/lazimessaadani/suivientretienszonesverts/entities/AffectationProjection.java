package com.lazimessaadani.suivientretienszonesverts.entities;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Projection(name="affectationProjection", types = {com.lazimessaadani.suivientretienszonesverts.entities.Affectation.class})
public interface AffectationProjection {
    public Long getId();
    public Personnel getPersonnel();
    public Tache getTache();
    public Date getDateRealisation();
    public boolean getEffectué();
}
