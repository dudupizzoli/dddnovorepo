package br.com.fiap.exercveiculo.models;

public class BalancoDiario {

    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo obj){
        qtdeCarros++;
        total = total + obj.doTotal();
    }

    public String doGerarRelatorio(){
        return "\nQuantidade de carros: " + qtdeCarros
                + "\nValor total: " + total;
    }

}
