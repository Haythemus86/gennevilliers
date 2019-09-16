package com.creche.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Parents implements Serializable {

    private String nomDeFamille;
    private String prenom;
    private String adressePostale;
    private String codePostale;
    private String ville;
    private String telephone;
    @Id
    private String email;
    private String telephone2;

    //Constructeur par défaut

    public Parents() {
        super();
    }

    //Constructeur avec parametre

    public Parents(String nomDeFamille, String prenom, String adressePostale, String codePostale, String ville, String telephone, String email, String telephone2) {
        this.nomDeFamille = nomDeFamille;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.codePostale = codePostale;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
        this.telephone2 = telephone2;
    }


    //GETTERS

    public String getNomDeFamille() {
        return nomDeFamille;
    }


    public String getPrenom() {
        return prenom;
    }


    public String getAdressePostale() {
        return adressePostale;
    }


    public String getCodePostale() {
        return codePostale;
    }

    public String getVille() {
        return ville;
    }



    public String getTelephone() {
        return telephone;
    }


    public String getEmail() {
        return email;
    }
    //SETTERS

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }


    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

}
