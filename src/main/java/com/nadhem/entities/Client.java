package com.nadhem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Client {
@Id
   private int idClt;
   private String nomClt;
   @OneToOne
   public Adresse adresse; 
   
//Getters & setters …
}
