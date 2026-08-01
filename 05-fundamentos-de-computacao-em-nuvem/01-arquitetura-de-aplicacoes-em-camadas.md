Arquitetura de aplicações em Camadas
Nesta aula vamos fazer um alicerce para a compreensão da arquitetura de camadas, com um viés claro nas aplicações cloud. Falaremos das evoluções das camadas, de seus números e de como esta implementação revolucionou o modelo base cliente servidor.

CONCEITOS DE ARQUITETURA EM CAMADAS

Vamos começar tratando de compreender o que vem a ser arquitetar algo.  Com isso, descobriremos que, apesar do termo ter muita relação com a construção física das coisas, como todas as palavras do dicionário, carrega um conceito em seu significado que passou a ser muito utilizado no universo da informática.

Bem, me considero jovem, mas pude testemunhar a informática dar os seus maiores passos saindo da arquitetura 16 bits para 32. Isso representa, dentre outras mudanças, quantos endereços de memória um sistema suporta. Claro que hoje estamos vivendo a era dos 64 bits, temos registradores de memória morando dentro dos CPU´s. Todo este papo de bits e evolução foi para compreender que a arquitetura representa um elemento muito importante na informática e sua evolução mexe (e muito) com a humanidade.

Vamos para algumas conceituações, começando com a concepção de Fowler (2007, p. 23) para arquitetura. Mesmo com o autor acreditando que se trata de um termo que vem sendo usado de forma bastante ampla, (você percebeu isso com o que já falamos sobre a arquitetura dos computadores),

“Arquitetura” é um termo que muitas pessoas, com pouca concordância entre si, tentam definir. Existem dois elementos comuns: um é a decomposição em alto nível de um sistema em suas partes; o outro são decisões difíceis de alterar. […] existem diversas arquiteturas em um sistema, e a visão do que é significativo em termos de arquitetura pode mudar durante o ciclo de vida de um sistema.

De acordo com as palavras de Fowler, podemos encaixar perfeitamente o que estamos aqui para discutir e compreender: os softwares são construções que podemos decompor em partes, e, assim como na construção civil, cada sistema tem uma arquitetura e segue uma filosofia que guia a abordagem de sua construção. Vamos tratar da construção da arquitetura em camadas. Embora existam diversas, são a base dos serviços de Cloud Computing.

Partindo então para as tais camadas na sistematização da arquitetura, os sistemas, podemos fazer um paralelo com a própria arquitetura de um computador pessoal. Quando um professor de ensino técnico tenta explicar aos seus estudantes a diferença entre hardware e software, uma das abordagens é a de mostrar o sistema operacional em relação aos periféricos e componentes como placas de sistema, placas mãe, memórias e discos

Este professor vai tratar a interface gráfica do computador como uma camada intermediária entre os periféricos de entrada (mouse e teclado) e o software que o usuário deseja operar. Portanto temos, em um computador pessoal, os dispositivos de entrada, o sistema operacional, e os dispositivos de saída (monitor, caixas de som, impressoras) como camadas bem definidas.

Partindo para um detalhamento do que as camadas representam para um sistema, vamos encontrar a interface de usuário como a primeira camada. Isto é do ponto de vista do usuário, claro, afinal não seria nada prático usar um sistema direto em seu código fonte ou até mesmo em modo texto, como nos primórdios da era pré interface gráfica.

Com isso podemos definir melhor o que representa para a produção de software uma arquitetura em camadas. De acordo com Fowler (2007, p. 37): ao pensar em um sistema em termos de camadas, você imagina os subsistemas principais no software dispostos de forma parecida com camadas de um bolo em que cada camada repousa sobre uma camada mais baixa.

Com a perspectiva das camadas de um bolo, podemos concluir, de acordo com Fowler (2007, p. 37) que a camada superior usará serviços da camada imediatamente inferior a esta, ou seja, a camada mais alta usa serviços da mais baixa. Além desta dinâmica, devemos salientar que camadas não vizinhas não se relacionam diretamente, ou seja, não usam serviços uma da outra.

Assim como um bolo pode ter duas ou dezenas de camadas, fica claro que existem inúmeras vantagens de se usar a abordagem da arquitetura de software em camadas. Como vantagem da arquitetura em camadas, Fowler (2007, p. 37) apresenta:



Você pode compreender uma única camada como um todo coerente sem saber muito sobre as outras camadas. Você pode compreender como construir um serviço FTP sobre TCP sem conhecer os detalhes de como funciona o protocolo ethernet.

Você pode substituir camadas por implementações alternativas dos mesmos serviços básicos. Um serviço FTP pode rodar sem modificações sobre ethernet, PPP, ou seja, lá o que usado pelo provedor.

Você minimiza as dependências entre camadas. Se o provedor alterar o sistema físico de transmissão, não precisamos alterar nosso serviço FTP.

Camadas são bons lugares para padronização. TCP e IP são padrões porque eles definem como suas camadas podem operar.

Uma vez que você tenha construído uma camada, ela pode ser usada por muitos serviços de nível mais alto. Desta forma, TCP/IP é usado por FTP, Telnet, SSH e HTTP. De outra maneira, todos esses protocolos de nível mais alto teriam que escrever seus próprios protocolos de nível mais baixo.

Embora não seja nada fácil para a indústria da tecnologia chegar aos consensos que precisamos em ordem de se padronizar sistemas e protocolos de larga escala, é um feito que torna a vida de todos mais fácil, principalmente a dos programadores que vão se dedicar a camadas mais complexas e mais estratégicas de seus projetos de sistemas.

MODELO ARQUITETURAL DAS APLICAÇÕES CORPORATIVAS PARA WEB

Demorou um pouco para que o desenvolvimento de software migrasse da arquitetura em batch (lote) para modelos onde fosse possível distinguir claramente a existência de camadas. Fowler (2007) afirma que foi nos anos 1990 que se pode observar melhor a noção de camadas com a criação dos primeiros sistemas de cliente-servidor. 

Nestes sistemas as camadas eram a interface de usuário e a aplicação com banco de dados relacional. Este modelo de duas camadas principais atendeu ao mundo da engenharia de software até que a web chegou e com isso chegou o desejo dos clientes em usar tais aplicações cliente/servidor direto de seus navegadores web. Mas antes de maiores avanços vamos distinguir as aplicações domésticas das corporativas E como aplicações corporativas comuns podemos citar:

As aplicações coorporativas incluem folhas de pagamento, registro de pacientes, rastreamento de remessas, análise de custos, pontuação de crédito, seguro, cadeia de suprimentos, contabilidade, serviço de atendimento ao cliente e comércio internacional. (FOWLER, 2007: 38)

Outro detalhe relevante das aplicações comerciais bem destacado por Fowler (2007) está na persistência que os dados destas aplicações precisam ter, uma vez que farão parte de inúmeras instâncias do ambiente corporativo sendo executados por múltiplos usuários simultaneamente, o que também significa que tais sistemas precisam ser construídos com grande robustez.

O grande avanço que trouxe ao mesmo tempo robustez a arquitetura de camadas e resolveu inúmeros problemas relativos a lógica de domínio e ainda dentro da dinâmica das aplicações cliente/servidor, foi a criação de um sistema de tripla camada: a primeira seria a interface com o usuário, uma camada de apresentação, a segunda seria a camada de lógica de domínio e por fim uma camada de dados.

​


Este modelo de tripla camada orientou a criação das aplicações corporativas desde que surgiu melhorando e muito os tempos de resposta e dando maior performance em sistemas web. Conforme defende Macêdo (2012, online) este modelo surge como evolução do modelo de 2 camadas:

A ideia básica do modelo de 3 camadas, é “retirar” as Regras do Negócio do cliente e centralizá-las em um determinado ponto, o qual é chamado de Servidor de Aplicações. O acesso ao Banco de dados é feito através das regras contidas no Servidor de Aplicações. Ao centralizar as Regras do Negócio em um único ponto, fica muito mais fácil a atualização destas regras.

O que devemos salientar é que o usuário não tem acesso direto aos dados, ele interage com a camada de apresentação e o acesso aos dados será intermediado pela aplicação, o que normatiza os processos e os dá toda esta visão de agilidade e respostas mais rápidas comparadas aos modelos anteriores.

MODELOS MULTICAMADAS

Conforme as necessidades em relação a informática, a tecnologia, vão superando o que existe disponível são criadas novas tecnologias que as acomodam, algo que faz muito sentido do ponto de vista dos sistemas e softwares e de como são desenvolvidos. Vamos tratar agora dos modelos que fogem do simples (mas não tão simples) modelo cliente/servidor e expandem e muito os conceitos de camadas, os modelos de N camadas.

Neste ponto ainda temos a arquitetura cliente/servidor como base e inspiração mas temos também a evolução promovida pelos modelos de 3 camadas que, com a popularização da internet precisou de adotar novas padronizações, caso contrário seu desenvolvimento e o desenvolvimento de aplicações web sofreria o mesmo problema que tinha sido mitigado nos modelos de 3 camadas, se comparado com os modelos originais de cliente/servidor.

Agora estamos acrescentando cada vez mais camadas para que sejam padronizados certos aspectos facilitando o desenvolvimento das aplicações e temos, portanto a internet como elemento que chamou para a criação da 4ª camada, conforme Macêdo (2012, online):

A ideia básica do modelo de 4 camadas, é retirar a apresentação do cliente e centralizá-las em um determinado ponto, o qual na maioria dos casos é um servidor Web. Com isso o próprio Cliente deixa de existir como um programa que precisa ser instalado em cada computador da rede. O acesso a aplicação é feito através de um Navegador, como o Internet Explorer ou o Netscape Navigator.

Fica fácil reconhecer as vantagens dos modelos multicamadas quando estamos pensando nas aplicações Web: imagine se cada navegador web fosse o precursor de uma rede isolada das outras? Hoje temos diversos navegadores web que “surfam” todos na mesma rede, se diferenciando mais nos detalhes da camada de apresentação.

​


Portanto, nos modelos de N camadas temos uma enorme variação do número de camadas na segunda camada, a intermediária, onde cada camada pode ser fisicamente separada para se obter melhor escalabilidade e resiliência.

ARQUITETURA EFICIENTE PARA PROJETOS CLOUD

Obviamente que uma eficiente arquitetura em nuvem deve conter ao menos 3 camadas, mas para ser verdadeiramente eficiente será preciso muita otimização e robustez, portanto devemos partir para soluções de N camadas que, de acordo com Microsoft (2018, online) apresentam os seguintes benefícios: “Portabilidade entre nuvem e local e entre plataformas de nuvem. Curva de aprendizado menor para a maioria dos desenvolvedores. Evolução natural do modelo tradicional de aplicativos. Abertura para ambientes heterogêneos (Windows/Linux)”.

Uma eficiente arquitetura para projetos de aplicações Web Cloud não tem apenas as suas 3 ou mais camadas, deve ter em mente também seus 3 pilares: Os Softwares como Serviços, ou SaaS, as Plataformas como Serviços conforme descritos no quadro a seguir:

​


Outros pontos que farão o projeto cloud ser desenvolvido de forma eficiente e que seja eficiente ao consumidor estão na fundamentação de sua construção em uma elevada padronização e escalabilidade. Como padronização podemos citar as suas principais instâncias como a rede o armazenamento e a computação. A própria escalabilidade precisa ser padronizada e por escalabilidade temos a independência do sistema desenvolvido para com outros sistemas do mesmo ecossistema embora se faz necessário que tenha compatibilidade.

 

 

 

Atividade extra

Nome da atividade: Leitura do artigo: Arquitetura de Software: Desenvolvimento orientado para arquitetura.

Após a leitura fazer uma dissertação de até 5 linhas sobre sua posição a respeito do desenvolvimento de sistemas orientado pela arquitetura.

 

Referência Bibliográfica

FOWLER, Martin. Padrões de arquitetura de aplicações corporativas. Bookman, 2009. Disponível em: https://books.google.com.br/books?id=8uSN0Qwz2kQC&lpg=PR7&dq=Arquitetura em Camadas&lr&hl=pt-BR&pg=PR7#v=onepage&q=Arquit&f=false. Acesso em: 13 mar. 2023.

REDE NACIONAL DE ENSINO E PESQUISA. Memória RNP. Disponível em: https://memoria.rnp.br/newsgen/9710/n5-3.html 1997. Acesso em: 13 mar. 2023.

MACÊDO, Diego. Arquitetura de Aplicações em 2, 3, 4 ou N camadas. 2012. Disponível em: https://www.diegomacedo.com.br/arquitetura-de-aplicacoes-em-2-3-4-ou-n-camadas/. Acesso em: 13 mar. 2023.

VERAS, Manoel. Cloud Computing: nova arquitetura da TI. Brasport, 2012. Disponível em: https://books.google.com.br/books?id=yiggoX2aoC8C&lpg=PA1&dq=ARQUITETURA EFICIENTE PARA PROJETOS CLOUD&lr&hl=pt-BR&pg=PR1#v=onepage&q=ARQUITETURA EFICIENTE PARA PROJETOS CLOUD&f=false. Acesso em: 13 mar. 2023.

MICROSOFT (org.). Estilo de arquitetura de N camadas. Disponível em: https://learn.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/n-tier. Acesso em: 13 mar. 2023.
BLOG BRASIL, 4 etapas para desenvolver uma arquitetura de Cloud bem-sucedida. Disponível em:

4 passos essenciais antes de começar sua migração para nuvem, Disponível em: <https://emaster.cloud/computacao-em-nuvem/passos-essenciais-migracao-nuvem/>, Acesso em 20 de junho de 2023.