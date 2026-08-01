Infraestrutura básica de segurança para web
Nesta unidade teremos um apanhado de temas que nos ajudarão a compreender melhor a infraestrutura dos serviços em rede começando com os maiores problemas de segurança. Em seguida trataremos de definir os conceitos sobre a infraestrutura em nuvem e detalhes como seus nós físicos. Trataremos de tema delicado: a necessidade de ampliação dos recursos de alta disponibilidade e o aumento na demanda por soluções cloud e por fim como podemos compreender a estrutura de hardware dos serviços em nuvem.

 

Introdução a aspectos de segurança para web

Se você, estudante, refletir sobre o fato de que um percentual muito grande das empresas espalhadas pelo mundo tem seus negócios na internet ou ao menos usam aplicações na internet não fica estranho pensar que isso pode dar margem a toda uma série de problemas de segurança. Da mesma forma que soluções foram sendo desenvolvidas para facilitar a vida dos gestores, outras foram surgindo para lhe roubar informações e de forma mais direta, recursos financeiros. De acordo com Rojas (2016: 24) a necessidade de segurança pode ser definida:

[…] nos modelos de serviço e implantação, bem como a responsabilidade atribuída aos atores do processo, ou seja, os consumidores e os provedores de serviços. A Figura 1 [a seguir] ilustra a responsabilidade compartilhada em relação à segurança dos serviços executados na nuvem com base nos modelos de serviços propostos pelo NIST (MELL; GRANCE, 2011).

 


Com esta imagem que mostra a representação de uma solução de servidor local comparadas a uma solução em nuvem, fica fácil perceber que a posição do gestor que se faz valer de recursos em nuvem é muito mais delicada, uma vez que o gestor que ainda utiliza servidores e soluções locais necessita de um número muito menor de soluções de segurança. A seguir listamos os maiores problemas de segurança que o mundo corporativo enfrenta quando entra na rede mundial de computadores:

Segurança de rede:

Problemas de segurança associados à rede de comunicação de dados, elementos de processamento e armazenamento da nuvem. Como exemplos de problemas desta categoria, podem-se mencionar: transferência de dados, firewalls e configurações de segurança para o ambiente;

Interface:

Problemas relacionados às interfaces oferecidas pelos serviços para interação com a nuvem por parte dos usuários, administradores e elementos programáveis. Como exemplos de problemas desta categoria, podem-se citar: API (Application Program Interface), administração do ambiente de nuvem, acesso do usuário final e mecanismos de autenticação e autorização para acesso à nuvem;

Segurança de dados:

Problemas de proteção dos dados no ambiente em nuvem com relação à confidencialidade, integridade e disponibilidade (CIA). Estes serviços são considerados fundamentais no contexto da segurança da informação (BISHOP, 2002). Como exemplos de problemas desta categoria, podem-se citar: criptografia de dados, redundância de recursos e atenção especial ao processo de descarte dos dados. O processo de descarte visa garantir que os dados não possam ser recuperados após seu uso;

Virtualização:

Problemas relacionados com técnicas de virtualização empregadas pela nuvem para poder compartilhar e administrar os recursos físicos da infraestrutura. Como exemplos de problemas desta categoria, podem-se mencionar: Isolamento de recursos, vulnerabilidades do hypervisor, vazamento de dados do ambiente compartilhado, autenticação e autorização entre máquina virtuais do ambiente e ataques entre máquinas virtuais;

Governança:

Problemas relacionados à perda do controle administrativo e de segurança causados pela utilização das soluções baseadas em nuvem. Como exemplos de problemas desta categoria, podem-se relacionar: controle dos dados em ambiente de nuvem, controle dos níveis de segurança em ambiente de nuvem e dependência em relação aos serviços de nuvem (lock-in);

Conformidade:

Requisitos de conformidade a serem atendidos pelos serviços, bem como disponibilidade, transparência e auditoria. Como exemplos de problemas desta categoria, podem-se citar: acordo de nível de serviço, disponibilidade do ambiente e serviço de nuvem, possibilitar auditoria de segurança e conformidade de serviços e usuários;

Questões legais:

Aspectos relacionados a requisitos legais a serem considerados pela nuvem. Como exemplos de problemas desta categoria, podem-se mencionar: aspectos relacionados à localização geográfica dos dados, possibilidade de análise forense mantendo confidencialidade, privilégios de administrador do provedor da nuvem e legislações.

 

Quadro: Principais problemas de segurança na nuvem

Fonte: Adaptado de Rojas (2016: 26)

 

 

Mas precisamos considerar um fator importante: o portador de solução local se encarrega de sua segurança enquanto o usuário de serviço em nuvem tem sua segurança servida pelo seu provedor cloud. A diferença entre a solução de segurança local e da em nuvem dependerá dos recursos da empresa. Uma empresa pequena pode não ter recursos para uma solução de segurança online robusta o suficiente para proteger seus dados enquanto que um provedor de serviços web tem tais soluções por padrão para oferecer aos seus clientes, primeiro pois seu negócio depende disso e segundo pois como empresa precisa assegurar suas informações assim como as de seus clientes.     

 

Principais componentes da infraestrutura cloud

Podemos dizer que são poucos os elementos que você vê de um serviço em nuvem: um portal, tela de login de usuário e senha e um ambiente onde executa seus serviços. Podemos dizer mais ainda ao afirmar que a computação em nuvem mudou de lugar os servidores físicos das empresas e fez algo interessante: elas não precisam mais comprar tais servidores, apenas pagar pelo aluguel do uso, do quanto precisam e do que precisam usar. Muito peculiar esta computação em nuvem, não é? Agora, Sousa, Moreira e Machado (2009: 3) conceituam a infraestrutura que antes se situava na empresa e que agora se concentra no provedor como:

A infraestrutura do ambiente de computação em nuvem normalmente é composta por um grande número, centenas ou milhares de máquinas físicas ou nós físicos de baixo custo, conectadas por meio de uma rede como ilustra a Figura 7.2. Cada máquina física tem as mesmas configurações de software, mas pode ter variação na capacidade de hardware em termos de CPU, memória e armazenamento em disco [Soror et al. 2010]. Dentro de cada máquina física existe um número variável de máquinas virtuais (VM) ou nós virtuais em execução, de acordo com a capacidade do hardware disponível na máquina física.

O custo de aquisição de um servidor, dependendo da aplicação e do tamanho da empresa, pode ser de milhões de dólares para uma empresa, algo que é proibitivo na maioria das vezes. Mas o elevado custo, embora desestimule a compra não elimina a necessidade e em um mundo tão competitivo, força as empresas a demandarem tais serviços em outros formatos. Esta necessidade de novas formas de acesso a poder computacional foi e sempre será a mola propulsora das aplicações em nuvem. Os principais componentes da computação em nuvem que a tornam tão atrativas as empresas são:

Hipervisor

Hypervisor é um programa de firmware ou de baixo nível que atua como um Virtual Machine Manager. Ele, no entanto, permite compartilhar a instância física única de recursos de nuvem entre vários inquilinos.

Software de implantação

Isso ajuda a implantar e integrar a aplicação na nuvem para iniciar um gerenciamento mais eficaz.

Software de gerenciamento

O software de gerenciamento, como alguns componentes da computação em nuvem, ajuda a manter e configurar a infraestrutura de suas aplicações em nuvem. E além disso, ajuda qualquer outro projeto relacionado no Servidor.

Rede

Este é o principal componente da infraestrutura da nuvem. A rede permite conectar serviços da nuvem pela Internet. Do mesmo modo, também é possível entregar a rede como um utilitário pela Internet. O que significa que o cliente pode personalizar a rota e o protocolo da rede.

Servidor

O servidor ajuda a calcular o compartilhamento de recursos e oferece outros serviços, como alocação de recursos e desalocação, monitorando os recursos, fornecendo segurança etc.

Armazenamento

A Nuvem mantém múltiplas réplicas de armazenamento. Se um dos recursos de armazenamento falhar, ele pode ser extraído de outro, o que torna a computação em nuvem mais confiável.

 

Quadro: Componentes cloud

Fonte: Adaptado de Icloud (2020: online)

 

 

A alguns anos atuei em uma instituição de ensino que fez a façanha de comprar um servidor. A ideia era de agilizar processos existentes e implementar novos processos. A instituição estava mergulhando de cabeça no BI (Business Inteligence) e com isso necessitava de uma solução poderosa e local, com isso adquiriu da HP (Hewlett-Packard) um servidor de R$ 12 milhões.

Embora a situação da instituição não seja única, muitas outras passam pelo mesmo momento, pois estão no mesmo mercado, o fato é que são poucas as que possuem recursos para tamanha aquisição de servidor, o que as joga nos braços das provedoras de soluções em nuvem com seus servidores dedicados e serviços customizados. De acordo com Sousa, Moreira e Machado (2009: 3) existem 3 principais benefícios da computação em nuvem:

O modelo de computação em nuvem foi desenvolvido com o objetivo de fornecer serviços de fácil acesso, baixo custo e com garantias de disponibilidade e escalabilidade. Este modelo visa fornecer, basicamente, três benefícios. O primeiro benefício é reduzir o custo na aquisição e composição de toda infraestrutura requerida para atender as necessidades das empresas, podendo essa infraestrutura ser composta sob demanda e com recursos heterogêneos e de menor custo. O segundo é a flexibilidade que esse modelo oferece no que diz respeito à adição e substituição de recursos computacionais, podendo escalar tanto em nível de recursos de hardware quanto software para atender as necessidades das empresas e usuários. O último benefício é prover uma abstração e facilidade de acesso aos usuários destes serviços. Neste sentido, os usuários dos serviços não precisam conhecer aspectos de localização física e de entrega dos resultados destes serviços.

Veja como é interessante: a empresa não dispõe de verba para comprar um servidor e quando decide partir para uma solução em nuvem não vai precisar “comprar” o poder computacional equivalente ao servidor local que desejara comprar, a computação em nuvem democratiza e muito o acesso a poder computacional colocando a empresa em um contrato onde vai pagar apenas pelo que necessitar processar.

Claro que a computação em nuvem não resolve apenas a questão financeira, mas torna tudo mais acessível pois as aplicações fazem com que o empresário invista em computadores mais básicos, pois estas aplicações dão maior poder de gerenciamento e mobilidade ao gestor e seus colaboradores e oferecem uma variedade enorme de funcionalidades.

 

Recursos de alta disponibilidade para todos os componentes da infraestrutura web

Existe um termo que a indústria usa para definir uma situação onde a velocidade de um processo é reduzida por algum fator, a este termo damos o nome de gargalo. Desde que a internet se popularizou no Brasil, podemos assistir as velocidades de acesso sendo gradativamente aumentadas principalmente pela tecnologia de comunicação, dos modens e das linhas telefônicas. Os gargalos da internet foram sendo reduzidos e hoje são mais uma questão de contrato, onde a velocidade de sua internet é tão elevada quanto você a contratar para ser. Mas com tantas empresas oferecendo soluções em nuvem e com isso jogando tanta carga de processamento, movimentação de dados, é de se esperar que ocorram gargalos eventualmente, o que mexe com um conceito muito debatido neste universo em nuvem: o da disponibilidade dos serviços. De acordo com Heimovski (et al, 2017: 2):

Atualmente, observam-se variados tipos de serviços oferecidos pelos provedores de nuvens computacionais, por exemplo, próximo de 61% das atividades comerciais no Reino Unido utilizam algum tipo de serviço em computação em nuvem [Arean 2013]. Entretanto, ainda existem diversos desafios que precisam ser tratados, como: segurança, gerenciamento de riscos, e a alta disponibilidade [Kholghi et al. 2014].

Pense no cenário: o seu antigo sistema de vendas (por exemplo) funcionava em um servidor local mas fora substituído por uma aplicação web cujo acesso agora é pelo navegador, e embora seja um sistema melhor, mais ágil, com mais recursos, não vai funcionar se não estiver conectado a internet e esta regra vale também para o provedor e seu próprio acesso a internet. A disponibilidade então é representada pela capacidade do provedor de entregar o serviço ao cliente, conforme defende Heimovski (et al, 2017: 2):

A alta disponibilidade e essencial para permitir que aplicações críticas façam uso da nuvem. Em particular, o gerenciador de nuvem sempre deve se manter acessível para que o cliente ou administrador da nuvem consiga utiliza-lo a qualquer instante. O cliente deve ser capaz de acessar os dados de qualquer gerenciador a qualquer momento, da forma mais transparente possível. Desta forma, e desejável que uma infraestrutura em nuvem ofereça soluções que permitam o acesso aos recursos mesmo diante de falhas.

Portanto o provedor de soluções em nuvem vai se fazer valer de muitas soluções redundantes como soluções de armazenamento, links de acesso, sistemas geradores de energia e até mesmo servidores redundantes, tudo projetado para que nada seja interrompido e o cliente sempre tenha acesso ao seus sistemas, seus dados.

 

Infraestrutura de hardware: plataformas de hardware, virtualização e consolidação de servidores

Para compreender o que significa virtualizar basta pensar que a carga de trabalho que antes necessitava de um poder X de processamento agora é feita em um computador com 10% desta capacidade X que roda o serviço em nuvem, virtualizado. Virtualização, portanto, centraliza muito o sentido do cloud computing, mas o que é a virtualização para a informática? De acordo com Alcoba (2013: online):

Virtualização e Cloud Computing são conceitos que estão relacionados, mas isso não significa que eles dizem respeito à mesma coisa. A interligação deles ocorre porque na implantação atual de cloud, geralmente ocorre a virtualização de servidores. Entretanto, essa não é uma regra. É possível obter uma solução de cloud computing utilizando apenas máquinas físicas, mas não é o mais comum, nem o mais eficiente e vantajoso.

Agora a empresa não mais precisa ter enormes servidores que custam muito e necessitam de manutenção constante, mão de obra especializada, agora as empresas podem se dedicar mais a sua atividade principal pois suas necessidades computacionais estão sendo tratadas pelo seu provedor em nuvem que contém, de acordo com Verdi (et al, 2010: 13) a seguinte estrutura:

A infraestrutura da nuvem é formada pelos data centers que abrigam os servidores que, mediante diferentes níveis de organização e técnicas de virtualização, oferecem os serviços em nuvem. Portanto, os data centers são a manifestação física da computação em nuvem, sendo a infraestrutura de rede a base de comunicações que habilita o paradigma de cloud computing, interligando servidores físicos em grande escala.

O fato de que a empresa usuária de uma solução em nuvem, não necessita da mesma carga de processamento o tempo todo torna o uso das maquinas virtuais algo muito prático, uma vez que cada servidor em nuvem pode ter diversas destas maquinas virtuais cada uma ocupando sua capacidade alocada de processamento e com isso um servidor abriga dezenas ou centenas de clientes. De acordo com Verdi (et al, 2010: 13):

Em ambientes virtualizados, cada servidor físico pode conter múltiplas máquinas virtuais (VM) gerenciadas por um software de virtualização (hypervisor). Este software introduz um switch virtual para interligar máquinas virtuais dentro de um mesmo servidor físico e pode estender suas configurações para criar domínios virtuais no nível de rack. Esta nova geração de switches (por exemplo, Cisco v1000, Open vSwitch) em software é desenvolvida com funcionalidades e interfaces comparáveis aos switches físicos, mas com a flexibilidade e velocidade de desenvolvimento de uma implementação em software. Isto facilita extremamente a gerência de redes em ambientes virtuais, além de oferecer numerosas opções de configuração, isolamento e funcionalidades que seriam intratáveis com técnicas tradicionais de gerência dos switches em hardware.

Em muitos casos o servidor da empresa (em situações onde a atividade da empresa usa servidores como parte do processo e não existe elevada dependência) é subutilizado ao ponto de ser um custo muito auto manter embora seja parte do processo. Se o servidor opera a um terço de sua capacidade o custo de manutenção passa a ser um problema e a solução em nuvem fica como uma saída atrativa e objetiva. Agora esta consolidação de servidores, representa para Dian e Pereira (2013: 30):

Consolidar servidores é consolidar recursos subutilizados em uma quantidade menor, permitindo economia de hardware e melhor gerenciamento e administração de infraestrutura. De acordo com Supercom (2013), a consolidação propicia ainda menos espaço físico a ser ocupado e menos gastos com eletricidade e com manutenção de máquinas, além de maior flexibilidade.

Dell (2013 apud DIAN E PEREIRA, 2013: 30) afirma que “consolidar servidores significa organizar e reestruturar a infraestrutura de uma determinada organização com o intuito de reduzir custos e melhorar o gerenciamento da rede.” Portanto, o número de servidores virtuais que “cabem” em um servidor em nuvem recebe o nome de taxa de consolidação sendo um número que varia em cada data center e depende do poder de processamento, do volume de memória, das taxas de leitura e gravação dos discos e SSDs bem como das taxas de utilização destes recursos.

Mansur (2009 apud DIAN E PEREIRA, 2013: 30) diz que “nos dias de hoje a consolidação de servidores se mostra como elemento essencial às estratégias de TI verde das empresas, pois além de trazer redução dos custos e aumento dos lucros, traz também benefícios ambientais e vantagens competitivas.” Podemos ir além da pegada verde da consolidação de servidores ao afirmar que proporciona a escalabilidade dos serviços em rede, ficando claro que jamais seria viável uma estrutura em nuvem onde cada cliente do provedor fosse locatário de um servidor dentro da estrutura e não de uma instância de processamento.

 

 

Atividade extra

Nome da atividade: A Red Hat faz uma leitura muito interessante sobre o que é virtualização e sua relação com a computação em nuvem. Faça a leitura e ao final sintetize a diferença entre computação em nuvem e virtualização em uma frase de até 2 linhas.

Link para a atividade:

https://www.redhat.com/pt-br/topics/cloud-computing/cloud-vs-virtualization

 

 

Referência Bibliográfica​

DIAN, Mauricio de Oliveira; PEREIRA, Marco Antonio Alves. A Contribuição Da Virtualização E A Consolidação De Servidores Para Redução De Tco. Disponível em: <https://revista.fatectq.edu.br/index.php/interfacetecnologica/article/view/76/83> Acesso em 7 de junho de 2020.
HEIMOVSKI, Gustavo B. ET AL. Alta Disponibilidade de um Gerenciador de Nuvem IaaS Baseada em Replicação: Experiência Resultados. Disponível em: <https://sol.sbc.org.br/index.php/sbrc/article/view/2631> Acesso em 7 de junho de 2020.
ICLOUD. Infraestrutura e Componentes da Computação em Nuvem. Disponível em: <https://www.icloud.com.br/2329/infraestrutura-e-componentes-da-computacao-em-nuvem> Acesso em 7 de junho de 2020.
SOUZA, Flávio R. C; MOREIRA, Leonardo; MACHADO, Javam. Computação em Nuvem: Conceitos, Tecnologias, Aplicações e Desafios. Disponível em: <https://www.researchgate.net/profile/Javam_Machado/publication/237644729_Computacao_em_Nuvem_Conceitos_Tecnologias_Aplicacoes_e_Desafios/links/56044f4308aea25fce3121f3.pdf> Acesso em 7 de junho de 2020.
