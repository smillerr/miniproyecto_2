package modelo;

/**
 *
 * @author gurui
 */
public class Jugador {
    //  Atributos
    private String nombre;
    
    //  Metodos
    public Jugador(){
        this.nombre="";
    }
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
