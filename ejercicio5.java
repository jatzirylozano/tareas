import java.util.Scanner;
/**
 *
 * @author User
 */
public class ejercicio5 {
    public static void main(String[] args) {
        int num;
        
        Scanner Num = new Scanner(System.in);
        System.out.println("Escribe un número");
        num = Num.nextInt();
        
        if (num %2== 0 || num %5== 0){
            System.out.println("Tu número es par o multiplo de 5");
        } else{
            System.out.println("Tu número no es par ni multiplo de 5");
        }
    }
}
