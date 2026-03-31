# ⚓ Exercício: Sistema de Gestão do Programa de Desenvolvimento de Submarinos (PROSUB)

## 📝 Contexto Histórico e Geopolítico

Este exercicio foi adaptado atraves da noticia neste link:

https://www.bbc.com/portuguese/articles/cy51rd4vlpzo

Fonte: BBC Brasil, ultimo acesso: 2026/03/31

O Brasil, através da **DGDNTM (Diretoria-Geral de Desenvolvimento Nuclear e Tecnológico da Marinha)**, conduz o projeto do SN-BR (Submarino Convencionalmente Armado com Propulsão Nuclear). 

Em 2026, enfrentamos um cenário crítico: a necessidade de gerir orçamentos flutuantes e garantir a segurança de dados sensíveis sob pressão internacional.

O Almirante de Esquadra Alexandre Rabello de Faria precisa de uma ferramenta computacional que auxilie na tomada de decisão rápida sobre a continuidade das fases do projeto e protocolos de segurança.

---

## 💻 O Desafio
Você deve desenvolver um programa em **Java** que simule três situacoes de decisão lógica para a gestão do submarino.

### Requisitos do Programa

O sistema deve processar as seguintes situações utilizando `if`, `else if` e `else`:

1.  **1 Situacao: Orçamento e Cronograma:**
    * O usuário insere o valor do repasse anual (em bilhões de reais).
    * **Regra:** * Se o valor for menor que R$ 0.5 bi: Exibir "ALERTA: Risco de paralisação total. Data estimada: 2045".
        * Se o valor estiver entre R$ 0.5 bi e R$ 1.0 bi: Exibir "Ritmo lento: Finalização prevista para 2037".
        * Se o valor for maior que R$ 1.0 bi: Exibir "Projeto acelerado: Possibilidade de antecipação da entrega".

2.  **2 Situacao: Protocolo de Acesso Internacional:**
    * O sistema recebe um nível de acesso (String) e um código de país (String).
    * **Regra:** Se o nível for "TOTAL" e o país não for "Brasil", o sistema deve exibir "ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados". Caso contrário, se for "Brasil", exibir "Acesso autorizado ao Almirantado".

3.  **3 Situacao: Propulsão (Simulação de Segurança):**
    * O sistema recebe a temperatura do reator nuclear (double).
    * **Regra:** * Abaixo de 280°C: "Aumentar potência do reator".
        * Entre 280°C e 350°C: "Operação Normal - Cruzeiro".
        * Acima de 350°C: "EMERGÊNCIA: Acionar sistema de resfriamento e emergência".

---

## 🚀 Instruções para Entrega

1.  Clique em Fork neste repositório no GitHub `exercicio-prosub-java`.
2.  Crie uma classe chamada `GestaoSubmarino.java`.
3.  Utilize a classe `Scanner` para receber os dados do usuário via console.
4.  Certifique-se de que o código está devidamente indentado e com comentários explicativos.
5.  Teste seu algoritmo e tire um print dele funcionando.
6.  Dê um `git commit` com a classe Java e o print do algoritmo funcionando.

### Exemplo de Saída Esperada
```text
--- SISTEMA DE COMANDO PROSUB 2026 ---
Informe o repasse anual (em bilhões): 0.8
Status: Ritmo lento: Finalização prevista para 2037.

Informe o país de origem da solicitação: França
Nível de acesso solicitado: TOTAL
Status: ACESSO NEGADO: Soberania Nacional preservada.
--------------------------------------
```

---

## 🛠️ Critérios de Avaliação
* Uso correto dos operadores relacionais (`>`, `<`, `==`, `!=`).
* Uso correto dos operadores lógicos (`&&`, `||`).
* Organização do código e clareza nas mensagens de saída.

> "A Marinha não pode abrir mão do futuro, e vocês não podem abrir mão da lógica!" — *Prof. Daniel Paiva*

---

**Dica do Professor:** Lembrem-se que para comparar Strings em Java, não usamos `==`, mas sim o método `.equalsIgnoreCase()`. 

Fiquem atentos!
