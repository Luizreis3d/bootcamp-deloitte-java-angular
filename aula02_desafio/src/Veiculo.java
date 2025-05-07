public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0f;
    }

    public void acelerar() {
        velocidade += 10.0f;
    }

    public void frear() {
        if (velocidade >= 10.0f) {
            velocidade -= 10.0f;
        } else {
            velocidade = 0.0f;
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
