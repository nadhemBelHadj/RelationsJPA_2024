package com.nadhem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.nadhem.entities.Departement;
import com.nadhem.util.JPAutil;

public class DepartementDao {
private EntityManager entityManager=JPAutil.getEntityManager("RelationsJPA");
public   void ajouter(Departement dept)
{
 	EntityTransaction tx = entityManager.getTransaction();
 	tx.begin();
 	System.out.println(dept.getNomDept());
 		entityManager.persist(dept);
 	tx.commit();  

}

public  Departement Consulter(Departement d,Object id)
{
	
 return entityManager.find(d.getClass(), id);
}
}
