package proyecto_pedidos;

import java.util.ArrayList;

/**
 * La clase Pedidos representa un pedido realizado por un cliente, 
 * incluyendo los productos asociados al pedido.
 */
public class Pedidos {
    /**
     * Identificador único del pedido.
     */
    int id_pedido;

    /**
     * Identificador del cliente que realizó el pedido.
     */
    int id_cliente;

    /**
     * Lista de productos incluidos en el pedido.
     */
    ArrayList<Productos> pr = new ArrayList<>();

    /**
     * Constructor que inicializa un pedido con un producto.
     * 
     * @param id_pedido Identificador único del pedido.
     * @param id_cliente Identificador del cliente.
     * @param pro Producto inicial que pertenece al pedido.
     */
    public Pedidos(int id_pedido, int id_cliente, Productos pro) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.pr.add(pro);
    }

    /**
     * Obtiene el identificador único del pedido.
     * 
     * @return El identificador del pedido.
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * Establece el identificador único del pedido.
     * 
     * @param id_pedido El nuevo identificador del pedido.
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * Obtiene el identificador del cliente que realizó el pedido.
     * 
     * @return El identificador del cliente.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el identificador del cliente que realizó el pedido.
     * 
     * @param id_cliente El nuevo identificador del cliente.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Obtiene un producto específico del pedido por su índice.
     * 
     * @param indice El índice del producto en la lista.
     * @return El producto en la posición indicada.
     */
    public Productos getPr(int indice) {
        return pr.get(indice);
    }

    /**
     * Agrega un producto al pedido.
     * 
     * @param pro El producto a agregar.
     */
    public void setPr(Productos pro) {
        this.pr.add(pro);
    }

    /**
     * Verifica si un producto específico existe en el pedido.
     * 
     * @param pro El producto a buscar.
     * @return {@code true} si el producto existe en el pedido; {@code false} en caso contrario.
     */
    boolean existe_producto(Productos pro) {
        int indice = 0;

        while (indice < pr.size()) {
            if (pr.get(indice).equals(pro)) {
                return true;
            }
            indice++;
        }
        return false;
    }

    /**
     * Devuelve una representación en forma de cadena del pedido, 
     * incluyendo los identificadores y la lista de productos.
     * 
     * @return Una cadena que representa el pedido.
     */
    @Override
    public String toString() {
        return "Pedidos{" + "id_pedido=" + id_pedido + ", id_cliente=" + id_cliente + ", pr=" + pr + '}';
    }
}
