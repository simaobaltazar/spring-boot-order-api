# Spring Boot Order API

[![Licença](https://img.shields.io/badge/License-MIT-blue.svg)]([https://opensource.org/licenses/MIT](https://github.com/simaobaltazar/spring-boot-order-api/blob/main/LICENSE))

## Sobre o projeto

**Spring Boot Order API** é uma aplicação backend (API RESTful) construída com **Java** e **Spring Boot**. 

Este projeto simula um sistema de gestão de encomendas (Order Management System), contemplando o mapeamento objeto-relacional (ORM) de entidades como Utilizadores, Produtos, Categorias, Encomendas e Itens de Encomenda. A arquitetura foi desenvolvida seguindo as melhores práticas da indústria, incluindo separação em camadas (Resources/Controllers, Services, Repositories e Entities) e tratamento global de exceções.

A API permite realizar operações de consulta (GET) e manipulação de dados, sendo suportada por uma base de dados em memória (H2) configurada no perfil de testes, ideal para demonstrações rápidas e validação de lógica de negócio.

## Modelo Conceitual

<img width="1132" height="426" alt="Captura de ecrã 2026-09-17 010710" src="https://github.com/user-attachments/assets/02d46f75-c86d-4745-8051-bd74af833687" />

## Tecnologias utilizadas
### Backend
- Java 17
- Spring Boot 4.1
- Spring Data JPA
- Hibernate
- Maven

### Base de Dados
- H2 Database (Perfil de Teste)

### Ferramentas & Práticas
- Padrão de Camadas (MVC)
- Injeção de Dependências
- Git & GitHub

## Como executar o projeto

### Pré-requisitos
- Java 17 ou superior
- Git

### Passos para clonar e executar

```bash
# clonar repositório
git clone [https://github.com/simaobaltazar/spring-boot-order-api.git](https://github.com/simaobaltazar/spring-boot-order-api.git)

# entrar na pasta do projeto
cd spring-boot-order-api

# executar o projeto utilizando o Maven Wrapper
./mvnw spring-boot:run
```
### Autor
Simão Baltazar

Estudante de Engenharia Informática no Instituto Politécnico de Santarém.
