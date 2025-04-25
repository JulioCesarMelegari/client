# Projeto CRUD de Clientes - Spring Boot

## Sobre o projeto

Este projeto é uma aplicação **Spring Boot** que implementa um CRUD completo de web services **REST** para gerenciar recursos de **clientes**.

O projeto inclui:

- **Busca paginada** de clientes
- **Busca por id** de cliente
- **Inserção** de novo cliente
- **Atualização** de cliente
- **Deleção** de cliente

O ambiente de testes está configurado utilizando o banco de dados **H2** em memória.  
O gerenciamento de dependências é feito com **Maven**, e a linguagem utilizada é **Java**.

---

## Especificação da Entidade

A entidade `Client` possui os seguintes atributos:

| Atributo  | Tipo      |
|-----------|-----------|
| id        | Long      |
| name      | String    |
| cpf       | String    |
| income    | Double    |
| birthDate | LocalDate |
| children  | Integer   |

> *(Os nomes de classes e atributos seguem exatamente o diagrama fornecido.)*

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Banco de dados H2
- Maven
- JUnit 5 (para testes)

---

## Como executar o projeto

### Pré-requisitos

- Java 17 (ou superior)
- Maven 3.8 (ou superior)

### Passos para rodar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Acesse a pasta do projeto
cd seu-repositorio

# Compile o projeto
mvn clean install

# Execute o projeto
mvn spring-boot:run
