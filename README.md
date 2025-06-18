# Java Bank Account Inheritance Project

Este projeto demonstra o uso de herança, sobrescrita de métodos e encapsulamento em Java através de um sistema simples de contas bancárias. É um ótimo exemplo prático dos princípios da Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades

- Criar contas bancárias do tipo comum, poupança ou empresarial.
- Realizar depósitos e saques.
- Aplicar taxas de juros (poupança).
- Conceder empréstimos (conta empresarial).
- Mostrar o comportamento do polimorfismo em métodos sobrescritos.

## 🧱 Estrutura de Classes

- `Account`  
  Classe base com atributos comuns (número, titular e saldo), métodos de saque (com taxa) e depósito.

- `SavingAccount`  
  Herda de `Account`. Aplica taxa de juros e redefine o método `withdraw` sem cobrança de taxa.

- `BusinessAccount`  
  Herda de `Account`. Permite empréstimos dentro de um limite, com taxa fixa por operação.

- `Program`  
  Classe principal que instancia objetos e demonstra o uso do polimorfismo com `withdraw`.

  🛠️ Como Executar

    Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git

Compile a classe:

javac application/Program.java

Execute:

java application.Program

📁 Organização
src/
├── application/
│   └── Program.java
└── entities/
    ├── Account.java
    ├── BusinessAccount.java
    └── SavingAccount.java

📚 Conceitos Utilizados

    Herança

    Polimorfismo

    Sobrescrita de métodos

    Encapsulamento

    Superclasse e subclasses

  🧑‍💻 Autora

     Daniela Alineri
     Projeto desenvolvido para estudo de Java com foco em POO.



