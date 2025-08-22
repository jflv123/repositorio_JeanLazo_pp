package proyecto_parcial;
//Paquete de datos e/s datos por consola
import java.util.Scanner;
public class Proyecto_Parcial {
    //Método principal
    public static void main(String[] args) {
        //Declaracion de variables
        String empleado;
        double ht, th, sb, d, sn, sm;
        //creando el objeto de lectura
        Scanner lectura = new Scanner (System.in);
        //Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado = lectura.next();
        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();
        //Proceso de datos
        sb = ht * th;
        d = sb * 0.13;
        sn = sb - d;
        sm = sb * 0.09;
        //Salida de datos
        System.out.println("Sueldo Bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo Neto: " + sn);
        System.out.println("Seguro medico: " + sm);
    } // Fin del método
} // Fin del programa
