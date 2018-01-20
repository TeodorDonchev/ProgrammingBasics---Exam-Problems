import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stepCount = Integer.parseInt(scan.nextLine());
        int dancerCount = Integer.parseInt(scan.nextLine());
        int daysToLearn = Integer.parseInt(scan.nextLine());

        double stepsPercentagePerDay = Math.ceil(100.0 / daysToLearn);
        double stepsPercentagePerDancer = stepsPercentagePerDay / dancerCount;

        if(stepsPercentagePerDay <= 13){
            System.out.printf("Yes, they will succeed in that goal! %.2f",
                    stepsPercentagePerDancer);
            System.out.print("%.");
        }else{
            System.out.printf("No, They will not succeed in that goal! Required %.2f",
                    stepsPercentagePerDancer);
            System.out.print("% steps to be learned per day.");
        }
    }
}
