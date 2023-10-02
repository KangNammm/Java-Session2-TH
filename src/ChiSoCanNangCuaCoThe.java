import java.util.Scanner;

public class ChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram) :");
        weight = scanner.nextDouble();
        System.out.print("Your height (in meter) :");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "In\n");
        if (bmi< 18)
            System.out.printf("%-20s%s", bmi, "Underweight");
        else if (bmi<25)
            System.out.printf("%-20.2f%s", bmi, "Nomal");
         else if (bmi < 30)
            System.out.printf("%-20s%s", bmi, "Overweight");
        else
            System.out.printf("%-20s%s", bmi, "Obese");
    }
}
