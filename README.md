# Sintaxe - Desafio: ContaBanco

Neste desafio, vamos exercitar o conteúdo aprendido no módulo de Sintaxe ao criar um projeto que simula uma conta bancária.

## Descrição do Projeto

O projeto **ContaBanco** foi desenvolvido para receber e processar dados bancários via terminal, solicitando as informações essenciais de uma conta e exibindo uma mensagem de confirmação personalizada. O programa pede ao usuário os dados da conta em sequência e, ao final, apresenta uma mensagem formatada com as informações fornecidas.

### Classe Principal

Toda a lógica está implementada na classe `ContaTerminal.java`, onde são manipuladas as entradas e saídas de dados com uso da classe `Scanner`. Durante o desenvolvimento, revisamos conceitos como regras de declaração de variáveis, uso do terminal para captura de dados e operações de concatenação de `String`.

## Atributos da Conta

A tabela abaixo descreve os atributos usados no programa:

| Atributo      | Tipo    | Exemplo       |
|---------------|---------|---------------|
| Número        | Inteiro | 1021          |
| Agência       | Texto   | 067-8         |
| Nome Cliente  | Texto   | MARIO ANDRADE |
| Saldo         | Decimal | 237.48        |

## Funcionalidades

- Solicita os dados da conta bancária ao usuário no terminal com mensagens interativas.
- Realiza a coleta dos seguintes dados:
  - **Número da Conta**
  - **Agência**
  - **Nome do Cliente**
  - **Saldo Inicial**
  

