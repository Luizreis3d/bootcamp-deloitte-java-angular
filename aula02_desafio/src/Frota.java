import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;

    public Frota() {
        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void adicionarMotorista(Motorista m) {
        motoristas.add(m);
    }

    public void listarFrota() {
        System.out.println("=== Frota de Veículos ===");
        for (Veiculo v : veiculos) {
            v.exibirInfo();
            System.out.println();
        }

        System.out.println("=== Motoristas ===");
        for (Motorista m : motoristas) {
            m.dirigir();
            System.out.println();
        }
    }
}
