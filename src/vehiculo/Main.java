
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VS14Junio24 miVehiculoVS14Junio24;
        int stockActual;
        
        miVehiculoVS14Junio24 = new VS14Junio24("Seat",18000,100);
        operativaVehiculosVS14Junio24(miVehiculoVS14Junio24, 50); 
    }

    private static void operativaVehiculosVS14Junio24(VS14Junio24 miVehiculoVS14Junio24, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVS14Junio24.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVS14Junio24.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoVS14Junio24.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
