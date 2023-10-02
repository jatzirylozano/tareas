import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int num1;
        
        Scanner Num1 = new Scanner(System.in);
        System.out.println("Escribe un número");
        
        num1 = Num1.nextInt();
        
        if (num1 > 0){
            System.out.println("El numero es positivo y no es 0");
        } else if (num1 <= 0){
            System.out.println("El número es negativo");
    }
                
    }
}
