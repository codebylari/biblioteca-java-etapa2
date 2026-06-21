package br.edu.biblioteca.action;

public class AcaoRemoverLivro implements Acao {

    @Override
    public void executar() {
        System.out.println("Livro removido.");
    }

    @Override
    public void desfazer() {
        System.out.println("Remoção desfeita.");
    }

    @Override
    public String descricao() {
        return "Remover Livro";
    }
}