package com.escuela.Clases;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Profesor extends Persona{
    private  int aĆ±oDeEgresoDeFacultad;
    private int aĆ±oIngresoAInsitucionEducativa;
    private int aĆ±oNacimientoPerro;
    
    @OneToMany
    private List<Materia> dictadas = new ArrayList<Materia>();

    public int CuantasMaterias(){
        return materias.size();
    }




}
