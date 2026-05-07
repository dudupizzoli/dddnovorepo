package br.com.fiap.despesas.models;

public class Diaria extends Despesa{
    private double qtdDiaria;

    public void cadastrarDespesa(String descricao, double qtdDiaria) {
        super.cadastrarDespesa(descricao);
        this.qtdDiaria = qtdDiaria;
    }
    @Override
    public double calcularDespesa() {
        return qtdDiaria * 50;
    }

    @Override
    public String listarDespesa() {
        String mensagem = "Despesa de alimentação\n" +
                "--------------------------------\n" +
                "Descrição: " + descricao +
                "\nQuantidade de diárias: " + qtdDiaria +
                "\nGastos com hospedagem: R$" + calcularDespesa();
        return mensagem;
    }

    public double getQtdDiaria() {
        return qtdDiaria;
    }
    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }


}
