package modelo;


/**
 *
 * @author gurui
 */
public class Ronda {
    //   Atributos
    private int intentosTotales;
    private int aciertosRonda;
    private int fallosRonda;
    private int vidasRonda;
    private int puntaje;
    private int tiempo; //El tiempo está dado en segundos
    
    //  Metodos

    public Ronda() {
    }

    public int getIntentosTotales() {
        return intentosTotales;
    }

    public void setIntentosTotales(int intentosTotales) {
        this.intentosTotales = intentosTotales;
    }
    
    public void añadirIntento(){
        this.intentosTotales += 1;
    }

    public int getAciertosRonda() {
        return aciertosRonda;
    }

    public void setAciertosRonda(int aciertosRonda) {
        this.aciertosRonda = aciertosRonda;
    }

    public int getFallosRonda() {
        return fallosRonda;
    }

    public void setFallosRonda(int fallosRonda) {
        this.fallosRonda = fallosRonda;
    }

    public int getVidasRonda() {
        return vidasRonda;
    }

    public void setVidasRonda(int vidasRonda) {
        this.vidasRonda = vidasRonda;
    }
    
    public void quitarVida(){
        this.setVidasRonda(this.getVidasRonda()-1);
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void aumentarPuntaje(int _puntaje){
        this.setPuntaje(this.getPuntaje()+_puntaje);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public String cuantoTiempo(int tiempoSeg){
        int segundos = tiempoSeg % 60;
        int minutos = tiempoSeg / 60;
        return "El tiempo de la ronda es de "+ minutos +":"+ segundos +" (minutos:segundos)";
    }
    
}
