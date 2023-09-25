import java.util.Date;

public class Bancada {

    private int id;
    private String nomeCultura;
    private Date dataPlantio;
    private Date dataPrevistaColheita;
    private int capacidadeReservatorio;
    private int maxUnidadesPlantio;

    public Bancada(){
        this.nomeCultura = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCultura() {
        return nomeCultura;
    }

    public void setNomeCultura(String nomeCultura) {
        this.nomeCultura = nomeCultura;
    }

    public Date getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(Date dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public Date getDataPrevistaColheita() {
        return dataPrevistaColheita;
    }

    public void setDataPrevistaColheita(Date dataPrevistaColheita) {
        this.dataPrevistaColheita = dataPrevistaColheita;
    }

    public int getCapacidadeReservatorio() {
        return capacidadeReservatorio;
    }

    public void setCapacidadeReservatorio(int capacidadeReservatorio) {
        this.capacidadeReservatorio = capacidadeReservatorio;
    }

    public int getMaxUnidadesPlantio() {
        return maxUnidadesPlantio;
    }

    public void setMaxUnidadesPlantio(int maxUnidadesPlantio) {
        this.maxUnidadesPlantio = maxUnidadesPlantio;
    }
}
