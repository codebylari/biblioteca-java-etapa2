package br.edu.biblioteca.action;

public class AcaoCadastrarLivro implements Acao {

    @Override
    public void executar() {
        System.out.println("Livro cadastrado.");
    }

    @Override
    public void desfazer() {
        System.out.println("Cadastro de livro desfeito.");
    }

    @Override
    public String descricao() {
        return "Cadastro de Livro";
    }
}