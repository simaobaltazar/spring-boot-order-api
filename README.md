<div align="center">

# 🛒 Spring Boot Order API

**API RESTful para gestão de encomendas, construída com Java e Spring Boot**

<p>
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.3-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/PostgreSQL-16-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Docker-Compose-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" />
  <img src="https://img.shields.io/badge/Swagger-UI-85EA2D?style=for-the-badge&logo=swagger&logoColor=black" alt="Swagger" />
</p>

<p>
  <a href="https://github.com/simaobaltazar/spring-boot-order-api/blob/main/LICENSE">
    <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="Licença MIT" />
  </a>
</p>

<p>
  <a href="#sobre"><img src="https://img.shields.io/badge/Sobre-30363D?style=for-the-badge&logo=readdotcv&logoColor=white" alt="Sobre" /></a>
  <a href="#tecnologias"><img src="https://img.shields.io/badge/Tecnologias-30363D?style=for-the-badge&logo=stackshare&logoColor=white" alt="Tecnologias" /></a>
  <a href="#como-executar"><img src="https://img.shields.io/badge/Como_executar-30363D?style=for-the-badge&logo=docker&logoColor=white" alt="Como executar" /></a>
  <a href="#documentacao"><img src="https://img.shields.io/badge/Documenta%C3%A7%C3%A3o-30363D?style=for-the-badge&logo=swagger&logoColor=white" alt="Documentação" /></a>
  <a href="#endpoints"><img src="https://img.shields.io/badge/Endpoints-30363D?style=for-the-badge&logo=postman&logoColor=white" alt="Endpoints" /></a>
  <a href="#autor"><img src="https://img.shields.io/badge/Autor-30363D?style=for-the-badge&logo=github&logoColor=white" alt="Autor" /></a>
</p>

</div>

---

<a id="sobre"></a>

## 📖 Sobre o projeto

**Spring Boot Order API** simula um sistema de gestão de encomendas (*Order Management System*), com o mapeamento objeto-relacional de **Utilizadores, Produtos, Categorias, Encomendas, Itens e Pagamentos**.

### ✨ Destaques

- 🧱 **Arquitetura em camadas**: Resources, Services, Repositories e Entities
- 🛡️ **Tratamento global de exceções** com respostas de erro padronizadas
- 🐳 **Pronto a correr em Docker**, com *multi-stage build* e utilizador sem privilégios
- 🐘 **PostgreSQL** com dados persistentes via Docker Compose
- 📚 **Documentação interativa** com Swagger UI
- ⚙️ **Perfis de configuração** (`test` e `dev`) controlados por variáveis de ambiente
- 🌱 **Dados de exemplo** criados automaticamente no arranque

## 🗺️ Modelo Conceitual

<div align="center">
  <img width="900" alt="Modelo conceitual" src="https://github.com/user-attachments/assets/02d46f75-c86d-4745-8051-bd74af833687" />
</div>

<a id="tecnologias"></a>

## 🛠️ Tecnologias

| Área | Tecnologias |
|---|---|
| **Backend** | Java 17, Spring Boot 3.3, Spring Data JPA, Hibernate, Maven |
| **Base de dados** | H2 (perfil `test`), PostgreSQL 16 (perfil `dev`) |
| **Infraestrutura** | Docker, Docker Compose |
| **Documentação** | springdoc-openapi, Swagger UI |

<a id="como-executar"></a>

## 🚀 Como executar

### 🐳 Opção 1: com Docker (recomendado)

> Só precisas do [Docker](https://www.docker.com/) instalado. Não é necessário ter Java nem PostgreSQL.

```bash
git clone https://github.com/simaobaltazar/spring-boot-order-api.git
cd spring-boot-order-api
docker compose up --build
```

A API fica disponível em **http://localhost:8080**, com a base de dados já populada.

<details>
<summary><b>Comandos úteis do Docker Compose</b></summary>

<br>

| Comando | O que faz |
|---|---|
| `docker compose up -d` | Arranca em segundo plano |
| `docker compose logs -f api` | Mostra os logs da API |
| `docker compose down` | Para tudo (os dados mantêm-se) |
| `docker compose down -v` | Para tudo e apaga os dados |

</details>

### ☕ Opção 2: com o Maven Wrapper

> Requer Java 17 ou superior. Usa a base de dados H2 em memória.

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
.\mvnw.cmd spring-boot:run
```

<a id="documentacao"></a>

## 📚 Documentação da API

Com a aplicação a correr, abre:

<div align="center">

### 👉 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

</div>

Aí podes consultar todos os endpoints e **testá-los diretamente no navegador**.

<a id="endpoints"></a>

## 🔗 Endpoints

| Método | Endpoint | Descrição |
|:---:|---|---|
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/users` | Lista todos os utilizadores |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/users/{id}` | Procura um utilizador pelo id |
| ![POST](https://img.shields.io/badge/POST-F4B400?style=flat-square) | `/users` | Cria um utilizador |
| ![PUT](https://img.shields.io/badge/PUT-4285F4?style=flat-square) | `/users/{id}` | Atualiza um utilizador |
| ![DELETE](https://img.shields.io/badge/DELETE-DB4437?style=flat-square) | `/users/{id}` | Apaga um utilizador |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/products` | Lista todos os produtos |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/products/{id}` | Procura um produto pelo id |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/categories` | Lista todas as categorias |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/categories/{id}` | Procura uma categoria pelo id |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/orders` | Lista todas as encomendas |
| ![GET](https://img.shields.io/badge/GET-0F9D58?style=flat-square) | `/orders/{id}` | Procura uma encomenda pelo id |

## ⚙️ Configuração

<details>
<summary><b>Perfis e variáveis de ambiente</b></summary>

<br>

| Perfil | Base de dados | Quando é usado |
|---|---|---|
| `test` | H2 em memória | Por defeito (IDE ou Maven) |
| `dev` | PostgreSQL | Com o Docker Compose |

| Variável | Valor por defeito |
|---|---|
| `SPRING_PROFILES_ACTIVE` | `test` |
| `DB_URL` | `jdbc:postgresql://localhost:5432/ordersystem` |
| `DB_USER` | `postgres` |
| `DB_PASSWORD` | `postgres` |

</details>

<a id="autor"></a>

## 👨‍💻 Autor

<div align="center">

**Simão Baltazar**

Estudante de Engenharia Informática no Instituto Politécnico de Santarém

[![GitHub](https://img.shields.io/badge/GitHub-simaobaltazar-181717?style=for-the-badge&logo=github)](https://github.com/simaobaltazar)

</div>

---

<div align="center">
  <sub>Feito com ☕ e Spring Boot</sub>
</div>
