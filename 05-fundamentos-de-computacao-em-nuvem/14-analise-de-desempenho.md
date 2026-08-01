Análise de desempenho
Nesta unidade faremos um apanhado de conceitos e considerações para que você, estudante, seja capaz de compor suas métricas de avaliação e medição do desempenho de qualquer solução cloud. Começaremos com as formas de se avaliar o Hardware, a parte física do provedor. Sobre a avaliação do desempenho do software vamos tratar de como a medição da elasticidade consegue promover métricas relevantes neste sentido.

Por fim, trataremos de como a conectividade pode oferecer bons insights sobre o desempenho da nuvem contratada e finalizaremos com as principais metodologias de avaliação de desempenho e sua aplicabilidade na nuvem.

DESEMPENHO DE HARDWARE EM APLICAÇÕES CLOUD

Desde que fui apresentado ao meu primeiro computador, um intel pentium 166 (MHz) com fabulosos 32 Megabytes de memória e disco rígido de 2.1 Gb passei a constantemente avaliar o desempenho de meus computadores e buscar formas de extrair mais alguns MHz e gigabytes e com a avaliação do desempenho de meu hardware comecei a notar o quanto era importante o software que fazia uso dele. 

Avaliar soluções cloud sob a ótica do hardware não é muito prático se você não for o provedor da solução. Mas como consumidor final a avaliação de desempenho da solução pode sim ser feita, basta apenas se procurar a metodologia certa, e que provavelmente vai ser uma análise feita com base em serviços e contratos de IaaS. De acordo com Coutinho (2014: 19):

O monitoramento de recursos computacionais, como CPU, memória e largura de banda, se torna essencial tanto para os provedores, os quais disponibilizam os serviços, quanto para seus clientes. Uma maneira de se avaliar um ambiente é monitorando algum aspecto, como utilização de recursos. Muitas vezes a elasticidade está associada a algum recurso do provedor. Na Amazon EC2, por exemplo, o cliente pode estar utilizando uma instância com poucos recursos, e em caso de necessidade de recursos, monitorado através serviço de monitoramento (Cloudwatch), o serviço de escalonamento (Auto Scaling) pode acionar que o serviço de balanceamento de carga (Elastic Load Balance) incremente a quantidade de instâncias.

Perceba que em muitos casos, como os dos usuários de soluções AWS é possível fazer uma avaliação rápida ao se observar quais são os atributos das soluções que servem as soluções, e como exemplo podemos citar a existência de subsistemas como o Auto Scaling que junto com o Cloudwatch, promovem imensa agilidade na prestação do serviço.

Existem também diversos protocolos que podem ser utilizados como elemento de avaliação de desempenho e como são diversos os protocolos utilizados, vamos a um dos mais populares, o IPsec, que, de acordo com Almeida (et al 2016: 960) pode ser conceituado como:

O protocolo IPsec opera na camada de rede, fornecendo os serviços de autenticação e cifração de pacotes na comunicação entre dois elementos quaisquer de uma rede (e.g., roteadores ou máquinas de usuários finais) [11]. Assim, o IPsec oferece proteção contra ameaças à confidencialidade, autenticidade e integridade de dados, como escutas e ataques de repetição [9], garantindo o devido isolamento lógico entre os canais de comunicação. 

Almeida (et al 2016: 960) afirma que o IPsec contribui para uma avaliação mais refinada ao estabelecer: 

[…] criptográficas simétricas entre os elementos participantes de uma sessão, o que pode ser feito manualmente ou via protocolos como o Internet Key Exchange versão 2 (IKEv2) [10], criando-se uma associação de segurança entre as partes. Essas chaves são então utilizadas nos protocolos Authentication Header (AH), responsável pela autenticação dos pacotes, e Encapsulating Security Payload (ESP), que fica responsável pela sua cifração. 

Para tornar o IPsec uma metodologia de avaliação de desempenho, Almeida (et al 2016: 960) apresenta o uso dos cenários de referência:

O cenário de referência, ilustrado na Figura [a seguir], implementa a comunicação entre VMs localizadas em máquinas físicas distintas utilizando apenas o OvS. A realização dos testes considera a transferência de pacotes de dados entre VM1 e VM3. Este cenário não utiliza mecanismos de segurança e tem como objetivo principal permitir sua comparação com os demais cenários que implementam SR-IOV e IPsec.


Neste momento (nostálgico) para mim, voltamos a conceitos mais básicos como o do tempo de resposta e mencionei nostálgico, pois quando o mundo chega no Pentium 3 e você está no 166, tempo de resposta é uma avaliação importante. Claro que, no universo de aplicações em nuvem, estamos falando não da velocidade em si, mas do impacto, antes e depois do cenário padrão receber o IPsec, como apresenta Almeida (et al 2016: 960):

A análise e avaliação dos cenários de aplicação apresentados requer que seja primeiramente feito o levantamento dos tempos de resposta referentes a cada mecanismo utilizado para compor os cenários apresentados com o intuito de calcular suas respectivas taxas de processamento de pacotes (TP). Mais precisamente, o procedimento adotado foi a comparação entre os tempos de resposta obtidos de um cenário sem qualquer mecanismo de segurança (i.e., “cenário de referência”) e um cenário onde o respectivo mecanismo é implementado (i.e., “cenário IPsec” e “cenário SR-IOV”).

Tempos de resposta e números de pacotes entre as máquinas virtuais depende muito de como é feito o tráfego e da forma com que se faz o gerenciamento da capacidade de infraestrutura do provedor, mas é preciso expandir o olhar por toda a rede, desde o maquinário do cliente, sua conexão com a internet, os caminhos e servidores onde os dados percorrem e que podem provocar altas latências, aqui, queremos as baixas.

DESEMPENHO DE SOFTWARE EM APLICAÇÕES CLOUD

Vamos falar da análise da porção lógica dos sistemas cloud pela ótica da elasticidade, mas antes precisamos reconhecer o que representa a elasticidade nos serviços em nuvem. Quando se fala de elasticidade de serviços em nuvem estamos nos referindo a capacidade do servidor de redirecionar recursos como armazenamento e processamento, de acordo com a carga de trabalho do momento e do solicitado pelo cliente. 

Como principal vantagem, a elasticidade promoveu o desenvolvimento das Máquinas Virtuais e Containers encarregados de aumentar ou diminuir a sua oferta de recursos de forma automatizada e imediata. Coutinho (2014: 19) define elasticidade em nuvem como:

A elasticidade é uma característica essencial da Computação em Nuvem. Conforme o National Institute of Standards and Technology (NIST), a elasticidade é a habilidade de rápido provisionamento e desprovisionamento, com capacidade de recursos virtuais praticamente infinita e quantidade adquirível sem restrição a qualquer momento (MELL; GRANCE, 2009).

 

Não é por acaso que se usa o termo elasticidade aqui. Um elástico comum, por exemplo, possui sua capacidade de expandir em tamanho, mas deve, em algum momento, retroceder ao tamanho original sem danos em sua estrutura, o mesmo vale para as nuvens e provedores: se esticar o elástico além de sua capacidade ele se danifica e não retoma a forma original e os serviços cloud também terão tal limite de elasticidade. De acordo com Coutinho (2014: 19)

Uma definição de elasticidade mais recente proposta por Herbst, Kounev e Reussner (2013) consiste no quanto um sistema é capaz de se adaptar a variações na carga de trabalho pelo provisionamento e desprovisionamento de recursos de maneira autonômica, de modo que em cada ponto no tempo os recursos disponíveis combinem com a demanda da carga de trabalho o mais próximo possível. 

As nuvens computacionais estão, a cada dia, proporcionando elasticidade, uma de suas características mais dinâmica pois as permitem absorver cargas de trabalho cada vez mais intensas, e com isso existem, portanto, diversas maneiras de se medir a elasticidade, que embora não se tenha qualquer padronização, via de regra, usa aspectos como desempenho de CPU, memória e Throughput que somados devem fazer parte de uma forma de avaliação de elasticidade coerente.

CONECTIVIDADE EM APLICAÇÕES CLOUD

Que tal já começar colocando em jogo um outro termo? O termo Mobilidade cai muito bem com aplicações em nuvem pois nuvens são móveis e mobilidade é muito do que os serviços cloud trazem como vantagem, claro que vai muito além disso. Para Robu (2012 apud Vieira, Meirelles e Cunha, 2015: 4) “ A computação em nuvem é considerada uma tecnologia que traz benefícios aos usuários e empresas, pois otimiza os recursos computacionais. Os dados armazenados na nuvem podem ser acessados a qualquer momento e em qualquer lugar através da internet permitindo a mobilidade dos usuários.” Mas o que realmente significa uma nuvem cheia de SaaS, PaaS e IaaS? 

Para Pinto (2014: online) conectividade é uma nuvem cheia de serviços:

A partir de agora, mais do que nunca, as aplicações e serviços dependem da conectividade para manter o bom desempenho e o setor de TI não consegue garantir o padrão de qualidade das operadoras de Telecom. Com o acesso simples que o SaaS oferece, os executivos não precisam mais, necessariamente, do aval da equipe de TI ou do CIO da empresa para utilizar um determinado aplicativo, o que também dificulta a manutenção da performance.

Existe toda uma dinâmica e sincronização nos serviços em nuvem e, segundo com Pinto (2014: online) estes serviços permitem acesso, em qualquer lugar com internet assim como em qualquer dispositivo com a vantagem de manter os arquivos sincronizados: “característica que facilita toda a troca de materiais, fotos e outras informações. O mesmo ocorre, por exemplo, com o Office 365: um pacote com softwares baseados na plataforma Microsoft Office, totalmente online. “

Para gerar toda essa conectividade corporativa, Pinto (2014: online) afirma que é preciso:

Além da expectativa de que os serviços estejam disponíveis a qualquer hora e em qualquer local, existe ainda a necessidade de que as informações estejam sempre sincronizadas. Para isso, a equipe de TI precisa, primeiro, identificar quais os aplicativos considerados, de fato, corporativos. O segundo passo é construir, então, uma malha de redes preparada para fornecer todos os requisitos para garantir conectividade em todas localidades, qualidade, controle, segurança e, também, flexibilidade (um mix de MPLS, IP-VPN, LAN-to-LAN, etc).

Simplificando conectividade cloud podemos afirmar que se o dispositivo tem energia e conexão com a internet, é mais do que capaz de integrar na nuvem computacional. Esta extrema conectividade é uma das responsáveis pelo crescimento e aprimoramento das soluções em nuvem e junto com IoT, Machine Learning e Inteligência Artificial, vai moldar nosso futuro, embora já podemos vislumbrar isso hoje!

METODOLOGIAS DE ANÁLISE DE DESEMPENHO

Existem diversas metodologias de avaliação de sistemas que podem ser utilizadas em aplicações cloud, mas tal avaliação cai melhor nas mãos de programadores e profissionais de TI, o usuário comum, o empresário se faz uso de tais avaliações, apenas acompanhado de seu responsável técnico. De acordo com Souza (2012: 16) existe uma obvia necessidade de se avaliar constantemente os serviços em nuvem:

Toda esta “facilidade” é sensível aos usuários do sistema, que percebem quando a entrega dos serviços está degradada ou não. Por outro lado, os gestores e desenvolvedores deste tipo de plataforma, necessitam entregar estes serviços aos clientes de maneira confiável, disponível, e escalável. Tal desempenho não é transparente para a gerência, mesmo utilizando um software de gerenciamento, demandando uma maneira eficiente de quantizá-la, que será exposta mais adiante neste trabalho.

Para Santos (2005 apud Maia et al 2015: 2) atuar com o AHP (Analytic Hierarquic Process) representa uma metodologia que “possibilita a classificação e a comparação de critérios. Os critérios podem ser qualitativos ou quantitativos, pois as comparações são feitas de forma relativa entre as alternativas.” O método AHP é definido por Costa (2014 apud Maia et al 2015: 2) como composto pelas seguintes etapas:

Agora, aplicando o AHP em um cenário de cloud computing (neste caso uma migração de um banco de dados local para soluções em nuvem)  temos, conforme apresenta Maia (et al 2015: 2) às necessidades e objetivos pré-definidos:

Definir o objetivo a ser alcançado;
Definir as alternativas;
Definir uma hierarquia de critérios mais facilmente analisáveis e comparáveis;
Avaliar as alternativas duas a duas em relação aos critérios; e
Determinar a avaliação global de cada alternativa.

O resultado da aplicação do método AHP oferece ao gestor alternativas onde cada uma recebe sua pontuação e sistemas como o ExpertChoice são utilizados para ler tais resultados e fornecer indicativos de qual o melhor caminho a seguir. ExpertChoice é uma robusta ferramenta que foi criada com base na metodologia AHP:  

O software Expert Choice® foi criado a partir do método AHP para simplificar e sistematizar cálculos utilizando a metodologia em referência. O programa foi desenvolvido por Thomas Saaty em 1983 sendo considerado uma das ferramentas de sistema de apoio à decisão mais difundida do mundo. O software é de uso intuitivo e amigável mesmo para operadores sem experiência. Sua escolha diz respeito ao fato de que ele consegue, como poucos, associar a experiência humana e seu conhecimento a informações físicas mais fáceis de manipular. (COMIMI, et al, 2013: 12).

Com interface amigável, a utilização da ferramenta Expert Choice é facilitada, o que contribui para o sucesso da tomada de decisão na qual ela é empregada. Um dos motivos do sucesso da ferramenta está na utilização de intuitiva interface gráfica e na priorização de cálculos automáticos e checagem de inconsistências, dentre outros benefícios.

 

Com a aplicação do AHP refinada pelo uso do ExpertChoice, o resultado (não vamos falar aqui de escolhas mas do impacto do uso do AHP), pode ser percebido na organização como tendo efeito amplo e gerando muita informação útil a consultas futuras, como defende Maia (et al 2015) quando afirma que o processo decisório se torna transparente, com decisões confirmadas bem como no registro dos parâmetros e critérios avaliativos que poderão ser revisitados em situações futuras semelhantes.

 
 
Atividade extra

Nome da atividade: Leia o artigo intitulado “Tire suas dúvidas sobre conectividade de rede em ambiente cloud” e em seguida produza um texto sobre como a conectividade em nuvem pode ser aprimorada.
Link para a atividade:  https://sgatecnologia.com.br/tire-suas-duvidas-sobre-conectividade-de-rede-em-ambiente-cloud/

 

Referência Bibliográfica

COMIMI, Gisele et al. Melhores Práticas De Sustentabilidade Socioambiental No Planejamento Estratégico Das Organizações: Uma Análise De Apoio À Decisão Multicritério Com Expert Choice. Disponível em: <https://www.aedb.br/seget/arquivos/artigos13/45318530.pdf>. Acesso em 13 de junho de 2020.
COUTINHO, Emanuel Ferreira.  Fole: Um Framework Conceitual Para Avaliação De Desempenho Da Elasticidade Em Ambientes De Computação Em Nuvem. Disponível em: <http://repositorio.ufc.br/bitstream/riufc/18673/1/2014_tese_efcoutinho.pdf>. Acesso em 13 de junho de 2020.
MAIA, Jorge Luiz Grivot. O Uso Do Método Ahp Para A Seleção Da Melhor Maneira De Migrar Servidores De Bancos De Dados De Uma Determinada Empresa. Disponível em: <https://www.aedb.br/seget/arquivos/artigos15/23922358.pdf>. Acesso em 13 de junho de 2020.
PINTO, Francisco. SaaS e nuvem pública – A conectividade na era dos aplicativos. Disponível em: <https://computerworld.com.br/2014/12/12/saas-e-nuvem-publica-2013-a-conectividade-na-era-dos-aplicativos/>. Acesso em 13 de junho de 2020.
SOUZA, Leonardo Menezes De. Uma Metodologia Para Análise De Desempenho Em Sistemas De Computação Em Nuvens. Disponível em: <http://www.uece.br/macc/wp-content/uploads/sites/51/2020/02/LEONARDO-MENEZES-DE-SOUZA.pdf>. Acesso em 13 de junho de 2020.
VIEIRA, Claudia S.; MEIRELLES, Fernando de Souza; CUNHA, Maria Alexandra. Fatores que influenciam o indivíduo na utilização da Computação em Nuvem. Disponível em: <https://pdfs.semanticscholar.org/fabd/6083815d0055ded857ec039ffde33e1875c6.pdf>. Acesso em 13 de junho de 2020.

