/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.calculadora;

/**
 *
 * @author OscarRuiz
 */
public class Calculadora {
    //Atributos
    private int operador1;
    private int operador2;
    
    //Contructores
    public Calculadora () {
        
    }
    public Calculadora (int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        
    }
    //Métodos
    
    public int Sumar() {
        int suma = this.operador1 + this.operador2;
        return suma;
    }
    
    public int Restar() {
        int resta = this.operador1 - this.operador2;
        return resta;
    }
    
    public int Multiplicar() {
        int multiplicación = this.operador1 * this.operador2;
        return multiplicación;
    }
    
    public double Dividir() {
        double divir = (double)this.operador1 / (double)this.operador2;
        return divir;
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    
    
}
