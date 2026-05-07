package br.com.fiap.despesas.models;

public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int qtdRefeicao;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }
    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }
    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }

    public void cadastrarDespesa(String descricao, String nomeRestaurante, int qtdRefeicao) {

    }

    @Override
    public double calcularDespesa() {
        return qtdRefeicao * 18;

    }

    @Override
    public String listarDespesa() {
        return "Despesas de alimentação:\n" +
                "Descrição: " + descricao +
                "\nRestaurante: " + nomeRestaurante +
                "\n";
    }


}
