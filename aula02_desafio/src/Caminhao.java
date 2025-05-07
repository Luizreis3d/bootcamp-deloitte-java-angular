public class Caminhao extends Veiculo {
    private float capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, float capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}