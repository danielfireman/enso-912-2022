import java.util.Collection;
import java.util.Hashtable;

public class EstacionamentoAcoplamentoRuim {

    // Uma tabela cujo tipo da chave é String e o tipo do valor é inteiro.
    private Hashtable<String, Integer> vagas;

    // Construtor da classe estacionamento.
    // Recebe como parâmetro uma tabela.
    public EstacionamentoAcoplamentoRuim(Hashtable<String, Integer> vagas) {
        this.vagas = vagas;
        System.out.println("Construtor estacionamento");
    }

    public Collection<Integer> vagasOcupadas() {
        return vagas.values();
    }
}
