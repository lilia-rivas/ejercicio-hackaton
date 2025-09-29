Proyecto: Agenda Telefónica Interactiva en Java (OOP)
Este proyecto es una implementación completa de un sistema de gestión de agenda telefónica, diseñado para demostrar los principios fundamentales de la Programación Orientada a Objetos (POO) y el manejo de colecciones en Java.

La aplicación permite al usuario interactuar a través de la consola para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una lista de contactos con capacidad limitada.

🛠️ Conceptos Clave Implementados
La arquitectura del proyecto se basa en los pilares de POO y estructuras de control:

Clases y Objetos: Se utilizan las clases Contacto y Agenda para modelar las entidades del sistema.

Encapsulamiento: Los atributos de los contactos (nombre, apellido, telefono) son privados y se acceden mediante Getters y Setters.

Polimorfismo (Sobreescritura): El método equals() en la clase Contacto ha sido sobreescrito para asegurar que la agenda no permita contactos con nombres duplicados, aplicando una regla de negocio específica.

Abstracción/Diseño Modular:

La clase Agenda gestiona la lógica de negocio (añadir, buscar, eliminar).

La clase AgendaTest (o AgendaManager) maneja la interfaz de menú interactivo con el usuario, utilizando un bucle do-while y un switch.

Estructuras de Datos: Se utiliza un ArrayList para almacenar el conjunto de contactos, con lógica implementada para controlar la capacidad máxima de la agenda (por defecto 10).

Manejo de Errores: Se utiliza try-catch para capturar y manejar el NumberFormatException cuando el usuario ingresa datos incorrectos en el menú de opciones.

🚀 Funcionalidades Principales
Añadir Contacto: Permite añadir un contacto, validando que la agenda no esté llena y que el nombre no exista.

Buscar Contacto: Permite buscar por Nombre y Apellido y muestra el teléfono.

Eliminar Contacto: Elimina el contacto especificado por nombre y apellido.

Modificar Teléfono: Permite actualizar el teléfono de un contacto existente.

Listar y Espacios Libres: Muestra todos los contactos guardados e indica la capacidad restante.

