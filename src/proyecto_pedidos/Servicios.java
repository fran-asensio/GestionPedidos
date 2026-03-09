package proyecto_pedidos;

import java.util.ArrayList;

/**
 * La clase Servicios proporciona métodos para gestionar pedidos, clientes y productos
 * de un sistema de inventario y pedidos.
 */
public class Servicios {

    /**
     * Verifica si un producto está disponible en la cantidad solicitada.
     * 
     * @param cantidad La cantidad solicitada del producto.
     * @param pr El producto a verificar.
     * @return {@code true} si el producto está disponible en la cantidad solicitada; 
     *         {@code false} en caso contrario.
     */
    boolean disponibilidad(int cantidad, Productos pr) {
        if (cantidad > pr.getCantidad() | pr.getCantidad() <= 7) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Genera una lista de productos que necesitan ser pedidos al proveedor.
     * 
     * @param pr Lista de productos en el inventario.
     * @return Una lista de productos cuya cantidad es menor o igual a 7.
     */
    ArrayList<Productos> pedir_proveedor(ArrayList<Productos> pr) {
        ArrayList<Productos> servir = new ArrayList<>();
        int indice = 0;
        int tamano = pr.size() - 1;

        while (indice <= tamano) {
            if (pr.get(indice).getCantidad() <= 7) {
                servir.add(pr.get(indice));
            }
            indice++;
        }
        return servir;
    }

    /**
     * Identifica el cliente al que pertenece un pedido específico.
     * 
     * @param p Lista de pedidos existentes.
     * @param pr El pedido a buscar.
     * @param c Lista de clientes registrados.
     * @param cli Cliente inicial (no utilizado directamente en la lógica actual).
     * @return El cliente al que pertenece el pedido, o {@code null} si no se encuentra.
     */
    Clientes pedidos_cliente(ArrayList<Pedidos> p, Pedidos pr, ArrayList<Clientes> c, Clientes cli) {
        int indice = 0;
        int tamano = p.size() - 1;

        while (indice <= tamano && p.get(indice).getId_pedido() != pr.getId_pedido()) {
            indice++;
        }
        if (indice <= tamano) {
            int encontrado = p.get(indice).getId_cliente();
            indice = 0;
            tamano = c.size() - 1;

            while (indice <= tamano && encontrado != c.get(indice).getId_cliente()) {
                indice++;
            }
            if (indice <= tamano) {
                return c.get(indice);
            }
        }
        return null;
    }

    /**
     * Encuentra el cliente que compró un producto específico.
     * 
     * @param p Lista de pedidos existentes.
     * @param pro El producto buscado.
     * @param c Lista de clientes registrados.
     * @return El cliente que compró el producto, o {@code null} si no se encuentra.
     */
    Clientes producto_cliente(ArrayList<Pedidos> p, Productos pro, ArrayList<Clientes> c) {
        int indice = 0;
        int tamano = p.size() - 1;

        while (indice <= tamano && !p.get(indice).existe_producto(pro)) {
            indice++;
        }
        if (indice <= tamano) {
            int encontrado = p.get(indice).getId_cliente();
            indice = 0;
            tamano = c.size() - 1;

            while (indice <= tamano && encontrado != c.get(indice).getId_cliente()) {
                indice++;
            }
            if (indice <= tamano) {
                return c.get(indice);
            }
        }
        return null;
    }

    /**
     * Calcula la cantidad de clientes únicos que han comprado un producto específico.
     * 
     * @param p Lista de pedidos existentes.
     * @param pro El producto buscado.
     * @param c Lista de clientes registrados.
     * @return El número de clientes únicos que han comprado el producto.
     */
    int cantidadClientes(ArrayList<Pedidos> p, Productos pro, ArrayList<Clientes> c) {
        int indicePedidos = 0;
        int tamanoPedidos = p.size();
        ArrayList<Integer> clientesUnicos = new ArrayList<>();

        while (indicePedidos < tamanoPedidos) {
            if (p.get(indicePedidos).existe_producto(pro)) {
                int idCliente = p.get(indicePedidos).getId_cliente();
                boolean encontrado = false;

                for (int cliente : clientesUnicos) {
                    if (cliente == idCliente) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    clientesUnicos.add(idCliente);
                }
            }
            indicePedidos++;
        }
        return clientesUnicos.size();
    }
}

  