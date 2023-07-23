package conversor_unidades.logica;

public class CalculoMoneda {

    public Double calculo(String entrada, String salida, Double valorRecibido) {
//Peso argentino, Euro, Dolar estadounidense, Real, Pesos chilenos, Peso mexicano
//Dolar estadounidense Peso argentino
        if (entrada.equalsIgnoreCase("Peso argentino")) {
            switch (salida) {
                case "Euro" -> {
                    return valorRecibido * 0.0035;
                }
                case "Dolar estadounidense" -> {
                    return valorRecibido * 0.0038;
                }
                case "Real" -> {
                    return valorRecibido * 0.019;
                }
                case "Pesos chilenos" -> {
                    return valorRecibido * 3.05;
                }
                case "Peso mexicano" -> {
                    return valorRecibido * 0.066;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Euro")) {
            switch (salida) {
                case "Peso argentino" -> {
                    return valorRecibido * 286.07;
                }
                case "Dolar estadounidense" -> {
                    return valorRecibido * 1.10;
                }
                case "Real" -> {
                    return valorRecibido * 5.34;
                }
                case "Pesos chilenos" -> {
                    return valorRecibido * 873.68;
                }
                case "Peso mexicano" -> {
                    return valorRecibido * 18.81;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Dolar estadounidense")) {
            switch (salida) {
                case "Peso argentino" -> {
                    return valorRecibido * 260.77;
                }
                case "Euro" -> {
                    return valorRecibido * 0.91;
                }
                case "Real" -> {
                    return valorRecibido * 4.87;
                }
                case "Pesos chilenos" -> {
                    return valorRecibido * 796.43;
                }
                case "Peso mexicano" -> {
                    return valorRecibido * 17.15;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Real")) {
            switch (salida) {
                case "Peso argentino" -> {
                    return valorRecibido * 53.56;
                }
                case "Euro" -> {
                    return valorRecibido * 0.19;
                }
                case "Dolar estadounidense" -> {
                    return valorRecibido * 0.21;
                }
                case "Pesos chilenos" -> {
                    return valorRecibido * 163.58;
                }
                case "Peso mexicano" -> {
                    return valorRecibido * 3.52;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Pesos chilenos")) {
            switch (salida) {
                case "Peso argentino" -> {
                    return valorRecibido * 0.32;
                }
                case "Euro" -> {
                    return valorRecibido * 0.0011;
                }
                case "Dolar estadounidense" -> {
                    return valorRecibido * 0.0012;
                }
                case "Real" -> {
                    return valorRecibido * 0.0060;
                }
                case "Peso mexicano" -> {
                    return valorRecibido * 0.021;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Peso mexicano")) {
            switch (salida) {
                case "Peso argentino" -> {
                    return valorRecibido * 15.21;
                }
                case "Euro" -> {
                    return valorRecibido * 0.053;
                }
                case "Dolar estadounidense" -> {
                    return valorRecibido * 0.058;
                }
                case "Real" -> {
                    return valorRecibido * 0.28;
                }
                case "Pesos chilenos" -> {
                    return valorRecibido * 46.45;
                }
            }
        }

        return 0.0;
    }
}
