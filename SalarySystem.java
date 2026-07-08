import java.util.Scanner;

public class SalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter bonus percentage: ");
        double bonusPercent = sc.nextDouble();

        double bonus = basicSalary * bonusPercent / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("\nEmployee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + totalSalary);

        sc.close();
    }
}