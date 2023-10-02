import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolve");
        System.out.println("Given a equation 'a*x+b = c', please enter constants :  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a; // phương trình có nghiệm duy nhất
            System.out.println("Equation pass with x ="+x);
        }else {
            // trường hợp a = 0
            if (b==c){
                // nếu b = c phương trình có vô số nghiệm
                System.out.println("The solution is all x!");
            }else {
                // nếu b # c => phương trình vô nghiệm
                System.out.println("No solution");
            }
        }
    }
}
