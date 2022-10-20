import java.util.Scanner;;
public class Count {
    public static void main(String[] args) {
        int input = 1;
        int sum = 0;
        int count = 0;
        int pos = 0;
        int neg = 0;
        Scanner scan = new Scanner(System.in);

        while(input != 0){
            System.out.print("Please enter an integer: ");

            input = Integer.parseInt(scan.nextLine());
            sum += input;
            count++;

            if(input > 0){
                pos++;
            }else if(input < 0){
                neg++;
            }

        }
        count--;
        double avg = (double)sum / count;
        System.out.println("You entered " + pos + " positive numbers.");
        System.out.println("You entered " + neg + " negetive numbers.");
        System.out.println("The avrage of the numbers is " + avg + ".");


    }
}
