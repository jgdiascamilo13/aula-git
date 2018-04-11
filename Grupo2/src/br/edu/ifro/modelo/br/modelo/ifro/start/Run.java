/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.modelo.br.modelo.ifro.start;

import br.edu.ifro.modelo.Aluno;
import br.edu.ifro.modelo.Turma;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 00080339271
 */
public class Run {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin(); // inicia a transação

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Fulano");
        Turma turma = new Turma();
        
           turma.setCategoria("Integrado");
           turma.setPeriodo("Manhã");
           turma.setCurso("Informática");
           turma.setData ("2018-04-11");
           em.persist(turma);
        em.persist(aluno1);
        em.getTransaction().commit();
    }

}
