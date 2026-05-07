package br.com.fiap.despesas.models;

public class Diaria extends Despesa{
    private double qtdDiaria;

    public double getQtdDiaria() {
        return qtdDiaria;
    }
    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    @Override
    public double calcularDespesa() {
        return 0;
    }

    @Override
    public String listarDespesa() {
        return "";
    }

    public void cadastrarDespesa(String descricao, double qtdDiaria){

    }
}
