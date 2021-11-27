package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    private static int totalCamionetas;
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        vehiculos.add(this);
        totalCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getTotalCamionetas() {
        return totalCamionetas;
    }

    public static void setTotalCamionetas(int totalCamionetas) {
        Camioneta.totalCamionetas = totalCamionetas;
    }

}
