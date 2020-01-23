import java.util.Scanner;

public class TemperaturePractice {


    public class TemperatureConverter {

        public  void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 1 to convert from Celsius to Fahrenheit.");
            System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
            ;

            int choice = scanner.nextInt();
            double temperature = 0.0;
            double converted = 0.0;


            if (choice == 1);
            {

                System.out.println("enter the temperature in Celsius");
              //  temperature = scan.nextDouble();
                converted = 9 / 5.0 * temperature + 32;
                System.out.println("Tempreature in Fahreineit= " + converted);
            }
            if (choice==2);
            {

                System.out.println("Enter temperature in Fahrenheit.");
              //  temperature = scan.nextDouble();
                converted = 5/9.0*(temperature-32);
                System.out.println("Temperature in Celsius="+ converted);


            }
        }}
}
