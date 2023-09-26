import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BancadaBuilderTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        BancadaBuilder bancadaBuilder = new BancadaBuilder();
        Bancada bancadaOriginal = bancadaBuilder
                .setNomeCultura("Alface Crespa")
                .setMaxUnidadesPlantio(250)
                .setCapacidadeReservatorio(500)
                .build();
        Date dataPlantio = java.sql.Date.valueOf(LocalDate.of(2023,5,15));
        bancadaOriginal.setDataPlantio(dataPlantio);
        Date dataEstimadaColheita = java.sql.Date.valueOf(LocalDate.of(2023,6,4));
        bancadaOriginal.setDataPrevistaColheita(dataEstimadaColheita);

        Bancada bancadaClone = bancadaOriginal.clone();
        dataPlantio = java.sql.Date.valueOf(LocalDate.of(2023,6,4));
        bancadaClone.setDataPlantio(dataPlantio);
        dataEstimadaColheita = java.sql.Date.valueOf(LocalDate.of(2023,6,24));
        bancadaClone.setDataPrevistaColheita(dataEstimadaColheita);

        assertEquals("Bancada " + bancadaOriginal.getId() +
                " [Cultura: " + bancadaOriginal.getNomeCultura() +
                ", Capacidade-Plantio: " + bancadaOriginal.getMaxUnidadesPlantio() +
                ", Data Plantio: " + bancadaOriginal.getDataPlantioFormatada()+
                ", Data Estimada Colheita: " + bancadaOriginal.getDataColheitaFormatada(), bancadaOriginal.toString());

        assertEquals("Bancada " + bancadaClone.getId() +
                " [Cultura: " + bancadaClone.getNomeCultura() +
                ", Capacidade-Plantio: " + bancadaClone.getMaxUnidadesPlantio() +
                ", Data Plantio: " + bancadaClone.getDataPlantioFormatada()+
                ", Data Estimada Colheita: " + bancadaClone.getDataColheitaFormatada(), bancadaClone.toString());
    }

}