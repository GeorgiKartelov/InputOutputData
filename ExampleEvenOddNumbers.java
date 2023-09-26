import java.util.Scanner;

public class ExampleEvenOddNumbers {
    public static void main(String[] args){
        System.out.println("Enter Number...");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        System.out.println("Is the Number EVEN/ЧЕТНО or ODD/НЕЧЕТНО:");

        if (num % 2==0){
            System.out.println("The Insert NUMBER is EVEN.");
        }
        else{
            System.out.println("result:\t" + num % 2 + "\n No, the insert NUMBER IS ODD.");
        }
    }
}
