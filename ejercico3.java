import java.util.Scanner;
/**
 *
 * @author User
 */
public class ejercico3 {
    public static void main(String[] args) {
        String cadena;
        int valorASCII;
        boolean cona = false;
        boolean conb = false;
         
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Escribe una palabra:");
         cadena = teclado.next();
         
         for(int i=0; i<cadena.length();i++){
             char caracter = cadena.charAt(i);
             System.out.println("caracter" + caracter);
             valorASCII = (int) caracter;
             
             System.out.println("valorASCII" + valorASCII);
             
             if (valorASCII == 97){
                 cona = true;
             } else if (valorASCII==98){
                 conb = true;
             }
             
             if (cona && conb){
                 System.out.println("Contiene a y b");
                 break;
             }
         }
    }
}