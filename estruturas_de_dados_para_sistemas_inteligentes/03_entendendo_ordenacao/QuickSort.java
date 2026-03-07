package estruturas_de_dados_para_sistemas_inteligentes.entendendo_ordenacao;

public class QuickSort {
    public static void quicksort(int p, int q, int vetor[])

   {

     int x;

 

     if (p < q)

      {

        x = particao(p, q, vetor);

        quicksort(p, x - 1, vetor);

        quicksort(x + 1, q, vetor);

      }

   }

 

public static int particao(int p, int q, int vetor[])

   {

     int j = p - 1;

     int temp, aux = vetor[q];

 

     for (int i = p; i <= q; i++)

      {

        if (vetor[i] <= aux)

         {

           j++;

           temp = vetor[i];

           vetor[i] = vetor[j];

           vetor[j] = temp;

         }

      }

     return j;

   }
}
