package modelo;

/**
 *
 * @author gurui
 */
public class Figura {
    /*  
        Arrays para asignar forma y color a las fichas,
        "nulo" es para dejar ese atributo como si no lo tuviera
    */
    static public String[] listaFormas = {"nulo","Circulo","Flecha","Rombo","Triangulo"};
    static public String[] listaColores = {"nulo","Amarillo","Verde","Azul","Rojo"};
    
    //  Atributos 
    private String forma;
    private String color;
    
    //  Metodos
    public Figura(){
        this.forma = listaFormas[0];
        this.color = listaColores[0];
    }
    
    public Figura(int _forma, int _color){
        this.forma = listaFormas[_forma];
        this.color = listaColores[_color];
    }
    
    public Figura(int _forma){
        this.forma = listaFormas[_forma];
    }
    
    /*public Figura(int _color){
        this.color = listaColores[_color];
    }*/

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean compararColor(Figura _figura){
        return this.getColor().equalsIgnoreCase(_figura.getColor());
    }
    
    public boolean compararForma(Figura _figura){
        /*if (_figura.getColor().equals(listaColores[0])){
            return this.getForma().equalsIgnoreCase(_figura.getForma());
        }
        if (_figura.getForma().equals(listaFormas[0])){
            return this.getColor().equalsIgnoreCase(_figura.getColor());
        }*/
        return this.getForma().equalsIgnoreCase(_figura.getForma());
    }
    
    public boolean compararFiguras(Figura _figura){
        if (_figura.getColor().equals(listaColores[0])){
            return this.compararForma(_figura);
        }
        if (_figura.getForma().equals(listaFormas[0])){
            return this.compararColor(_figura);
        }
        else
            /*
                Si ningun atributo es "nulo" en _figura, compara color y forma
                a traves del operador logico && and, retorna true si y solo si
                ambas condiciones coinciden
             */
            return (this.compararForma(_figura) && this.compararColor(_figura));
    }
}
