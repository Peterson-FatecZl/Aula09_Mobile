package fateczl.aps.aula09_mobile.model;

import androidx.annotation.NonNull;

public class AtletasJuvenis extends Atletas{
    private int qtdAnosQueParticaOEsporte;

    public int getQtdAnosQueParticaOEsporte() {
        return qtdAnosQueParticaOEsporte;
    }

    public void setQtdAnosQueParticaOEsporte(int qtdAnosQueParticaOEsporte) {
        this.qtdAnosQueParticaOEsporte = qtdAnosQueParticaOEsporte;
    }

    @NonNull
    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nData Nascimento: " + dataNascimento +
                "\nBairro: " + bairro +
                "\nAnos que Pratica o Esporte: " + qtdAnosQueParticaOEsporte;
    }
}
