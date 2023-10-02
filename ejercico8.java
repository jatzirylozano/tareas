import java.util.Scanner;
/**
 *
 * @author User
 */
public class ejercico8 {
    public static void main(String[] args) {
        int num1;
        Scanner Num1 = new Scanner(System.in);
        System.out.println("Escribe un número");
        num1 = Num1.nextInt();
        
        if (num1 < 50 ){
            System.out.println( num1 + " Es menor a 50");
        } else if (num1 > 100){
            System.out.println(num1 + " Es mayor a 100");
        } else if (num1 == 100){
            System.out.println("Tu número es 100");
        }else if (num1 == 50){
            System.out.println("Tu número es 50");
        }
            //menor de 50 o mayor a cien
    }
}
