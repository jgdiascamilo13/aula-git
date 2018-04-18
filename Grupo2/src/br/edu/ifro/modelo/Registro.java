
package br.edu.ifro.modelo;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String nomeServidor, nomeAluno;
    private Time hora;  
}


