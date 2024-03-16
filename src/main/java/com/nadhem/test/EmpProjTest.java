package com.nadhem.test;

import com.nadhem.dao.DepartementDao;
import com.nadhem.dao.EmployeDao;
import com.nadhem.entities.Departement;
import com.nadhem.entities.Employe;

public class EmpProjTest {
	public static void main(String[] args) {
		DepartementDao deptDao = new DepartementDao();
		EmployeDao empDao = new EmployeDao();
		Departement dep1 = new Departement();
		
		dep1.setNomDept("Information Technology");
		// persister l'objet dep1
		deptDao.ajouter(dep1);
		
		Employe e1 = new Employe();
		Employe e2 = new Employe();
		e1.setNomEmp("Yassine Bel Hadj");
		e2.setNomEmp("Nadhem Bel Hadj");
		
		e1.setDept(dep1);
		e2.setDept(dep1);
		
		// persister les objets e1 et e2
		empDao.ajouter(e1);
		empDao.ajouter(e2);
		
		Departement d = new Departement();
		d = deptDao.Consulter(d, 1);
		
		// affihcer la liste des employés du département d
		System.out.println("****** Employés du Departement : "+d);
		for (Employe e : d.getEmployes())
			System.out.println(e);
	}
}
