import java.util.Scanner;
public class IntSums {

    public static void main(String[] args) {
        int input = 17;
        int sum = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);

        while(input != 0 && count != 10){
            System.out.print("Please enter a number: ");
            input = Integer.parseInt(scan.nextLine());
            sum += input;
            count++;

        }

        System.out.println("The sum of the numbers is: " + sum);


    }
}