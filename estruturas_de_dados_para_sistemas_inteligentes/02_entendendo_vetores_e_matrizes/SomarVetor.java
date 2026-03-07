package estruturas_de_dados_para_sistemas_inteligentes.entendendo_vetores_e_matrizes;
// Import necessário para usar JOptionPane (caixas de diálogo gráficas)
import javax.swing.JOptionPane;

class SomarVetor {
    // Método principal - ponto de entrada do programa Java
    public static void main(String[] args) {
        
        // Declara e inicializa o vetor/array de 100 posições inteiras
        // new int[100] aloca memória para 100 números inteiros
        int[] VetSoma = new int[100];
        
        // Declara variável de controle do loop (i) e soma inicializada em 0
        int i, soma = 0;

        // Loop for: i vai de 0 até 99 (100 iterações no total)
        // i < 100 é mais limpo que i <= 99 e evita erros de índice
        for (i = 0; i < 100; i++) {
            
            // Lê input do usuário via diálogo gráfico e converte String → int
            // JOptionPane.showInputDialog retorna String, parseInt converte para número
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            
            // Acumula o valor lido na variável soma (soma += é mais limpo que soma = soma +)
            soma += VetSoma[i];
        }

        // Mostra resultado final em caixa de diálogo (mais consistente com input GUI)
        JOptionPane.showMessageDialog(null, "A soma dos 100 valores é: " + soma);
        
        // System.exit(0) opcional - encerra programa com código de saída 0 (sucesso)
        // Não é necessário em aplicações console simples
        // System.exit(0);
    }
}
