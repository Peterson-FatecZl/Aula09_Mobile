package fateczl.aps.aula09_mobile.model;

import androidx.annotation.NonNull;

public class AtletasSeniores extends Atletas {
    private String problemasCardiacos;

    public String getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(String problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData Nascimento: " + dataNascimento +
                "\nBairro: " + bairro +
                "\nPossui Problemas Cardiacos: " + problemasCardiacos;

    }
}
