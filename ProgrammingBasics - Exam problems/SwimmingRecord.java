import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secondsForOneMeter = Double.parseDouble(scan.nextLine());

        double timeWithoutBreak = distance * secondsForOneMeter;
        double breakTime = Math.floor((distance / 15)) * 12.5;
        double finishTime = timeWithoutBreak + breakTime;

        if(worldRecord > finishTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finishTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", finishTime - worldRecord);
        }

    }
}
