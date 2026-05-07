package br.com.fiap.despesas.tests;

import br.com.fiap.despesas.models.Alimentacao;
import br.com.fiap.despesas.models.Diaria;
import br.com.fiap.despesas.models.Transporte;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Alimentacao refeicoes = new Alimentacao();
        Transporte veiculos = new Transporte();
        Diaria diarias = new Diaria();

        int op = 5;
        while (op != 0) {
            System.out.println("Digite:\n1 - Alimentação\n2 - Transporte\n 3 - Diária\n 4 - Apresenta análise de despesas\n 0 - Sair");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    int opcao;
                    do{
                        System.out.println("Digite:\n1 - Cadastrar despesa\n2 - Calcular despesa\n 3 - Apresentar despesa\n 4 - Incluir despesa para análise\n 0 - Sair");
                        opcao = leitor.nextInt();
                        if (opcao == 1){
                            refeicoes.cadastrarDespesa("Referente aos gastos com alimentação", "Casa di Pasta", 20);
                        } else if (opcao == 2) {
                            System.out.println(refeicoes.calcularDespesa());
                        } else if (opcao == 3) {
                            System.out.println(refeicoes.listarDespesa());
                        } else if (opcao == 4) {
                            
                        } else {
                            System.out.println("Voltando para o menu principal ....");
                        }
                    } while (opcao != 0);
                    break;

                case 2:
                    int opcaoTransporte;
                    do{
                        System.out.println("Digite:\n1 - Cadastrar despesa\n2 - Calcular despesa\n 3 - Apresentar despesa\n 4 - Incluir despesa para análise\n 0 - Sair");
                        opcaoTransporte = leitor.nextInt();
                        if (opcaoTransporte == 1){
                            veiculos.cadastrarDespesa("Referente aos gastos com transporte", 100, 5);
                        } else if (opcaoTransporte == 2) {
                            System.out.println(veiculos.calcularDespesa());
                        } else if (opcaoTransporte == 3) {
                            System.out.println(veiculos.listarDespesa());
                        } else if (opcaoTransporte == 4) {

                        } else {
                            System.out.println("Voltando para o menu principal ....");
                        }
                    } while (opcaoTransporte != 0);
                    break;

                case 3:
                    int opcaoDiaria;
                    do{
                        System.out.println("Digite:\n1 - Cadastrar despesa\n2 - Calcular despesa\n 3 - Apresentar despesa\n 4 - Incluir despesa para análise\n 0 - Sair");
                        opcaoDiaria = leitor.nextInt();
                        if (opcaoDiaria == 1){
                            diarias.cadastrarDespesa("Referente aos gastos com hospedagem", 14);
                        } else if (opcaoDiaria == 2) {
                            System.out.println(diarias.calcularDespesa());
                        } else if (opcaoDiaria == 3) {
                            System.out.println(diarias.listarDespesa());
                        } else if (opcaoDiaria == 4) {

                        } else {
                            System.out.println("Voltando para o menu principal ....");
                        }
                    } while (opcaoDiaria != 0);
                    break;
                case 4:

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;





            }
        }
    }
}