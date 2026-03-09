package proyecto_pedidos;

import java.util.ArrayList;

/**
 * La clase Clientes representa un cliente con información básica como su identificador, nombre y apellidos.
 */
public class Clientes {
    /**
     * Identificador único del cliente.
     */
    int id_cliente;

    /**
     * Nombre del cliente.
     */
    String nombre;

    /**
     * Primer apellido del cliente.
     */
    String apellido1;

    /**
     * Segundo apellido del cliente.
     */
    String apellido2;

    /**
     * Constructor que inicializa los atributos del cliente.
     * 
     * @param id_cliente Identificador único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido1 Primer apellido del cliente.
     * @param apellido2 Segundo apellido del cliente.
     */
    public Clientes(int id_cliente, String nombre, String apellido1, String apellido2) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Obtiene el identificador único del cliente.
     * 
     * @return El identificador del cliente.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el identificador único del cliente.
     * 
     * @param id_cliente El nuevo identificador del cliente.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el primer apellido del cliente.
     * 
     * @return El primer apellido del cliente.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Establece el primer apellido del cliente.
     * 
     * @param apellido1 El nuevo primer apellido del cliente.
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Obtiene el segundo apellido del cliente.
     * 
     * @return El segundo apellido del cliente.
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Establece el segundo apellido del cliente.
     * 
     * @param apellido2 El nuevo segundo apellido del cliente.
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Devuelve una representación en forma de cadena del cliente.
     * 
     * @return Una cadena con los detalles del cliente.
     */
    @Override
    public String toString() {
        return "Clientes{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    }
}

