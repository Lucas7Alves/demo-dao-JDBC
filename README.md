# Projeto de Estudo: JDBC com Padrão DAO em Java

Este projeto foi desenvolvido como parte do curso de Java oferecido na [Udemy](https://www.udemy.com/), ministrado pelo professor Nélio Alves. O objetivo principal deste módulo foi aprofundar o conhecimento em **JDBC (Java Database Connectivity)** e no padrão de projeto **DAO (Data Access Object)**.

## Objetivo do Projeto

O módulo focou no uso do JDBC para comunicação com bancos de dados e na implementação do padrão de projeto DAO, uma prática que é recomendada para separar a lógica de acesso a dados da lógica de negócio na aplicação. Durante o curso, o professor explicou passo a passo a construção de um projeto utilizando esses conceitos, destacando as razões por trás de cada decisão e implementação.

## Implementação e Aprendizado

Na etapa final do projeto, o professor lançou um desafio: implementar a classe DepartmentDaoJDBC por conta própria. Isso foi essencial para comprovar meu aprendizado nesse módulo JDBC onde pude entender com clareza o padrão DAO e o uso de JDBC, me permitindo ver na prática como o padrão DAO e o uso do JDBC se conectam para formar uma solução robusta e bem estruturada.


## Funcionalidades

- Conexão com banco de dados utilizando JDBC.
- Implementação de operações CRUD (Create, Read, Update, Delete) para a entidade `Department`.
- Uso do padrão DAO para desacoplar a lógica de persistência de dados.
- Tratamento de exceções e gerenciamento de conexões com boas práticas.

## Tecnologias Utilizadas

- **Java** - Linguagem principal do projeto.
- **JDBC** - Para interação com o banco de dados.
- **MySQL** - Banco de dados utilizado.
- **Padrão DAO** - Para organização do código e separação de responsabilidades.

## Como Executar

1. Clone este repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Configure o banco de dados conforme o script SQL fornecido.
3. Atualize as credenciais de conexão no arquivo `DB.java`.
4. Execute a aplicação.
