package br.com.joaocarloslima;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Meteoro extends Asset {

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        Random random = new Random();

        tamanho = random.nextInt(8) + 1;
        poder = tamanho;

        String path = "images/meteoro/meteoro" + poder + ".png";
        imagem = new ImageView(new Image(getClass().getResource(path).toString()));

    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPoder() {
        return poder;
    }

    public void tomarTiro(Tiro tiro) {
        poder -= tiro.getPoder();

    }

}
