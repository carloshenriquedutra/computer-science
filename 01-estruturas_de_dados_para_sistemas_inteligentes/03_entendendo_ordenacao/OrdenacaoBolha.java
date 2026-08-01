package estruturas_de_dados_para_sistemas_inteligentes.entendendo_ordenacao;

import javax.swing.*;

public class OrdenacaoBolha {

    public static void Bolha(int numeros[]) {
        final int n = numeros.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String arg[]) {
        int num[] = new int[10];

        for (int i = 0; i < 10; i++) {
            String s;
            s = JOptionPane.showInputDialog("Digite número inteiro");
            num[i] = Integer.parseInt(s);
        }

        Bolha(num);

        String s = "";
        for (int i = 0; i < num.length; i++) {
            s = s + num[i] + " ";
        }
        JOptionPane.showMessageDialog(null, s);

        System.exit(0);
    }
}
