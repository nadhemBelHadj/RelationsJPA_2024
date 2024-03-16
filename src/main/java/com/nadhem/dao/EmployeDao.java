package com.nadhem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.nadhem.entities.Departement;
import com.nadhem.entities.Employe;
import com.nadhem.util.JPAutil;

public class EmployeDao {
private EntityManager entityManager=JPAutil.getEntityManager("RelationsJPA");
 public   void ajouter(Employe e)
{
 EntityTransaction tx = entityManager.getTransaction();
 tx.begin();
 entityManager.persist(e);
 tx.commit();  
}
 
 public  Employe Consulter(Employe e,Object id)
 {
  return entityManager.find(e.getClass(), id);
 }
}
