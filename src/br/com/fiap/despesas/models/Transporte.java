package br.com.fiap.despesas.models;

public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagio;

    public void cadastrarDespesa(String descricao, double kmPercorrida, double valorPedagio){
        super.cadastrarDespesa(descricao);
        this.kmPercorrida = kmPercorrida;
        this.valorPedagio = valorPedagio;
    }

    @Override
    public double calcularDespesa() {

    }

    @Override
    public String listarDespesa() {

    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }
    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagio;
    }
    public void setValorPedagios(double valorPedagios) {
        this.valorPedagio = valorPedagios;
    }

}
