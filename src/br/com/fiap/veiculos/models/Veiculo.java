package br.com.fiap.veiculos.models;

import br.com.fiap.veiculos.enums.StatusVeiculo;

//Uma classe comum/concreta tem método comum
//Uma classe abstrata PODE ter métodos comuns, métodos abstratos

public abstract class Veiculo {
    private String placa;
    private double nivelCombustivel;
    public StatusVeiculo status;

    //método abstrato: não tem código
    //obrigo os filhos a implementar esse método
    public abstract boolean validarAutonomia (double km);

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }
    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }


}
