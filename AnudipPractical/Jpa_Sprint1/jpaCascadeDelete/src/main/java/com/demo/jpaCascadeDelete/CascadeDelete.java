package com.demo.jpaCascadeDelete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaCascadeDelete.entity.StudentEntity;



public class CascadeDelete {  
	  
    public static void main( String[ ] args ) {  
            
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "student_details" );  
           
         EntityManager em = emf.createEntityManager( );  
       em.getTransaction().begin();  
 
          
         StudentEntity s=em.find(StudentEntity.class, 101);  
        em.remove(s);  
           
         
         em.getTransaction().commit();  
 
         em.close( );  
         emf.close( );  
         
         
   }  
 
     
}