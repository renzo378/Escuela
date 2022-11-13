package com.escuela.Clases;

import lombok.Data;

@Data
@Entity
public class Materia {
    private String Nombre;
  

    public boolean Esdificil( ){
        if(complejidad == "alta"){
            return true;
        }else {
            return false;
        }
    }

}
