package br.com.zup;

import java.util.Scanner;

public class Modulo02Aula5_27_08_21_ListaExercicios03_ex2 {
    public static void main(String[] args) {
        /* 2 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        ~~Álcool:
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro
        ~~Gasolina:
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro
        ~~Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90. */

        /*Algoritmo da resolução:
        ler o tipo de combustível; ler a quantidade de litros que o usuário vai colocar; if com o tipo do combustível */

        Scanner leitorAbastecimento = new Scanner(System.in);

        float valorTotal = 0F;
        float valorDoDesconto = 0F;

        System.out.println("Bem-vinde! Siga as instruções para realizar o abastecimento");
        System.out.println("Digite G para gasolina e E para etanol");

        String tipoDoCombustivel = leitorAbastecimento.nextLine(); //entrada do usuário qual combustivel

        System.out.println("Digite a quantidade de litros que deseja abastecer:");

        float qtdLitros = leitorAbastecimento.nextFloat(); //quantidade de litros

        if (tipoDoCombustivel.equals("G") | tipoDoCombustivel.equals("g")) {
            valorTotal = qtdLitros * 2.5; // o valor a pagar

            if (qtdLitros < 20 & qtdLitros > 0) {
                //Cálculo do desconto de < 20L
                valorDoDesconto = (0.04 * valorTotal); //até 20 litros, desconto de 4% por litro
            } else {
                //Cálculo do desconto > 20L
                valorDoDesconto = (0.06 * valorTotal); //acima de 20 litros, desconto de 6% por litro
            }
        } else if (tipoDoCombustivel.equals("E") | tipoDoCombustivel.equals("e")) {
            if (qtdLitros <= 20 & qtdLitros > 0)
            //Cálculo do desconto de < 20L
        } else {
            // Calculo de desconto > 20L
        }


    }
}
