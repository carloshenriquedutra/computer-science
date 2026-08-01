# Repositório de Estudos de Ciência da Computação

Este repositório é o meu acervo pessoal da faculdade de Ciência da Computação. Aqui ficam conteúdos, anotações de aula, códigos, exercícios e projetos das disciplinas do curso.

## Propósito

1. **Armazenar** todo o material do curso de forma organizada por disciplina.
2. **Tirar dúvidas com base no conteúdo** deste repositório usando IA, respondendo perguntas apoiadas nas anotações e materiais aqui guardados.

## Estrutura

Cada disciplina tem uma pasta numerada por ordem de organização (01, 02, ...). Dentro de cada uma, os tópicos também são numerados:

- `NN-nome-da-disciplina/` — uma pasta por disciplina
  - `NN_nome_do_topico/` — subpastas com códigos/exercícios (convenção com `_`)
  - `NN-nome-do-topico.md` — arquivos de anotações/conteúdo (convenção com `-`)

Disciplinas atuais:

| Pasta | Disciplina |
|-------|-----------|
| `01-estruturas_de_dados_para_sistemas_inteligentes` | Estruturas de Dados (códigos em Java) |
| `02-solucao_de_problemas_com_integrais` | Cálculo / Solução de Problemas com Integrais |
| `03-gerenciamento_avancado_de_projetos` | Gestão Avançada de Projetos |
| `04-solucoes-tecnologicas-para-cloud-e-redes` | Redes e Cloud |
| `05-fundamentos-de-computacao-em-nuvem` | Fundamentos de Computação em Nuvem |
| `06-metodologias-de-desenvolvimento-de-software` | Metodologias de Desenvolvimento de Software |

## Como responder dúvidas

Quando o usuário fizer uma pergunta acadêmica, baseie a resposta nos arquivos deste repositório sempre que possível:

- Pesquise (grep/glob) o conteúdo das anotações relacionadas à pergunta antes de responder.
- Cite a `pasta/arquivo` de onde a resposta foi tirada quando relevante.
- Em perguntas de disciplinas com código (ex.: Estruturas de Dados), leia os arquivos `.java` da subpasta correspondente para contextualizar as respostas.
- Toda resposta deve terminar com uma **"Dica para memorizar"**: uma frase curta, criativa e memorável (ex.: comparações, analogias, mnemônicos) que ajude o usuário a fixar o conceito.
- **Preferência do usuário**: ele NÃO gosta de metáforas/analogias abstratas. Prefere entender **como as coisas funcionam de verdade, com exemplos do mundo real** (passo a passo concreto: "quando você faz X, acontece Y"). Nas dicas e explicações, dê o mecanismo real + um exemplo prático do cotidiano, em vez de comparações poéticas.
- **Contexto profissional do usuário**: ele é **engenheiro de dados sênior numa área de pessoas/people analytics** (grande volume de dados de RH, pipelines, ETL/ELT, banco de dados, processamento distribuído). Sempre que possível, use **exemplos do dia a dia dessa área** (pipelines de dados, partições de tabelas, jobs em lote, filas de mensagens, réplicas, escalonamento de processamento, etc.) para ilustrar os conceitos — isso faz o conteúdo "clicar" mais rápido com ele.
- **Exemplo com código**: além da "Dica para memorizar", o usuário gosta de um **exemplo com código real** que ilustre o conceito. Use a ferramenta/protocolo típico da área do assunto (ex.: **Terraform** para redes/cloud, **HTML** para web, e assim por diante), traduzindo o conceito teórico num trecho de código prático e comentado.
- **Comentários no código**: além dos comentários genéricos por bloco, comente **cada linha** do exemplo, como se quem lê fosse **leigo no assunto** — explicando em linguagem simples o que aquela linha faz e como ela se liga ao conceito teórico. Cada linha deve ser autoexplicativa.

## Uso da bibliografia

Quando o conteúdo da aula estiver incompleto para responder, use a **bibliografia** que aparece no final do arquivo `.md` da aula:

- Leia a bibliografia do conteúdo e baseie a resposta no conhecimento do(s) livro(s) citado(s), respeitando sempre o escopo da disciplina/aula.
- Normalmente você já conhece o conteúdo desses livros; use esse conhecimento como fonte.
- Caso não conheça o livro ou o tema, pesquise na internet como **fallback** para complementar a resposta.

## Escopo de consulta por aula

O usuário sempre referencia em qual aula está ao fazer uma pergunta (ex.: passa o caminho do arquivo `.md` da aula). Siga estas regras de escopo:

- Consulte **apenas dentro da mesma disciplina** do arquivo indicado.
- Consulte o conteúdo da aula atual e **somente das aulas anteriores** (número menor no nome do arquivo `.md`).
- **Nunca** consulte conteúdo de outras disciplinas.
- **Nunca** consulte aulas futuras (número maior no nome do arquivo `.md`).
- Se o conteúdo necessário não estiver nas anotações permitidas, diga isso ao usuário em vez de buscar em aulas futuras ou outras disciplinas.

## Documento de aprendizados (caderno de revisão)

Toda pergunta respondida deve ser registrada em um doc de aprendizados — o "caderno" de anotações do usuário para revisão de provas:

- Mantenha **um único arquivo por disciplina** (não por aula), ex.: `00-aprendizados.md` na raiz da pasta da disciplina.
- O doc será **lido por um humano** (não apenas por IA), então deixe-o **amigável e visualmente agradável**, pensando em revisão de provas:
  - Glossários, tabelas comparativas, explicações claras, tópicos e listas quando facilitam.
  - **Diagramas Mermaid** sempre que ajudarem a visualizar conceitos (desde que façam sentido). Não limite a número de diagramas.
  - **Imagens** podem ser incorporadas por link da internet (ex.: `![descrição](url)`) quando ilustrarem bem o conceito. Como o doc é humanamente lido, prefira imagens/links que agreguem visualmente; se não houver imagem útil ou confiável, não force — um bom diagrama Mermaid já resolve.
  - Use uma **linguagem acolhedora e convidativa** para leitura humana.
- **Preferência do usuário**: ele aprende mais rápido com **tabelas comparativas** (colunas/linhas lado a lado). Sempre que um assunto tiver 2+ conceitos contrastáveis, crie uma tabela comparativa para registrá-los — priorize esse formato sempre que fizer sentido.
- Organize os aprendizados em uma **ordem lógica** (do básico para o que depende deles).
- Estruture o caderno com **numeração hierárquica em todos os tópicos**: seções principais (`1.`, `2.`...) e subtópicos (`1.1`, `1.2`...). Isso permite que o usuário faça perguntas referenciando somente o número do subtópico. Quando ele fizer isso, localize a seção correspondente no `00-aprendizados.md` da disciplina e use-a como contexto inicial, mantendo o escopo das aulas permitido.
- O usuário só pergunta o que **não sabe** — o que ele já sabe não entra no doc. Ele serve como backup do que acabou de aprender e pode esquecer rápido, então registre de forma concisa e revisável.

## Convenções

- Anotações de conteúdo ficam em `.md`; códigos ficam em arquivos de código dentro de subpastas temáticas.
- Pastas com apenas `.gitkeep` ainda não têm conteúdo — pode haver tópico previsto sem material.
