import java.util.Scanner;

public class CheckOddEven_Scnner {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Numbers :");

        int number= sc.nextInt();

        String result=(number % 2==0) ? "Even" : "Odd";
        System.out.println(number + " is " + result );
        sc.close();
    }
}
