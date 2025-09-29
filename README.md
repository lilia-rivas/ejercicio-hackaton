📖 Proyecto: Agenda Telefónica Interactiva en Java (OOP)
Este proyecto implementa un sistema de gestión de agenda telefónica diseñado para consolidar los pilares de la Programación Orientada a Objetos (POO) y el manejo de colecciones en un entorno de aplicación interactiva por consola.

🛠️ Arquitectura y Diseño POO
El sistema está dividido en módulos (clases) con responsabilidades únicas, siguiendo el Principio de Responsabilidad Única (SRP):

Clase / Módulo	Responsabilidad Principal	Conceptos POO Aplicados
Contacto	Representa una entidad de datos (Nombre, Apellido, Teléfono).	Encapsulamiento, Polimorfismo (equals() y toString()).
Agenda	Lógica de Negocio. Administra la colección de contactos.	Abstracción, Control de Capacidad (tamaño máximo).
AgendaTest	Interfaz de Usuario y Control de Flujo.	Interacción por Consola (Scanner), Control de Flujo (do-while, switch), Manejo de Errores (try-catch).

EXPORTAR A HOJAS DE CÁLCULO
✨ Conceptos Clave Implementados
1. Encapsulamiento y Modelado
Todos los atributos (nombre, apellido, telefono, contactos, maxCapacity) son privados (private), protegiendo la integridad de los datos.

El acceso y la modificación se realizan únicamente a través de métodos públicos (getNombre(), setTelefono()).

2. Polimorfismo: Regla de Negocio
El método equals(Object obj) en Contacto fue sobreescrito para implementar la regla de unicidad del negocio: dos contactos se consideran iguales si tienen el mismo nombre, ignorando mayúsculas/minúsculas.

3. Colecciones y Estructura
Se utiliza un ArrayList<Contacto> dentro de la clase Agenda para almacenar la colección de objetos.

Se implementa la lógica de capacidad máxima (maxCapacity y espaciosLibres()), cumpliendo con el requerimiento de tamaño limitado.

🚀 Funcionalidades Principales
El menú interactivo en la consola permite al usuario realizar las siguientes operaciones:

Añadir Contacto: Valida la capacidad máxima y evita la adición de contactos duplicados (por nombre).

Buscar Contacto: Permite la búsqueda precisa utilizando el Nombre y Apellido del contacto.

Eliminar Contacto: Elimina el contacto especificado por su nombre completo, informando al usuario si la operación fue exitosa o fallida.

Modificar Teléfono: Permite actualizar el teléfono de un contacto existente, buscándolo por su nombre completo.

Espacios Libres: Muestra cuántos contactos más se pueden ingresar en la agenda.

Integrantes: Lilia Berenice Rivas Sánchez, Angel Tirado Luna, Saúl G. Esquiliano Soto y Jesús Jaime Covarruvias.
