import java.util.Collection;
import java.util.Hashtable;

public class EstacionamentoAcoplamentoBom {

    // Uma tabela cujo tipo da chave é String e o tipo do valor é inteiro.
    private Hashtable<String, Integer> vagas;

    // Construtor da classe estacionamento.
    // Recebe como parâmetro uma tabela.
    public EstacionamentoAcoplamentoBom() {
        this.vagas = new Hashtable<>();
        System.out.println("Construtor estacionamento");
    }

    public void estaciona(String placa, int vaga) {
        this.vagas.put(placa, vaga);
    }

    public void libera(String placa) {
        this.vagas.remove(placa);
    }

    public Collection<Integer> vagasOcupadas() {
        return vagas.values();
    }
}
