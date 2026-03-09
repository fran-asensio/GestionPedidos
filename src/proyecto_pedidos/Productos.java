package proyecto_pedidos;

/**
 * La clase Productos representa un producto con atributos básicos como identificador, nombre, descripción y cantidad disponible.
 */
public class Productos { 
    /**
     * Identificador único del producto.
     */
    String id_producto;

    /**
     * Nombre del producto.
     */
    String nombre;

    /**
     * Descripción del producto.
     */
    String descripcion;

    /**
     * Cantidad disponible del producto en el inventario.
     */
    int cantidad;

    /**
     * Constructor para inicializar los atributos de un producto.
     * 
     * @param id_producto Identificador único del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param cantidad Cantidad disponible en el inventario.
     */
    public Productos(String id_producto, String nombre, String descripcion, int cantidad) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return El identificador del producto.
     */
    public String getId_producto() {
        return id_producto;
    }

    /**
     * Establece el identificador del producto.
     * 
     * @param id_producto El identificador único del producto.
     */
    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre El nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto.
     * 
     * @return La descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     * 
     * @param descripcion La descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     * 
     * @return La cantidad disponible del producto en el inventario.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible del producto.
     * 
     * @param cantidad La cantidad disponible en el inventario.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve una representación en forma de cadena del producto.
     * 
     * @return Una cadena con los detalles del producto.
     */
    @Override
    public String toString() {
        return "Productos{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad + '}';
    }
}
