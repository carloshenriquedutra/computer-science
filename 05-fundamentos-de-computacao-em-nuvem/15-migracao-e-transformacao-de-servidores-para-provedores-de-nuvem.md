Migração e transformação de servidores para provedores de nuvem
Nesta unidade trataremos de tema delicado: como transferir uma empresa de suas soluções locais para os serviços em nuvem. Vamos começar tratando sobre os desafios na primeira ponta, a empresa e nesta aula falaremos de como enxergar a empresa em ordem de se conhecer suas necessidades computacionais. Em seguida vamos a definição da outra ponta: o ambiente destino, a nuvem e com isso poderemos compreender melhor a sinergia entre o que a empresa precisa e o que os provedores oferecem. Por fim trabalharemos os conceitos das estratégias de migração e transformação para a empresa ingressar na nuvem e obter o melhor resultado.

DESAFIOS NA ÁREA DE DESCOBERTA DO AMBIENTE FONTE 

Neste ponto, você estudante já compreende que centenas empresas provedoras estão no mercado 24 horas por dia, 7 dias por semana oferecendo soluções em nuvem como servidores, armazenamento, softwares, virtualização, hipervisores e muito mais, mas é importante que se tenha atenção ao não subestimar a complexidade que é o processo de se migrar algo hospedado localmente para uma hospedagem em nuvem. Neste sentido, Moraes (2015: 4) afirma que:

Um ambiente de nuvem, centralizado e compartilhado para as OM que compõe o Polo de TI, vai resultar em uma série de vantagens, como a modernização do parque computacional em termos de formato de centro de dados, aproveitando as possibilidades que a computação em nuvem agrega em relação á virtualização. Também, em tempos de escassez de a convergência de pessoal de infraestrutura de três OM para uma, liberando os excedentes para completar outras funções, pode ajudar a amenizar a dificuldade particular que o Exército possui em transferir mais militares (principalmente de carreira) de outros estados para o Distrito Federal.

A origem, o ambiente fonte neste caso, precisa ser avaliada e com isso gerar informação suficiente ao gestor que o permita compreender os passos do processo de migração. Talvez seja a migração um bom momento da empresa se redescobrir, fato é que muitos negócios funcionam ano a ano em tamanho instinto, achismo, que nelas existe pouca ou nenhuma metodologia. Uma empresa com uma fonte desestruturada não será capaz de promover uma migração segura e pode sair do processo extremamente prejudicada. Assim, neste sentido Moraes (2015: 18) complementa que:

A transição de um ambiente tradicional para provedores de nuvem permite ao negócio optar pela solução de custo mais efetivo. No entanto, o processo de migração não é simples e pode oferecer riscos, tanto aos sistemas que foram fundidos, ou migrados parcialmente para o ambiente de nuvem, causando, por exemplo, exposição de informações críticas do negócio. Desta forma, Pahl e Xiong [37] lembram de que o processo de migração requer análise, planejamento e execução com muita cautela para garantir que a solução adotada esteja de acordo com os requerimentos organizacionais, ao passo que provê segurança e integridade aos sistemas de TI da organização.

Um fato importante a ser considerado reside no fato de que ambientes fonte tradicionais costumam ter inúmeros sistemas e tecnologias que são largamente ofertados em servidores em nuvem, embora a migração nestes casos jamais será livre de desafios e complexidades (MORAES, 2015). E concluindo, embora estejamos atuando sempre em casos de migração, devemos lembrar que existirão muitos casos de não migração, seja por motivo de não compatibilidade do modelo de negócio ou até mesmo por falta de um ambiente cuja cultura seja receptiva a cultura de trabalho em aplicações de nuvem.

DEFINIÇÃO DE AMBIENTE DESTINO 

Boa parte da complexidade em migrar para a nuvem reside no ambiente fonte, mas tal processo pode ser facilitado enormemente se a empresa compreender o ambiente destino e como este último lhe pode ser útil feitas algumas adaptações. Claro que existem centenas de serviços cloud por ai e em muitos existem diferentes soluções integradas, algumas proprietárias e outras “sublocadas” destas soluções, a exemplo dos serviços AWS.

Fato é que muitos fornecedores de cloud computing usam, por exemplo, produtos Microsoft Azure, por exemplo, e com isso não se deve esperar diferenças muito grandes entre o que estes provedores oferecem, o melhor mesmo é sempre buscar conhecer as tecnologias utilizadas, não quem as vende. De acordo com Blanchard (2020: online) um ambiente, ou zona de destino, pode ser definido por:
A infraestrutura como código é um requisito comum para a maioria dos esforços de adoção da nuvem. A mudança para a criação do ambiente de código em primeiro lugar pode adicionar uma curva de aprendizado para membros da equipe e exigir alterações em aspectos de operações, segurança, governança e conformidade. A implantação de zonas de destino criadas com a finalidade de discrição ajuda a nivelar essas curvas e permite que a equipe permaneça no controle dos planos de adoção.

Se preferir, pode chamar as zonas destino de Landing Zones (termo em inglês que designa uma solução proprietária da AWS), e de acordo com AWS (2018: online) temos que as Landing Zones promovem soluções: 

O AWS Landing Zone é uma solução que ajuda os clientes a configurar mais rapidamente um ambiente AWS seguro de várias contas, com base nas melhores práticas da AWS. Com o grande número de opções de design, a configuração de um ambiente de várias contas pode levar um tempo significativo, envolver a configuração de várias contas e serviços e exigir um profundo conhecimento dos serviços da AWS.

Soluções como a Landing Zone da AWS contribuem ao economizar tempo em automatizar a configuração e com isso executar grandes cargas de trabalho de forma segura e com possibilidade de escalonamento ao mesmo tempo em que cria as contas e recursos principais. De acordo com AWS (2018: online)

O AWS Landing Zone implanta um produto AVM (Account Vending Machine – Máquina de venda de contas) da AWS para provisionamento e configuração automática de novas contas. O AVM aproveita o AWS Single Sign-On para gerenciar o acesso à conta de usuário. Esse ambiente é personalizável para permitir que os clientes implementem suas próprias linhas de base de contas por meio de um pipeline de configuração e atualização do Landing Zone. Para saber mais sobre o AWS Landing Zone, consulte a página da web da solução.

Para Blanchard (2020: online) previamente a implantação das zonas de destino:

[…] supõe-se que os controles centralizados para identidade, segurança, operações, conformidade e governança sejam fornecidos à zona de destino por meio de uma base de plataforma compartilhada, compatível com todas as cargas de trabalho nessa plataforma de nuvem específica. Todas as cargas de trabalho em cada zona de destino serão governadas por esses controles centrais para estabelecer uma linha de base consistente entre os pilares de arquitetura compartilhada de segurança, confiabilidade, desempenho, custo e operações de nuvem. 

DECISÕES DE ESTRATÉGIAS DE MIGRAÇÃO

Nesta aula vamos dar uma visão mais financeira no processo estratégico de migração de funcionalidades e sistemas informáticos para as plataformas em nuvem. Mas antes de começar, vamos na mesma linha que Ribas, Lima e Souza (2014: ) ao afirmar que o processo de tomada de decisão para avaliar a adoção ou não das soluções em nuvem deve ser multicritério e indica o uso do AHP (Analytic Hierarchy Process).

E antes de aprofundar nas metodologias que nos ajudarão a compreender como se deve pensar nas estratégias de migração é preciso retomar o conceito de SaaS, conforme apresenta Ribas (et al, 2014: ) “Os serviços do tipo SaaS  são os que representam a adoção do modelo em nuvem  na sua forma  mais  abrangente,  pois  em  última  análise  o  usuário  de  um  software  no  modelo SaaS   é também  usuário  de PaaS e IaaS,  indiretamente.”

No final da década de 60 Saaty, o matemático, desenvolveu o método de medição de desempenho AHP (Analytic Hierarchy Process) sendo um método de apoio a tomada de decisão inspirado em sua observação sobre a dificuldade de comunicação entre os membros do governo americano enquanto trabalhava para a Agência de Controle de Armas e Desarmamento do Departamento de Estado Americano.

Quando a empresa necessita adotar algo que tem grande peso, seja no fato de mudar processos, seja na complexidade da mudança ou na complexidade da escolha de como proceder com a mudança, ela se faz valer de métodos de apoio a tomada de decisão, e cá entre nós, a adoção de serviços em nuvem ou a migração para a nuvem não é decisão simples, é sim decisão estratégica, e como tal precisa entrar no ciclo de um projeto, precisa ser avaliada com metodologia, e neste caso, o uso do AHP faz muito sentido, conforme resumem Briozo e Musetti (2015: 808):

Além de o método AHP permitir a resolução de problemas com critérios conflitantes, uma das vantagens apontadas por Gomes (2009) se deve ao fato de o método permitir a participação de diversas pessoas, como é o caso da gestão pública, em que decisões envolvem diversos atores, diversos critérios e múltiplas alternativas e consequências.

Para Ribas (et al, 2014) sistemas SaaS podem apresentar muita variação, dependendo de quem os oferece e depende do tipo da aplicação e seu tamanho bem como da complexidade dos seus processos e do negócio da empresa, sem deixar de lado o custo do software hospedado. 

Por fim, embora micro e pequenas empresas possam desconsiderar os benefícios de um projeto bem executado, ao menos se utilizarem métodos como o AHP, terão melhores chances de que sua decisão por adotar ou não uma solução em nuvem não será apenas pautada pelo relativo baixo valor mensal da proposta.

DECISÕES DE ESTRATÉGIAS DE TRANSFORMAÇÃO

Revoluções costumam vir em ondas que em certo momento, dependendo das condições, explodem e mudam e muito a vida das pessoas. Um exemplo de onda que estourou na praia do mundo corporativo foi a revolução da Indústria 4.0 que convergiu o que se tem de melhor em tecnologia e criou as fábricas inteligentes, os dispositivos conectados (IoT) e mostrou como vai ser a cara das próximas evoluções debruçadas em computação quântica e muita inteligência artificial. De acordo com Olitel (2019: online):

O processo de transformação digital das empresas veio para ficar e está revolucionando a forma como as marcas trabalham e se comunicam com os clientes. Para atingir essa tão desejada transformação, as empresas precisam investir e grande parte deste investimento, de acordo com o IDC, será direcionado aos produtos e serviços digitais. E entre essas soluções, o cloud computing se destaca como meio facilitador do trabalho dos gestores de TI, fazendo com que o processo de transformação digital seja uma experiência mais inteligente, acessível e descomplicada para empresas de qualquer porte. Com tantos benefícios e vantagens ofertados às empresas, até o ano de 2020, ao menos 55% das infraestruturas e softwares corporativos da América Latina serão baseadas na nuvem. 

Desta forma, o mundo inteiro será cloud ao menos dentro desta década, o que nos faz pensar sobre o que virá a seguir. Mas um fato a se considerar reside na velocidade das transformações dos serviços em nuvem e, novamente, sua enorme capacidade de absorver as mudanças dos clientes de seus serviços e dos clientes destes clientes. Para Olitel (2019: online) a aceleração é sempre parte do crescimento na nuvem:
O crescimento do uso da nuvem em seus diferentes tipos de soluções tem motivado a inovação nas empresas e acelerado as estratégias de transformação digital. Um importante ponto de partida desta transformação, tem sido a análise de dados. Com as novas tecnologias, tem sido possível reutilizar os dados da empresa de forma mais eficiente como parte de um ecossistema de desenvolvimento e gestão mais modernos. Outro fator que impulsiona a adoção da cloud computing é estar sempre conectada com as novas tecnologias como IoT, Big Data, inteligência artificial e muitas outras inovações de ponta. 

Um ponto importante sobre transformação é que leva tempo para que os elementos transformadores tomem conta de todo o seu “alvo” modificando comportamento, neste sentido, a computação em nuvem já está “no ar” a uns bons anos, mas ainda não chegou ao ponto necessário para formar sua própria revolução, está quase.

De acordo com Saldanha (2020: online) “Entre as distintas e relevantes transformações que estão revolucionando o mercado, há uma que ainda passa um pouco despercebida, embora tenha bastante potencial para transformar negócios: a computação em nuvem.” Saldanha apresenta dados muito interessantes do Gartner que revelam que até 2022 mais de 75% dos bancos de dados serão criados ou migrados na nuvem e que as aplicações SaaS terão enorme demanda.

De acordo com Saldanha (2020: online)

No varejo, por exemplo, com a utilização de determinadas tecnologias em nuvem, a força de vendas pode estar mais alinhada aos objetivos estratégicos por meio da integração de dados pulverizados para que haja uma atuação mais cirúrgica e assertiva sempre que conveniente. 

Quando você compra um veículo o motor contido no cofre, sob o capô, não pode ser substituído por outro, ao menos não facilmente ou sem um custo considerável, correto? A grande transformação das tecnologias e desenvolvimento de soluções em nuvem é a capacidade de permitir que a empresa use um motor de Ferrari quando precisa correr mais, ou use um motor de fusca quando as coisas estão tranquilas, o que significa que quem contrata um serviço em nuvem tem a possibilidade de aumentar flexivelmente a potência da sua capacidade computacional em um mês e reduzir no outro, caso necessite.

Toda esta troca de motores, a flexibilidade do consumo dos serviços em nuvem concede a qualquer empresário a chance de potencializar as atividades de sua empresa sem, com isso, ter que fazer grandes despesas ou empréstimos, como exemplifica Saldanha (2020: online):

Para as empresas de entretenimento, que têm demandas pontuais quando há intensa venda digital de ingressos, por exemplo, servidores hospedados na nuvem podem ser contratados sob demanda, o que também contribui para ganho de escala e redução de custos.

Sem mencionar o e-mail, fica claro que muitos já operam em nuvem e não percebem, e isto é outra qualidade deste importante serviço. Hoje pessoas e empresas podem acessar seus arquivos em qualquer lugar ou dispositivo que esteja conectado a internet e toda esta mobilidade tecnológica está permitindo uma enorme evolução no que se tem oferecido em termos de experiência de usuário.

 

 

 

Atividade Extra

Nome da atividade: Leia o artigo “10 motivos para migrar à nuvem e não depender mais de seu servidor” e em seguida produza um texto argumentativo sobre: Que tipo de empresa não precisa usar serviços em nuvem?

 

Link para a atividade:  https://www.vertic.com.br/post/10-motivos-para-migrar-a-nuvem-e-nao-depender-mais/98/

 

 

Referência Bibliográfica 

BRIOZO, Rodrigo Amancio Briozo; MUSETTI. Marcel Andreotti. Método multicritério de tomada de decisão: aplicação ao caso da localização espacial de uma Unidade de Pronto Atendimento – UPA 24 h. Disponível em: <https://www.scielo.br/pdf/gp/v22n4/0104-530X-gp-0104-530X975-13.pdf>. Acesso em 13 de junho de 2020.

MICROSOFT. O que é uma zona de destino? Disponível em: <https://docs.microsoft.com/pt-br/azure/cloud-adoption-framework/ready/landing-zone/>. Acesso em 13 de junho de 2020.

MORAIS, Nathaniel Simch de. Proposta de modelo de migração de sistemas de ambiente tradicional para nuvem privada para o Polo de Tecnologia da Informação do Exército brasileiro. Disponível em: <https://repositorio.unb.br/handle/10482/18758>. Acesso em 13 de junho de 2020.

RIBAS, Maristella. Tomada De Decisão Multicritério Na Migração De Aplicativos Para Ambientes De Nuvem Do Tipo  Software As A Service. Disponível em: <http://sustenere.co/index.php/rbadm/article/view/SPC2179-684X.2014.002.0007/468>. Acesso em 13 de junho de 2020.

SALDANHA, José. Computação em nuvem pode melhorar negócio. Disponível em: <https://www.hojeemdia.com.br/opinião/blogs/opinião-1.363900/computação-em-nuvem-pode-melhorar-negócio-1.765736>. Acesso em 13 de junho de 2020.