public class Temperature {

        public static void main(String[] args) {


            System.out.println(getKelvin_toCelsius(300));
            System.out.println(getKelvin_toFahrenheit(280));
            System.out.println(getCelsius_toFahrenheit(25));
            System.out.println(getCelsius_toKelvin(28));

        }

        public static double getKelvin_toCelsius(double kelvin) {
            double celsius = (kelvin - 273.15);
            return celsius;
        }

        public static double getKelvin_toFahrenheit(double kelvin) {
            double fahrenheit = (kelvin * 9/5.0 - 459.67);
            return fahrenheit;
        }
        public static double getCelsius_toFahrenheit(double celsius){
            double fahrenheit = (celsius * 9/5.0 +32);
            return fahrenheit;
        }
        public static double getCelsius_toKelvin(double celsius){
            double kelvin = (celsius + 273.15);
            return kelvin;
        }

    }


//      Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit













