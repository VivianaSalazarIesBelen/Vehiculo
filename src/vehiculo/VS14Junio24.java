
package vehiculo;

/**
 *Clase vehiculo, con parametos nombre, precio, precio con iva y stockde vehiculo
 * Metodos de compra y venta de vehiculo
 * @author Viviana
 */
public class VS14Junio24 {

    /**
     * obtiene nombre de vehiculo
     * @return nomde de vehiculo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * asinga el nombre de vehiculo
     * @param nombre Nombre de vehiculo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * obtiene el precio de vehiculo
     * @return precio de vehiculo
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * asigna el precio de vehiculo
     * @param precio Precio de vehiculo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * obtiene el precio con iva de vehiculo
     * @return Precio con iva
     */

    public double getPrecioIVA() {
        return precioIVA;
    }
    
    /**
     * asigna el precio con iva de vehiculo 
     * @param precioIVA precio con iva de vehiculo
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * obtiene el stock de vehiculo 
     * @return stock de vehiculo
     */
    public int getStock() {
        return stock;
    }
    
    /**
     * asigna el stock de vehiculo 
     * @param stock Stock de vehiculo 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VS14Junio24 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructos con parametro
     * @param nom nombre de vehiculo 
     * @param precio precio de vehiculo
     * @param stock stock de vehiculo 
     */
    
    public VS14Junio24 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Metodo para vender vehiculos
     * @param cantidad cantidad de vehiculos
     * @throws Exception comprueba si hay stock y si la cantidad es postiva
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

