import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scan.nextLine());
        double puzzleCount = Double.parseDouble(scan.nextLine());
        double talkingDollsCount = Double.parseDouble(scan.nextLine());
        double puffyBearsCount = Double.parseDouble(scan.nextLine());
        double minionsCount = Double.parseDouble(scan.nextLine());
        double trucksCount = Double.parseDouble(scan.nextLine());

        double puzzlePrice = puzzleCount * 2.60;
        double talkingDollsPrice = talkingDollsCount * 3;
        double puffyBearsPrice = puffyBearsCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double trucksPrice = trucksCount * 2;

        double price = puzzlePrice + talkingDollsPrice + puffyBearsPrice + minionsPrice + trucksPrice;
        double count = puzzleCount + talkingDollsCount + puffyBearsCount + minionsCount + trucksCount;

        if (count >= 50) {
            price -= price * 0.25;
        }

        price -= price * 0.10;

        if (price >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", price - tripPrice);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - price);
        }

    }
}
