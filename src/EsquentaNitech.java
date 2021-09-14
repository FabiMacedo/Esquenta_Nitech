import javax.swing.*;

public class EsquentaNitech {

    public static void main(String[] args) {

        //Declaração de variáveis
        double aumento = 0;
        double imposto;
        double novoPreco;
        int categoria;
        String situacao;
        String classificacao = null;
        String nomeCategoria;
        String nomeSituacao = null;

        //Mensagem de Boas-vindas
        JOptionPane.showMessageDialog(null, "Olá!\nBem-vindo ao Sistema de reajuste de preços.");

        //Entrada do usuário com o nome do produto
        String nome = JOptionPane.showInputDialog("Informe o nome do produto:");

        //Entrada do usuário com o preço do produto
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto R$:"));

        //Entrada do usuário para escolha da categoria do produto com validação dos dados
        do {
            categoria = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma categoria:\n1 – limpeza\n2 - alimentação\n3 – vestuário"));
            if (categoria != 1 && categoria != 2 && categoria != 3) {
                JOptionPane.showMessageDialog(null, "Informe uma categoria válida!");
            }
        } while (categoria != 1 && categoria != 2 && categoria != 3);

        //Entrada do usuário para escolha da situação do produto com validação dos dados
        do {
            situacao = JOptionPane.showInputDialog("Escolha a situação do produto:\nR – para produtos que necessitam de refrigeração\nN – para produtos que não necessitam de refrigeração ");
            if (!(situacao.equalsIgnoreCase("R") || situacao.equalsIgnoreCase("N"))) {
                JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
            }
        } while (!(situacao.equalsIgnoreCase("R") || situacao.equalsIgnoreCase("N")));

        //Nome da categoria do produto
        if (categoria == 1) {
            nomeCategoria = "Limpeza";
        } else if (categoria == 2) {
            nomeCategoria = "Alimentação";
        } else {
            nomeCategoria = "Vestuário";
        }

        //Nome da situacao do produto
        if (situacao.equalsIgnoreCase("R")) {
            nomeSituacao = "Necessita de Refrigeração";
        } else if (situacao.equalsIgnoreCase("N")) {
            nomeSituacao = "Não Necessita de Refrigeração";
        }

        //Calculo para o valor do aumento 1
        if (preco <= 25 && categoria ==1) {
            aumento = preco * 0.05;
        } else if (preco <= 25 && categoria ==2) {
            aumento = preco * 0.08;
        } else if (preco <= 25 && categoria ==3) {
            aumento = preco * 0.1;
        }

        //Calculo para o valor do aumento 2
        if (preco > 25 && categoria ==1) {
            aumento = preco * 0.12;
        } else if (preco > 25 && categoria ==2) {
            aumento = preco * 0.15;
        } else if (preco > 25 && categoria ==3) {
            aumento = preco * 0.18;
        }

        //Calculo para o valor do imposto
        if (categoria == 2 || situacao.equalsIgnoreCase("R")) {
            imposto = preco * 0.05;
        } else {
           imposto = preco * 0.08;
        }

        //Declaração da variável novoPreco
        novoPreco = preco + aumento + imposto;

        //Classificação do produto
        if (novoPreco <= 50) {
            classificacao = "Barato";
        } else if (novoPreco > 50 && novoPreco < 120) {
            classificacao = "Normal";
        } else if (novoPreco >= 120) {
           classificacao = "Caro";
        }

        //Status do produto e suas alterações
        JOptionPane.showMessageDialog(null, "               STATUS DO PRODUTO\n"+
            "\nNome do produto:     "+nome+
            "\nPreço do produto R$: "+preco+
            "\nCategoria:           "+nomeCategoria+
            "\nSituação do Produto: "+nomeSituacao+
            "\nValor do aumento R$: "+aumento+
            "\nValor do imposto R$: "+imposto+
            "\nPreço atualizado R$: "+novoPreco+
            "\nClassificação:       "+classificacao);
    }

}
