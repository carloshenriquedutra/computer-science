# Questões e Respostas Comentadas — Fundamentos de Computação em Nuvem

Documento de resolução e revisão das questões avaliativas das Aulas 12 a 16 da disciplina **05 - Fundamentos de Computação em Nuvem**, com fundamentação teórica baseada nas anotações do repositório.

---

## Aula 12 — Infrastructure as a Service (IaaS)
**Arquivo de Referência:** [12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md)

---

### Questão 1
IaaS significa Infraestrutura como serviço e faz parte das camadas do serviço cloud oferecido às empresas desde 1960 quando o cientista da computação John McCarthy surgiu com o conceito de compartilhamento de tempo de computação. No IaaS é oferecida parte da capacidade computacional da estrutura de TI do provedor. Qual seria o nome anterior dado ao IaaS?

- [ ] XaaS – Everything as a Service
- [ ] CaaS – Computer as a Service
- [ ] MaaS – Machine as a Service
- [ ] CaaS – CPU as a Service
- [x] **HaaS – Hardware as a Service**

> **Justificativa:** Conforme destacado em [12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L14), *"o IaaS era anteriormente conhecido como HaaS — ou Hardware como Serviço"*, no qual a empresa contrata capacidade computacional e servidores virtuais em vez de adquirir ativos físicos.

---

### Questão 2
O IaaS derruba o conceito de TCO, custo total de propriedade no que diz respeito ao fato de promover acesso a poder computacional que antes deveria ser adquirido pela empresa. Além da cobrança pelo serviço IaaS ser, a exemplo dos serviços SaaS, pela carga de processamento, qual seria a outra forma de medição de uso para cobrança?

- [x] **Pelo número de servidores utilizados no mês**
- [ ] Pelo faturamento anual da empresa
- [ ] Pelo número de colaboradores que acessam o serviço
- [ ] Pelo número de computadores que a empresa possui em sua sede
- [ ] Pela quantidade de horas que o cliente fica conectado ao sistema

> **Justificativa:** Conforme o material ([12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L16-L18)), a cobrança no IaaS considera a quantidade de servidores virtuais alocados no mês, o volume de dados armazenados e o tráfego gerado no modelo *pay-per-use*.

---

### Questão 3
Em relação a tarifação, serviços IaaS podem ser ligeiramente distintos dos serviços SaaS e PaaS, mas de que forma?

- [ ] Tarifação baseada no número de usuários e licenças
- [ ] Tarifação por funcionalidades e níveis de serviço
- [ ] Tarifação por pacotes de uso
- [x] **A tarifação é feita com base no que for alocado, sendo utilizado ou não**
- [ ] Tarifação por transações e uso de recursos

> **Justificativa:** De acordo com Carissimi (2015, citado em [12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L28)), *"a tarifação no IaaS considera a quantidade de recurso que é destinado ao cliente, durante um certo período de tempo, sem considerar se está ou não sendo efetivamente empregado"*.

---

### Questão 4
O começo da AWS, plataforma cloud da Amazon, foi devido a uma grande ideia: aproveitar toda a expertise desenvolvida para lidar com sua enorme expansão de servidores pelo mundo e oferecer como serviço sob demanda para outras empresas. Qual das alternativas a seguir NÃO apresenta um provedor IaaS?

- [ ] Microsoft Azure
- [x] **Google App Engine**
- [ ] Rackspace Cloud
- [ ] Amazon EC2
- [ ] Citrix

> **Justificativa:** O **Google App Engine (GAE)** é um serviço clássico de **PaaS** (*Platform as a Service*), voltado para execução e deploy de código sem gestão de infraestrutura, enquanto Azure, Rackspace, EC2 e Citrix fornecem IaaS ([12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L28)).

---

### Questão 5
No IaaS um termo muito comum é “servidor”. São servidores físicos que abrigam inúmeras máquinas virtuais, onde o cliente seleciona na contratação a quantidade que precisa para suas necessidades. Nas soluções SaaS o cliente encontra as aplicações prontas para uso, de que forma isso acontece nas soluções IaaS?

- [ ] Da mesma forma. No IaaS o cliente já recebe o servidor virtual configurado
- [ ] No IaaS o consumidor tem acesso a um verdadeiro servidor e o utiliza com seu teclado de uso remoto
- [x] **No IaaS o próprio cliente deve instalar e configurar os recursos que precisa**
- [ ] O consumidor encontra o servidor vazio, sem sistema, mas em seguida o departamento de TI do provedor se encarrega de configurar tudo
- [ ] No IaaS o cliente instala seu sistema operacional mas os recursos que vai utilizar já se encontram configurados

> **Justificativa:** Conforme Carissimi (2015, citado em [12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L28)), no IaaS o cliente recebe o sistema computacional bruto e *"é necessário instalar e configurar, por conta própria, todos os recursos necessários à utilização desse sistema, tais como, compiladores, banco de dados e, inclusive, o próprio sistema operacional"*.

---

### Questão 6
IaaS não é apenas recursos de Hardware, ao contratar um IaaS o cliente tem também as facilidades como a alocação dinâmica dos recursos computacionais e com isso se beneficia de uma tarifação mais simples e democrática onde paga apenas pelo que solicitar. O problema da computação em nuvem do tipo IaaS ocorre quando os recursos demandados estão nas mãos de diferentes provedores. Neste sentido, o que faz um Cloud Broker?

- [ ] Desconstrói o código fonte dos sistemas produzidos
- [ ] Encarregado de testar a segurança dos serviços em nuvem
- [ ] Distribui os recursos computacionais entre os clientes do provedor
- [x] **Concentra em um único provedor a busca por todas as soluções IaaS necessárias para a empresa**
- [ ] Encarregado de testar os aplicativos criados

> **Justificativa:** De acordo com o texto ([12-infrastructure-as-a-service.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/12-infrastructure-as-a-service.md#L62)), a corretagem de nuvem (*Cloud Services Brokerage*) unifica a gestão e negociação de múltiplos provedores: *"há a contratação de um único fornecedor e, portanto, a empresa passa a ter uma única interface de negociação"*.

---

## Aula 13 — Service Level Agreements (SLAs) para Serviços de Cloud
**Arquivo de Referência:** [13-service-level-agreements-slas-para-servicos-de-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/13-service-level-agreements-slas-para-servicos-de-cloud.md)

---

### Questão 7
Os serviços oferecidos em nuvem são tão amplos quanto o perfil de seus clientes. Tendo em vista que todo tipo de empresa tem evidente potencial de migrar seus negócios, funções e ferramentas para a nuvem, é preciso que exista um padrão no serviço que facilite seu gerenciamento. Portanto, porque os SLA´s são importantes em padronizar a oferta dos serviços em nuvem?

- [ ] Para que o provedor possa ter equipe de colaboradores maior
- [ ] Para que cada provedor ofereça um serviço diferente
- [x] **Devido a impossibilidade de atender as diferentes expectativas dos clientes**
- [ ] Facilita a identificação dos dados cadastrais dos clientes
- [ ] Concentra os esforços na atividade principal do provedor: fornece licenças

> **Justificativa:** Citando Patel et al. (2009, em [13-service-level-agreements-slas-para-servicos-de-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/13-service-level-agreements-slas-para-servicos-de-cloud.md#L14)), o texto afirma: *"dada a impossibilidade do fornecedor de serviços em satisfazer as necessidades de todos os seus clientes, é motivado um processo de negociação entre o fornecedor e o cliente... esse acordo denomina-se SLA e serve como intermediário entre a expectativa do cliente... e a capacidade do fornecedor"*.

---

### Questão 8
Fica claro que o SLA é um contrato celebrado entre fornecedor e cliente que inclui a forma de tratamento em situações de problema além do conjunto de promessas que o provedor faz para com seu cliente . Qual das alternativas a seguir não apresenta um objetivo abordado pelos SLA´s?

- [ ] Disponibilidade
- [ ] Segurança
- [ ] Conformidade
- [x] **Quantidade de licenças**
- [ ] Desempenho

> **Justificativa:** O controle estático de "quantidade de licenças" é característico do modelo legado de software local on-premises. Os SLAs em nuvem tratam de metas de nível de serviço, tais como disponibilidade (*uptime*), segurança, conformidade e métricas de desempenho.

---

### Questão 9
Em um contrato SLA fica estabelecido de forma estática o serviço que será prestado, tal informação representa o componente nomeado Resource Metrics. Podemos dizer que o resource metrics se situa na etapa onde são definidos os níveis de serviço do contrato SLA, mas vale ressaltar que tal contrato apresenta diversos outros componentes para se tornar completo e juridicamente viável. Em qual componente do SLA pode-se encontrar informações como o percentual de Uptime do sistema oferecido?

- [ ] No Business Metrics
- [ ] No portal do provedor como informação pública
- [x] **Dentro do Resource Metrics**
- [ ] Em conjunto com os dados cadastrais
- [ ] Dentro do Composite Metrics

> **Justificativa:** As métricas de recursos (*Resource Metrics*) definem os parâmetros técnicos diretos e quantificáveis da infraestrutura contratada, como tempo de atividade (*Uptime*), taxa de transferência e latência de rede.

---

### Questão 10
No componente do SLA que trata de suporte técnico são definidas as regras desta parte do serviço como, por exemplo, o número de visitas e canais para que o cliente possa tirar suas dúvidas. Existe, nos SLA´s, um componente que facilita a avaliação da qualidade, e que em muitas ocasiões, se confunde com o Próprio SLA. Qual das alternativas a seguir apresenta este componente?

- [ ] MTBT – Tempo Médio entre Falhas
- [ ] Termo de compromisso
- [x] **GNS – Gerenciamento de Nível de Serviço**
- [ ] Prazos do contrato
- [ ] Nível do serviço

> **Justificativa:** O **GNS** (*Gerenciamento de Nível de Serviço*, ou *Service Level Management - SLM*) é a disciplina/componente responsável por monitorar, avaliar e assegurar continuamente a qualidade acordada no contrato.

---

### Questão 11
Em uma era anterior à nuvem, a Governança de TI se encarregava de gerenciar as licenças de software em nome da organização... Agora a Governança de TI gerencia os SLA´s. Porque podemos afirmar que um SLA é também uma ferramenta de transparência?

- [x] **Pois permite ao cliente compreender os ganhos reais envolvidos**
- [ ] Pois os contratos são disponibilizados no portal do provedor
- [ ] Pois permite mudanças a todo momento, sem modificar o primeiro contrato
- [ ] Pois permite ver o que os outros clientes do provedor contrataram
- [ ] Pois os contratos ficam disponíveis ao público no site do governo

> **Justificativa:** Conforme Sonda (2018, citado em [13-service-level-agreements-slas-para-servicos-de-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/13-service-level-agreements-slas-para-servicos-de-cloud.md#L61)), o SLA é uma ferramenta de transparência pois *"a definição prévia de objetivos garante aos profissionais de Tecnologia da Informação que seus contratantes entendam o que o negócio pode oferecer e quais são os ganhos reais envolvidos"*.

---

### Questão 12
Além de um custo muito menor em relação a soluções de hardware e software locais, as nuvens computacionais proporcionam a vantagem de ter contratos SLA´s que podem ser frequentemente renegociados. Este fator é mais um nos elementos dinâmicos tão atrativos nas soluções em nuvem. Porque o modelo de SLA direcionado ao cliente não é o preferido para os provedores?

- [ ] Pois coloca os dados da provedora de forma pública na internet
- [ ] Pois faz com que o serviço assinado tenha lucro menor
- [x] **Pois a cada mudança, um novo contrato deve ser feito**
- [ ] Pois exige o pagamento de imposto pelo provedor
- [ ] Pois exige a oferta de mais serviços de forma gratuita

> **Justificativa:** De acordo com Teles (2017, citado em [13-service-level-agreements-slas-para-servicos-de-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/13-service-level-agreements-slas-para-servicos-de-cloud.md#L71)), *"modelos de SLA direcionados ao cliente são bem complexos de serem gerenciados, pois como são personalizados, a cada mudança no combinado um novo SLA deve ser feito e assinado"*.

---

## Aula 14 — Análise de Desempenho
**Arquivo de Referência:** [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md)

---

### Questão 13
Nos serviços em nuvem o monitoramento de recursos como os de hardware, CPU, memória e largura de banda é importante para todos: consumidores e provedores. Uma importante forma de se saber antecipadamente algo sobre o desempenho de um serviço cloud é conhecer as suas ferramentas de provisionamento de recursos. Qual das alternativas a seguir apresenta uma ferramenta que monitora o uso de recursos em um serviço cloud da AWS?

- [x] **Cloud Watch**
- [ ] Cloud Privada
- [ ] SLA
- [ ] Pipeline de Barramento
- [ ] Auto Scaling

> **Justificativa:** Conforme Coutinho (2014, em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L12)), o **Amazon CloudWatch** é o serviço responsável por monitorar recursos computacionais (CPU, memória, tráfego), acionando o Auto Scaling quando necessário.

---

### Questão 14
Do ponto de vista do cliente de um serviço em nuvem a análise de desempenho não pode interferir diretamente no hardware do provedor, o que não inviabiliza a possibilidade de teste e sim muda a sua forma de abordagem. Neste sentido, qual a função do uso de um protocolo como o IPsec como forma de avaliação do desempenho de uma rede?

- [ ] Exibe dados sigilosos sobre o desempenho de componentes antes acessíveis apenas pelo provedor, como o processador do data center
- [x] **Causa efeito nos tempos de resposta do servidor**
- [ ] Gera um relatório com o uso e percentual de desempenho geral de cada cliente do provedor
- [ ] Elimina máquinas virtuais sem uso
- [ ] Separa o acesso da empresa criando uma rede particular de maior desempenho

> **Justificativa:** Conforme Almeida et al. (2016, em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L31)), a avaliação de desempenho compara o tempo de resposta entre o cenário de referência (sem segurança) e o cenário com o overhead de cifração/autenticação do IPsec para mensurar as taxas reais de processamento de pacotes.

---

### Questão 15
Depois do valor das assinaturas, outro elemento das nuvens computacionais que chama e muito a atenção do consumidor deste serviço é a Elasticidade. Sendo Elasticidade a capacidade de um sistema em se adaptar a variações na sua carga de trabalho, como ela pode ser utilizada como métrica de medição de desempenho?

- [ ] Pois revela a velocidade da CPU e memória durante sua execução
- [ ] Pois aumenta a velocidade local de processamento
- [ ] Pois testa a velocidade do link de internet do provedor
- [ ] Permite avaliar o nível de falhas do servidor
- [x] **Se permite o rápido provisionamento dos recursos**

> **Justificativa:** De acordo com o padrão NIST (Mell & Grance, 2009, citado em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L41)), a métrica central de elasticidade reside na *"habilidade de rápido provisionamento e desprovisionamento, com capacidade de recursos virtuais praticamente infinita"*.

---

### Questão 16
A base das nuvens computacionais, como modelo de negócio, é a conectividade, pois nela os aplicativos ficam hospedados nos provedores... Em relação a empresas e a conectividade, qual dificuldade ela apresenta ao se utilizar serviços em nuvem?

- [ ] Aumento no custo com internet
- [x] **Dentro da empresa diversos aplicativos podem ser acessados sem necessidade de permissão do departamento de TI, podendo provocar perda de performance**
- [ ] Dificuldade de se manter os aparelhos com carga de bateria
- [ ] Reclamações do TI pela falta de consulta prévia
- [ ] Apoio dos diretores sobre o uso indiscriminado de aplicações em nuvem

> **Justificativa:** Citando Pinto (2014, em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L57)), *"com o acesso simples que o SaaS oferece, os executivos não precisam mais, necessariamente, do aval da equipe de TI ou do CIO da empresa para utilizar um determinado aplicativo, o que também dificulta a manutenção da performance"*.

---

### Questão 17
Um serviço em nuvem de qualidade apresenta boas opções sobre quais linguagens de programação aceita, sua capacidade de conversar com vários dispositivos, sistemas, servidores e até soluções proprietárias de seus clientes. Qual das alternativas a seguir apresenta uma expectativa dos serviços em nuvem relativa a conectividade?

- [ ] Que apresenta custo elevado em dispositivos móveis
- [ ] Que funcione mesmo em locais sem conexão com a internet
- [ ] Que custe mais que soluções locais
- [ ] Que jamais necessite de perfil de usuário
- [x] **Disponibilidade a qualquer hora e local**

> **Justificativa:** Conforme Pinto (2014, em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L63)), a expectativa básica de conectividade em nuvem é *"que os serviços estejam disponíveis a qualquer hora e em qualquer local, existindo ainda a necessidade de que as informações estejam sempre sincronizadas"*.

---

### Questão 18
A origem do Expert Choice é o método AHP (Analytic Hierarchy Process ou Processo de Análise Hierárquica e foi desenvolvido por Saaty e 1970, já o Expert Choice nasceu pouco mais de uma década depois em 1983 e tem se tornado referência em sistema de apoio a tomada de decisão desde então. Portanto, porque a ferramenta Expert Choice recebe tão boas recomendações?

- [ ] Pelo custo elevado e poucos relatórios
- [x] **Pela facilidade de uso e amplo uso mundialmente**
- [ ] Por revelar dados sigilosos dos concorrentes
- [ ] Por sua complexa e enigmática interface de usuário
- [ ] Por tratar apenas de empresas que não usam computação em nuvem

> **Justificativa:** Conforme Comimi et al. (2013, em [14-analise-de-desempenho.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/14-analise-de-desempenho.md#L85-L87)), o Expert Choice é *"uma das ferramentas de sistema de apoio à decisão mais difundida do mundo. O software é de uso intuitivo e amigável mesmo para operadores sem experiência"*.

---

### Questão 19
De acordo com um estudo realizado pelo SAS Brasil, 80% das empresas avaliadas têm ou terão um projeto baseado em Cloud Computing nos próximos 12 meses... Sendo a computação em nuvem um modelo de TI que deve deixar a área de tecnologia ainda mais próxima a área de negócios, assim qual a melhor definição para a computação em nuvem?

- [x] **É um modelo que permite elasticidade, grupamento de recursos acesso amplo via internet e mensuração de serviços que ficam disponíveis a qualquer momento pelo contratante**
- [ ] Um serviço oferecido por um datacenter que permita a hospedagem de sites
- [ ] É um modelo que permite a virtualização de máquinas em rede
- [ ] É um serviço que permite acessar documentos e planilhas online
- [ ] É um modelo que permite acessar qualquer sistema via internet sem necessidade de um servidor local

> **Justificativa:** A alternativa sintetiza as cinco características essenciais estabelecidas pelo NIST para a definição canônica de Computação em Nuvem: autoatendimento sob demanda, amplo acesso à rede, pool/grupamento de recursos compartilhados, rápida elasticidade e serviço mensurado.

---

## Aula 15 — Migração e Transformação de Servidores para Provedores de Nuvem
**Arquivo de Referência:** [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md)

---

### Questão 20
Como ambiente fonte temos a empresa e seu engessado TI. Sabemos que migrar para a nuvem representa sair de uma solução estática para um serviço dinâmico, neste sentido o que Moraes (2014) quer dizer quando afirma que ao utilizar o ambiente em nuvem o parque computacional da organização será modernizado?

- [x] **Em relação ao formato do centro de dados**
- [ ] Que receberá também equipamentos novos
- [ ] Que se trata de aquisição de equipamento e não de serviço em nuvem
- [ ] Que os servidores contratados devem ficar na sede da empresa
- [ ] Que receberá um novo software

> **Justificativa:** Conforme Moraes (2015, citado em [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L8)), as vantagens incluem *"a modernização do parque computacional em termos de formato de centro de dados, aproveitando as possibilidades que a computação em nuvem agrega em relação à virtualização"*.

---

### Questão 21
Quando uma empresa busca assinar um serviço em nuvem, nem sempre está buscando algo mais barato, pode estar simplesmente necessitando de algo avançado, moderno, cuja implementação seja rápida, ordenada... Mas a migração não é livre de riscos! Assinale a alternativa que apresente um dos riscos da migração total ou parcial para a nuvem:

- [ ] Pagamento de multas por abandonar as licenças
- [ ] Atrasos nos contracheques
- [ ] Aumento das contas de serviços como energia elétrica
- [x] **Exposição de informações críticas**
- [ ] Exposição a novas formas de radiação

> **Justificativa:** Segundo Moraes (2015, em [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L12)), o processo de migração pode oferecer riscos de segurança e privacidade aos sistemas integrados, *"causando, por exemplo, exposição de informações críticas do negócio"*.

---

### Questão 22
A diferença entre um servidor em nuvem e um servidor local é muito maior que a localização geográfica que os separa. Nos serviços IaaS o cliente não tem a solução pré configurada pronta para uso pois está contratando máquinas virtuais e não estrutura lógica de sistema operacional como em um PaaS. Configurar o servidor em casos de adoção do IaaS pode ser ligeiramente mais complexo do que fazer tal operação em solução local, contudo, qual ferramenta da AWS facilita o processo de configuração do ambiente destino?

- [ ] Cloud Watch
- [ ] Cloud Zone
- [x] **Landing Zone**
- [ ] Landing Page
- [ ] Elastic Zone 2

> **Justificativa:** O texto destaca ([15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L23-L25)) que o **AWS Landing Zone** *"é uma solução que ajuda os clientes a configurar mais rapidamente um ambiente AWS seguro de várias contas, com base nas melhores práticas da AWS"*.

---

### Questão 23
Embora a informalidade, muitos microempreendedores deixem de considerar muitas das normas administrativas em detrimento de um suposto instinto, o fato é que, indiferente do tamanho e setorização da organização é preciso levar a sério o processo de migração para a nuvem. Para uma migração com o mínimo de problemas, que recurso administrativo a empresa não pode deixar de utilizar?

- [ ] Avaliação de carga tributária
- [ ] Redução do número de colaboradores
- [ ] Financiamento bancário
- [ ] Consultores e Coaches
- [x] **Um método de apoio à tomada de decisão.**

> **Justificativa:** De acordo com Ribas, Lima e Souza (2014, citados em [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L37-L43)), a migração é uma decisão estratégica multicritério complexa que exige a utilização formal de **métodos de apoio à tomada de decisão** (como o AHP).

---

### Questão 24
Atualmente podemos ver que o mundo corporativo está em parte migrando e em parte nascendo na nuvem e isso é um caminho sem volta... Se tratando de transformação para a nuvem, como a computação em nuvem contribuiu para esta aceleração?

- [ ] Fazendo tradicionais empresas de software abrir falência
- [ ] Tornando alguns sistemas proibidos
- [ ] Tornando alguns serviços em nuvem obrigatórios
- [x] **Fazendo o processo ser mais inteligente e acessível**
- [ ] Fazendo sistemas anteriores mais caros

> **Justificativa:** Conforme Olitel (2019, em [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L55)), a computação em nuvem atua como facilitador, *"fazendo com que o processo de transformação digital seja uma experiência mais inteligente, acessível e descomplicada para empresas de qualquer porte"*.

---

### Questão 25
Um elemento importante imposto pela computação em nuvem é a constante adaptação... Com a computação em nuvem, como empresas de entretenimento poderiam se transformar e remodelar o processo da venda de ingressos?

- [ ] Com a compra por telefone e o envio pelos correios
- [ ] Aumentando a capacidade de processamento de suas soluções locais
- [x] **Contratando servidores em nuvem e obtendo ganho em escala**
- [ ] Contratando mais colaboradores
- [ ] Reduzindo o número de computadores nas sedes das empresas

> **Justificativa:** Citando Saldanha (2020, em [15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md#L72)), *"para as empresas de entretenimento, que têm demandas pontuais quando há intensa venda digital de ingressos... servidores hospedados na nuvem podem ser contratados sob demanda, o que também contribui para ganho de escala e redução de custos"*.

---

## Aula 16 — O Futuro e a Evolução dos Serviços Cloud
**Arquivo de Referência:** [16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md)

---

### Questão 26
Podemos dizer que assim como muito do que a computação em nuvem realiza como serviço passa despercebido pelo público em geral, a internet das coisas, ou IoT não é diferente... Qual a função da IoT?

- [ ] Permitir o monitoramento pelas agências governamentais
- [ ] Controlar o uso para fins de emissão de fatura
- [ ] Acelerar o carregamento da bateria do aparelho
- [x] **Conectar objetos e coisas a internet**
- [ ] Acelerar o processamento

> **Justificativa:** Conforme Santos (2014, em [16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L16)), a função primordial da IoT é *"agregar, linkar, fazer comunicar entre si todos os objetos, coisas, na internet, na rede"*.

---

### Questão 27
De acordo com Battisti (2018: online) IoT ou internet das coisas, foi criada pelo Britânico Kevin Ashton em 1999, mas a Cisco expande o IoT para IoE como sendo a internet de todas as coisas, no que os dois conceitos diferem?

- [ ] Na IoE não é necessária a conexão com a internet
- [ ] Na IoE os aparelhos de TV são desconsiderados
- [x] **Na IoE as pessoas também são consideradas**
- [ ] Na IoE não são considerados smartphones por serem computadores de bolso
- [ ] A IoE não coleta dados

> **Justificativa:** A Cisco define a **Internet de Todas as Coisas (IoE)** como a *"união de pessoas, processos, dados e tudo que torna as conexões em rede mais relevantes e valiosas"* ([16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L20)), integrando as pessoas ativamente ao ecossistema dos objetos conectados.

---

### Questão 28
Embora a produção de softwares para a computação em nuvem estivesse trazendo muita inovação, existiam algumas barreiras quase que intransponíveis. Mas agora a tecnologia aprende, se adapta, torna as máquinas inteligentes. Sobre machine learning assinale a alternativa INCORRETA:

- [ ] Usa algoritmos para coletar dados
- [x] **São sistemas e equipamentos destinados ao ensino da ciência**
- [ ] Usa dados e algoritmos para executar tarefas
- [ ] Representa um dos destaques da 4ª Revolução Industrial
- [ ] Torna máquinas inteligentes

> **Justificativa:** O Machine Learning é a disciplina computacional que utiliza dados e algoritmos para treinar máquinas a executar tarefas preditivas e aprender com padrões ([16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L37)). Não se trata de "equipamentos destinados ao ensino da ciência".

---

### Questão 29
Quando falamos de inteligência artificial não estamos mais falando de algum filme com o Arnold Schwarzenegger, mas sim de uma série de tecnologias que permitem que uma máquina faça algo que para nós, humanos de carne e osso, fazemos diariamente: sentir, compreender, atuar e aprender. De que forma a Inteligência artificial contribui para a computação em nuvem?

- [ ] Criou uma geração de androides que emulam os humanos
- [ ] Criou sistemas capazes de se fazer passar por máquinas antigas
- [ ] Apresentou a computação quântica
- [ ] Foi capaz de criar redes sem o uso de qualquer tipo de conexão
- [x] **Capacidade em lidar com grande quantidade de dados**

> **Justificativa:** Conforme Mundo Digital (2019, em [16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L45)), a IA contribui diretamente para a nuvem no *"manejo de grandes dados"*, permitindo analisar e extrair inteligência do volume massivo de dados corporativos gerados diariamente.

---

### Questão 30
A arquitetura de um computador quântico é tão distinta da de um computador tradicional que soa estranho chamar de computador quântico. Mas existe uma forma relativamente simples de diferenciar as duas arquiteturas, qual é?

- [x] **O bit tradicional pode ser 0 ou 1, já o bit quântico (Qubit) pode ser 0, 1 ou os dois**
- [ ] Computadores quânticos só podem ser construídos e utilizados pelos governos dos países que os desenvolvem
- [ ] O computador quântico não usa eletricidade
- [ ] O computador quântico necessita de energia nuclear
- [ ] O computador quântico trabalha apenas com machine learning

> **Justificativa:** Na computação clássica o bit assume estados binários estritos (0 ou 1), enquanto na computação quântica o **Qubit** pode estar em 0, 1 ou em ambos simultaneamente graças ao princípio da superposição quântica ([16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L51)).

---

### Questão 31
Em 2014 a Amazon introduziu sua solução Serverless o AWS Lambda, cuja diferença dos outros modelos estava no fato de não carregar a aplicação em um container ou em uma máquina virtual. Neste sistema o usuário faz o upload do código no Lambda que se encarrega de todo o resto. De que outra forma podemos conceituar uma solução serverless?

- [ ] Serverless é quando a empresa não possui servidor e contrata um na nuvem
- [x] **Neste modelo aplicações são acionadas por um evento e depois de concluídas são descartadas**
- [ ] Serverless é uma linguagem de programação que não permite interação com a internet
- [ ] Serverless é o serviço de menor valor entre os provedores cloud por não usar servidor, nem o virtual
- [ ] Serverless representa computadores básicos com hardware limitado e incapaz de acessar um servidor

> **Justificativa:** Citando Bodt (2018) e Roberts (2018, em [16-o-futuro-e-a-evolucao-dos-servicos-cloud.md](file:///home/carlosdutra/dev/computer-science/05-fundamentos-de-computacao-em-nuvem/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md#L80-L84)), a aplicação serverless permanece inativa até ser disparada por um evento (*event-driven*), executando de forma efêmera e sendo descartada após a conclusão da atividade.
