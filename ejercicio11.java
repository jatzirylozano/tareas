import java.util.Scanner;
/**
 *
 * @author User
 */
public class ejercicio11 {
    public static boolean esPrimo(int numero) {
  if (numero == 0 || numero == 1 || numero == 4) {
    return false;
  }
  for (int x = 2; x < numero / 2; x++) {
    if (numero % x == 0)
      return false;
  }
  return true;
}
    public static void main(String[] args) {
        int Num;
        Scanner num = new Scanner(System.in);
                System.out.println("Escribe un número");
                Num = num.nextInt();
                
         if (esPrimo(Num) && Num < 100){
             System.out.println("Tu número es primo y menor a 100");
         } else if (Num > 100){
             System.out.println("Tu numero es mayor a 100");
         }else {
             System.out.println("Tu número no es primo");
         }
    }
}
