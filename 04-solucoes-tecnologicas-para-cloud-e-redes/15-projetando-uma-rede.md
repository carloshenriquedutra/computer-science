Projetando uma rede
Introdução

Bem-vindo ao nosso estudo projetando uma rede. Este estudo auxiliará você a compreender os aspectos relevantes ao projetar uma rede. Entender as necessidades e requisitos de projeto é fundamental para a realização de um projeto adequado. Vamos começar com os dispositivos típicos de rede.

 

Dispositivos

 

“Pequenas” Redes – Topologia

No projeto das primeiras redes de computadores, o hardware foi a principal preocupação e o software ficou em segundo plano. Essa estratégia foi abandonada. Atualmente, o software de rede é altamente estruturado (TANENBAUM e WETHERALL, 2011).

A maioria das empresas é pequena e, portanto, as redes que implementam, em geral, são pequenas. As pequenas redes normalmente têm uma única conexão com a rede WAN via DSL, cabo modem ou conexão Ethernet. As grandes redes requerem um departamento de TI para operar, manter, proteger e solucionar problemas dos dispositivos de rede, sistemas  e os dados das organizações (corporações).  Mesmo para uma pequena rede requer muitas das mesmas habilidades necessárias para gerenciar uma rede maior.

A Figura 1  a seguir ilustra um exemplo de uma rede típica de pequenas empresas.


“Pequenas” Redes – Escolha

 

Custo

O custo de um switch ou roteador é determinado pela capacidade e recursos disponíveis. Inclui quantidade e tipos de portas disponíveis e a capacidade de comutação do backplane. Outros fatores que influenciam o custo são os recursos de gerenciamento de rede, tecnologias de segurança e de comutação avançadas incorporadas. O custo dos cabos metálicos e ópticos necessários para conectar os dispositivos da rede também é considerado.  Outro elemento-chave que afeta o custo é a necessidade de redundância de dispositivos e conexões da rede para fins de requisitos de disponibilidade.

 

Tipos de Portas e Interfaces

Escolher a quantidade e o tipo de portas em um roteador ou switch é uma decisão crítica. Os computadores mais recentes possuem NICs de 1 Gbit/s e servidores tem portas de 10 Gbit/s. A escolha de dispositivos da camada 2 com velocidades (taxas) maiores permite que a rede evolua sem a necessidade de substituir os dispositivos centrais.

 

Expansão

Os dispositivos de rede têm configurações físicas fixas bem como modulares quando adquiridos. Os dispositivos de configuração fixa têm uma quantidade e tipo específico de portas ou interfaces e não podem ser expandidos.  Os dispositivos modulares têm slots de expansão disponíveis para adicionar novos módulos conforme as necessidades demandam. Os switches têm portas adicionais para uplinks de alta velocidade. Os roteadores conectam diferentes tipos de redes.  Seleciona-se os módulos e interfaces apropriados para a mídia utilizada (meio).

 

Sistema Operacional e Serviços

Os dispositivos de rede têm sistemas operacionais que suportam as necessidades dos requisitos da organização, tais como:

Layer 3 Switching
Tradução de endereço de rede (NAT)
Protocolo de configuração dinâmica de hosts (DHCP)
Segurança
Qualidade de serviço (QoS)
Voz sobre IP (VoIP)
 

“Pequenas” Redes – Endereçamento

Todos os hosts e dispositivos em uma rede devem ter um endereço exclusivo. Os dispositivos incluem:

Dispositivos do usuário final: o número e o tipo de conexão (ou seja, com fio, sem fio, acesso remoto)
Servidores e dispositivos periféricos: por exemplo, impressoras e câmeras de segurança
Dispositivos intermediários: interruptores e pontos de acesso
O uso de um esquema de endereçamento IP planejado facilita a identificação do tipo de dispositivo e a solução dos problemas.

A Figura 2 a seguir mostra um exemplo de uma rede com o endereçamento IP planejado.


A Tabela 1 a seguir ilustra um exemplo do planejamento do endereçamento IP.



“Pequenas” Redes – Redundância

Um aspecto importante de um projeto de rede é a confiabilidade. Tanto as pequenas quanto as grandes empresas dependem fortemente da disponibilidade da rede. Uma falha na rede pode comprometer os serviços e custar caro. Para ter um alto grau de confiabilidade é necessário incluir a redundância no projeto da rede. A redundância minimiza ou elimina pontos únicos de falha. Existem muitas maneiras de realizar a redundância em uma rede. A redundância é realizada ao instalar equipamentos duplicados e, também, links duplicados para as áreas críticas da rede.

A Figura 3 a seguir mostra um exemplo de uma rede com redundância de dispositivos e enlaces.


“Pequenas” Redes - Gerenciamento de Tráfego

O objetivo de um projeto de rede, seja esta pequena ou grande, é aumentar a produtividade e minimizar o tempo de inatividade da rede. O administrador da rede considera os vários tipos de tráfego e os tratamentos adequados para cada tráfego no projeto da rede. Os roteadores e switches em uma pequena rede são configurados para suportar tráfego em tempo real, como voz e vídeo, de maneira apropriada em relação a outros tráfegos. Um projeto de rede implementa qualidade de serviço (QoS – Quality of Service) para classificar o tráfego cuidadosamente de acordo com a prioridade durante a concorrência de tráfegos. A Figura 4 a seguir ilustra um exemplo de níveis de prioridade de tráfego.


Protocolos e Aplicações

 

Aplicações

Existem duas maneiras em que programas ou processos de software fornecem acesso à rede:

1. Aplicações de rede

Os aplicativos implementam protocolos da camada de aplicação e se comunicam diretamente com as camadas inferiores da pilha de protocolo. Exemplos, clientes de e-mail e navegadores web.
2. Serviços de camada de aplicação

Há programas que precisam dos serviços da camada de aplicação para usar os recursos de rede como transferência de arquivos ou spool de impressão em rede. Os diferentes tipos de dados, por exemplo, texto, imagem ou vídeo exigem diferentes serviços de rede para garantir que sejam tratados de maneira adequada para os processamentos que ocorrem nas camadas inferiores do modelo OSI.
 

Protocolos

Os administradores de rede têm acesso a dispositivos e servidores de rede. As soluções de acesso remoto mais comuns são Telnet e Secure Shell (SSH). O serviço SSH é uma alternativa segura ao Telnet. Os dispositivos de rede (por exemplo, roteador, switch) oferecem suporte a SSH para fornecer serviços de acesso remoto. Os servidores (por exemplo, servidor web, servidor de e-mail)  também oferecem suporte a serviços de servidor SSH de acesso remoto. A Figura 5 a seguir mostra um exemplo de rede com os servidores típicos utilizados.


Escalabilidade

O projeto de uma rede deve considerar um horizonte de planejamento e assim prever a expansão no tempo, dimensionamento e práticas. O crescimento é um processo natural para as empresas e suas redes devem acompanhar de forma adequada. Para dimensionar uma rede vários aspectos são considerados:

Aplicações e serviços: utilizados de imediato e previstos no planejamento
Documentação de rede: topologia física e lógica
Inventário de dispositivos: lista de dispositivos que utilizam ou pertencem a rede
Orçamento: orçamento de TI discriminado que inclui aquisição de equipamentos (ou contratação de serviços de nuvem) alinhado ao negócio da empresa
Análise de tráfego: protocolos, aplicativos e serviços com seus respectivos requisitos de tráfego são documentados e monitorados
 

Análise de Tráfego

Para acompanhar o crescimento da rede é importante determinar como gerenciar o tráfego da rede. Há várias ferramentas de gerenciamento e monitoramento de rede, por exemplo, Zabbix e Wireshark. Para determinar os padrões de fluxo de tráfego é importante:

Capturar o tráfego durante os horários de pico de utilização para obter uma boa caracterização dos diferentes tipos de tráfego.
Executar a captura em diferentes segmentos de rede e dispositivos, pois há tráfego local em segmentos específicos.
As informações coletadas pelo analisador de protocolo são avaliadas com base na origem e no destino do tráfego, bem como no tipo de tráfego. Realocar um servidor ou serviço para outro segmento de rede pode melhorar o desempenho da rede e acomodar o tráfego crescente, por exemplo.

O software de monitoração Zabbix é uma solução open source que monitora vários parâmetros dos equipamentos de rede e a saúde e integridade de servidores.

 

Conectividade

 

Ping

Nos diversos cenários de projeto de rede é necessário verificar se os componentes estão conectados entre si e com a Internet. O comando ping é a maneira mais simples de testar rapidamente a conectividade da camada 3 entre um endereço IP de origem e de destino. O comando também exibe várias estatísticas de tempo (soma da ida e da volta – roundtrip). O comando ping usa as mensagens de echo request (ICMP Tipo 8) e de echo reply (ICMP Tipo 0) do protocolo de mensagens de controle da Internet (ICMP) (KUROSE e ROSS, 2016).

 

Traceroute

O ping é útil para saber rapidamente se há problema de conectividade da camada 3, mas não identifica onde está localizado ao longo do caminho. O Traceroute ajuda a localizar problemas da camada 3 em uma rede. Um rastreamento retorna uma lista de saltos à medida que um pacote é roteado na rede. Usa-se para identificar o ponto onde o problema se encontra. As solicitações de rastreamento para o próximo salto podem atingir o tempo limite e significa que o roteador do próximo salto não respondeu. As solicitações referentes ao limite de tempo indicam que há uma falha na rede além da LAN ou que tais roteadores foram configurados para não responder às solicitações de eco usadas no rastreamento.

 

Baseline

Uma das formas mais eficazes para monitorar e solucionar problemas de desempenho de rede é estabelecer uma linha de base de rede. A criação de uma linha de base de desempenho de rede eficaz é realizada ao longo do tempo. Medir o desempenho em tempos e cargas variados cria uma imagem melhor do desempenho geral da rede. As respostas dos comandos de rede contribuem com dados para a linha de base da rede. Entre os itens considerados estão as mensagens de erro e os tempos de resposta de host para host. Se houver um aumento considerável nos tempos de resposta pode significar um problema de latência a ser resolvido.

 

Troubleshooting

As questões referentes ao desempenho são muito importantes nas redes de computadores (TANENBAUM e WETHERALL, 2011). Há muitas maneiras de solucionar um problema de rede. Os problemas de rede podem ser simples ou complexos e resultam de uma combinação de problemas de hardware, software e conectividade. É necessário analisar o problema e procurar a causa do erro antes de resolver o problema de rede. Esse processo é chamado de troubleshooting (solução de problemas). Para avaliar o problema determina-se quantos dispositivos na rede apresentam o problema, por exemplo. Se houver um problema com um dispositivo na rede inicia-se o processo de solução dos problemas nesse dispositivo. Se houver um problema, por exemplo, com todos os dispositivos da rede inicia-se o processo de solução de problemas no dispositivo onde os demais dispositivos estão conectados.

 

Passos

A Tabela 2 a seguir ilustra as  etapas típicas do processo de solução de problemas.


Atividade Extra

Assista o vídeo: Introdução ao Gerenciamento de Redes - parte 1. Disponível em:

<https://www.youtube.com/watch?v=RntTxnDsM9g>.

 

 

Referência Bibliográfica

KUROSE, J. F.; ROSS, K. W. Redes de Computadores e a Internet: uma abordagem top-down, 6ª. ed. São Paulo: Pearson Education do Brasil, 2016.

TANENBAUM, A. S.; WETHERALL, D. Redes de Computadores, 5ª. ed. Pearson, 2011.