/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASE;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class NewBnco {
    //Siempre tienen que ser privados
    //atributos de clase
    private String Nombre;
    private double Saldo;
    
    //Simepre debe existir un intermediario con los datos
    //intermediarios son metodos: get (lectura) y set (escritura)
    //metodos:
    //nivel de acceso - valor de retorno - nombre (variables de entrada)
    //leer datos de nuestra clase
    //comportamientos de clase
    //todo metodo publico de la clase es la interfaz de comunicacion
    public String getNombre(){
        return Nombre;
    }
    public double getSaldo(){
        return Saldo;
    }
// escribir datos en nuestra clase
    public void setNombre(String sVal){
        Nombre = sVal;
    }
    public void setSaldo(double sVal){
        Saldo = sVal;
    }
}

