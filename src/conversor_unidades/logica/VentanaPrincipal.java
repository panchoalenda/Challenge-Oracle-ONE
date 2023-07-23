/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor_unidades.logica;

import conversor_unidades.gui.Principal;

/**
 *
 * @author panch
 */
public class VentanaPrincipal {
    public static void mostrarVentanaPrincipal(){
         Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Conversor de Unidades");
//        ventana.setIconImage(image);
    }
}
