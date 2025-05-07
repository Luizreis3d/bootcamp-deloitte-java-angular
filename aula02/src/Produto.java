public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
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
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    // Aplica desconto percentual
    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido.");
            return;
        }

        double desconto = (percentual / 100) * preco;
        preco -= desconto;
    }

    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3000);
        p.aplicarDesconto(10); // 10% de desconto
        System.out.println("Preço com desconto: R$ " + p.getPreco());
    }
}
