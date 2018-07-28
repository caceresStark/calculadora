
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorFirstClass;

/**
 *
 * @author alfonso
 */
public class aritmetica {

    public double suma(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public int resta() {
        return 0;
    }

    public double multiplicacion(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public int division() {
        return 0;
    }

    public double residuo(double numerador, double denominador) {
        return (numerador % denominador);
    }

    public int potencia() {
        return 0;
    }

    public double raiz(double primerNumero) {
        double raiz = Math.sqrt(primerNumero);
        return  raiz;
    }
}
