package com.escuela.Clases;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Profesor extends Persona{
    private  int añoDeEgresoDeFacultad;
    private int añoIngresoAInsitucionEducativa;
    private int añoNacimientoPerro;
    
    @OneToMany
    private List<Materia> dictadas = new ArrayList<Materia>();

    public int CuantasMaterias(){
        return materias.size();
    }




}
