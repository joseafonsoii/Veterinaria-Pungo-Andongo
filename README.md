# 🐾 Sistema de Gestão de Clínica Veterinária

Este projeto foi desenvolvido como parte da disciplina de **Programação Orientada a Objetos (POO)** com o objetivo de aplicar os principais conceitos da orientação a objetos na construção de um sistema funcional de gestão veterinária.

## 📌 Funcionalidades

- Registro de **proprietários** com nome, ID e contacto.
- Cadastro de **animais** associados a proprietários.
- Registro de **visitas veterinárias**:
  - 💉 Vacinas
  - 🩺 Consultas
  - 🛁 Higiene
- Contagem de visitas de higiene por animal.
- Exibição de visitas por animal ou por tipo.
- Armazenamento persistente em arquivos `.txt`.

## 🛠 Tecnologias

- **Linguagem:** Java
- **IDE:** Visual Studio Code
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Persistência:** Escrita e leitura em arquivos de texto (`FileWriter`/`Scanner`)

## 🧱 Estrutura de Classes

- `Proprietario`: Armazena dados de um dono.
- `Animal`: Representa um animal com associação ao proprietário.
- `Visita` (abstract): Classe base para todos os tipos de visita.
  - `Vacina`: Subclasse com nome da vacina.
  - `Consulta`: Subclasse com motivo da consulta.
  - `Higiene`: Subclasse com tipo fixo de serviço.
- `Maneger`: Contém os métodos de gerenciamento do sistema.
- `Menu`: Interface textual com o usuário.

## 💡 Conceitos de POO Aplicados

- **Encapsulamento:** Atributos privados com getters e setters.
- **Herança:** `Vacina`, `Consulta` e `Higiene` herdam de `Visita`.
- **Polimorfismo:** Sobrescrita de métodos como `toString()`.
- **Composição:** Um `Animal` pertence a um `Proprietario`.
- **Tratamento de Exceções:** Validação de dados, como data inválida ou tipo incorreto.

## 📂 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
````

2. Compile os arquivos `.java`:

   ```bash
   javac *.java
   ```
3. Execute a classe `Menu`:

   ```bash
   java Menu
   ```

## ⚠️ Observações

* Os dados inseridos são salvos em arquivos `.txt` na mesma pasta do projeto.
* IDs são gerados automaticamente com base na quantidade de registros.

## 📚 Autor

* Nome: **José António Afonso**
* Curso: Ciência da Computação / Engenharia Informática
* Ano: 2024–2025
* Disciplina: Programação Orientada a Objetos (POO)

---

```

