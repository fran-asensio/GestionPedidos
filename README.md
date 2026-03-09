# Sistema de Gestión de Pedidos (Java) 📦

Este proyecto es una aplicación de consola en **Java** diseñada para gestionar el flujo de ventas, inventario y relación entre clientes y productos de una tienda o almacén.

## 🚀 Estructura del Proyecto

El sistema está organizado en el paquete `proyecto_pedidos` y se compone de las siguientes entidades principales:



* **`Clientes`**: Almacena la información personal del comprador (ID, nombre y apellidos).
* **`Productos`**: Representa los artículos del inventario, incluyendo su descripción y el stock disponible (`cantidad`).
* **`Pedidos`**: Vincula a un cliente con una lista dinámica (`ArrayList`) de productos adquiridos.
* **`Servicios`**: Contiene la lógica de negocio y algoritmos de búsqueda del sistema.
* **`Proyecto_Pedidos`**: Clase principal que contiene el método `main` para ejecutar la aplicación.

---

## 🛠️ Funcionalidades Principales

La clase **`Servicios.java`** permite realizar las siguientes operaciones avanzadas:

### 1. Gestión de Stock
* **Verificación de Disponibilidad**: Comprueba si hay suficiente stock para un pedido. El sistema bloquea la venta si la cantidad restante es menor o igual a 7 unidades.
* **Reporte para Proveedores**: Genera automáticamente una lista de todos los productos que están bajo el umbral de reposición (7 unidades o menos).

### 2. Inteligencia de Datos y Rastreo
* **Localización de Clientes**: Permite encontrar los datos completos de un cliente a partir de un objeto de pedido.
* **Rastreo de Producto**: Identifica qué cliente compró un producto específico navegando por el historial de pedidos.
* **Conteo de Clientes Únicos**: Calcula cuántos clientes distintos han comprado un producto en particular, evitando duplicados en el conteo.

---

## 📋 Requisitos e Instalación

1.  **Java JDK**: Versión 8 o superior.
2.  **IDE recomendado**: NetBeans, IntelliJ IDEA o Eclipse.
3.  **Configuración**:
    * Crea un proyecto llamado `proyecto_pedidos`.
    * Copia los archivos `.java` en la carpeta del paquete correspondiente.
    * Ejecuta `Proyecto_Pedidos.java`.

## 📝 Notas de Implementación
* El sistema utiliza la clase `ArrayList` para manejar la colección de productos dentro de cada pedido, permitiendo que un solo pedido contenga múltiples artículos de forma dinámica.
* La lógica de búsqueda emplea ciclos `while` y comparaciones de identificadores únicos para garantizar la precisión en el manejo de datos.

---
Desarrollado como un ejemplo de lógica de programación y gestión de colecciones en Java.
