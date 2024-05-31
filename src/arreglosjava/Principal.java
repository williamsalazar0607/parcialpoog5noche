package arreglosjava;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Competencia competencia = new Competencia();
        int opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    registrarAtleta(competencia);
                    break;
                case 2:
                    mostrarDatosCampeon(competencia);
                    break;
                case 3:
                    mostrarAtletasPorPais(competencia);
                    break;
                case 4:
                    mostrarTiempoPromedio(competencia);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 5);
    }

    public static int mostrarMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Competencia\n" +
                "1. Registrar Atleta\n" +
                "2. Datos del campeon\n" +
                "3. Atletas por pais\n" +
                "4. Tiempo promedio de todos los atletas\n" +
                "5. Salir\n" +
                "Ingrese su opción: "));
    }

    public static void registrarAtleta(Competencia competencia) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Atleta: ");
        String nacionalidad = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad del Atleta: ");
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tiempo en minutos del Atleta: "));
        Atleta atleta = new Atleta(nombre, nacionalidad, tiempo);
        competencia.registrarAtleta(atleta);
    }

    public static void mostrarDatosCampeon(Competencia competencia) {
        Atleta campeon = competencia.obtenerCampeon();
        JOptionPane.showMessageDialog(null, "El nombre del atleta con el menor tiempo es " + campeon.getNombre() +
                " de nacionalidad " + campeon.getNacionalidad() +
                " su tiempo fue " + campeon.getTiempo());
    }

    public static void mostrarAtletasPorPais(Competencia competencia) {
        String nacionalidadPais = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad para mostrar los atletas de ese pais: ");
        ArrayList<Atleta> atletasPorPais = competencia.obtenerAtletasPorPais(nacionalidadPais);
        StringBuilder mensaje = new StringBuilder("Los atletas de nacionalidad " + nacionalidadPais + " son:\n");
        for (Atleta atleta : atletasPorPais) {
            mensaje.append(atleta.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public static void mostrarTiempoPromedio(Competencia competencia) {
        double tiempoPromedio = competencia.calcularTiempoPromedio();
        JOptionPane.showMessageDialog(null, "El tiempo promedio de los atletas fue " + tiempoPromedio);
    }
}