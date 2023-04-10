package Notas_Aprobado_O_NoAprobado;
import java.util.Scanner;
public class Notas_Aprobado_O_NoAprobado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese la calificación del alumno: ");
        int calificacion = tc.nextInt();

        if(calificacion >= 60){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
	}

}
