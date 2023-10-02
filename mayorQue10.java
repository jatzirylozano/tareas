import java.util.Scanner;
/**
 *
 * @author User
 */
public class mayorQue10 {
    public static void main(String[] args) {
        int num1;
        
        Scanner Num1 = new Scanner(System.in);
        System.out.println("Escribe un numero");
        num1 = Num1.nextInt();
        
        if (num1 > 10 && num1 < 20  ){
            System.out.println("El numero es mayor a 10 y menor a 20");
        }else if (num1 > 20){
            System.out.println("El numero es mayor a 20");
        }else if (num1 < 10 ){
            System.out.println("El numero es menor a 10");
        }
            
        if (num1 == 10){
            System.out.println("El número es 10");
          } else if (num1 == 20){
              System.out.println("El numero es 20");
            }   
    }   
}
