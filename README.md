## 💻 Projeto: Simulador de Conta Bancária em Java

Este é um programa simples em Java que simula o funcionamento de uma conta bancária, permitindo ao usuário realizar operações básicas como consultar saldo, receber depósitos e realizar transferências. O programa roda no console e interage com o usuário por meio de menus e entrada de dados via teclado.

---

### 📌 Funcionalidades

* Criação de uma conta com nome e tipo.
* Geração de saldo inicial aleatório (simulando um score).
* Consulta de saldo atual.
* Depósito de valores.
* Transferência de valores com validação de saldo.
* Encerramento do sistema.

---

### 🤠 Tecnologias e conceitos utilizados

* **Java** (linguagem de programação)
* `Scanner` para entrada de dados
* `Random` para geração de saldo aleatório
* `for` com `break` como laço de repetição infinito
* Estrutura condicional `if-else`
* Impressão formatada com `String.format` e `text block ("""...""")`

---

### 📜 Explicação do Fluxo

1. **Criação da conta**

   * O programa solicita o nome e o tipo de conta do usuário.
   * Um saldo aleatório entre R\$100 e R\$2000 é gerado como saldo inicial.

2. **Exibição dos dados iniciais**

   * São mostrados nome, tipo da conta e saldo inicial formatados.

3. **Menu de operações**

   * O sistema entra em um loop onde exibe um menu com as opções:

     * `1` – Consultar saldo
     * `2` – Receber valor (depósito)
     * `3` – Transferir valor
     * `4` – Sair

4. **Lógica de cada opção**

   * **1 – Consultar saldo:** mostra o saldo atual.
   * **2 – Receber valor:** soma um valor ao saldo da conta.
   * **3 – Transferir valor:** subtrai um valor do saldo, se houver saldo suficiente.
   * **4 – Sair:** encerra o programa.
   * Caso o usuário escolha uma opção inválida, o sistema exibe uma mensagem de aviso.

---

### ✅ Melhorias feitas no código

* Mensagens ofensivas foram substituídas por alertas apropriados para um ambiente educacional ou profissional.
* Clareza no menu de opções.
* Correção de erros de digitação como "Obridado" para "Obrigado".

---

### 🖼️ Exemplo de uso

```
Crie sua conta bancária:

Digite seu nome:
João

Tipo de conta:
Corrente

Valor sendo analisado pelo score do seu nome...

*************************************************

Dados iniciais do cliente:

Nome: JOÃO
Tipo da conta: CORRENTE
Saldo da conta: R$ 1057.00

*************************************************

Operações

1- Consultar Saldos
2- Receber Valor
3- Tranferir valor
4- Sair

Escolha uma opção
```
