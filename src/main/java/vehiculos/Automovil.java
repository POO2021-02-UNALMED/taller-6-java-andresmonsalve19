package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private static int totalAutomoviles;
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        vehiculos.add(this);
        totalAutomoviles++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getTotalAutomoviles() {
        return totalAutomoviles;
    }

    public static void setTotalAutomoviles(int totalAutomoviles) {
        Automovil.totalAutomoviles = totalAutomoviles;
    }
}
