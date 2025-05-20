package Mascotas;

public class Gato extends Mascota{
    private String patronPelaje;

    public Gato(String nombre, String raza, double peso, double edad, String patronPelaje) {
        super(nombre, raza, peso, edad);
        this.patronPelaje = patronPelaje;
    }

    public String getPatrondePelaje() {
        return patronPelaje;
    }

    public void setPatrondePelaje(String patrondePelaje) {
        this.patronPelaje = patrondePelaje;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("GATO");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Raza: "+getRaza());
        System.out.println("Edad: "+getEdad());
        System.out.println("Patrón de pelaje: "+patronPelaje);  
    }
}