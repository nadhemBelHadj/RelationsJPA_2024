package com.nadhem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int idEmp;
private String nomEmp;

@ManyToOne
@JoinColumn (name="DEPT_ID")
private Departement dept;

@ManyToMany
private List<Projet> projets; 


public int getIdEmp() {
	return idEmp;
}
public void setIdEmp(int idEmp) {
	this.idEmp = idEmp;
}
public String getNomEmp() {
	return nomEmp;
}
public void setNomEmp(String nomEmp) {
	this.nomEmp = nomEmp;
}
public Departement getDept() {
	return dept;
}
public void setDept(Departement dept) {
	this.dept = dept;
}
public List<Projet> getProjets() {
	return projets;
}
public void setProjets(List<Projet> projets) {
	this.projets = projets;
}
@Override
public String toString() {
	return "Employe [idEmp=" + idEmp + ", nomEmp=" + nomEmp +   "]";
}



}
