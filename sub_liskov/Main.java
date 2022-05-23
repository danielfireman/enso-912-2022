public class Main {

    public static void treino(Passaro passaro) {
        passaro.voa(10, 1);
        passaro.bica();
    }

    public static void main(String[] args) {
        Sabia sabia = new Sabia();
        Azulao azulao = new Azulao();
        Galinha galinha = new Galinha();
        //treino(sabia);
        //treino(azulao);
        treino(galinha);
    }
}
