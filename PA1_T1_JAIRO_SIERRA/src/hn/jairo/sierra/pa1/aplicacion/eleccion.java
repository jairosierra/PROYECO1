/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.jairo.sierra.pa1.aplicacion;

/**
 *
 * @author usuario
 */
public class eleccion {
   public  int contador1, contador2, contador3;
   public  int porcentaje1, porcentaje2, porcentaje3;
   public  int totalvotoss;

    public int getContador1() {
        return contador1;
    }

    public void setContador1(int contador1) {
        this.contador1 = contador1;
    }

    public int getContador2() {
        return contador2;
    }

    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }

    public int getContador3() {
        return contador3;
    }

    public void setContador3(int contador3) {
        this.contador3 = contador3;
    }

    public int getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(int porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public int getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(int porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public int getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(int porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public int getTotalvotos() {
        return totalvotoss;
    }

    public void setTotalvotos(int totalvotoss) {
        this.totalvotoss = totalvotoss;
    }

    @Override
    public String toString() {
        return "Participante{" + "contador1=" + contador1 + ", contador2=" + contador2 + ", contador3=" + contador3 + ", porcentaje1=" + porcentaje1 + ", porcentaje2=" + porcentaje2 + ", porcentaje3=" + porcentaje3 + ", totalvotos=" + totalvotoss + '}';
    }
    
}
