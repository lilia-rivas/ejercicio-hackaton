package org.generation;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;
    private int maxCapacity; // Atributo para controlar el tamaño máximo
    private static final int DEFAULT_CAPACITY = 10; // Tamaño por defecto 

    // Constructor 1: Con tamaño por defecto de 10
    public Agenda() {
        this.maxCapacity = DEFAULT_CAPACITY;
        this.contactos = new ArrayList<>(maxCapacity);
    }
    

    // -----------------------------------------------------
    // Métodos de la Agenda (Lógica de Negocio)
    // -----------------------------------------------------

    // Indica si el contacto pasado existe o no (basado en el nombre).
    public boolean existeContacto(Contacto c) {
        // Usamos el método .contains() que a su vez usa el .equals() que sobrescribimos.
        return contactos.contains(c); 
    }

    //  Indica cuántos contactos más se pueden ingresar.
    public int espaciosLibres() {
        return maxCapacity - contactos.size();
    }

    //  Añade un contacto a la agenda.
    public String añadirContacto(Contacto c) {
        // 1. Verificar si la agenda está llena
        if (espaciosLibres() == 0) {
            return "Falló: La agenda está llena (" + maxCapacity + " contactos).";
        }
        
        // 2. Verificar si el contacto ya existe (mismo nombre)
        if (existeContacto(c)) {
            return "Falló: El contacto con el nombre '" + c.getNombre() + "' ya existe.";
        }
        
        // 3. Añadir el contacto
        contactos.add(c);
        return "Éxito: Contacto '" + c.getNombre() + " " + c.getApellido() + "' añadido con éxito.";
    }

    //  Lista todos los contactos de la agenda
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("\n--- Lista de Contactos (" + contactos.size() + " de " + maxCapacity + ") ---");
        for (Contacto c : contactos) {
            System.out.println(c); // Llama al toString() de Contacto
        }
    }

    // Busca un contacto por su nombre y muestra su teléfono.
    public Contacto buscaContacto(String nombre, String apellido) {
    	 String nombreCompletoBusqueda = (nombre + " " + apellido).trim();
    	 for (Contacto c : contactos) {
    		 String nombreCompletoContacto = c.getNombre() + " " + c.getApellido();
    		 if (nombreCompletoContacto.trim().equalsIgnoreCase(nombreCompletoBusqueda)) {
                 System.out.println("Contacto encontrado: " + nombreCompletoContacto + ", Teléfono: " + c.getTelefono());
    	            return c;
            }
        }
        // Si no se encuentra
    	 System.out.println("El contacto '" + nombre + " " + apellido + "' no se encuentra.");
        return null;
    }

    // Elimina el contacto correspondiente al nombre.
    public String eliminarContacto(String nombre, String apellido) {
        Contacto contactoAEliminar = buscaContacto(nombre, apellido);

        if (contactoAEliminar != null) {
            contactos.remove(contactoAEliminar);
            return "Éxito: Contacto '" + nombre + " " + apellido + "' eliminado correctamente.";  
        }
        //  Si no existe
        return "Falló: No se puede eliminar. El contacto '" + nombre + " " + apellido + "' no existe."; 
    }
    
    //  Permite modificar el teléfono.
    public String modificarTelefono(String nombre, String apellido,  String nuevoTelefono) {
        Contacto contactoAModificar = buscaContacto(nombre, apellido);
        
        if (contactoAModificar != null) {
            contactoAModificar.setTelefono(nuevoTelefono);
            return "Éxito: Teléfono de '" + nombre + " " + apellido + "' modificado a " + nuevoTelefono;  
        }
        // Si el contacto no existe
        return "Falló: No se pudo modificar. El contacto '" + nombre + " " + apellido + "' no existe.";
    }
    }

