Conversões e Sistemas Numéricos
Introdução

Bem-vindo ao nosso estudo de conversões e sistemas numéricos. Este estudo ajudará você entender como os sistemas numéricos são importantes em na organização lógica das redes. Saber realizar as conversões agiliza o raciocínio. Vamos começar a estudar o sistema binário.

 

Binário

O entendimento de sistema binário como “idioma” das transmissões no contexto computacional é essencial para esse recorte na disciplina. Em especial, o uso do sistema binário aparece de forma expressiva no endereçamento.

 

Os endereços

Os endereços IPv4 na linguagem das máquinas são binários, uma série 1s e 0s. Para os administradores de rede (e usuários) os endereços em binário são difíceis de gerenciar, portanto, o sistema operacional dos equipamentos e dispositivos devem convertê-los em decimais de acordo com a aplicação (ou o contrário, de decimais para binários). Binário é um sistema numérico que consiste em dois símbolos, dígitos 0 e 1, chamados bits. Em contraste, o sistema de numeração decimal consiste em 10 símbolos, dígitos de 0 a 9 (TANENBAUM e WETHERALL, 2011).

É importante entendermos o sistema binário porque hosts, servidores e dispositivos de rede usam, internamente, endereçamento binário.

 

Relembrando o cenário…

A Figura 1 a seguir ilustra o cenário de uma rede com os endereços IP em binário.


A Figura 2 a seguir mostra o mesmo cenário anterior, mas para facilitar o entendimento, com os endereços IP em decimal.



Notação posicional

O que aprendemos desde o princípio…

A Figura 3 a seguir ilustra o sistema de notação posicional decimal para o número decimal 168.


A Tabela 1 a seguir ilustra como o sistema de notação posicional decimal opera.



Com binário, “falamos” diferente

A notação posicional binária opera conforme descrito na Tabela 2 a seguir.


O exemplo na Tabela 3 a seguir mostra como um número binário 10101000 corresponde ao número 168.



Praticando binário

Alguns exemplos de conversões envolvendo binário e aplicando o que foi tratado anteriormente.

 

IP - Binário para Decimal

A Figura 4 a seguir ilustra um exemplo de um endereço IP em binário 11000000.10101000.00001011.00001010 e o correspondente em decimal 192.168.11.10.


IP - Decimal para Binário

A Figura 5 a seguir ilustra um exemplo de um endereço IP em decimal 172.16.1.98 e o correspondente em binário 10101100.00010000.00000001.01100010.


Hexadecimal

Complementar ao sistema numérico binário há o hexadecimal. É utilizado tanto para representação do endereçamento físico MAC quanto o endereçamento lógico no IPv6 (KUROSE e ROSS, 2016).

 

Equivalência

A Tabela 4 a seguir mostra os valores decimais e hexadecimais equivalentes para o binário 0000 a 1111.


​É mais fácil expressar um valor como um único dígito hexadecimal do que como quatro bits binários. O sistema de numeração hexadecimal é usado em rede para representar endereços IP versão 6 e endereços MAC Ethernet. Os endereços IPv6 têm 128 bits e cada 4 bits é representado por um único dígito hexadecimal totalizando 32 hexadecimais. O formato é x: x: x: x: x: x: x: x: x, onde cada “x” são quatro valores hexadecimais (um hexteto - 16 bits ou quatro hexadecimais). A Figura 6 a seguir ilustra o formato do endereço IPv6.​


Relembrando o cenário…

A Figura 7 a seguir mostra o cenário da rede com os endereços IPv6.


Notação posicional

A Tabela 5 ilustra a notação posicional hexadecimal.


Conversão - Hexa para Decimal

A Tabela 6 a seguir mostra como o número hexadecimal 2A corresponde ao número decimal 42.


Praticando hexadecimal

Conversão - Decimal para Hexa

A Figura 8 a seguir ilustra um exemplo de conversão do número decimal 197 para hexadecimal.


Conversão - Hexa para Decimal

A Figura 9 a seguir mostra um exemplo de conversão do número hexadecimal 9F para decimal.


Atividade Extra

A Cisco Learning Network disponibiliza um jogo binário. Aumente sua compreensão dos números binários e da velocidade de conversão com este jogo. Em pouco tempo você fará essas conversões de cabeça. Para jogar acesse em: <https://learningcontent.cisco.com/games/binary/index.html>.

 

 

Referência Bibliográfica

KUROSE, J. F.; ROSS, K. W. Redes de Computadores e a Internet: uma abordagem top-down, 6ª. ed. São Paulo: Pearson Education do Brasil, 2016.

TANENBAUM, A. S.; WETHERALL, D. Redes de Computadores, 5ª. ed. Pearson, 2011.