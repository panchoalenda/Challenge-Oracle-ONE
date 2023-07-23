package conversor_unidades.logica;

public class CalculoVelocidad {

    public Double calculo(String entrada, String salida, Double valorRecibido) {
//Milla por hora, Pie por segundo, Metro por segundo, Kilómetro por hora, Nudo
        if (entrada.equalsIgnoreCase("Milla por hora")) {
            switch (salida) {
                case "Pie por segundo" -> {
                    return valorRecibido * 1.467;
                }
                case "Metro por segundo" -> {
                    return valorRecibido / 2.237;
                }
                case "Kilómetro por hora" -> {
                    return valorRecibido * 1.609;
                }
                case "Nudo" -> {
                    return valorRecibido / 1.151;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Pie por segundo")) {
            switch (salida) {
                case "Milla por hora" -> {
                    return valorRecibido / 1.467;
                }
                case "Metro por segundo" -> {
                    return valorRecibido / 3.281;
                }
                case "Kilómetro por hora" -> {
                    return valorRecibido * 1.097;
                }
                case "Nudo" -> {
                    return valorRecibido / 1.688;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Metro por segundo")) {
            switch (salida) {
                case "Milla por hora" -> {
                    return valorRecibido * 2.237;
                }
                case "Pie por segundo" -> {
                    return valorRecibido * 3.281;
                }
                case "Kilómetro por hora" -> {
                    return valorRecibido * 3.6;
                }
                case "Nudo" -> {
                    return valorRecibido * 1.944;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Kilómetro por hora")) {
            switch (salida) {
                case "Milla por hora" -> {
                    return valorRecibido / 1.609;
                }
                case "Pie por segundo" -> {
                    return valorRecibido / 1.097;
                }
                case "Metro por segundo" -> {
                    return valorRecibido / 3.6;
                }
                case "Nudo" -> {
                    return valorRecibido / 1.852;
                }
            }
        }
          if (entrada.equalsIgnoreCase("Nudo")) {
            switch (salida) {
                case "Milla por hora" -> {
                    return valorRecibido * 1.151;
                }
                case "Pie por segundo" -> {
                    return valorRecibido * 1.688;
                }
                case "Metro por segundo" -> {
                    return valorRecibido / 1.944;
                }
                case "Kilómetro por hora" -> {
                    return valorRecibido * 1.852;
                }
            }
        }
              
              
        return 0.0;
    }
}
