package EsquentaNitechOO;

import java.util.Scanner;

public class EsquentaNitechMain {

    public static void main(String[] args) {

        Scanner aux = new Scanner(System.in);

        //Instanciando um objeto
        Produto produto = new Produto();

        //Entrada de Dados
        System.out.println("Cadastrar Produto");
        System.out.println("Informe o código do produto");
        produto.setCodProduto(aux.nextInt());
        System.out.println("Informe o nome do produto");
        produto.setNome(aux.next());
        System.out.println("Informe o preço do produto");
        produto.setPreco(aux.nextDouble());
        System.out.println("Escolha a categoria: 1 - Limpeza | 2 - Alimentação | 3 - Vestiário");
        produto.setCategoria(aux.nextInt());
        System.out.println("Necessita de Refrigeração? S - Sim | N - Não");
        produto.setSituacao(aux.next());

        if (produto.getSituacao().equalsIgnoreCase("S")) {
            produto.setRefrigeracao(true);
        } else {
            produto.setRefrigeracao(false);
        }

        produto.statusProduto();
    }


}
