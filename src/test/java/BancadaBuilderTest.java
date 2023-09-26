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

        assertEquals("Bancada " + "0" +
                " [Cultura: " + "Alface Crespa" +
                ", Capacidade-Plantio: " + "250" +
                ", Data Plantio: " + "15/05/2023"+
                ", Data Estimada Colheita: " + "04/06/2023", bancadaOriginal.toString());

        assertEquals("Bancada " + "0" +
                " [Cultura: " + "Alface Crespa" +
                ", Capacidade-Plantio: " + "250" +
                ", Data Plantio: " + "04/06/2023" +
                ", Data Estimada Colheita: " + "24/06/2023", bancadaClone.toString());
    }

}