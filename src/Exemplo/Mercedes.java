package Exemplo;

public class Mercedes implements Freio {

    private String cor;
    private int velocidade;

    public Mercedes(String cor, int velocidade) {
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
        this.velocidade -= 5;
    }
}
