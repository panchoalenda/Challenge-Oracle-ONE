package conversor_unidades.logica;

public class CalculoTemperatura {

    public Double calculo(String entrada, String salida, Double valorRecibido) {
//Fahrenheit °F, Celsius °C, Kelvin °K
        if (entrada.equalsIgnoreCase("Fahrenheit °F")) {
            switch (salida) {
                case "Celsius °C" -> {
                    return ((valorRecibido - 32) * 5/9);   //(1 °F − 32) × 5 / 9 = -17,22 °C
                }
                case "Kelvin °K" -> {
                    return ((valorRecibido - 32) * 5 / 9 + 273.15); // (1°F - 32) * 5/9 +273.15 = 255.928


                }
            }
        }
        if (entrada.equalsIgnoreCase("Celsius °C")) {
            switch (salida) {
                case "Fahrenheit °F" -> {
                    return ((valorRecibido * 9 / 5) + 32); //(1 °C × 9 / 5) + 32 = 33,8 °F
                }
                case "Kelvin °K" -> {
                    return valorRecibido + 273.15;  //1 °C + 273,15 = 274,15 K
                }
            }
        }
         if (entrada.equalsIgnoreCase("Kelvin °K")) {
            switch (salida) {
                case "Fahrenheit °F" -> {
                    return ((valorRecibido - 273.15) * 9 / 5 + 32);   //(1 K − 273,15) × 9 / 5 + 32 = -457,9 °F
                }
                case "Celsius °C" -> {
                        return (valorRecibido - 273.15);   //(1 °F − 273.15)=-272.1°C
                }
            }
        }

        
        return 0.0;
    }
}
