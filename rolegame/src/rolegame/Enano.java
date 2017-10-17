
package rolegame;

public class Enano {
    private String nombre;
    private int puntosVida;
    private int fuerzaAtaque;
    private int puntosDefensa;
    private int puntosResistencia;
    private int puntosExperiencia;
    private boolean muerto;

public Enano()
{
    this.nombre="";
    this.puntosVida=0;
    this.fuerzaAtaque=0;
    this.puntosDefensa=0;
    this.puntosResistencia=0;
    this.puntosExperiencia=0;
    this.muerto=false;  
}
public Enano(String nombre)
{
    this.nombre=nombre;
}
}
