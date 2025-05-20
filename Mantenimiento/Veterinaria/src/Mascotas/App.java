package Mascotas;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<Mascota> lista = new ArrayList<>();
            
            while(true){
                System.out.println("\n1. Agregar gato");
                System.out.println("2. Agregar perro"); 
                System.out.println("3. Mostrar información"); 
                System.out.println("4. Salir"); 
                System.out.println("Ingrese opción"); 
                int opcion = entrada.nextInt();
                entrada.nextLine();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del gato: ");
                        String nombreGato = entrada.nextLine();
                        System.out.println("Ingrese la raza del gato: ");
                        String razaGato = entrada.nextLine();
                        System.out.println("Ingrese el peso del gato en kilogramos: ");
                        double pesoGato = entrada.nextDouble();
                        System.out.println("Ingrese la edad del gato en años: ");
                        double edadGato = entrada.nextDouble();
                        System.out.println("Ingrese el patrón de pelaje del gato: ");
                        String patronPelaje = entrada.nextLine();
                        entrada.nextLine();
                        lista.add(new Gato(nombreGato, razaGato, pesoGato, edadGato, patronPelaje));
                        break;
                    
                    case 2:
                        System.out.println("Ingrese el nombre del perro: ");
                        String nombrePerro = entrada.nextLine();
                        System.out.println("Ingrese la raza del perro: ");
                        String razaPerro = entrada.nextLine();
                        System.out.println("Ingrese el peso del perro en kilogramos: ");
                        double pesoPerro = entrada.nextDouble();
                        System.out.println("Ingrese la edad del perro en años: ");
                        double edadPerro = entrada.nextDouble();
                        System.out.println("Ingrese las horas de juego diarias del perro: ");
                        double horasdeJuego = entrada.nextDouble();
                        entrada.nextLine();
                        lista.add(new Perro(nombrePerro, razaPerro, pesoPerro, edadPerro, horasdeJuego));
                        break;
                        
                    case 3:
                        System.out.println("Detalles de las mascotas: ");
                        for(Mascota producto: lista){
                            producto.mostrarInformacion();
                            System.out.println("----------");
                        }
                        break;
                        
                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción Inválida. Por favor ingrese una opción (1-4).");
                        throw new AssertionError();
                }
            }
        }
    }
}
