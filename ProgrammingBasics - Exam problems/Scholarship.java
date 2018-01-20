import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double wage = Double.parseDouble(scan.nextLine());
        double averageScore = Double.parseDouble(scan.nextLine());
        double minimalWage = Double.parseDouble(scan.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if(wage < minimalWage && averageScore > 4.5){
            socialScholarship = minimalWage * 0.35;
        }if(averageScore >= 5.5){
            excellentScholarship = averageScore * 25;
        }

        if(excellentScholarship == 0 && socialScholarship == 0){
            System.out.println("You cannot get a scholarship!");
        }
        else if(excellentScholarship >= socialScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",
                    Math.floor(excellentScholarship));
        }else if (socialScholarship > excellentScholarship){
            System.out.printf("You get a Social scholarship %.0f BGN",
                    Math.floor(socialScholarship));
        }
    }
}
