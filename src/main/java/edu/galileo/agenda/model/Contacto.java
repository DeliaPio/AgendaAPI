package edu.galileo.agenda.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Contacto")
@Data
public class Contacto {
    @GeneratedValued(strategy = generationType.Auto)
    @Id
    private Integer id;
    @Colum
    private String nombre;
    @Colum
    private String direccion;
    @Colum
    private String telefono;

}