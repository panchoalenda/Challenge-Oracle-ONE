package conversor_unidades.logica;

public class CalculoVolumen {
private double valor = 0;
    public Double calculo(String entrada, String salida, Double valorRecibido) {
//Metro cúbico, Litro, Mililitro, Galón, Onza

        if (entrada.equalsIgnoreCase("Metro cúbico")) {
            switch (salida) {
                case "Litro" -> {
                    return valorRecibido * 1000;
                }
                case "Mililitro" -> {
                    return valorRecibido * 1e+6;
                }
                case "Galón" -> {
                    return valorRecibido * 264.2;
                }
                case "Onza" -> {
                    return valorRecibido * 33810;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Litro")) {
            switch (salida) {
                case "Metro cúbico" -> {
                    return valorRecibido / 1000;
                }
                case "Mililitro" -> {
                    return valorRecibido * 1000;
                }
                case "Galón" -> {
                    return valorRecibido /  3.785;
                }
                case "Onza" -> {
                    return valorRecibido * 33.814;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Mililitro")) {
            switch (salida) {
                case "Metro cúbico" -> {
                    return valorRecibido / 1e+6;
                }
                case "Litro" -> {
                    return valorRecibido / 1000;
                }
                case "Galón" -> {
                    return valorRecibido /  3785;
                }
                case "Onza" -> {
                    return valorRecibido / 29.574;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Galón")) {
            switch (salida) {
                case "Metro cúbico" -> {
                    return valorRecibido / 264.2;
                }
                case "Litro" -> {
                    return valorRecibido * 3.785;
                }
                case "Mililitro" -> {
                    return valorRecibido * 3785;
                }
                case "Onza" -> {
                    return valorRecibido * 128;
                }
            }
        }
          if (entrada.equalsIgnoreCase("Onza")) {
            switch (salida) {
                case "Metro cúbico" -> {
                    return valorRecibido / 33810;
                }
                case "Litro" -> {
                    return valorRecibido / 33.814;
                }
                case "Mililitro" -> {
                    return valorRecibido * 29.574;
                }
                case "Galón" -> {
                    return valorRecibido / 128;
                }
            }
        }
         
              
        return 0.0;
    }
}
