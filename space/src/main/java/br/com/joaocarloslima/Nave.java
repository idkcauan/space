package br.com.joaocarloslima;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        String path = "images/ships/playerShip1_red.png";
        imagem = new ImageView(new Image(getClass().getResource(path).toString()));
    }

    public Tiro atirar(int poder) {
        return new Tiro(x, y, 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        super.mover();

        if(x < 0) {
            x = 0;
        }

        if(x > (640 - 50)) {
            x = 640 - 50;
        }

    }



}
