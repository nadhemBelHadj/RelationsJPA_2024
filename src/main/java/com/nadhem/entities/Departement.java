package com.nadhem.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {
   @Id
   @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int idDept;
   private String nomDept;

   @OneToMany (mappedBy ="dept") //,fetch = FetchType.EAGER
   private List<Employe> employes;

public int getIdDept() {
	return idDept;
}

public void setIdDept(int idDept) {
	this.idDept = idDept;
}

public String getNomDept() {
	return nomDept;
}

public void setNomDept(String nomDept) {
	this.nomDept = nomDept;
}

public List<Employe> getEmployes() {
	return employes;
}

public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}

@Override
public String toString() {
	return "Departement [idDept=" + idDept + ", nomDept=" + nomDept + ", employes=" + employes + "]";
} 


}
