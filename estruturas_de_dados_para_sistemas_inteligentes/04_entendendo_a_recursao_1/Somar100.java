package estruturas_de_dados_para_sistemas_inteligentes.entendendo_a_recursao_1;

import javax.swing.*;

public class Somar100 {

    public static int soma1(int numero, int soma) {
        int resultado;

        if (numero == 100) {
            resultado = numero + soma;
        } else {
            resultado = soma1(numero + 1, numero + soma);
        }

        return resultado;
    }

    public static void main(String[] args) {
        int soma = soma1(1, 0);

        JOptionPane.showMessageDialog(
            null,
            "A soma dos 100 primeiros numeros e: " + soma
        );

        System.exit(0);
    }
}
