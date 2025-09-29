package org.generation;

import java.util.Scanner;

public class AgendaTest {
	
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Agenda miAgenda = new Agenda(); // 
        int opcion = 0;
        
        System.out.println("--- AGENDA TELEFÓNICA ROOM 8 ---");
        
        do {
            desplegarMenu();
            
            // Usamos un try-catch para manejar errores si el usuario ingresa una letra
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                ejecutarOpcion(opcion, miAgenda);

            } catch (NumberFormatException e) {
                System.out.println("\n*** ERROR: Ingresa un número de opción válido. ***\n");
                opcion = 0; // Para que el ciclo continúe
            }

        } while (opcion != 7); // 7 será la opción de Salir
        
        System.out.println("\n¡Gracias por usar el Gestor de Agenda con el room 8! Hasta pronto.");
        scanner.close();
    }

    private static void desplegarMenu() {
        System.out.println("\n===================================");
        System.out.println("Por favor, selecciona una opción:");
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Buscar Contacto (Mostrar teléfono)");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Modificar Teléfono");
        System.out.println("5. Listar Contactos");
        System.out.println("6. Mostrar Espacios Libres");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }
    
    private static void ejecutarOpcion(int opcion, Agenda agenda) {
        String nombre, apellido, telefono;
        
        switch (opcion) {
            case 1: // Añadir Contacto
                System.out.print("Nombre del contacto: ");
                nombre = scanner.nextLine();
                System.out.print("Apellido del contacto: ");
                apellido = scanner.nextLine();
                System.out.print("Teléfono del contacto: ");
                telefono = scanner.nextLine();
                Contacto nuevo = new Contacto(nombre, apellido, telefono);
                System.out.println(agenda.añadirContacto(nuevo));
                break;
                
            case 2: // Buscar Contacto
                System.out.print("Nombre del contacto a buscar: ");
                nombre = scanner.nextLine();
                System.out.println("Apellido del contacto a buscar: ");
                apellido = scanner.nextLine();
                agenda.buscaContacto(nombre, apellido);
                break;
                
            case 3: // Eliminar Contacto
                System.out.print("Nombre del contacto a eliminar: ");
                nombre = scanner.nextLine();
                System.out.println("Apellido del contacto a eliminar: ");
                apellido = scanner.nextLine();
                System.out.println(agenda.eliminarContacto(nombre, apellido));
                break;
                
            case 4: // Modificar Teléfono
                System.out.print("Nombre del contacto a modificar: ");
                nombre = scanner.nextLine();
                System.out.println("Apellido del contacto a modificar: ");
                apellido = scanner.nextLine();
                System.out.print("Nuevo teléfono: ");
                telefono = scanner.nextLine();
                System.out.println(agenda.modificarTelefono(nombre, apellido, telefono));
                break;
                
            case 5: // Listar Contactos
                agenda.listarContactos();
                break;
                
            case 6: // Mostrar Espacios Libres
                System.out.println("Espacios Libres: " + agenda.espaciosLibres());
                break;
                
            case 7: // Salir
                // El bucle do-while terminará
                break;
                
            default:
                System.out.println("\n*** Opción inválida. Intenta de nuevo. ***\n");
        }
	
	}
}

