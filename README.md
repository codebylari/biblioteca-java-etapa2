📚 Sistema de Biblioteca - Segunda Etapa
📖 Descrição Geral

Este projeto tem como objetivo implementar um Sistema de Biblioteca em Java utilizando estruturas de dados para organização do acervo, controle de empréstimos, reservas e gerenciamento de usuários.

A segunda etapa do projeto foi focada na implementação das classes responsáveis pelas ações do sistema, persistência de dados e interface com o usuário.

🛠️ Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Estruturas de Dados Utilizadas
Lista (armazenamento de usuários e livros)
Fila (controle de reservas)
Pilha (histórico de operações)
Árvore Binária de Busca (busca eficiente de livros)
Algoritmos de ordenação
📂 Estrutura do Projeto
📌 Pacote br.edu.biblioteca.action

Responsável pelas ações executadas no sistema.

Classes Implementadas
Acao
AcaoEmpresta
AcaoDevolver
AcaoCadastrarLivro
AcaoRemoverLivro
AcaoReservar
AcaoCancelarReserva
Métodos da Interface Acao
executar();
desfazer();
descricao();
📌 Pacote br.edu.biblioteca.repository

Responsável pela persistência de dados em arquivos TXT/CSV.

Classes Implementadas
LivroRepository
UsuarioRepository
EmprestimoRepository
ReservaRepository
ExemplarRepository
FileStorage
Funcionalidades
Salvar informações
Carregar informações
Persistência de dados em arquivos
📌 Pacote br.edu.biblioteca.ui

Responsável pela interface do usuário em modo console.

Classes Implementadas
MenuPrincipal
TelaCatalogo
TelaUsuarios
TelaEmprestimos
TelaReservas
TelaRelatorios
⚙️ Funcionalidades
Cadastro de livros
Cadastro de usuários
Controle de empréstimos
Controle de devoluções
Reserva de livros
Consulta ao acervo
Controle de multas
Relatórios do sistema
▶️ Execução

Execute a classe principal:

Main.java
Exemplo de Saída
=== LIVROS ===
Java Básico

=== USUÁRIOS ===
Larissa

Empréstimo realizado!

Multa calculada: R$ 6.0
📁 Estrutura de Diretórios
src/
└── br/
    └── edu/
        └── biblioteca/
            ├── action/
            ├── model/
            ├── repository/
            ├── service/
            ├── structures/
            ├── ui/
            └── Main.java
