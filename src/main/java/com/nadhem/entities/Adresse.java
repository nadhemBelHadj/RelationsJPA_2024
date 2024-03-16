package com.nadhem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse {
   @Id
   private int idAdr;
   private String rue;
   private String ville; 
//Getters & setters …
}
