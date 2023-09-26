import java.util.Scanner;

public class EvenOddNumbers2way {
    public static void main(String[] args){
        System.out.println("Enter Number....");
        Scanner scanner = new Scanner(System.in);
        int myNum;
        myNum = scanner.nextInt();
System.out.println("Is the INSERT number EVEN or ODD?");
String isthenumberEVENorODD = (myNum % 2 ==0) ? "Yes, the entered NUMBER is an EVEN number." : "NO, the entered NUMBER is an ODD number.";
System.out.println(isthenumberEVENorODD);



    }
}
