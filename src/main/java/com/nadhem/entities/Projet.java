package com.nadhem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Projet {
@Id
private int idProj;
private int nomProj;
   
@ManyToMany
@JoinTable(name = "EMP_PROJ",
joinColumns = @JoinColumn(name = "EMP_ID"),
inverseJoinColumns = @JoinColumn(name = "PROJ_ID") )
  private List<Employe> employes;

public int getIdProj() {
	return idProj;
}

public void setIdProj(int idProj) {
	this.idProj = idProj;
}

public int getNomProj() {
	return nomProj;
}

public void setNomProj(int nomProj) {
	this.nomProj = nomProj;
}

public List<Employe> getEmployes() {
	return employes;
}

public void setEmployes(List<Employe> employes) {
	this.employes = employes;
} 


}
