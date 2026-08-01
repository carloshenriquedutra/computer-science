Camada de Enlace
Introdução

Bem-vindo ao nosso estudo da camada de enlace. Neste estudo você compreenderá como a camada de enlace participa no processo de comunicação das redes. Conhecer como são tratados os quadros que apresentam erros na recepção ajuda a entender os mecanismos desenvolvidos para controle de erros. Vamos começar a estudar o propósito da camada de enlace.

 

Proposição

A camada de enlace

A camada de enlace de dados do modelo OSI (camada 2) prepara os dados da camada de rede para a camada física o que inclui a placa de interface de rede (NIC) para as comunicações. Permite que camadas superiores acessem a mídia. A camada superior desconhece o tipo de mídia usada para encaminhar os dados. Aceita os pacotes da camada 3 e os encapsula em quadros da camada 2. Controla como os dados são transmitidos e recebidos na mídia (meio físico). Troca os quadros entre pontos de extremidade da meio físico do enlace. Na recepção, recebe os dados e os direciona para a camada superior. Executa também, na recepção, a detecção de erros e rejeita qualquer quadro corrompido.

Em redes de computadores, um nó é um dispositivo que pode receber, criar, armazenar ou encaminhar dados ao longo de um caminho de comunicação, que pode ser um dispositivo final ou um dispositivo intermediário. Sem a camada de enlace, os protocolos da camada de rede teriam que fazer implementações para se conectar a todos os tipos de mídia que poderiam existir pelo caminho de entrega. Além disso, toda vez que uma nova tecnologia de rede fosse desenvolvida, o IP teria que se adaptar. Em suma, no sentido da transmissão, a camada de enlace adiciona o destino Ethernet da camada 2 e as informações da NIC de origem a um pacote da camada 3. Em seguida, converte as informações em um formato compatível com a camada física para a transmissão de cada bit (TANENBAUM e WETHERALL, 2011).

 

Subcamadas

Os padrões IEEE 802 LAN/MAN são específicos para LANs Ethernet, LANs sem fio (WLAN), redes de área pessoal sem fio (WPAN) e outros. A camada de enlace de dados LAN/MAN IEEE 802 tem duas subcamadas:

Logical Link Control (LLC): comunica-se entre o software de rede nas camadas superiores e o hardware do dispositivo nas camadas inferiores. Coloca informações no quadro que identifica qual protocolo da camada de rede está sendo usado para o quadro. Essas informações permitem que protocolos da camada 3 usem a mesma interface de rede.
Media Access Control (MAC): é responsável pelo encapsulamento de dados e controle de acesso à mídia. Fornece endereçamento de camada de enlace e está integrado a várias tecnologias de camada física.
A Figura 1 a seguir ilustra detalhes da camada de enlace.


A subcamada LLC recebe os dados do protocolo de rede (IPv4 ou IPv6) e adiciona informações de controle da camada 2 para ajudar a entregar o pacote ao nó de destino. A subcamada MAC controla a NIC e outro hardware responsável por enviar e receber dados através do meio físico LAN/MAN (com fio ou sem fio). A subcamada MAC fornece encapsulamento que inclui:

Delimitação de quadro: o processo de enquadramento fornece delimitadores importantes para identificar campos em um quadro. Esses bits de delimitação fornecem sincronização entre os nós transmissores e receptores.
Endereçamento: fornece endereçamento de origem e destino para transportar o quadro da camada 2 entre dispositivos no mesmo meio físico compartilhado.
Detecção de erros: inclui um trailer (com Cyclic Redundancy Check - CRC) usado para detectar erros na recepção.
A subcamada MAC também fornece controle de acesso à mídia (meio) e assim permite que vários dispositivos se comuniquem em uma mídia compartilhada (half-duplex). As comunicações full-duplex não requerem controle de acesso.

 

Acesso aos meios

Cada ambiente de rede pode ter características diferentes para as rotas:

LAN Ethernet, geralmente, consiste em muitos hosts disputando o acesso ao meio e a subcamada MAC resolve isso.
Em links seriais o método de acesso pode ser uma conexão direta entre dois dispositivos e não requerer as técnicas da subcamada MAC IEEE 802.
As interfaces do roteador encapsulam o pacote no quadro apropriado. Um método de controle de acesso à mídia (meio) adequado é usado para acessar cada link. Em qualquer troca de pacotes da camada de rede pode haver várias camadas de enlace de dados e transições de mídia. A cada salto ao longo do caminho, um roteador aceita um quadro de uma mídia, desencapsula o quadro, encapsula o pacote em um novo quadro e o encaminha para o meio físico desse segmento da rede. A Figura 2 a seguir mostra os detalhes dos quadros ao longo do caminho.


Padrões

Ao contrário dos protocolos das camadas superiores do conjunto TCP/IP, os protocolos da camada de enlace não são definidos por RFCs. A IETF mantém os protocolos e serviços funcionais para o conjunto de protocolos TCP/IP nas camadas superiores, mas não define as funções e a operação da camada de acesso à rede TCP/IP. As organizações de engenharia que definem padrões abertos e protocolos que se aplicam à camada de acesso à rede (ou seja, as camadas física e de enlace do OSI) incluem:

Instituto de Engenheiros Elétricos e Eletrônicos (IEEE)
União Internacional de Telecomunicações (ITU)
Organização Internacional de Padronização (ISO)
American National Standards Institute (ANSI)
 

Topologias

Físicas e Lógicas

Como a camada de enlace prepara os dados de rede para a camada física deve conhecer a topologia lógica da rede para poder determinar o que é necessário para transferir quadros de um dispositivo para outro. A topologia de uma rede é o arranjo, ou relacionamento, dos dispositivos de rede e as interconexões entre eles. Existem dois tipos de topologias usadas ao descrever redes LAN e WAN:

Topologia física: identifica as conexões físicas e como os dispositivos finais e os dispositivos intermediários são interconectados
Topologia lógica: refere-se à maneira como uma rede transfere quadros de um nó para o próximo.
A camada de enlace de dados “percebe” a topologia lógica de uma rede ao controlar o acesso de dados à mídia. É a topologia lógica que influencia o tipo de estrutura de rede e controle de acesso à mídia usado.

 

WAN

As redes WANs são interconectadas em três topologias físicas típicas.

 

Ponto a Ponto

Consiste em um link (enlace) permanente entre dois endpoints.  A Figura 3 a seguir ilustra a topologia ponto a ponto.


Hub and Spoke

É uma topologia WAN em estrela na qual um site central interconecta sites de filiais por meio do uso de links (enlaces) ponto a ponto. Os sites de filiais não podem trocar dados com outros sites de filiais sem passar pelo site central. A Figura 4 a seguir mostra a topologia Hub and Spoke.


Mesh (Malha)

Essa topologia fornece alta disponibilidade, mas para isso requer que cada sistema final esteja interconectado a todos os outros sistemas (totalmente conectada, full mash). Os custos administrativos e físicos podem ser significativos. Cada link é um link ponto a ponto para o outro nó. A Figura 5 a seguir ilustra a topologia em malha.


WAN Ponto a Ponto

Topologias físicas ponto a ponto conectam diretamente dois nós. Desta maneira, dois nós não precisam compartilhar a mídia com outros hosts. O uso de um protocolo de comunicação serial, como protocolo ponto a ponto (PPP), um nó não precisa fazer nenhuma determinação sobre se um quadro de entrada é destinado a ele ou a outro nó. Os protocolos de enlace de dados lógicos podem ser muito simples, já que todos os frames na mídia só podem viajar de um para outro nó. O nó coloca os quadros na mídia em uma extremidade e esses quadros são retirados da mídia pelo nó na outra extremidade do circuito ponto a ponto. A Figura 6 a seguir ilustra um circuito ponto a ponto.


​Um nó de origem e de destino pode ser conectado indiretamente um ao outro através de alguma distância geográfica usando vários dispositivos intermediários. No entanto, o uso de dispositivos físicos na rede não afeta a topologia lógica. A Figura 7 a seguir mostra um ponto a ponto (lógico) através de uma rede.​


LAN

Em LANs de multiacesso, os dispositivos finais são interconectados usando topologias em estrela ou estrela estendida. Às vezes, pode haver apenas dois dispositivos conectados na LAN Ethernet. Por exemplo, dois roteadores interconectados. Neste caso uma topologia ponto a ponto. As tecnologias antigas de Ethernet e Token Ring LAN incluíam dois outros tipos de topologias: Barramento e Anel (Ring).

 

Estrela (Star)

Nesse tipo de topologia os dispositivos finais são conectados a um dispositivo intermediário central, neste caso, um switch Ethernet. São fáceis de instalar, escalonáveis e fáceis de solucionar problemas. A Figura 8 a seguir ilustra uma topologia em estrela.


Estrela estendida (Extended Star)

Segue o mesmo princípio da topologia estrela. A Figura 9 a seguir mostra a topologia estrela estendida.


Barramento (Bus)

Todos os sistemas finais são encadeados uns aos outros e terminados de alguma forma em cada extremidade (barramento compartilhado). Dispositivos de infraestrutura, como switches, não são necessários para interconectar os dispositivos finais.  As redes Ethernet legadas costumavam ser topologias de barramento usando cabos coaxiais. A Figura 10 a seguir ilustra a topologia de barramento com cabo coaxial (com conectores BNC tipo T e terminações nas extremidades do cabo para casamento de impedância).


Anel (Ring)

Os sistemas finais são conectados aos respectivos vizinhos formando um anel. O anel não precisa ser terminado, ao contrário da topologia de barramento. As redes legadas FDDI (Fiber-Distributed Data Interface) e Token Ring usavam topologias em anel. A Figura 11 a seguir mostra a topologia em anel.


Comunicação

Tipos de comunicação duplex:

Half-duplex: ambos os dispositivos podem transmitir e receber na mídia, mas não podem fazer isso simultaneamente. As redes WLANs e os hubs Ethernet (topologia de barramento legado) usam o modo half-duplex. O half-duplex permite que apenas um dispositivo envie ou receba por vez no meio compartilhado.
Full-duplex: ambos os dispositivos podem transmitir e receber simultaneamente na mídia compartilhada. A camada de enlace pressupõe que a mídia esteja disponível para transmissão para ambos os nós a qualquer momento. Os switches Ethernet operam em modo full-duplex por padrão, mas podem operar em half-duplex se estiverem conectados a um dispositivo como um hub Ethernet.
É importante que duas interfaces interconectadas, como uma NIC de host e uma interface em um switch Ethernet, operem no mesmo modo duplex. Caso contrário, haverá uma incompatibilidade criando ineficiência e latência no link.

 

Métodos de Controle de Acesso

As LANs Ethernet e WLANs são exemplos de redes multiacesso. Uma rede multiacesso é uma rede que pode ter dois ou mais dispositivos finais tentando acessar a rede simultaneamente. Algumas redes multiacesso exigem regras para controlar como os dispositivos compartilham a mídia física. Existem dois métodos básicos de controle de acesso para mídia compartilhada:

Acesso baseado em contenção
Acesso controlado
 

Baseado em Contenção

Em redes multiacesso baseadas em contenção todos os nós estão operando em half-duplex, competindo pelo uso do meio. No entanto, apenas um dispositivo pode enviar por vez. Portanto, haverá um processo ativado se mais de um dispositivo transmitir ao mesmo tempo. Exemplos de métodos de acesso baseados em contenção incluem o seguinte:

Carrier sense multiple access with collision detection (CSMA/CD) usado em LANs Ethernet de topologia de barramento (rede com cabo coaxial e equipamento hub).
Carrier sense multiple access with collision avoidance (CSMA/CA) usado em LANs sem fio
 

Acesso Controlado

Em uma rede multiacesso com acesso controlado cada nó tem seu próprio tempo para usar o meio. Esses tipos determinísticos de redes legadas são ineficientes porque um dispositivo deve esperar sua vez para acessar o meio. Exemplo de rede multiacesso que usa acesso controlado é a Token Ring legada.

 

CSMA/CD

As redes que operam em modo half-duplex (apenas um dispositivo pode enviar ou receber por vez) requerem um processo para controlar quando um dispositivo pode enviar e o que acontece quando vários dispositivos enviam ao mesmo tempo. Se dois dispositivos transmitem ao mesmo tempo ocorre uma colisão. Para LANs Ethernet legadas, ambos os dispositivos detectam a colisão na rede. Esta é a detecção de colisão (CD) do CSMA/CD. A NIC compara os dados transmitidos com os dados recebidos, ou reconhecendo que a amplitude do sinal é maior do que o normal na mídia. Os dados enviados por ambos os dispositivos são corrompidos (sobrepostos) e precisarão ser reenviados (KUROSE e ROSS, 2016). A Figura 12 a seguir ilustra a transmissão de um frame do PC1 para o PC3.


CSMA/CA

O CSMA/CA usa um método semelhante ao CSMA/CD para detectar se a mídia está disponível, mas usa técnicas adicionais. Em ambientes sem fio, pode não ser possível para um dispositivo detectar uma colisão. O CSMA/CA não detecta colisões, mas tenta evitá-las esperando antes de transmitir. Cada dispositivo que transmite inclui o tempo de duração necessário para a transmissão. Todos os outros dispositivos sem fio recebem essas informações e sabem por quanto tempo o meio ficará indisponível (KUROSE e ROSS, 2016). A Figura 13 a seguir mostra um exemplo de uma a comunicação CSMA/CA.


Estrutura do Frame

Data Link – Enlace

A camada de enlace prepara os dados (pacote IPv4 ou IPv6) para transporte pela mídia local, encapsulando-os com um cabeçalho e um trailer para montar o quadro. O protocolo de enlace de dados é responsável pelas comunicações NIC-para-NIC na mesma rede. Cada tipo de frame tem três partes básicas: Header (cabeçalho), Data (Dados) e Trailer. Ao contrário de outros protocolos de encapsulamento, a camada de enlace de dados anexa informações na forma de um trailer no final do quadro.

Todos os protocolos da camada de enlace encapsulam os dados (pacotes da camada 3) dentro do campo de dados do quadro. No entanto, a estrutura do quadro e os campos contidos no cabeçalho e no trailer variam de acordo com o protocolo. Não existe uma estrutura de quadro que atenda às necessidades de todo o transporte de dados em todos os tipos de mídia. Dependendo do ambiente, a quantidade de informações de controle necessária no quadro varia para corresponder aos requisitos de controle de acesso da mídia e da topologia lógica. Por exemplo, um quadro WLAN deve incluir procedimentos para evitar colisões e, portanto, requer informações de controle adicionais quando comparado a um quadro Ethernet (KUROSE e ROSS, 2016). A Figura 14 a seguir ilustra a estrutura de um quadro.


Endereços

A camada de enlace fornece o endereçamento para a transmissão de um frame em uma mídia local compartilhada. Os endereços dos dispositivos nesta camada são chamados de endereços físicos. O endereçamento da camada de enlace está contido no cabeçalho do quadro e especifica o nó de destino do quadro na rede local. A NIC pode, então, determinar rapidamente se corresponde ao seu próprio endereço da camada 2 antes de aceitar o restante do quadro.  Ao contrário dos endereços lógicos da camada 3, que são hierárquicos, os endereços físicos não indicam em qual rede o dispositivo está localizado. Em vez disso, o endereço físico é exclusivo para o dispositivo. Um dispositivo ainda funcionará com o mesmo endereço físico da camada 2, mesmo se for movido para outra rede ou sub-rede. Portanto, os endereços da camada 2 são usados apenas para conectar dispositivos dentro da mesma mídia compartilhada, na mesma rede IP.

 

LAN e WAN

Os protocolos Ethernet são usados ​​por LANs com fio. As comunicações sem fio se enquadram nos protocolos WLAN (IEEE 802.11). Esses protocolos foram projetados para redes multiacesso. Alguns dos protocolos WAN desenvolvidos ao longo dos anos incluem, por exemplo, PPP (Point-to-Point Protocol), HDLC (High-Level Data Link Control), X.25, Frame Relay, ATM (Asynchronous Transfer Mode) e IP/MPLS (IP/Multi Protocol Label Switching).

Cada protocolo realiza controle de acesso à mídia para topologias lógicas da camada 2 especificadas. Isso significa que vários dispositivos de rede diferentes podem atuar como nós que operam na camada de enlace de dados ao implementar esses protocolos. Esses dispositivos incluem as NICs em computadores, bem como as interfaces em roteadores (camada 3) e switches (camada 2).

A diferença na largura de banda normalmente resulta no uso de protocolos diferentes para LANs e WANs:  Ethernet, 802.11 sem fio, PPP, HDLC e Frame Relay, por exemplo. A Figura 15 a seguir mostra os dispositivos e protocolos utilizados nos enlaces de uma rede desde um notebook até um servidor.



Atividade Extra

Assista o vídeo: CSMA/CD and CSMA/CA Explained. Disponível em <https://www.youtube.com/watch?v=iKn0GzF5-IU>.

 

 

Referência Bibliográfica

KUROSE, J. F.; ROSS, K. W. Redes de Computadores e a Internet: uma abordagem top-down, 6ª. ed. São Paulo: Pearson Education do Brasil, 2016.

TANENBAUM, A. S.; WETHERALL, D. Redes de Computadores, 5ª. ed. Pearson, 2011.