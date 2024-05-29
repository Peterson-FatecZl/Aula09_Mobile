package fateczl.aps.aula09_mobile.model;

import androidx.annotation.NonNull;

public class AtletasOutros extends Atletas {
    private String academiaQueCompete;
    private int recordeEmSegundos;

    public String getAcademiaQueCompete() {
        return academiaQueCompete;
    }

    public void setAcademiaQueCompete(String academiaQueCompete) {
        this.academiaQueCompete = academiaQueCompete;
    }

    public int getRecordeEmSegundos() {
        return recordeEmSegundos;
    }

    public void setRecordeEmSegundos(int recordeEmSegundos) {
        this.recordeEmSegundos = recordeEmSegundos;
    }

    @NonNull
    @Override
    public String toString() {

        return "Nome: " + nome +
                "\nData Nascimento: " + dataNascimento +
                "\nBairro: " + bairro +
                "\nAcademia que Compete: " + academiaQueCompete +
                "\nRecorde em Segundos: " + recordeEmSegundos;

    }
}
