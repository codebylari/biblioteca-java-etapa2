package br.edu.biblioteca.action;

public class AcaoReservar implements Acao {

    @Override
    public void executar() {
        System.out.println("Livro reservado.");
    }

    @Override
    public void desfazer() {
        System.out.println("Reserva desfeita.");
    }

    @Override
    public String descricao() {
        return "Reserva";
    }
}