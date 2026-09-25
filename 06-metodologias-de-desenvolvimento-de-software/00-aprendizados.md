# Aprendizados — Metodologias de Desenvolvimento de Software

👋 Bem-vindo ao teu caderno de revisão de **Metodologias de Desenvolvimento de Software**! Aqui ficam registrados, de forma resumida, estruturada e visual, os conceitos aprendidos nas aulas para servir como material de consulta ágil e preparação para provas.

---

## Glossário de Siglas

| Sigla | Termo em Inglês | Significado / Tradução no Contexto |
|---|---|---|
| **CI/CD** | Continuous Integration / Continuous Deployment | Integração Contínua e Entrega Contínua; automação de testes, build e deploy de software |
| **DataOps** | Data Operations | Metodologia que aplica princípios ágeis e DevOps à criação e manutenção de pipelines de dados |
| **DevOps** | Development and Operations | Cultura e conjunto de práticas que integra desenvolvimento e operações de infraestrutura |
| **ES** | Engenharia de Software | Software Engineering; área da computação voltada à produção sistemática, controlada e eficiente de software |
| **FinOps** | Financial Operations | Prática de governança financeira e otimização contínua de custos em ambientes de nuvem |
| **Green IT** | Green Information Technology | Tecnologia da Informação Verde; práticas focadas em eficiência energética e sustentabilidade computacional |
| **IaC** | Infrastructure as Code | Infraestrutura como Código; provisionamento de recursos de TI via arquivos de configuração declarativos |
| **QA** | Quality Assurance | Garantia de Qualidade; processos sistemáticos para garantir que o software atenda aos requisitos e padrões |
| **SLA** | Service Level Agreement | Acordo de Nível de Serviço; contrato que define metas de disponibilidade, performance e entrega |
| **TCO** | Total Cost of Ownership | Custo Total de Propriedade; soma de todos os custos diretos e indiretos de criação, execução e manutenção de software |

---

## 1. Engenharia de Software e suas Perspectivas Futuras

### 1.1 O Conceito e os Objetivos Centrais da Engenharia de Software
A **Engenharia de Software (ES)** é o ramo da ciência da computação dedicado ao estudo, criação e aplicação de metodologias, ferramentas e técnicas sistemáticas para:
1. **Especificar**: Compreender a fundo as regras de negócio e necessidades reais dos usuários.
2. **Desenvolver**: Construir o código de maneira estruturada, padronizada e modular.
3. **Validar**: Garantir por meio de testes rigorosos que o produto atende ao que foi planejado com alta confiabilidade.
4. **Evoluir (Manutenção)**: Permitir que o sistema seja adaptado, corrigido e expandido ao longo do tempo sem degradação arquitetural.

Os dois grandes pilares de valor da disciplina são:
- **Maximizar a Qualidade**: Entregar software funcional, robusto, seguro e que resolva o problema real.
- **Minimizar os Custos e Prazos**: Eliminar retrabalho, evitar desperdício computacional e de equipe, otimizando o Custo Total de Propriedade (TCO).

```mermaid
flowchart LR
    subgraph Ciclo_Fundamental["Ciclo Fundamental de Engenharia de Software"]
        direction LR
        E["1. Especificação"] --> D["2. Desenvolvimento"]
        D --> V["3. Validação (Testes)"]
        V --> M["4. Evolução (Manutenção)"]
        M --> E
    end
```

---

### 1.2 O Futuro da Engenharia de Software: Sustentabilidade, Legislação e Métodos Ágeis
Conforme observado nas tendências tecnológicas e metodológicas modernas, o futuro da engenharia de software é orientado por quatro eixos centrais:

1. **Economia Sustentável e Computação Verde (Green Computing)**:
   - A relação entre a fabricação de software e o consumo de energia/hardware tornou-se crítica.
   - O desenvolvimento futuro exige algoritmos energeticamente eficientes, arquiteturas serverless e alocação elástica sob demanda, diminuindo a pegada de carbono dos data centers.
2. **Conformidade Regulatória e Governança Legal**:
   - Legislações globais e nacionais (leis de privacidade de dados, normas de descarte, relatórios de emissões e governança corporativa) passam a exigir que o software seja concebido com conformidade por padrão (*Compliance-by-Design*).
3. **Novas Formas de Distribuição, Fabricação e Otimização**:
   - Uso intensivo de automação de testes, CI/CD, observabilidade e telemetria preditiva.
   - Otimização contínua de recursos humanos e computacionais para entregar o máximo valor com o menor custo de execução.
4. **Métodos Ágeis e Ciclos Curtos de Feedback**:
   - Adoção contínua de iterações rápidas para testar hipóteses, adaptar requisitos em tempo real e evitar a construção de softwares obsoletos ou que não atendam às reais necessidades do cliente.

```mermaid
flowchart TD
    subgraph Futuro_da_ES["Eixos do Futuro da Engenharia de Software"]
        A["1. Economia Sustentável (Green IT)<br>Otimização de consumo computacional e elétrico"]
        B["2. Conformidade Legal e Regulatória<br>Alinhamento a normas ambientais, fiscais e de dados"]
        C["3. Métodos Ágeis & Inovação Contínua<br>Adaptação a tendências e entregas iterativas de valor"]
        D["4. Otimização de Custos e Operações (FinOps)<br>Distribuição eficiente e redução do desperdício"]
    end
    A --> E["Software com Alta Qualidade, Baixo Custo e Impacto Positivo na Sociedade"]
    B --> E
    C --> E
    D --> E
```

---

### 1.3 Tabela Comparativa: Engenharia Tradicional vs. Engenharia de Software do Futuro

| Critério de Comparação | Abordagem Tradicional (Passado) | Abordagem Moderna e Futura (Tendências) |
|---|---|---|
| **Consumo de Recursos e Infraestrutura** | Alocação fixa e superdimensionada (*over-provisioning*), com servidores ligados 24/7 gerando desperdício financeiro e energético. | Alocação sob demanda, computação *serverless*, arquitetura em containers elásticos e otimização orientada a *Green IT*. |
| **Postura frente a Custos** | Custos de infraestrutura vistos como despesa fixa pós-projeto. | Cultura *FinOps* integrada ao desenvolvimento: medição contínua de custo por transação, query ou pipeline. |
| **Ciclo de Entrega e Validação** | Validação tardia ao final de longos meses de desenvolvimento (alto risco de retrabalho caro). | Entregas frequentes com métodos ágeis, testes automatizados imediatos (CI/CD) e ciclo contínuo de feedback do usuário. |
| **Conformidade e Legislação** | Adequações normativas e legais tratadas como remendos após a entrega do produto. | Conformidade e sustentabilidade exigidas por lei integradas desde a fase de arquitetura e especificação. |
| **Foco na Resolução do Problema** | Foco estrito em cumprir documentos e contratos extensos assinados no início. | Foco empírico no valor real entregue ao usuário, refinando requisitos conforme as tendências e o mercado evoluem. |

---

### 1.4 Ponto de Vista da Engenharia de Sistemas, Hardware e Redes
Para um engenheiro projetando sistemas de grande porte ou firmwares de equipamentos de telecomunicação:
- **Mecanismo real**: Desenvolver software no futuro não é apenas escrever código que executa uma função lógica, mas projetar rotinas que minimizem ciclos de clock da CPU, reduzam o tráfego desnecessário de rede e liberem memória imediatamente.
- **Impacto prático**: Em dispositivos IoT ou roteadores de borda, um algoritmo ineficiente drena baterias rapidamente e superaquece componentes físicos. No nível de data centers de provedores em nuvem, algoritmos otimizados reduzem o custo de refrigeração e a demanda de usinas termoelétricas.

---

### 1.5 Exemplo Real em Engenharia de Dados: FinOps, DataOps e Otimização Energética
Na engenharia de dados corporativa, a convergência entre qualidade, redução de custo e futuro sustentável é evidente em três práticas essenciais:

```mermaid
flowchart LR
    subgraph Pipeline_Otimizado["Pipeline de Dados Moderno e Sustentável"]
        direction LR
        Ing["Ingestão Incremental<br>(Apenas dados novos)"] --> Test["Testes Automáticos<br>(Data Quality na entrada)"]
        Test --> Proc["Processamento Otimizado<br>(Particionamento + Pruning)"]
        Proc --> Save["Armazenamento Comprimido<br>(Parquet / Delta / Iceberg)"]
    end
```

1. **Ingestão Incremental com *Partition Pruning***:
   - Em vez de reprocessar uma tabela de 50 Terabytes inteira diariamente (consumindo centenas de dólares e gigawatts de processamento), o pipeline lê apenas a partição de data do dia anterior (`WHERE data = CURRENT_DATE - 1`).
2. **Data Quality como Código (*Shift-Left Testing*)**:
   - Validações automáticas (ex.: verificar se há valores nulos em chaves primárias) barram dados corrompidos logo na camada Bronze. Isso evita reprocessamentos em cascata em lote (*backfills*) que custam milhares de dólares de computação em nuvem.
3. **Formatos Colunares Eficientes (Parquet/Iceberg)**:
   - Armazenar dados colunares e comprimidos reduz o espaço em disco em até 85% e permite que queries leiam somente as colunas necessárias, reduzindo os custos de varredura no BigQuery ou Athena.

---

### 1.6 Exemplo com Código: Pipeline em Python com Validação de Qualidade e Otimização FinOps

O exemplo abaixo ilustra uma rotina de engenharia de dados que exemplifica os objetivos da engenharia de software moderna: validação preventiva de qualidade de dados (evitando retrabalho e bugs) e processamento incremental eficiente (reduzindo custo de computação e energia):


---

## 2. Princípios do Manifesto Ágil e Equipes Auto-Organizáveis

### 2.1 Os Fundamentos dos Princípios Ágeis
O **Manifesto Ágil (2001)** estabeleceu 4 valores fundamentais desdobrados em **12 princípios práticos**. Dentre eles, destaca-se a autonomia e a colaboração técnica:
- **Princípio 4**: Pessoas de negócio e desenvolvedores devem trabalhar juntos diariamente ao longo do projeto.
- **Princípio 7**: Software funcionando é a medida primária de progresso (e não métricas de vaidade ou relatórios de defeitos).
- **Princípio 8**: Os patrocinadores, desenvolvedores e usuários devem ser capazes de manter um ritmo sustentável e constante indefinidamente.
- **Princípio 9**: A contínua atenção à excelência técnica e ao bom design aumenta a agilidade (a simplicidade não é desculpa para código mal estruturado).
- **Princípio 11**: **As melhores arquiteturas, requisitos e designs emergem de equipes auto-organizáveis**.
- **Princípio 12**: Em intervalos regulares, a equipe reflete sobre como se tornar mais eficaz e refina seu comportamento.

```mermaid
flowchart TD
    subgraph Equipe_Auto_Organizada["Princípio 11: Teoria da Emergência"]
        R["Regras Simples & Metas Claras"] --> Time["Equipe Multidisciplinar Autônoma"]
        Time --> A["Melhores Arquiteturas"]
        Time --> Req["Requisitos Assertivos"]
        Time --> D["Designs Elegantes e Sustentáveis"]
    end
```

---

### 2.2 O Princípio 11 e a Teoria da Emergência
Conforme a aula `08-principios-9-a-12-do-manifesto-agil.md`:
- **Teoria da Emergência**: Em sistemas complexos de desenvolvimento, soluções robustas não surgem de imposições centralizadas de comando-e-controle ou microgerenciamento de tarefas.
- **Mecanismo real**: Fornece-se à equipe um conjunto restrito e simples de regras claras (critérios de aceitação, padrões de código e metas da sprint). A própria equipe decide a melhor forma de organizar o trabalho técnico, escolher as ferramentas e desenhar a arquitetura para atingir a meta.
- **Evitar a Sistematização Excessiva**: Tentar prescrever antecipadamente cada passo e microtarefa burocrática engessa a inovação e aumenta as chances de falhas arquiteturais.

---

### 2.3 Tabela Comparativa: Princípios Reais vs. Distorções Comuns em Avaliações

| Princípio Ágil Real (Canônico) | Conceito Técnico Correto | Distorção / Pegadinha Comum de Prova |
|---|---|---|
| **Software Funcionando (Princípio 7)** | A entrega de software operacional em produção que gera valor é o termômetro de avanço do projeto. | *Dizer que "defeitos no software são a medida primária de progresso"* (Incorreto). |
| **Colaboração Diária (Princípio 4)** | Especialistas de negócio e engenheiros interagem diariamente em ciclos curtos de alinhamento. | *Dizer que "devem trabalhar isoladamente e se reunir apenas ao final"* (Incorreto). |
| **Excelência Técnica (Princípio 9)** | Código limpo, testes automatizados e refatoração contínua viabilizam a velocidade no longo prazo. | *Dizer que "excelência técnica deve ser evitada para não atrasar a agilidade"* (Incorreto). |
| **Ritmo Sustentável (Princípio 8)** | Evita sobrecarga e horas extras crônicas (*burnout*), garantindo previsibilidade estável. | *Dizer que o ritmo constante deve ocorrer "evitando intervalos regulares de descanso/reflexão"* (Incorreto). |
| **Equipes Auto-Organizáveis (Princípio 11)** | As melhores soluções técnicas, requisitos e designs nascem da autonomia do time próximo ao problema. | **Princípio Legítimo e Verdadeiro do Manifesto Ágil.** |

---

### 2.4 Ponto de Vista da Engenharia de Sistemas e Plataforma
Para um líder de engenharia de infraestrutura ou sistemas distribuídos:
- **Mecanismo real**: Um time auto-organizado possui liberdade técnica para definir o particionamento de microsserviços, a topologia de mensageria e o fluxo de CI/CD sem precisar de aprovações burocráticas centralizadas para cada linha de código, desde que respeitem os guardrails de segurança e SLAs da plataforma.

---

### 2.5 Exemplo Real em Engenharia de Dados: Autonomia em Squads e Data Mesh
Na engenharia de dados moderna:
- Em vez de um modelo antigo centralizado onde um único "comitê de arquitetura" ditava como cada tabela deveria ser criada, adota-se o modelo de **Data Mesh / Squads Auto-Organizadas**:
  - A squad de Logística ou Pagamentos tem total autonomia para modelar suas tabelas *Silver* e *Gold*, definir partições e criar transformações SQLX/Dataform.
  - A equipe responde diretamente pela qualidade do dado e pela escolha das melhores estratégias de compressão e indexação para o caso de uso real de negócio.

---

### 2.6 Exemplo com Código: Pipeline Declarativo Autogerenciado (Dataform / SQLX)

No exemplo abaixo, uma equipe de engenharia de dados auto-organizada define declarativamente o contrato, a documentação e os testes de qualidade de sua própria tabela dimensional, sem intervenção burocrática externa:


---

## 3. Dinâmica do Scrum: Planejamento, Timeboxes, Estimativas e Papéis

### 3.1 Papéis e Responsabilidades no Scrum
Conforme as práticas de gestão ágil em `09-scrum-e-kanban.md` e o *Scrum Guide*:
- **Product Owner (PO)**: Define as prioridades de negócio, gerencia o *Product Backlog* e maximiza o valor do produto entregue.
- **Desenvolvedores (Developers)**: Responsáveis por estimar o esforço, puxar os itens do backlog para a Sprint, definir a arquitetura técnica e construir o incremento funcional com qualidade.
- **Scrum Master (SM)**: Líder-servidor e facilitador. Garante a adesão ao método Scrum, remove impedimentos e protege o time contra interferências externas e microgerenciamento. **O Scrum Master NÃO define escopo, prazos ou tarefas técnicas.**

```mermaid
flowchart TD
    subgraph Papeis_Scrum["Separação Clara de Responsabilidades no Scrum"]
        PO["Product Owner<br>(O QUÊ fazer e prioridade de negócio)"]
        DEV["Equipe de Desenvolvimento<br>(COMO fazer, estimativas e construção)"]
        SM["Scrum Master<br>(Facilitação do processo e remoção de impedimentos)"]
    end
    PO <-->|"Colaboração na Meta da Sprint"| DEV
    SM -.->|"Protege e apoia"| DEV
    SM -.->|"Apoia na gestão do backlog"| PO
```

---

### 3.2 Timeboxes e o Planejamento da Sprint (Sprint Planning)
O conceito de **Timebox** estabelece uma duração máxima fixa para cada evento do Scrum, evitando reuniões intermináveis e paralisia por análise:
- **Sprint**: Ciclo de desenvolvimento fixo de no máximo 1 mês (geralmente 2 a 4 semanas).
- **Sprint Planning**:
  - Para um Sprint de **1 mês**, a reunião de planejamento tem timebox de **até 8 horas**.
  - Para Sprints menores (ex.: 2 semanas), a duração é proporcionalmente menor (cerca de 4 horas).
  - A equipe possui autonomia para encerrar a reunião assim que o objetivo do planejamento for atingido, adaptando o tempo necessário.

---

### 3.3 Estimativas Relativas: Story Points e Dias Ideais vs. Horas Tradicionais
- **Mecanismo real**: O Scrum e as metodologias ágeis substituíram o controle fabril por horas por **estimativas de esforço relativo** (*Story Points*, *Planning Poker*, *T-Shirt Sizing* ou *Dias Ideais*).
- **Compromisso de Capacidade**: A equipe compromete-se com a **Meta da Sprint (*Sprint Goal*)** baseada em sua velocidade empírica média histórica, e não com uma promessa contratual rígida de horas.
- **Impedimentos e Ajustes**: Quando surgem imprevistos ou bloqueios técnicos, o escopo da Sprint é renegociado entre os Desenvolvedores e o Product Owner, sendo desnecessário justificar o não cumprimento por meio de métricas de horas trabalhadas.

---

### 3.4 Tabela Comparativa: Papéis, Estimativas e Regras do Scrum

| Elemento | Regra Canônica do Scrum | Erro / Distorção Comum de Avaliação |
|---|---|---|
| **Definição de Escopo da Sprint** | Definido em conjunto pelos **Desenvolvedores** e o **Product Owner** com base na capacidade real do time. | Atribuir ao *Scrum Master* o poder de definir escopo e prazos. |
| **Unidade de Estimativa** | Estimativa relativa de complexidade/esforço (*Story Points*, dias ideais). O uso de horas é desnecessário. | Exigir controle rígido em horas para justificar atrasos de itens. |
| **Duração do Planejamento** | Até 8 horas para Sprint de 1 mês; proporcionalmente menor para Sprints mais curtos. | Impor uma duração inflexível e idêntica independentemente do tamanho do ciclo. |
| **Natureza do Compromisso** | Compromisso com a Meta da Sprint e melhor esforço técnico baseado na capacidade (*Capacity*). | Tratar o Sprint Backlog como um contrato jurídico rígido de escopo fechado. |

---

### 3.5 Ponto de Vista da Engenharia de Sistemas e Cloud
Para um líder técnico ou engenheiro de infraestrutura:
- **Mecanismo real**: Durante o planejamento de uma sprint de migração de cluster Kubernetes ou refatoração de APIs, a equipe pontua tarefas por complexidade técnica e riscos de dependência (ex.: 5 pontos para provisionar VPC, 8 pontos para migrar banco com zero downtime).
- Se a migração do banco encontrar um bloqueio de rede não previsto, o Scrum Master ajuda a destravar o acesso com a equipe de segurança, enquanto o time ajusta o escopo secundário da sprint sem penalizações burocráticas de horas.

---

### 3.6 Exemplo Real em Engenharia de Dados: Sprint Planning em Squads de BI e ETL
Em uma equipe de engenharia de dados:
- **Planejamento por Capacidade (Capacity)**: Se a squad possui velocidade histórica média de 40 *Story Points* por Sprint (2 semanas), o time seleciona 3 a 4 modelos dimensionais do Dataform que somem ~38 pontos.
- **Impedimentos Reais**: Se a API da fonte externa (ex.: Salesforce) instabilizar e atrasar a extração, os engenheiros reportam o impedimento na Daily. O time replaneja com o PO a entrega daquela tabela para a sprint seguinte, focando em entregar prontas as tabelas já extraídas que garantam o *Sprint Goal*.

---

### 3.7 Exemplo com Código: Cálculo de Capacidade e Velocidade de Sprint em Python

O script abaixo simula como uma equipe ágil calcula sua capacidade empírica para planejar a Sprint com base em Story Points:

