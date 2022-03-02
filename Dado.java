import java.util.Random;

public class Dado{
    
    int caras =0;
    Random rand = new Random();

    public Dado(int numCaras){
        caras=numCaras;
    }

    public int lanzar(){
        int rnd = rand.nextInt(caras);
        return rnd;
    }


}