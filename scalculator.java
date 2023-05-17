import java.util.Scanner;

public class scalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("Select a process 1= Divide 2= impact 3= addition 4= extraction");
       int process = scan.nextInt();

       System.out.println("Select Number 1");
       int number1 = scan.nextInt();

       System.out.println("Select Number 2");
       int number2 = scan.nextInt();

       switch(process){
        case 1:
        System.out.println((double)(number1/number2));
       }
       switch(process){
        case 2:
        System.out.println((double)(number1*number2));;
       }
       switch(process){
        case 3:
        System.out.println((double)(number1+number2));;
       }
       switch(process){
        case 4:
        System.out.println((double)(number1-number2));
       }

    }
}
