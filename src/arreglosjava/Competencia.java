package arreglosjava;
import java.util.ArrayList;

class Competencia {
    private ArrayList<Atleta> atletas;

    public Competencia() {
        this.atletas = new ArrayList<>();
    }

    public void registrarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public Atleta obtenerCampeon() {
        Atleta campeon = atletas.get(0);
        for (Atleta atleta : atletas) {
            if (atleta.getTiempo() < campeon.getTiempo()) {
                campeon = atleta;
            }
        }
        return campeon;
    }

    public ArrayList<Atleta> obtenerAtletasPorPais(String nacionalidad) {
        ArrayList<Atleta> atletasPorPais = new ArrayList<>();
        for (Atleta atleta : atletas) {
            if (atleta.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                atletasPorPais.add(atleta);
            }
        }
        return atletasPorPais;
    }

    public double calcularTiempoPromedio() {
        double sumTiempo = 0;
        for (Atleta atleta : atletas) {
            sumTiempo += atleta.getTiempo();
        }
        return sumTiempo / atletas.size();
    }
}



