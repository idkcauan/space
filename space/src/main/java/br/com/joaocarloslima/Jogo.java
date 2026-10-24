package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo extends Asset {

    public List<Asset> assets = new ArrayList<>();
    Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos = 0;
    private int nivel = 1;

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {

        Random random = new Random();
        int x = random.nextInt(590);

        Meteoro meteoro = new Meteoro(x, 0, 2, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar() {
        pontos++;
        if(pontos == 10) {
            pontos = 0;
            nivel ++;
            if(nivel >= 4) {
                nivel = 4;
            }

        }

    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }
}
