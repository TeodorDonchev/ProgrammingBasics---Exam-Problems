import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstBrotherTime = Double.parseDouble(scan.nextLine());
        double secondBrotherTime = Double.parseDouble(scan.nextLine());
        double thirdBrotherTime = Double.parseDouble(scan.nextLine());
        double dadTime = Double.parseDouble(scan.nextLine());

        double timeForCleaning = (1 / (1 / firstBrotherTime + 1 / secondBrotherTime + 1 / thirdBrotherTime));
        double timeForBreak = timeForCleaning * 0.15;

        double allTime = timeForCleaning + timeForBreak;

        System.out.printf("Cleaning time: %.2f\n", allTime);

        if(allTime <= dadTime){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.\n",
                    Math.floor(dadTime - allTime));
        }else{
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",
                    Math.ceil(allTime - dadTime));
        }
    }
}
