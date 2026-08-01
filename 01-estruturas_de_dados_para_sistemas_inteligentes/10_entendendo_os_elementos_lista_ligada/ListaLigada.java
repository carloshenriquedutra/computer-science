public class ListaLigada {

    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static No inicio = null;

    public static void main(String[] args) {
        simularLista();
    }

    public static void simularLista() {
        inserirNoInicio(43);
        inserirNoFinal(89);
        inserirNaPosicao(55, 2);

        consultarInicio();
        consultarFim();
        mostrarLista();

        removerValor(55);
        removerValor(43);
        removerValor(7);
        removerValor(89);

        mostrarLista();
    }

    private static void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    private static void inserirNoFinal(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            inicio = novoNo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    private static void inserirNaPosicao(int valor, int posicao) {
        if (posicao <= 1 || inicio == null) {
            inserirNoInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;
        int indice = 1;

        while (atual.proximo != null && indice < posicao - 1) {
            atual = atual.proximo;
            indice++;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    private static void consultarInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        System.out.println("Início: " + inicio.valor);
    }

    private static void consultarFim() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        System.out.println("Fim: " + atual.valor);
    }

    private static void mostrarLista() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = inicio;
        StringBuilder lista = new StringBuilder("Lista: ");

        while (atual != null) {
            lista.append(atual.valor);
            if (atual.proximo != null) {
                lista.append(" -> ");
            }
            atual = atual.proximo;
        }

        System.out.println(lista);
    }

    private static void removerValor(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            System.out.println("Elemento não existe na lista ligada.");
            return;
        }

        atual.proximo = atual.proximo.proximo;
    }
}
