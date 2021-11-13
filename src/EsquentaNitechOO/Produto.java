package EsquentaNitechOO;

public class Produto {
    //Atributos
    private int codProduto;
    private String nome;
    private double preco;
    private int categoria;
    private String situacao;
    private boolean refrigeracao;

    //Construtores
    public Produto() { }

    public Produto(int codProduto, String nome, double preco, int categoria, String situacao, boolean refrigeracao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.situacao = situacao;
        this.refrigeracao = refrigeracao;
    }

    //Getters e Setters
    public int getCodProduto() { return codProduto; }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public boolean isRefrigeracao() {
        return refrigeracao;
    }

    public void setRefrigeracao(boolean refrigeracao) {
        this.refrigeracao = refrigeracao;
    }

    //Método Criado
    public void statusProduto() {
        System.out.println("\nProduto Cadastrado: ");
        System.out.println("Código:          " + getCodProduto());
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço:           R$" + getPreco());

        if (getCategoria() == 1) {
            System.out.println("Categoria:       Limpeza");
        } else if (getCategoria() == 2) {
            System.out.println("Categoria:       Alimentação");
        } else {
            System.out.println("Categoria:       Vestuário");
        }

        if (isRefrigeracao()) {
            System.out.println("Necessita de Refrigeração");
        } else {
            System.out.println("Não Necessita de Refrigeração");
        }
    }

}
