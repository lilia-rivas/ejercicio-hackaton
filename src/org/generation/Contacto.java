package org.generation;

public class Contacto {
	
	 // Atributos de instancia privados (Encapsulamiento)
    private String nombre;
    private String apellido;
    private String telefono;
    
    // Constructor para inicializar el objeto
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
    	return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Polimorfismo: Sobreescritura del método equals()
     * Un contacto es igual a otro si sus nombres son iguales.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contacto) {
            Contacto otro = (Contacto) obj;
            // Comparar nombres ignorando mayúsculas/minúsculas
            return this.nombre.equalsIgnoreCase(otro.nombre); 
        }
        return false;
    }
    
    // Sobreescritura de toString() para mostrar el objeto
    @Override
    public String toString() {
    	return "Contacto [Nombre: " + nombre + " " + apellido + ", Teléfono: " + telefono + "]";
    }

}
