# Top 10 — Questões difíceis de Fundamentos de Computação em Nuvem

Questões de revisão elaboradas com base nas aulas, no caderno de aprendizados, na lista de questões e no material textual da pasta. São aplicações dos conteúdos estudados, não uma previsão de prova. Referências ao fim de cada item apontam os materiais-base.

## 1. Limites de responsabilidade entre IaaS, PaaS e SaaS

Uma equipe precisa controlar o sistema operacional e instalar componentes próprios, mas não quer comprar servidores físicos. Qual modelo se ajusta melhor e qual obrigação permanece com a equipe?

A. SaaS; a equipe administra o hipervisor e o sistema operacional.
B. PaaS; a equipe administra a infraestrutura física e o hipervisor.
C. IaaS; o provedor oferece recursos computacionais virtualizados e a equipe continua responsável por configurar o sistema operacional e o software necessário.
D. Serverless; a equipe administra o hardware, sistema operacional e plataforma.

**Resposta correta: C.** IaaS fornece recursos como processamento, memória, armazenamento e rede, com controle maior para o cliente. O material explica que o cliente instala e configura os recursos de sistema e aplicação de que precisa.

**Por que as outras estão erradas:** A descreve responsabilidades de IaaS e as atribui a SaaS, no qual a aplicação é gerenciada pelo provedor. B inverte a responsabilidade de PaaS: o provedor mantém infraestrutura e plataforma. D contradiz a definição de serverless apresentada, em que o provedor gerencia provisionamento e servidores.

*Base: 05/12-infrastructure-as-a-service.md; 05/09-software-as-a-service-saas.md; 05/10-platform-as-a-service-paas.md; 05/00-aprendizados.md, seção 9.*

## 2. Camadas lógicas e servidor web

Em uma aplicação de três camadas, a camada de apresentação precisa carregar uma página; a requisição deve passar por uma camada que centraliza entrada web antes de chegar à lógica de negócio. Qual alternativa descreve corretamente a separação e a extensão multicamadas?

A. A camada de dados apresenta a interface; o servidor web substitui a camada de domínio.
B. Apresentação trata a interação, domínio implementa regras de negócio e dados persiste informações; em uma arquitetura com camada web, o servidor web pode receber/controlar requisições antes do servidor de aplicação.
C. A camada de domínio deve acessar diretamente a interface do usuário, e a camada de dados executa o balanceamento web.
D. N-tier significa que todas as camadas podem chamar qualquer outra sem dependência ou interface definida.

**Resposta correta: B.** As três camadas têm responsabilidades distintas. O material apresenta também a camada de servidor web em arquiteturas multicamadas como ponto de entrada e controle entre clientes e servidores de aplicação.

**Por que as outras estão erradas:** A troca os papéis de apresentação, domínio e dados e supõe que o servidor web substitua regras de negócio. C mistura persistência, interface e tráfego web. D contradiz o princípio de separação/acoplamento entre camadas: N-tier organiza responsabilidades, não elimina limites.

*Base: 05/01-arquitetura-de-aplicacoes-em-camadas.md; 05/00-aprendizados.md, seções 1–3.*

## 3. E-business, e-commerce e EDI

Uma empresa automatiza a troca estruturada de pedidos com fornecedores, além de vender produtos diretamente a consumidores pela internet. Qual interpretação distingue corretamente os conceitos?

A. Ambas as atividades são exclusivamente e-commerce B2C; EDI é um tipo de pagamento.
B. A troca empresarial se enquadra em relações B2B e pode usar EDI; a venda online é e-commerce, que representa parte do e-business.
C. E-business significa apenas manter um site institucional; e-commerce inclui toda automação interna.
D. EDI é uma categoria de SaaS e não tem relação com troca eletrônica de documentos comerciais.

**Resposta correta: B.** O conteúdo diferencia e-business, que abrange processos e relações de negócio apoiados eletronicamente, de e-commerce, ligado à compra e venda. EDI é citado como meio de troca estruturada entre organizações; a relação empresa-fornecedor é B2B.

**Por que as outras estão erradas:** A reduz a troca entre empresas a B2C e erra a natureza de EDI. C restringe e-business a site e desloca automação interna para e-commerce. D confunde uma prática de intercâmbio de dados com um modelo de serviço cloud.

*Base: 05/02-padroes-de-e-business.md; 05/00-aprendizados.md, seção 4.*

## 4. SOA e contrato de serviço

Uma organização quer que sistemas de diferentes plataformas consumam uma capacidade de negócio reutilizável. Qual desenho está mais próximo de SOA como descrita nas aulas?

A. Um serviço com contrato explícito e interface que pode ser localizado/consumido, com papéis de provedor, consumidor e registro.
B. Uma única aplicação monolítica que compartilha tabelas internas diretamente com todos os consumidores.
C. Uma linguagem de programação específica que obriga todos os serviços a serem implantados no mesmo servidor.
D. Uma cópia física do mesmo sistema para cada consumidor, sem interface comum.

**Resposta correta: A.** O material descreve SOA como organização de capacidades em serviços interoperáveis e destaca provedor, consumidor e registro, além de contratos/interfaces.

**Por que as outras estão erradas:** B acopla consumidores aos detalhes internos do sistema e não modela serviços com contrato. C confunde arquitetura com linguagem e contradiz independência de plataforma. D remove reutilização e interação por serviço, não representando o modelo estudado.

*Base: 05/07-arquitetura-orientada-a-servico.md; 05/00-aprendizados.md, seção 10.*

## 5. Segurança na nuvem e responsabilidade compartilhada

Uma empresa executa uma aplicação em IaaS. O provedor protege o data center, mas uma regra de firewall configurada pelo cliente expõe o banco à internet. Qual análise é mais consistente com responsabilidade compartilhada?

A. O provedor é responsável por qualquer configuração feita pelo cliente, pois o serviço está na nuvem.
B. A empresa continua responsável por configurações e controles sob sua gestão; contratar cloud não transfere automaticamente toda responsabilidade de segurança.
C. A empresa não tem responsabilidade porque o banco está em uma máquina virtual.
D. A responsabilidade compartilhada se aplica apenas a SaaS, nunca a IaaS.

**Resposta correta: B.** As aulas tratam segurança como responsabilidade que se divide entre provedor e cliente conforme o modelo e os componentes gerenciados. Uma configuração feita pelo cliente continua sendo responsabilidade operacional dele.

**Por que as outras estão erradas:** A e C assumem transferência integral da responsabilidade, incompatível com o conteúdo. D exclui IaaS sem fundamento; a divisão existe nos modelos cloud e varia conforme o serviço.

*Base: 05/08-fundamentos-de-cloud-computing-terminologias-e-conceitos.md; 05/05-infraestrutura-basica-de-seguranca-para-web.md; 05/00-aprendizados.md, seções 5, 7 e 11.*

## 6. Elasticidade, escalabilidade e resiliência

Um job sazonal aumenta de 4 para 20 workers durante a carga e retorna a 4 depois; em outra situação, uma zona falha e a aplicação segue disponível por recursos em outra zona. Quais conceitos descrevem melhor as duas situações?

A. A primeira é elasticidade; a segunda é resiliência/alta disponibilidade.
B. A primeira é disponibilidade; a segunda é escalabilidade vertical.
C. Ambas são apenas elasticidade, pois qualquer mudança de capacidade é o mesmo conceito.
D. A primeira é tolerância a falhas; a segunda é pagamento por uso.

**Resposta correta: A.** Ajustar recursos à demanda para cima e para baixo caracteriza elasticidade. Continuar operando diante de falha é resiliência/alta disponibilidade. Escalabilidade é capacidade de acomodar crescimento, mas o retorno dinâmico ao nível anterior distingue a elasticidade no exemplo.

**Por que as outras estão erradas:** B troca as categorias e não há informação de aumento de capacidade de um único recurso (vertical). C apaga a distinção entre adaptação de capacidade e continuidade diante de falha. D associa cada cenário a conceitos que não descrevem o mecanismo apresentado.

*Base: 05/08-fundamentos-de-cloud-computing-terminologias-e-conceitos.md; 05/11-beneficios-desafios-e-riscos-das-plataformas-e-servicos.md; 05/14-analise-de-desempenho.md; 05/00-aprendizados.md, seção 11.*

## 7. Interpretação de um SLA

Um SLA estabelece um nível mínimo de serviço, como será medido e as consequências de descumprimento. Qual prática oferece uma avaliação mais válida do cumprimento?

A. Contar apenas interrupções percebidas por usuários, sem definir janela nem método de medição.
B. Medir o indicador acordado na janela e escopo definidos, comparar com a meta contratual e aplicar o mecanismo previsto no acordo.
C. Substituir a meta contratual pela média de desempenho de um mês escolhido pelo provedor.
D. Considerar que uma compensação financeira prova que o serviço nunca ficou indisponível.

**Resposta correta: B.** SLA é um acordo entre cliente e provedor sobre nível esperado, medição e condições. A avaliação depende dos indicadores, período, escopo e tratamento definidos no acordo.

**Por que as outras estão erradas:** A não permite comparação consistente, pois omite critérios de medição. C altera unilateralmente a referência acordada. D confunde remediação/compensação com ausência de falha.

*Base: 05/13-service-level-agreements-slas-para-servicos-de-cloud.md; 05/questoes.md, seção Aula 13.*

## 8. Métricas de desempenho

Um relatório compara dois ambientes com cargas diferentes. Um apresenta mais transações por segundo, mas também maior tempo médio de resposta. Qual conclusão é metodologicamente correta?

A. O ambiente com maior vazão é necessariamente melhor em qualquer carga e para qualquer usuário.
B. Vazão e tempo de resposta são métricas distintas; devem ser interpretadas junto à carga e aos objetivos/limites do serviço.
C. Tempo de resposta é o número de solicitações concluídas por segundo.
D. Se a vazão aumenta, latência obrigatoriamente diminui.

**Resposta correta: B.** Análise de desempenho distingue capacidade/vazão de tempo de resposta e considera condições de carga e metas. Uma métrica isolada não determina a qualidade completa.

**Por que as outras estão erradas:** A transforma uma métrica em critério universal e ignora latência. C troca o significado de latência e vazão. D afirma uma relação necessária que não decorre dos conceitos; sob saturação, vazão pode aumentar enquanto resposta piora.

*Base: 05/14-analise-de-desempenho.md; 05/questoes.md, seção Aula 14.*

## 9. Escolha de abordagem de migração

Uma aplicação antiga precisa ir para cloud rapidamente, mas não pode ser redesenhada no prazo. A organização pretende movê-la com alterações mínimas e revisar a modernização depois. Qual estratégia está mais alinhada ao caso?

A. Rehost, pois prioriza mover a carga com poucas mudanças; a decisão não significa que a aplicação já foi modernizada.
B. Refactor, pois exige reescrever a aplicação sem alterar seu desenho.
C. Retire, pois manter a aplicação em operação na nuvem equivale a desativá-la.
D. Repurchase, pois significa manter a mesma aplicação e migrar apenas os servidores.

**Resposta correta: A.** Rehost (lift-and-shift) descreve a migração com pouca ou nenhuma alteração. Pode atender a uma restrição de prazo, mas não entrega por si só os benefícios de modernização arquitetural.

**Por que as outras estão erradas:** B associa refatoração à ausência de mudança; refactor implica modificar a aplicação. C é desativar/retirar uma carga, não migrá-la para continuar operando. D confunde troca por outro produto/solução com a migração de infraestrutura descrita.

*Base: 05/15-migracao-e-transformacao-de-servidores-para-provedores-de-nuvem.md; 05/questoes.md, seção Aula 15.*

## 10. Nuvem híbrida e serverless

Uma empresa mantém dados sujeitos a restrições em ambiente privado e executa uma função curta, acionada por eventos, em serviço gerenciado que aloca recursos sob demanda. Qual interpretação é correta?

A. O ambiente combina nuvem híbrida; a execução por evento pode ser serverless, embora o provedor continue usando servidores e gerencie sua alocação.
B. Serverless significa que a aplicação não executa em hardware físico.
C. Nuvem híbrida exige que todos os dados e aplicações estejam em uma nuvem pública.
D. A função é necessariamente IaaS porque qualquer execução usa processador e memória.

**Resposta correta: A.** O material descreve nuvem híbrida como combinação de ambientes para atender necessidades distintas e serverless como modelo em que o provedor gerencia dinamicamente recursos/servidores, cobrando pelo consumo ou execução.

**Por que as outras estão erradas:** B interpreta literalmente “sem servidor”; os servidores existem, mas sua gestão é abstraída do cliente. C contradiz a combinação de ambientes privados e cloud. D ignora o nível de abstração e gerenciamento do serviço; uso de hardware não determina por si só que seja IaaS.

*Base: 05/16-o-futuro-e-a-evolucao-dos-servicos-cloud.md; 05/08-fundamentos-de-cloud-computing-terminologias-e-conceitos.md; 05/00-aprendizados.md, seções 11 e 14.*
