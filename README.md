# Projeto de Aprendizado Spring Boot - Messages API

Neste projeto, utilizamos diferentes tipos de métodos HTTP com o objetivo de aprender a manipular dados por meio de pequenas operações.

## Passos Iniciais

1. **MessagesApiController:**
    - **Objetivo:** Criar endpoints para realizar operações específicas no projeto.
    - **Implementação:**
        - O usuário pode visualizar todas as mensagens que estão dentro do array, verificar uma mensagem específica passando um id, enviar uma mensagem para dentro do array, atualizar mensagens e deletá-las.
    - **Endpoints:**
        - http://localhost:8080/mensagens (Rota Inicial | método GET)
        - http://localhost:8080/mensagens/0 (Rota com parâmetros | método GET)

####

2. **MessagesHandler:**
    - **Objetivo:** Criar uma classe para a criação das mensagens e seus métodos.
    - **Implementação:**
        - Foram criados 5 métodos para a manipulação necessária das mensagens: visualização, verificação de uma mensagem específica, criação, atualização e exclusão.
    
    **Obs:** Para realizar POST, PUT e DELETE, é necessário utilizar o Postman ou alguma ferramenta que permita teste de API.

####

## Utilizando Postman

- ### Método GET
  - http://localhost:8080/mensagens (Lista o array de mensagens)
  - http://localhost:8080/mensagens/id (Troque o id por um número de acordo com as mensagens do array | Lista uma mensagem específica)

- ### Método POST
- http://localhost:8080/mensagens (Vá em "Body", selecione "raw", formato "JSON" e envie uma mensagem sem estar dentro de um `objeto` | Adiciona uma nova mensagem)

- ### Método PUT
    - http://localhost:8080/mensagens/id (Coloque o `id` de uma mensagem que deseja atualizar e envie a mensagem junto igual o POST | Atualiza uma mensagem específica)

####

- **Foi utilizado os métodos HTTP GET, POST, PUT e DELETE no desenvolvimento.**

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório:

   ```bash
   git clone https://github.com/rafaelkeiti/messages-api.git
   ```

2. Navegue até o diretório do projeto pela sua IDE:

   ```bash
   cd pasta-do-projeto
   ```

3. Execute o projeto usando o Gradle Wrapper:

   ```bash
   ./gradlew clean build bootRun 
   ```

    - No Windows, use `gradlew.bat` em vez de `./gradlew`.

4. Agora basta acessar as rotas e utilizar uma ferramenta de teste de API.