package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int notas , promedio = 0;
        Scanner in = new Scanner(System.in);
        
        for(int i = 1 ; i < 5 ; i++){ 
        System.out.println("Porfavor ingrese las notas del estudiante");
        notas = in.nextInt();
        promedio = promedio + notas;
        }
        System.out.println("El promedio de las notas es: " + promedio / 5);
        
        
        
        

        
    }
}
