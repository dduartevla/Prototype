import java.text.SimpleDateFormat;
import java.util.Date;

public class Bancada implements Cloneable{

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

    public String getDataPlantioFormatada(){
        return formataData(this.dataPlantio);
    }

    public String getDataColheitaFormatada(){
        return formataData(this.dataPrevistaColheita);
    }

    private String formataData(Date data){
        String dataFormatada;
        if (data ==null){
           dataFormatada = "ND";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataFormatada = sdf.format(data);
        return dataFormatada;
    }

    @Override
    public Bancada clone() throws CloneNotSupportedException {
            Bancada bancadaClone = (Bancada) super.clone();
            return bancadaClone;
    }

    public String toString(){
        return "Bancada " + this.id +
                " [Cultura: " + this.nomeCultura +
                ", Capacidade-Plantio: " + this.maxUnidadesPlantio +
                ", Data Plantio: " + formataData(this.dataPlantio)+
                ", Data Estimada Colheita: " + formataData(this.dataPrevistaColheita);
    }
}
