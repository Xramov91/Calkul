package calcul;
import java.util.Scanner;
public class Calcul {

    public static void main(String[] args) {
        
        double otvet = 0;
     Scanner scan = new Scanner(System.in);
     System.out.println("Введите число");
     double a = scan.nextDouble();
     System.out.println("Введите операцию");
     String op = scan.next();
     char b = op.charAt(0);  
     System.out.println("Введите второе число");
     double c = scan.nextDouble();
     
     if (b == '+'){
     otvet = a + c;
     }
     
     if (b == '-'){
     otvet = a - c;
     }
     
     if (b == '*'){
     otvet = a * c;
     }
     
     if (b == '/'){
     otvet = a / c;
     }
     System.out.println("Ответ равен: " + otvet);
}
}