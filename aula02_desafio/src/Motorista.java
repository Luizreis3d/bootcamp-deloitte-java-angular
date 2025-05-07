public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculoAtual;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculoAtual = null;
    }

    public void atribuirVeiculo(Veiculo veiculo) {
        this.veiculoAtual = veiculo;
    }

    public void removerVeiculo() {
        this.veiculoAtual = null;
    }

    public void dirigir() {
        if (veiculoAtual != null) {
            System.out.println(nome + " está dirigindo o veículo " + veiculoAtual.getClass().getSimpleName());
        } else {
            System.out.println(nome + " não está dirigindo nenhum veículo.");
        }
    }
}
