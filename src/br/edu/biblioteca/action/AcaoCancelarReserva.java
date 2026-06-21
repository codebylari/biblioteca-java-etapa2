package br.edu.biblioteca.action;

public class AcaoCancelarReserva implements Acao {

    @Override
    public void executar() {
        System.out.println("Reserva cancelada.");
    }

    @Override
    public void desfazer() {
        System.out.println("Cancelamento desfeito.");
    }

    @Override
    public String descricao() {
        return "Cancelar Reserva";
    }
}