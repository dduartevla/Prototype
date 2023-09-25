import java.util.Date;

public class BancadaBuilder {

    private Bancada bancada;

    public BancadaBuilder(){
        bancada = new Bancada();
    }

    public Bancada build(){
        if (bancada.getNomeCultura().equals("")){
            throw new IllegalArgumentException("Nome da Cultura inválido!");
        }
        return bancada;
    }

    public BancadaBuilder setId(int id) {
        bancada.setId(id);
        return this;
    }

    public BancadaBuilder setNomeCultura(String nomeCultura) {
        bancada.setNomeCultura(nomeCultura);
        return this;
    }

    public BancadaBuilder setDataPlantio(Date dataPlantio) {
        bancada.setDataPlantio(dataPlantio);
        return this;
    }

    public BancadaBuilder setDataPrevistaColheita(Date dataPrevistaColheita) {
        bancada.setDataPrevistaColheita(dataPrevistaColheita);
        return this;
    }

    public BancadaBuilder setCapacidadeReservatorio(int capacidadeReservatorio) {
        bancada.setCapacidadeReservatorio(capacidadeReservatorio);
        return this;
    }

    public BancadaBuilder setMaxUnidadesPlantio(int maxUnidadesPlantio) {
        bancada.setMaxUnidadesPlantio(maxUnidadesPlantio);
        return this;
    }
}
