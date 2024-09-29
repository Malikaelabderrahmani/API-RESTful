package com.example.api.ApiModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Student {
    @Id
    private String cne;
    private String nom;
    private String prenom;
    private String date_nais;
    private String sexe;
    private String pass_hash;
    
    public String getCne() {
        return cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDate_nais() {
        return date_nais;
    }
    public void setDate_nais(String date_nais) {
        this.date_nais = date_nais;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getPass_hash() {
        return pass_hash;
    }
    public void setPass_hash(String pass_hash) {
        this.pass_hash = pass_hash;
    }
    

}
