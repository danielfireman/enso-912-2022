import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        EstacionamentoAcoplamentoBom e = new EstacionamentoAcoplamentoBom();
        System.out.println("Estacionamento criado!");

        System.out.println("Vagas Ocupadas antes:" + e.vagasOcupadas());
        e.estaciona("XXX-1234", 1);
        System.out.println("Vagas Ocupadas depois:" + e.vagasOcupadas());
        e.libera("XXX-1234");
        System.out.println("Vagas Ocupadas depois de liberar:" + e.vagasOcupadas());
    }

}