/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.hibernate.entity;

/**
 *
 * @author Tsila
 */
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "visiter")
@IdClass(VisiterId.class)
public class Visiter {
    @Id
    @ManyToOne
    @JoinColumn(name = "codemed")
    private Medecin medecin;

    @Id
    @ManyToOne
    @JoinColumn(name = "codepat")
    private Patient patient;

    @Temporal(TemporalType.DATE)
    private Date dateVisite;

    public Visiter() {}

    public Visiter(Medecin medecin, Patient patient, Date dateVisite) {
        this.medecin = medecin;
        this.patient = patient;
        this.dateVisite = dateVisite;
    }

    public Medecin getMedecin() { return medecin; }
    public void setMedecin(Medecin medecin) { this.medecin = medecin; }
    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }
    public Date getDateVisite() { return dateVisite; }
    public void setDateVisite(Date dateVisite) { this.dateVisite = dateVisite; }
}