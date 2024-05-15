package Contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactoPersona {


    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una operación a realizar: 1) Agregar una persona - 2) Mostrar los datos de una persona - 3) Mostrar todos los datos de los contactos - 4) Eliminar un contacto - 0) Salir de los contactos");
        int opcion = sc.nextInt();

        while(opcion != 0){
            switch (opcion){
                case 1:
                    sc.nextLine();
                    Persona nuevoContacto = new Persona();
                    System.out.println("Ingrese el nombre del contacto a agregar: ");
                    String nombre = sc.nextLine();
                    nuevoContacto.setNombre(nombre);
                    System.out.println("Ingrese el apellido del contacto a agregar: ");
                    String apellido = sc.nextLine();
                    nuevoContacto.setApellido(apellido);
                    System.out.println("Ingrese el DNI del contacto a agregar: ");
                    String dni = sc.nextLine();
                    nuevoContacto.setDni(dni);
                    listaPersonas.add(nuevoContacto);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la persona que desea verificar los datos: ");
                    String buscarPersona = sc.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (Persona persona : listaPersonas) {
                        if (persona.getNombre().equalsIgnoreCase(buscarPersona)) {
                            System.out.println(persona);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("La persona no fue encontrada en los contactos");
                    }
                    break;
                case 3:
                    System.out.println("Los contactos son los siguientes: ");
                    for(Persona persona: listaPersonas){
                        System.out.println(persona.toString());
                    }
                    break;
                case 4:
                    sc.nextLine(); // Limpiar el buffer del scanner
                    System.out.println("Ingrese el nombre de la persona que desea eliminar de los contactos: ");
                    String eliminarContacto = sc.nextLine().toLowerCase();
                    boolean eliminado = false;
                    for (Persona persona : listaPersonas) {
                        if (persona.getNombre().equalsIgnoreCase(eliminarContacto)) {
                            listaPersonas.remove(persona);
                            System.out.println("El contacto eliminado es: " + persona);
                            eliminado = true;
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("La persona no fue encontrada en los contactos");
                    }
                    break;
                default:
                    System.out.println("La opción elegida es incorrecta");
                    break;
            }
            System.out.println("Ingrese una operación a realizar: 1) Agregar una persona - 2) Mostrar los datos de una persona - 3) Mostrar todos los datos de los contactos - 4) Eliminar un contacto - 0) Salir de los contactos");
            opcion = sc.nextInt();

        }


        sc.close();

    }

}
