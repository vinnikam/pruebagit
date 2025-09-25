import dev.vinni.util.UtilArchivos;
import dev.vinni.util.UtilidadABinarios;
import pq1.Otra;

public class Principal {
    public static void main(String[] args) {
        System.out.println("");

        Otra otra = new Otra();
        otra.a = "dato en a clase otra";
        boolean bool = UtilidadABinarios.guardar("archivo.txt1", otra);
        if (bool)
            System.out.println("Guardo");
        else
            System.out.println("No Guardo");


        Object dato = UtilidadABinarios.leer("archivo.txt1");
        Otra otra1 = (Otra)dato;
        System.out.println("Recuperado "+otra1);
        String[] arreglo  = new String[1];
        arreglo[0] = "Mi nombre es oasjd oas ";
        UtilArchivos.guardar("uno",arreglo, false );
    }
}
