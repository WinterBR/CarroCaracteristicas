public class Carro {

    // Definindo as variaveis
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca; // Marca do carro
        this.modelo = modelo; // Nome do modelo do carro
        this.cor = cor; // Cor do carro
        this.ano = ano; // Ano de criação do carro
    }

    public void citarCaracteristicas() {
        // Dando print nas informações
        System.out.println("marca: " + marca + ", modelo: " + modelo + ", cor: " + cor + ", ano: " + ano);
    }
}