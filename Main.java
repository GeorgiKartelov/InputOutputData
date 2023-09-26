import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please, Enter a number to convert it accurately:");
        Scanner scanner = new Scanner(System.in);
        int myint;
        myint = scanner.nextInt();
        System.out.println("Here is the Convert Number:");
        double result = Math.sqrt(myint);
        System.out.printf("%.5f",result);
    }
}
