import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio19 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner Num = new Scanner(System.in);
        System.out.println("Escribe un número");
        num = Num.nextInt();
        
        if (num > 100){
            System.out.println("Tu número es mayor a 100");
        } else if (num < -100){
        System.out.println("Tu número es menor a -100");
    }else {
            System.out.println("Tu numero esta entre el -100 y 100");
        }
            
    }
}
