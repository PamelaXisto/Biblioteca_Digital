# 🏛️ Biblioteca Digital: Sistema Integrado de Gestão de Livros
O **Sistema Integrado de Gestão de Livros** é um sistema completo de gerenciamento de biblioteca que permite a fácil administração de livros, com funcionalidades para registrar, editar, excluir e visualizar livros de maneira intuitiva. O sistema utiliza uma arquitetura moderna, com um **back-end em Spring Boot** e um **front-end em HTML, CSS e JavaScript**. Ele se conecta a um banco de dados **MySQL** para armazenar as informações dos livros.

## 1. Objetivo do Projeto
O objetivo principal deste projeto é fornecer uma plataforma simples e eficiente para a gestão de livros em bibliotecas. Através deste sistema, bibliotecários podem gerenciar facilmente a coleção de livros, permitindo: adicionar novos, atualizar informações existentes, excluir livros e visualizar a coleção completa de maneira fácil e rápida.

## 2. Funcionalidades
- 📖 **Cadastro de Livros**: Adicione novos livros ao sistema com detalhes solicitados.
- ✏️ **Edição de Livros**: Altere informações dos livros cadastrados.
- 🗑️ **Exclusão de Livros**: Remova livros do sistema.
- 🔍 **Consulta**:  Acesse uma lista completa de livros cadastrados, com a possibilidade de filtrá-los pelo título.

## 3. Estrutura do Projeto
### 📂 Estrutura do Back-end
```bash
src/main/java/br/com/fecaf
│
├── controller
│   └── LivroController.java
├── database
│   └── model.sql
├── model
│   └── Livro.java
├── repository
│   └── LivroRepository.java
└── services
│   └── App.java
└── application.properties
```

### 📂 Estrutura do Front-end
```bash
/front-biblioteca-digital
│
├── css
│   └── styles.css    
│
├── js
│   └── script.js  
│
├── index.html        
```

### 📊 Estrutura do Banco de Dados
### Tabela: `tbl_livros`

| Coluna        | Tipo de Dado      | Descrição                                       |
|---------------|-------------------|-------------------------------------------------|
| `id`          | `INT`             | Identificador único do livro (chave primária).  |
| `isbn`        | `VARCHAR(20)`      | Código ISBN do livro.                          |
| `titulo`      | `VARCHAR(100)`     | Título do livro (campo obrigatório).           |
| `autor`       | `VARCHAR(100)`     | Autor do livro (campo obrigatório).            |
| `genero`      | `VARCHAR(100)`     | Gênero do livro (ficção, não-ficção, etc.).    |
| `data_lancamento` | `INT`          | Ano de lançamento do livro.                    |
| `sinopse`     | `TEXT`             | Descrição ou sinopse do livro.                 |
| `foto`        | `VARCHAR(200)`     | Caminho para a foto do livro (campo obrigatório). |

### Modelo do Script SQL de Criação da Tabela:
```sql
CREATE TABLE tbl_livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    isbn VARCHAR(20),
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    genero VARCHAR(100),
    data_lancamento INT,
    sinopse TEXT,
    foto VARCHAR(200) NOT NULL
);
```

## 4. Ferramentas Utilizadas

- **Back-end**: 
  - **IntelliJ** com **Maven 17.0.12**
  - **Spring Boot** (para a criação da API RESTful)
  - **MySQL** (conexão para armazenamento dos dados dos livros)

- **Front-end**: 
  - **VSCode**
  - **HTML**, **CSS**, **JavaScript** (para a interface do usuário)

- **Banco de Dados**:  
  - **MySQL Workbench 8.0**
 
## 5. Como Executar o Projeto

### Requisitos
- Java 17
- Maven
- MySQL

### ⚙️ Passos para Execução:
1. Clone este repositório.
- Use o comando abaixo para clonar o repositório para o seu ambiente local:
```git clone <url-do-repositorio>```

2. Configure o banco de dados MySQL.
- Crie o banco de dados no MySQL utilizando o seguinte comando:
```CREATE DATABASE nome_que_deseja;```

3. Execute a aplicação no **IntelliJ**.
- Abra o projeto no IntelliJ.
- Certifique-se de que o Maven está configurado corretamente e as dependências estão baixadas.
- Execute a aplicação clicando com o botão direito em App.java e selecionando Run.

4. Acesse a interface web no seu navegador.
- Após a execução da aplicação, abra seu navegador e acesse http://localhost:8080.
- A interface de gestão de livros estará disponível para visualização e interação









  
