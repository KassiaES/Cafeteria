package entity;

public class Cafeteria {

    private String nome;
    private String endereco;
    private boolean aberto;
    private int capacidadeMaximaClientes;
    private Enum menu;

    public Cafeteria(String nome, String endereco, boolean aberto, int capacidadeMaximaClientes, Enum menu) {
        this.nome = nome;
        this.endereco = endereco;
        this.aberto = aberto;
        this.capacidadeMaximaClientes = capacidadeMaximaClientes;
        this.menu = menu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getCapacidadeMaximaClientes() {
        return capacidadeMaximaClientes;
    }

    public void setCapacidadeMaximaClientes(int capacidadeMaximaClientes) {
        this.capacidadeMaximaClientes = capacidadeMaximaClientes;
    }

    public Enum getMenu() {
        return menu;
    }

    public void setMenu(Enum menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", aberto=" + aberto +
                ", capacidadeMaximaClientes=" + capacidadeMaximaClientes +
                ", menu=" + menu +
                '}';
    }
}
