public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " está ligado!");
        } else {
            System.out.println(modelo + " já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " foi desligado!");
        } else {
            System.out.println(modelo + " já está desligado!");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println(modelo + " está acelerando!");
        } else {
            System.out.println("Ligue o carro antes de acelerar!");
        }
    }
}
