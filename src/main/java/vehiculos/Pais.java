package vehiculos;

import java.util.ArrayList;

public class Pais {
    private static ArrayList<Pais> paises = new ArrayList<Pais>();
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public static Pais paisMasVendedor(){
        int[] ventasPorPais = new int[paises.size()];

        for (int i = 0; i < paises.size(); i++) {
            int totalPorPais = 0;

            for (int j = 0; j < Fabricante.getFabricantes().size(); j++) {
                if (paises.get(i).equals(Fabricante.getFabricantes().get(j).getPais())) {
                    for (int k =0; k < Vehiculo.getVehiculos().size(); k++) {
                        if (Fabricante.getFabricantes().get(i).equals(Vehiculo.getVehiculos().get(j).getFabricante())) {
                            totalPorPais++;
                        }
                    }
                }
            }

            ventasPorPais[i] = totalPorPais;
            totalPorPais = 0;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < ventasPorPais.length; i++) {
            if (ventasPorPais[i] > max) {
                max = ventasPorPais[i];
                index = i;
            }
        }

        return paises.get(index);
    }

    public static ArrayList<Pais> getPaises() {
        return paises;
    }

    public static void setPaises(ArrayList<Pais> paises) {
        Pais.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
