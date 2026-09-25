# Top 10 — Questões difíceis de Metodologias de Desenvolvimento de Software

Questões de revisão elaboradas com base nas aulas, no caderno de aprendizados e na lista de questões desta disciplina. São aplicações dos conteúdos estudados, não uma previsão de prova. As referências permitem localizar o assunto na pasta.

## 1. Cascata diante de requisitos instáveis

Uma equipe escolhe o modelo cascata para um produto cujos usuários ainda não sabem descrever bem suas necessidades. Descobertas importantes surgem durante a construção. Qual análise corresponde às características estudadas?

A. Cascata favorece mudanças tardias porque cada fase é independente e sem custo de retorno.
B. A sequência de fases e a validação mais tardia tornam mudanças descobertas durante a construção potencialmente caras; requisitos estáveis favorecem mais esse modelo.
C. Cascata não possui fases de requisitos ou testes.
D. O modelo obriga a entregar uma nova versão funcional ao fim de cada dia.

**Resposta correta: B.** No modelo cascata, o desenvolvimento segue fases ordenadas, com maior definição prévia. Alterações tardias podem exigir retorno a etapas anteriores e retrabalho, tornando requisitos relativamente estáveis uma condição mais favorável.

**Por que as outras estão erradas:** A nega o custo de retorno entre fases. C elimina fases fundamentais do modelo. D descreve iteração contínua, não a entrega faseada típica da cascata.

*Base: 06/03-cascata.md; 06/01-os-metodos-e-suas-aplicacoes.md.*

## 2. Lean e eliminação de desperdício

Em um fluxo de desenvolvimento, funcionalidades são iniciadas em paralelo, ficam paradas aguardando revisão e algumas nunca são usadas pelo cliente. Qual leitura combina melhor com Lean?

A. Aumentar o trabalho em andamento para que nenhuma pessoa fique ociosa.
B. Tratar espera e funcionalidades sem valor como desperdícios, limitar acúmulo e priorizar entrega de valor.
C. Manter todas as funcionalidades planejadas porque descarte sempre representa falha de qualidade.
D. Medir eficiência somente pela quantidade de tarefas iniciadas.

**Resposta correta: B.** Lean busca maximizar valor e eliminar desperdícios. Espera, excesso de trabalho em andamento e funcionalidades não utilizadas consomem capacidade sem entregar valor proporcional.

**Por que as outras estão erradas:** A aumenta filas e tempo de ciclo, em vez de reduzir desperdício. C confunde esforço já gasto com valor entregue. D mede atividade iniciada, não fluxo concluído nem valor para o cliente.

*Base: 06/04-lean.md.*

## 3. Valores do Manifesto Ágil

Uma equipe entrega incrementos úteis e conversa frequentemente com o cliente, mas mantém documentação suficiente para operar e segue contratos acordados. Qual interpretação dos valores ágeis é correta?

A. Viola o Manifesto, porque métodos ágeis proíbem documentação e contratos.
B. É compatível: o Manifesto valoriza mais indivíduos e interações, software funcionando, colaboração e resposta à mudança, sem declarar sem valor os elementos do lado direito.
C. É incompatível, porque o Manifesto prioriza seguir um plano fixo sobre responder a mudanças.
D. Só seria ágil se não houvesse planejamento ou documentação.

**Resposta correta: B.** Os valores expressam preferência relativa, não proibição dos itens à direita. Documentação e contratos podem existir, mantendo-se foco maior em colaboração, entregas e adaptação.

**Por que as outras estão erradas:** A e D transformam preferência em veto absoluto. C inverte explicitamente a preferência do Manifesto, que valoriza responder a mudanças mais que seguir um plano.

*Base: 06/05-manifesto-agil.md; 06/00-aprendizados.md, seção 2.*

## 4. Aplicação dos princípios ágeis

Um cliente altera uma necessidade após testar uma entrega utilizável. A equipe negocia uma nova prioridade e planeja uma próxima entrega menor. Qual princípio está mais diretamente em ação?

A. Seguir o plano original, pois mudanças só são aceitas antes do início do projeto.
B. Acolher mudanças de requisitos, inclusive tardiamente, usando-as para entregar valor ao cliente.
C. Adiar software funcionando até que toda a documentação esteja completa.
D. Substituir a comunicação com o cliente por relatórios contratuais.

**Resposta correta: B.** O Manifesto e seus princípios defendem acolher mudanças e entregar software funcionando frequentemente, mantendo colaboração com o cliente.

**Por que as outras estão erradas:** A rejeita a adaptação. C inverte a prioridade de entregas funcionais. D substitui a colaboração direta por um mecanismo que não é o foco preferencial dos princípios.

*Base: 06/06-principios-1-a-4-do-manifesto-agil.md; 06/05-manifesto-agil.md.*

## 5. Emergência e equipes auto-organizáveis

Uma equipe recebe um objetivo e restrições, mas decide como dividir o trabalho e quais decisões técnicas tomar. A gerência não prescreve cada tarefa. Qual interpretação está mais próxima do princípio estudado?

A. Auto-organização significa ausência de objetivo, responsabilidade e alinhamento.
B. Soluções, arquiteturas e requisitos podem emergir de equipes auto-organizáveis, com autonomia dentro do propósito e do contexto do trabalho.
C. Somente gestores podem definir como a equipe executa o trabalho para que haja agilidade.
D. Emergência significa que não há necessidade de inspeção ou adaptação.

**Resposta correta: B.** O princípio 11 do Manifesto afirma que as melhores arquiteturas, requisitos e designs emergem de equipes auto-organizáveis. Isso não elimina objetivos, colaboração ou responsabilidade.

**Por que as outras estão erradas:** A confunde autonomia com falta de direção. C contradiz a auto-organização. D transforma emergência em ausência de feedback, embora inspeção e adaptação sejam necessárias ao trabalho iterativo.

*Base: 06/08-principios-9-a-12-do-manifesto-agil.md; 06/00-aprendizados.md, seção 2.2.*

## 6. Scrum: responsabilidades dos papéis

Durante o planejamento, a equipe precisa definir como realizar os itens selecionados. O Scrum Master facilita a conversa e remove um impedimento, mas não escolhe a solução técnica nem atribui tarefas individualmente. Qual avaliação é correta?

A. O Scrum Master está descumprindo seu papel, pois deve definir o conteúdo e a execução do Sprint Backlog.
B. A conduta é coerente: o Scrum Master facilita e remove impedimentos; os Developers organizam o trabalho para criar o incremento, e o Product Owner ordena o Product Backlog.
C. O Product Owner deve atribuir cada tarefa técnica aos Developers.
D. Os Developers não participam do planejamento, pois apenas o Scrum Master pode estimar capacidade.

**Resposta correta: B.** Os papéis têm responsabilidades distintas: Product Owner maximiza valor e ordena o backlog; Developers planejam a execução e produzem o incremento; Scrum Master ajuda o Scrum a ser compreendido e praticado, além de facilitar/remover impedimentos.

**Por que as outras estão erradas:** A transfere ao Scrum Master decisões de execução próprias dos Developers. C confunde ordenação de produto com atribuição técnica de tarefas. D exclui os Developers de uma atividade central do Sprint Planning.

*Base: 06/09-scrum-e-kanban.md; 06/00-aprendizados.md, seção 3.1.*

## 7. Scrum, Kanban e limite do trabalho em andamento

Uma equipe mantém fluxo contínuo, visualiza etapas e limita quantos itens podem estar simultaneamente em cada etapa. Não trabalha necessariamente em Sprints com duração fixa. Qual conclusão é mais adequada?

A. É incompatível com métodos ágeis, pois todo fluxo deve ser organizado em Sprints.
B. É uma aplicação compatível com Kanban: visualizar o fluxo e limitar trabalho em andamento ajuda a controlar acúmulo e melhorar o fluxo.
C. É Scrum porque qualquer quadro visual é um Sprint Backlog.
D. É cascata, pois as tarefas passam por etapas.

**Resposta correta: B.** Kanban enfatiza visualização do trabalho e limites de WIP (trabalho em andamento) para apoiar fluxo contínuo. Usar um quadro, isoladamente, não transforma a prática em Scrum.

**Por que as outras estão erradas:** A trata Sprints como exigência de todo método ágil. C confunde ferramenta visual e conceito de backlog/Sprint. D classifica qualquer fluxo por etapas como cascata, ignorando a cadência e a forma de gestão descritas.

*Base: 06/09-scrum-e-kanban.md; 06/10-desenvolvendo-no-trello.md.*

## 8. Story points, horas e velocidade

Uma equipe estima itens em story points relativos. Em várias Sprints, conclui quantidades diferentes conforme capacidade e incerteza. Um gestor quer converter cada ponto diretamente em horas e usar a conversão como compromisso individual. Qual resposta é mais coerente?

A. Story points são uma unidade universal de horas e devem ser convertidos por uma taxa fixa entre equipes.
B. Story points expressam estimativa relativa; velocidade observada pode ajudar a planejar capacidade da própria equipe, mas não é uma conversão universal em horas nem uma meta individual.
C. Velocidade é o número de itens iniciados, mesmo que não concluídos.
D. Dias ideais e story points são idênticos e não refletem incerteza.

**Resposta correta: B.** O conteúdo distingue estimativas relativas de horas/dias ideais e apresenta velocidade/capacidade como apoio ao planejamento empírico da equipe. A medida depende do contexto da equipe e do trabalho concluído.

**Por que as outras estão erradas:** A transforma uma medida relativa em unidade absoluta comparável entre equipes. C mede início e não entrega concluída. D apaga diferenças entre estimativas e ignora incerteza/complexidade.

*Base: 06/09-scrum-e-kanban.md; 06/00-aprendizados.md, seção 3.3.*

## 9. Design thinking: sequência de investigação e síntese

Uma equipe observa pessoas usando um serviço, registra necessidades, agrupa achados em padrões, formula um problema e só depois gera alternativas. Qual leitura das etapas é correta?

A. Ideação deve vir antes da imersão para impedir que observações influenciem as soluções.
B. Imersão busca compreender contexto e pessoas; análise e síntese organizam evidências para definir o problema antes da ideação.
C. Prototipação substitui a pesquisa com usuários e define o problema sem evidência.
D. Síntese significa selecionar imediatamente uma solução sem agrupar ou interpretar achados.

**Resposta correta: B.** As aulas apresentam imersão para aproximar a equipe do contexto e análise/síntese para organizar dados, identificar padrões e formular desafios que orientam ideação.

**Por que as outras estão erradas:** A inverte a lógica de compreensão antes de propor soluções. C atribui ao protótipo o papel de pesquisa e definição inicial do problema. D reduz síntese a escolha prematura e ignora a organização/interpretação dos dados.

*Base: 06/12-imersao.md; 06/13-analise-e-sintese.md; 06/14-ideacao.md.*

## 10. Protótipo, fidelidade e aprendizagem

Uma equipe ainda está testando se usuários entendem a navegação básica. O prazo é curto e mudanças são esperadas. Qual estratégia de prototipação tende a apoiar melhor esse objetivo?

A. Construir primeiro uma versão de alta fidelidade com todos os recursos finais, pois alterações posteriores são sempre mais baratas.
B. Fazer um protótipo de baixa fidelidade focado no fluxo essencial, observar usuários e iterar com base no feedback antes de investir na implementação completa.
C. Evitar protótipos até que a solução esteja pronta, para não influenciar usuários.
D. Usar protótipo apenas como documentação visual, sem testar hipóteses com pessoas.

**Resposta correta: B.** As aulas tratam protótipos como representações para tornar ideias testáveis, obter feedback e aprender. Baixa fidelidade é apropriada quando a questão principal é validar estrutura ou fluxo com baixo custo de alteração.

**Por que as outras estão erradas:** A assume que alta fidelidade é sempre melhor e ignora custo de retrabalho. C posterga a validação até depois do investimento principal. D elimina o propósito de testar e aprender com protótipos.

*Base: 06/15-prototipacao.md; 06/16-prototipo.md.*
