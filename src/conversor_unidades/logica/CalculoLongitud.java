package conversor_unidades.logica;

public class CalculoLongitud {

    public Double calculo(String entrada, String salida, Double valorRecibido) {

        if (entrada.equalsIgnoreCase("Kilómetro")) {
            switch (salida) {
                case "Metro" -> {
                    return valorRecibido * 1000;
                }
                case "Centímetro" -> {
                    return valorRecibido * 100000;
                }
                case "Milímetro" -> {
                    return valorRecibido * 1e+6
;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1e+12;
                }
                case "Milla" -> {
                    return valorRecibido / 1.609;
                }
                case "Yarda" -> {
                    return valorRecibido * 1094;
                }
                case "Pie" -> {
                    return valorRecibido * 3281;
                }
                case "Pulgada" -> {
                    return valorRecibido * 39370;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 1.852;
                }
            }
        }

        if (entrada.equalsIgnoreCase("Metro")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 1000;
                }
                case "Centímetro" -> {
                    return valorRecibido * 100;
                }
                case "Milímetro" -> {
                    return valorRecibido * 1000;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1e+9;
                }
                case "Milla" -> {
                    return valorRecibido / 1609;
                }
                case "Yarda" -> {
                    return valorRecibido * 1.094;
                }
                case "Pie" -> {
                    return valorRecibido * 3.281;
                }
                case "Pulgada" -> {
                    return valorRecibido * 39.370;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 1852;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Centímetro")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 100000;
                }
                case "Metro" -> {
                    return valorRecibido / 100;
                }
                case "Milímetro" -> {
                    return valorRecibido * 10;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1e+7;
                }
                case "Milla" -> {
                    return valorRecibido / 160900;
                }
                case "Yarda" -> {
                    return valorRecibido / 91.44;
                }
                case "Pie" -> {
                    return valorRecibido / 30.48;
                }
                case "Pulgada" -> {
                    return valorRecibido / 2.54;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 185200;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Milímetro")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 1e+6;
                }
                case "Metro" -> {
                    return valorRecibido / 1000;
                }
                case "Centímetro" -> {
                    return valorRecibido / 10;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1e+6;
                }
                case "Milla" -> {
                    return valorRecibido / 1.609e+6;
                }
                case "Yarda" -> {
                    return valorRecibido / 914.4;
                }
                case "Pie" -> {
                    return valorRecibido / 304.8;
                }
                case "Pulgada" -> {
                    return valorRecibido / 25.4;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 1.852e+6;
                }
            }
        }
        if (entrada.equalsIgnoreCase("Nanómetro")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 1e+12;
                }
                case "Metro" -> {
                    return valorRecibido / 1e+9;
                }
                case "Centímetro" -> {
                    return valorRecibido / 1e+7;
                }
                case "Milímetro" -> {
                    return valorRecibido / 1e+6;
                }
                case "Milla" -> {
                    return valorRecibido / 1.609e+12;
                }
                case "Yarda" -> {
                    return valorRecibido / 9.144e+8;
                }
                case "Pie" -> {
                    return valorRecibido / 3.048e+8;
                }
                case "Pulgada" -> {
                    return valorRecibido / 2.54e+7;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 1.852e+12;
                }
            }
        }
         if (entrada.equalsIgnoreCase("Milla")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido * 1.609;
                }
                case "Metro" -> {
                    return valorRecibido * 1609;
                }
                case "Centímetro" -> {
                    return valorRecibido * 160900;
                }
                case "Milímetro" -> {
                    return valorRecibido * 1.609e+6;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1.609e+12;
                }
                case "Yarda" -> {
                    return valorRecibido * 1760;
                }
                case "Pie" -> {
                    return valorRecibido * 5280;
                }
                case "Pulgada" -> {
                    return valorRecibido * 63360;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 1.151;
                }
            }
        }
          if (entrada.equalsIgnoreCase("Yarda")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 1094;
                }
                case "Metro" -> {
                    return valorRecibido / 1.094;
                }
                case "Centímetro" -> {
                    return valorRecibido * 91.44;
                }
                case "Milímetro" -> {
                    return valorRecibido * 914.4;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 9.144e+8;
                }
                case "Milla" -> {
                    return valorRecibido / 1760;
                }
                case "Pie" -> {
                    return valorRecibido * 3;
                }
                case "Pulgada" -> {
                    return valorRecibido * 36;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 2025;
                }
            }
        }
           if (entrada.equalsIgnoreCase("Pie")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 3281;
                }
                case "Metro" -> {
                    return valorRecibido / 3.281;
                }
                case "Centímetro" -> {
                    return valorRecibido * 30.48;
                }
                case "Milímetro" -> {
                    return valorRecibido * 304.8;
                }
                case "Nanómetro" -> {
                    return valorRecibido *  3.048e+8;
                }
                case "Milla" -> {
                    return valorRecibido / 5280;
                }
                case "Yarda" -> {
                    return valorRecibido / 3;
                }
                case "Pulgada" -> {
                    return valorRecibido * 12;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 6076;
                }
            }
        }
            if (entrada.equalsIgnoreCase("Pulgada")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido / 39370;
                }
                case "Metro" -> {
                    return valorRecibido / 39.37;
                }
                case "Centímetro" -> {
                    return valorRecibido * 2.54;
                }
                case "Milímetro" -> {
                    return valorRecibido * 25.4;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 2.54e+7;
                }
                case "Milla" -> {
                    return valorRecibido / 63360;
                }
                case "Yarda" -> {
                    return valorRecibido / 36;
                }
                case "Pie" -> {
                    return valorRecibido / 12;
                }
                case "Milla náutica" -> {
                    return valorRecibido / 72910;
                }
            }
        }
             if (entrada.equalsIgnoreCase("Milla náutica")) {
            switch (salida) {
                case "Kilómetro" -> {
                    return valorRecibido * 1.852;
                }
                case "Metro" -> {
                    return valorRecibido * 1852;
                }
                case "Centímetro" -> {
                    return valorRecibido * 185200;
                }
                case "Milímetro" -> {
                    return valorRecibido * 1.852e+6;
                }
                case "Nanómetro" -> {
                    return valorRecibido * 1.852e+12;
                }
                case "Milla" -> {
                    return valorRecibido * 1.151;
                }
                case "Yarda" -> {
                    return valorRecibido * 2025;
                }
                case "Pie" -> {
                    return valorRecibido * 6076;
                }
                case "Pulgada" -> {
                    return valorRecibido * 72910;
                }
            }
        }
        return 0.0;
    }
}
