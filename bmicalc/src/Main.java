import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Please enter height in metres: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is : " + bmi);

        if(bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal range");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");





    }
}