import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio16 {
    public static void main(String[] args) {
        int num;
        Scanner Num = new Scanner(System.in);
        System.out.println("Escribe un número");
        num = Num.nextInt();
        
                
        if (num %3== 0 && num %5==1){
            System.out.println("Tu número es multiplo de 3 y no es multiplo de 5");
        } else{
            System.out.println("Tu número es multiplo de 5 y/o no es multiplo de 3");
        }
    }
}
