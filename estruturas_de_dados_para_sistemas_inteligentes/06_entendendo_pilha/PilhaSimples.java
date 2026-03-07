public class PilhaSimples {

    private static final int CAPACIDADE = 3;

    public static void main(String[] args) {
        simularPilha();
    }

    public static void simularPilha() {
        int[] pilha = new int[CAPACIDADE];
        int topo = -1;

        topo = empilhar(pilha, topo, 5);
        topo = empilhar(pilha, topo, 8);
        topo = empilhar(pilha, topo, 4);
        topo = empilhar(pilha, topo, 7);

        topo = desempilhar(pilha, topo);
        topo = desempilhar(pilha, topo);

        consultarTopo(pilha, topo);

        topo = desempilhar(pilha, topo);
        topo = desempilhar(pilha, topo);
    }

    private static int empilhar(int[] pilha, int topo, int valor) {
        if (topo == CAPACIDADE - 1) {
            System.out.println("Pilha cheia!");
            return topo;
        }

        topo++;
        pilha[topo] = valor;
        return topo;
    }

    private static int desempilhar(int[] pilha, int topo) {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return topo;
        }

        return topo - 1;
    }

    private static void consultarTopo(int[] pilha, int topo) {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println(pilha[topo]);
    }
}
