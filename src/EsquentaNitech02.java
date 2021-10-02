import javax.swing.*;

public class EsquentaNitech02 {

    public static void main(String[] args) {

        //Declaração de variáveis
        double aumento = 0;
        double imposto;
        double novoPreco;
        double total = 0;
        double desconto = 0;
        int categoria;
        String situacao;
        String nomeCategoria;
        String nomeSituacao = null;
        boolean sair = false;
        String output = "";

        //Mensagem de Boas-vindas
        JOptionPane.showMessageDialog(null, "Olá! Bem-vindo ao Sistema de compras de Produtos.");

        do {
            //Entrada do usuário com o código do produto
            int codProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto \nOu digite 0 para sair:"));

            if (codProduto == 0) {
                sair = true;
            } else {
                output += "Código do produto: "+ codProduto +"\n";

                //Entrada do usuário com o nome do produto
                String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
                output += "Nome do produto: "+ nome +"\n";

                //Entrada do usuário com o preço do produto
                double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto R$:"));
                output += "Preço do produto R$"+ preco +"\n";

                //Entrada do usuário para escolha da categoria do produto com validação dos dados
                do {
                    categoria = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma categoria:\n1 – limpeza\n2 - alimentação\n3 – vestuário"));
                    if (categoria != 1 && categoria != 2 && categoria != 3) {
                        JOptionPane.showMessageDialog(null, "Informe uma categoria válida!");
                    }
                } while (categoria != 1 && categoria != 2 && categoria != 3);

                //Nome da categoria do produto
                if (categoria == 1) {
                    nomeCategoria = "Limpeza";
                    output += "Caregoria do produto: "+ nomeCategoria +"\n";
                } else if (categoria == 2) {
                    nomeCategoria = "Alimentação";
                    output += "Caregoria do produto: "+ nomeCategoria +"\n";
                } else {
                    nomeCategoria = "Vestuário";
                    output += "Caregoria do produto: "+ nomeCategoria +"\n";
                }

                //Entrada do usuário para escolha da situação do produto com validação dos dados
                do {
                    situacao = JOptionPane.showInputDialog("Escolha a situação do produto:\nR – para produtos que necessitam de refrigeração\nN – para produtos que não necessitam de refrigeração ");
                    if (!(situacao.equalsIgnoreCase("R") || situacao.equalsIgnoreCase("N"))) {
                        JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
                    }
                } while (!(situacao.equalsIgnoreCase("R") || situacao.equalsIgnoreCase("N")));

                //Nome da situacao do produto
                if (situacao.equalsIgnoreCase("R")) {
                    nomeSituacao = "Necessita de Refrigeração";
                } else if (situacao.equalsIgnoreCase("N")) {
                    nomeSituacao = "Não Necessita de Refrigeração";
                }

                output += "Situação do produto: "+ nomeSituacao +"\n";

                //Calculo para o valor do aumento 1
                if (preco <= 20 && categoria ==1) {
                    aumento = preco * 0.05;
                } else if (preco <= 20 && categoria ==2) {
                    aumento = preco * 0.08;
                } else if (preco <= 20 && categoria ==3) {
                    aumento = preco * 0.1;
                }

                //Calculo para o valor do aumento 2
                if (preco >= 27 && categoria ==1) {
                    aumento = preco * 0.12;
                } else if (preco >= 27 && categoria ==2) {
                    aumento = preco * 0.15;
                } else if (preco >= 27 && categoria ==3) {
                    aumento = preco * 0.18;
                }

                output += "Valor do aumento R$: "+ aumento +"\n";

                //Calculo para o valor do imposto
                if (categoria == 1 || situacao.equalsIgnoreCase("R")) {
                    imposto = preco * 0.05;
                } else {
                    imposto = preco * 0.08;
                }

                output += "Valor do imposto R$:"+ imposto +"\n";

                //Declaração da variável novoPreco
                novoPreco = preco + aumento + imposto;
                output += "Preço atualizado R$:"+ novoPreco +"\n";
                total += novoPreco;
                output += "\n";
            }

        } while (!sair);

        if (total < 150) {
            desconto = total * 0.05;
            total -= desconto;
        } else if (total >= 150 && total < 350) {
            desconto = total * 0.1;
            total -= desconto;
        } else {
            desconto = total * 0.15;
            total -= desconto;
        }

        output += "Desconto R$:"+ desconto +"\n";
        output += "Total da compra R$:"+ total +"\n";

        //Status do produto e suas alterações
        JOptionPane.showMessageDialog(null,output+"Obrigado e volte sempre!");
    }
}
