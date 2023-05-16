import java.util.Scanner;
import java.util.Locale;

public class calculator {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      scan.useLocale(Locale.US);

      System.out.println("Select a process 1= Divide 2= impact 3= addition 4= extraction");

      int process = scan.nextInt();
      System.out.println("Select Number 1");
      int number1 = scan.nextInt();
      System.out.println("Select Number 2");
      int number2 = scan.nextInt();
      if(process == 1){
        System.out.println((double)(number1/number2));
      }
      if(process == 2){
        System.out.println((double)(number1*number2));
      }
      if(process == 3){
        System.out.println((double)(number1+number2));
      }
      if(process == 4){
        System.out.println((double)(number1-number2));
      }
      if(process > 4){
        System.out.println("Error");
      }
      if(process < 1){
        System.out.println("Error");
      }
    }
}
