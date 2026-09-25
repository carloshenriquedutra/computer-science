# Top 10 — Questões difíceis de Redes e Cloud

Questões de revisão elaboradas a partir das aulas e do caderno desta disciplina. São aplicações dos conceitos estudados, não uma previsão de prova. Em cada item, a referência indica o material-base.

## 1. Identificação de rede local por máscara

Um host está configurado como `192.168.10.70/26` e precisa enviar um pacote a `192.168.10.125`. Qual decisão corresponde ao funcionamento do IPv4 descrito no material?

A. Enviar o pacote diretamente ao destino, pois os três primeiros octetos coincidem.
B. Enviar o pacote ao gateway, pois os endereços estão em sub-redes diferentes.
C. Enviar um broadcast ARP para o endereço IP de destino, mesmo que ele esteja fora da sub-rede.
D. Reescrever o endereço IP de destino para o endereço MAC do gateway antes de rotear.

**Resposta correta: A.** Com `/26`, a máscara é `255.255.255.192`, formando blocos de 64 endereços no último octeto. Tanto 70 quanto 125 pertencem ao bloco 64–127, portanto o host considera o destino local e resolve seu MAC na LAN.

**Por que as outras estão erradas:** B erra porque a comparação é feita com a máscara, não apenas por limites intuitivos de sub-rede; os dois endereços caem no mesmo bloco. C erra porque ARP resolve o MAC do próximo salto local, não faz broadcast para alcançar um IP remoto. D confunde endereçamento: IP de destino permanece IP; o frame usa um MAC de destino apropriado ao enlace.

*Base: 04/00-meu-caderno.md, seção 11; 04/11-enderecos-e-segmentacao-no-ipv4.md.*

## 2. Cálculo de sub-redes IPv6

Uma organização recebeu o prefixo IPv6 `/48` e quer criar sub-redes `/64`. Quantas sub-redes distintas pode formar, mantendo os primeiros 48 bits do prefixo?

A. 16
B. 256
C. 65.536
D. 2⁸⁰

**Resposta correta: C.** Há 16 bits entre `/48` e `/64`; esses bits identificam a sub-rede. Logo, existem `2^16 = 65.536` combinações.

**Por que as outras estão erradas:** A considera apenas um hexteto em quantidade de símbolos, mas não os 16 bits disponíveis. B usa `2^8`, como se só houvesse um octeto. D conta os bits restantes até 128 como se todos pudessem ser usados para numerar sub-redes, embora o enunciado reserve `/64` para cada sub-rede.

*Base: 04/00-meu-caderno.md, seção 12; 04/12-enderecamento-ipv6.md.*

## 3. Endereços IP e MAC ao atravessar roteadores

Um servidor de origem envia tráfego a um servidor em outra rede. O pacote atravessa dois roteadores. Qual descrição está correta para cada enlace?

A. O IP de destino muda em cada roteador, enquanto os MACs permanecem iguais até o destino.
B. Os endereços IP de origem e destino identificam os extremos da comunicação; o frame de cada enlace usa endereços MAC locais ao salto e é reconstruído pelo roteador.
C. O MAC do servidor de destino é usado em todos os frames, mesmo quando ele está em uma rede remota.
D. O roteador remove os endereços IP e encaminha somente com base na porta TCP.

**Resposta correta: B.** O endereçamento IP sustenta a entrega entre redes. A camada de enlace entrega o frame no enlace atual; ao rotear, o dispositivo remove o frame recebido e cria outro para o próximo salto, com endereços MAC correspondentes àquele enlace.

**Por que as outras estão erradas:** A inverte a estabilidade típica dos endereços IP e a troca de MAC por salto. C ignora que um host remoto não é alcançado diretamente na LAN de origem: o MAC de destino do primeiro frame é o do gateway. D confunde camadas; roteadores encaminham pacotes IP, e portas TCP identificam processos/serviços nos extremos.

*Base: 04/00-meu-caderno.md, seções 5 e 6; 04/09-camada-de-rede.md.*

## 4. ARP e Neighbor Discovery

Um host IPv4 conhece o IP de outro host na mesma LAN, mas ainda não conhece seu endereço Ethernet. Em uma rede IPv6 ocorre a mesma necessidade. Qual associação corresponde ao material?

A. IPv4 usa DNS; IPv6 usa DHCPv6.
B. IPv4 usa ARP; IPv6 usa mensagens Neighbor Discovery sobre ICMPv6.
C. Ambos usam ARP, pois a resolução ocorre na camada de enlace.
D. IPv4 usa ICMP; IPv6 usa DNS multicast.

**Resposta correta: B.** ARP descobre o endereço de enlace associado ao IPv4 na rede local. No IPv6, funções de descoberta de vizinhos e resolução são providas pelo Neighbor Discovery, parte do ICMPv6.

**Por que as outras estão erradas:** A mistura resolução de nome e configuração de endereço com resolução de vizinho. C generaliza ARP incorretamente para IPv6. D atribui a ICMPv6 uma função de DNS; embora Neighbor Discovery use ICMPv6, DNS resolve nomes, não endereços MAC de vizinhos.

*Base: 04/00-meu-caderno.md, seção 10.10; 04/10-resolucao-de-enderecos-e-estrutura-ipv.md.*

## 5. Confiabilidade do TCP e serviço do IP

Uma aplicação observa segmentos TCP fora de ordem e um pacote IP que não chegou. Qual interpretação combina corretamente os papéis dos protocolos?

A. O IP retransmite e reordena; o TCP apenas escolhe o caminho físico.
B. O IP oferece entrega sem garantia de ordem; o TCP usa números de sequência e mecanismos de transporte para ordenar e detectar a necessidade de recuperação.
C. O TCP garante que todo pacote IP chegue sem perda, por isso a situação é impossível.
D. O roteador reordena os segmentos usando números de sequência TCP antes de encaminhá-los.

**Resposta correta: B.** O material caracteriza IP como serviço de melhor esforço, sem garantia de entrega ou ordenação. TCP acrescenta controle de sessão, sequência e confiabilidade na comunicação entre processos.

**Por que as outras estão erradas:** A transfere para IP funções de confiabilidade próprias do TCP e atribui ao TCP escolha de rota. C transforma confiabilidade em garantia absoluta; TCP pode detectar perdas e retransmitir, mas uma aplicação ainda pode falhar se a conexão não se recuperar. D atribui ao roteador a remontagem da conversa TCP, que cabe aos endpoints.

*Base: 04/00-meu-caderno.md, seções 11.4 e 13; 04/09-camada-de-rede.md; 04/13-camada-de-transporte.md.*

## 6. Escolha entre TCP e UDP

Um cliente envia uma consulta DNS pequena e recebe resposta; ocasionalmente uma transferência de zona DNS é realizada. Qual conclusão é sustentada pelo conteúdo?

A. DNS usa exclusivamente UDP porque é um protocolo de aplicação sem estado.
B. DNS pode usar UDP para consultas comuns e TCP em situações como transferência de zona; o protocolo de aplicação não determina sozinho um único transporte para todo uso.
C. Toda consulta DNS precisa iniciar um handshake TCP de três vias.
D. DNS usa TCP para a consulta e UDP para transferir uma zona completa.

**Resposta correta: B.** O material destaca o uso híbrido: consultas DNS comuns são frequentemente feitas por UDP, enquanto transferências de zona usam TCP, que oferece uma conexão confiável adequada à transferência.

**Por que as outras estão erradas:** A ignora a transferência de zona sobre TCP. C generaliza o handshake TCP para todas as consultas. D troca os casos apresentados no caderno.

*Base: 04/00-meu-caderno.md, seção 14.5; 04/14-camada-de-aplicacao.md.*

## 7. Controle de acesso ao Wi-Fi

Dois dispositivos Wi-Fi querem transmitir e ambos detectam o canal ocupado. Qual comportamento corresponde ao mecanismo estudado?

A. Ambos transmitem imediatamente, pois o Wi-Fi usa CSMA/CD para detectar e interromper colisões no meio sem fio.
B. Cada um espera o canal ficar livre e aplica o mecanismo de acesso por contenção/evitação de colisão CSMA/CA.
C. O ponto de acesso reserva permanentemente o canal para o primeiro dispositivo associado.
D. O Wi-Fi opera em full-duplex e não precisa coordenar o acesso ao meio compartilhado.

**Resposta correta: B.** O conteúdo descreve Wi-Fi/IEEE 802.11 com CSMA/CA: a estação escuta o meio e aguarda a disponibilidade antes de transmitir, reduzindo a chance de colisões em um meio compartilhado.

**Por que as outras estão erradas:** A confunde CSMA/CA com CSMA/CD e pressupõe detecção de colisão como em Ethernet compartilhada cabeada. C inventa uma reserva permanente. D contradiz o material, que descreve WLAN compartilhada e half-duplex.

*Base: 04/00-meu-caderno.md, seções 9.5 e 10; 04/05-cabeamentos-e-conexoes.md; 04/07-camada-de-enlace.md.*

## 8. Diagnóstico por camadas

Um computador consegue executar `ping 127.0.0.1`, mas não consegue acessar um servidor de outra sub-rede. Qual inferência é mais rigorosa?

A. A conexão física e o gateway estão comprovadamente funcionando, pois loopback testa todo o caminho.
B. O teste confirma funcionamento básico da pilha IP local, mas não comprova enlace físico, configuração da interface, gateway ou caminho remoto.
C. O servidor remoto está necessariamente desligado.
D. O DNS é a única causa possível, pois loopback não usa nomes.

**Resposta correta: B.** Loopback valida a pilha local ao enviar tráfego à própria máquina. Não percorre a NIC, o cabo, o switch, o gateway ou a rede remota.

**Por que as outras estão erradas:** A amplia indevidamente o alcance do teste. C conclui uma causa sem evidência; há várias etapas entre host e destino. D limita o diagnóstico a DNS, embora o problema possa ocorrer em interface, máscara, rota, enlace ou destino.

*Base: 04/00-meu-caderno.md, seção 11.5; 04/15-projetando-uma-rede.md.*

## 9. Fibra monomodo e multimodo

Um enlace de longa distância precisa reduzir dispersão e atenuação. Qual escolha e justificativa estão alinhadas às aulas?

A. Multimodo, pois seu núcleo maior mantém todos os pulsos no mesmo modo e elimina dispersão.
B. Monomodo, pois o núcleo menor confina a luz em um modo e é indicado para longas distâncias; multimodo apresenta maior dispersão.
C. Cabo UTP, pois não sofre interferência eletromagnética e não tem limite de distância.
D. Multimodo, pois usa necessariamente laser e alcança centenas de quilômetros sem amplificação.

**Resposta correta: B.** A fibra monomodo usa núcleo menor e fonte laser, sendo adequada a enlaces longos. O material associa a multimodo a maior dispersão e distâncias menores, comum em LAN.

**Por que as outras estão erradas:** A inverte o efeito do núcleo e da dispersão. C atribui ao cobre imunidade a EMI e ausência de limites, propriedades relacionadas à fibra. D inverte o alcance típico e afirma que multimodo usa necessariamente laser, embora o material cite LED ou laser.

*Base: 04/05-cabeamentos-e-conexoes.md; 04/00-meu-caderno.md, seção 9.*

## 10. QoS e tolerância a falhas

Uma rede tem caminhos redundantes, mas uma chamada de voz sofre atraso durante congestionamento. Qual ação atua diretamente no problema descrito, sem confundir objetivos?

A. Usar QoS para priorizar tráfego sensível a atraso; redundância contribui para tolerância a falhas, mas não garante baixa latência sob congestionamento.
B. Aumentar redundância, pois dois caminhos sempre eliminam congestionamento e atraso.
C. Usar escalabilidade para reordenar segmentos TCP e recuperar pacotes perdidos.
D. Aplicar confidencialidade da tríade CIA, pois criptografia garante prioridade ao tráfego de voz.

**Resposta correta: A.** QoS gerencia congestionamento e prioriza tráfego sensível ao atraso. Redundância fornece caminhos alternativos em caso de falha, mas não substitui o gerenciamento de tráfego.

**Por que as outras estão erradas:** B confunde disponibilidade com desempenho e supõe que mais caminhos eliminem a contenção. C confunde escalabilidade com funções de transporte. D confunde confidencialidade com priorização e atribui à criptografia um efeito que ela não oferece.

*Base: 04/02-tecnologias-e-protocolos.md; 04/15-projetando-uma-rede.md; 04/00-meu-caderno.md, seções 1 e 15.*
