package com.escuela.Clases;

pulic class Auxiliar{
private int codigo;
  
  @OneToOne
  private Materia materia;
  public void aumentarCodigo(int codigo){
   codigo++; 
  }

}
