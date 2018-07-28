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
public class sistemaCalculadora {

    aritmetica aritmetica = new aritmetica();

    public String operar(String signo, String valor1, String valor2) {
        int conteo;
        double numero;
        System.out.println(valor1);
        System.out.println(valor2);

        try {
            System.out.println(signo + " " + valor1 + " " + valor2);
            switch (signo) {
                case "+":
                    if (valor2.equalsIgnoreCase("")) {valor2 = "0";}
                    return "" + aritmetica.suma(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "-":
                    break;
                case "*":
                    return "" + aritmetica.multiplicacion(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "/":
                    break;
                case "%":
                    return "" + aritmetica.residuo(Double.parseDouble(valor1), Double.parseDouble(valor2));
                case "^":
                    break;
                case "#":
                    return "" + aritmetica.raiz(Double.parseDouble(valor1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

}
