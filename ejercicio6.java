import java.util.Scanner;
/**
 *
 * @author User
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int num1;
        Scanner Num1 = new Scanner(System.in);
        System.out.println("Ingresa la calificacion del alumno");
        
        num1 = Num1.nextInt();
        
        if (num1 >=60 && num1 <= 100){
            System.out.println("Su calificaccion es aprobatoria");
        } else if (num1 < 60 && num1 >= 0){
            System.out.println("Su calicficacion es reprobatoria");
        } else if (num1 > 100 || num1 < 0){
        System.out.println("Ingrese una calificacion valida");
    } 
            
        
    }
}
