
package rolegame;

public class Troll {
    private String nombre;
    private int puntosVida;
    private int fuerzaAtaque;
    private int puntosDefensa;
    private int puntosResistencia;
    private int puntosExperiencia;
    private boolean muerto;

    public Troll()
    {
        this.nombre="Troll";
        this.puntosVida=0;
        this.fuerzaAtaque=0;
        this.puntosDefensa=0;
        this.puntosResistencia=0;
        this.puntosExperiencia=0;
        this.muerto=false;  
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public String toString() {
        return "Mi nombre de Troll es: " + this.getNombre();
    }
    
}
