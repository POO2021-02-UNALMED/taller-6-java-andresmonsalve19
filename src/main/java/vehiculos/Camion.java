package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    private static int totalCamiones;
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        vehiculos.add(this);
        totalCamiones++;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Camion.totalCamiones = totalCamiones;
    }

}
