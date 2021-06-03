package com.lazimessaadani.suivientretienszonesverts.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class ZoneVert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private String adresse;
    private String ville;
    private String photo;
    private Double longitude;
    private Double latitude;
    private Double surface;
    private Integer anneeDemarage;

    @CreatedDate
    private Date createdDate;

/*  @LastModifiedDate
    @Column(name = "updated_at")
    private Date updatedAt;*/

    @ManyToOne
    @JoinColumn(name = "type_zone", nullable = true)
    private TypeZoneVert typeZone;
}
