package Exemplo;

import Exemplo.Freio;

public class Ferrari implements Freio {

    private String cor;
    private int velocidade;

    public Ferrari(String cor, int velocidade) {
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int acelerar(){
        return this.velocidade++;
    }

    @Override
    public void freiar() {
        this.velocidade -= 10;
    }
}
