package Mascotas;

public class Perro extends Mascota{
    private double horasdeJuego;

    public Perro(String nombre, String raza, double peso, double edad, double horasdeJuego) {
        super(nombre, raza, peso, edad);
        this.horasdeJuego = horasdeJuego;
    }

    public double getHorasdeJuego() {
        return horasdeJuego;
    }

    public void setHorasdeJuego(double horasdeJuego) {
        this.horasdeJuego = horasdeJuego;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("PERRO");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Raza: "+getRaza());
        System.out.println("Edad: "+getEdad());
        System.out.println("Horas de juego: "+horasdeJuego);  
    }   
}
