import javax.swing.*;

 

class Potencia

   {

      // Este é o método da função recursiva chamada pot

      // que recebe dois números inteiros e retorna um número inteiro

      static int pot(int base , int exp)

         {

            if (base == 0) // parada recursiva, caso 1 da recursão

               {

                  return 0;

               }

            else

               {

                  if (exp == 0) // parada recursiva, caso 1 da recursão

                     {

                        return 1;

                     }

                  else

                     {

                        return pot(base , exp-1) * base; // chamada recursiva, casos 2 e 3 da recursão

                     }

               }

         } // fim da função pot

 

      //escrevendo o método principal no Java

      public static void main(String entrada [ ])

         {

            int b, e, p;

 

            b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base para calculo da potencia"));

            e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente para calculo da potencia"));

            if ( b < 0 || e < 0)

               {

                  System.out.println("Valor digitado incorretamente, os valores devem ser maiores ou iguais a zero");

               }

            else

               {

                  p = pot(b,e);

                  System.out.println(b + " elevado a " + e + " e igual a " + p);

               }

            System.exit(0);

         } // fim do void main

   } // fim da classe
