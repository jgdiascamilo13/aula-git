/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.ifro.Aluno;
import br.edu.ifro.Turma;
/**
 *
 * @author 02119149240
 */
public class Run {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Aluno aluno1 = new Aluno();
        Turma turma= new Turma ();
        
        turma.setCategoria ("");
        aluno1.setNome("Fulano");
        em.persist(aluno1);
        em.getTransaction().commit();
    }
}
