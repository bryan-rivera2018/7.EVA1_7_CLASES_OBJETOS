/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_clases_objetos;

import CLASE.BANCO;
import CLASE.NewBnco;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_7_CLASES_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BANCO bMicuenta = new BANCO();
        bMicuenta.Nombre = "Bryan Rivera Villaseñor";
        bMicuenta.Saldo = 1000;
        System.out.println("Informacion de la cuenta");
        System.out.println("Titular: " + bMicuenta.Nombre);
        System.out.println("Saldo: " + bMicuenta.Saldo);
        //me cambio de banco
        NewBnco bMiMejorBanco = new NewBnco();
        bMiMejorBanco.setNombre("Bryan Rivera Villaseñor");
        bMiMejorBanco.setSaldo(1000);
        System.out.println("Mi nueva cuenta en un mejor banco");
        System.out.println("Titular: " + bMiMejorBanco.getNombre());
        System.out.println("Saldo: " + bMiMejorBanco.getSaldo());
    }
    
}
