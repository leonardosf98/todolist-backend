# Task List API

Tem algum tempo que estou estudando Java e achei que era hora de parar com a teoria e testar o que aprendi em algum projeto. Pensando em alguma sugestão de projeto simples, achei legal fazer uma lista de tarefas, algo simples mas para consolidar o aprendizado. Este é o meu primeiro projeto em Java, uma API de lista de tarefas (CRUD) desenvolvida usando Spring Boot. O projeto utiliza H2 para o desenvolvimento local e PostgreSQL para a produção no Heroku o que não vai ser usado no momento. Lombok foi utilizado para simplificar o código.

## Tecnologias Utilizadas

- Java
- Spring Boot
- H2 Database (desenvolvimento local)
- PostgreSQL (produção no Heroku)
- Lombok
- Postman (para testes)

## Funcionalidades

- Criar tarefas
- Ler tarefas
- Atualizar tarefas
- Excluir tarefas

## Como Executar o Projeto Localmente

1. Clone o repositório:
    ```bash
    git clone https://github.com/leonardosf98/todolist-backend.git
    cd task-list-api
    ```

2. Configure o banco de dados H2 no `application.properties`:
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```

3. Compile e execute o projeto:
    ```bash
    ./mvnw spring-boot:run
    ```

4. Acesse o H2 Console (opcional) em `http://localhost:8080/h2-console` com as seguintes credenciais:
    - JDBC URL: `jdbc:h2:mem:testdb`
    - User Name: `sa`
    - Password: `password`

## Próximos Passos

- Escrever a documentação da aplicação.
- Implementar verificações e validações adicionais.
- Desenvolver a interface em Vue.js para interagir com a API.

## Agradecimentos

Gostaria de agradecer especialmente à [Kamila Code](https://www.youtube.com/@Kamilacode) pela série de vídeos que foi fundamental para a realização deste projeto.
