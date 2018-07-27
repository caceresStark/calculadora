
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

    public int suma(int primerNumero, int segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public int resta() {
        return 0;
    }

    public int multiplicacion(int primerNumero, int segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public int division() {
        return 0;
    }

    public int residuo(int numerador, int denominador) {

        return (numerador % denominador);
    }

    public int potencia() {

        return 0;
    }

    public int raiz(int primerNumero, int segundoNumero) {
        double raiz = Math.sqrt(primerNumero);
        return 0;
    }
}
