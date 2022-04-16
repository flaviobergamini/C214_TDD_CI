package br.inatel.c14;

public class Inimigo {
    private String nome;
    private double qtdvida;
    private String arma;

    public Inimigo(String nome, double qtdvida, String arma){
        this.nome = nome;
        this.qtdvida = qtdvida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdvida() {
        return qtdvida;
    }

    public void setQtdvida(double qtdvida) {
        this.qtdvida = qtdvida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
