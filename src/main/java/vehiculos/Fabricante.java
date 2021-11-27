package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
        int[] vehiculosxfabricante = new int[fabricantes.size()];

        for (int i = 0; i < fabricantes.size(); i++) {
            int totalPorFabricante = 0;
            for (int j = 0; j < Vehiculo.getVehiculos().size(); j++) {
                if (fabricantes.get(i).equals(Vehiculo.getVehiculos().get(j).getFabricante())) {
                    totalPorFabricante++;
                }
            }
            vehiculosxfabricante[i] = totalPorFabricante;
            totalPorFabricante = 0;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < vehiculosxfabricante.length; i++) {
            if (vehiculosxfabricante[i] > max) {
                max = vehiculosxfabricante[i];
                index = i;
            }
        }

        return fabricantes.get(index);
    }

    public static ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
        Fabricante.fabricantes = fabricantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
