package fateczl.aps.aula09_mobile;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fateczl.aps.aula09_mobile.model.AtletasJuvenis;

public class AtletasJuvenisFragment extends Fragment {

    private View view;
    private EditText etNomeJuvenil;
    private EditText etDataNascimentoJuvenil;
    private EditText etBairroJuvenil;
    private EditText etQtdAnosPraticaOEsporte;
    private Button btnCadastrarJuvenil;

    public AtletasJuvenisFragment() {
        super();
    }

    //infla o layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_atletas_juvenis, container, false);
        etNomeJuvenil = view.findViewById(R.id.etNomeJuvenil);
        etDataNascimentoJuvenil = view.findViewById(R.id.etDataNascimentoJuvenil);
        etBairroJuvenil = view.findViewById(R.id.etBairroJuvenil);
        etQtdAnosPraticaOEsporte = view.findViewById(R.id.etQtdAnosPraticaOEsporte);
        btnCadastrarJuvenil = view.findViewById(R.id.btnCadastrarJuvenil);

        btnCadastrarJuvenil.setOnClickListener(click -> cadastrarAtleta());
        return view;
    }

    private void cadastrarAtleta() {
        AtletasJuvenis juvenil = new AtletasJuvenis();
        juvenil.setNome(etNomeJuvenil.getText().toString());
        juvenil.setDataNascimento(etDataNascimentoJuvenil.getText().toString());
        juvenil.setBairro(etBairroJuvenil.getText().toString());
        juvenil.setQtdAnosQueParticaOEsporte(Integer.parseInt(etQtdAnosPraticaOEsporte.getText().toString()));

        Toast.makeText(view.getContext(), juvenil.toString(), Toast.LENGTH_LONG).show();
        limparCampos();
    }

    private void limparCampos() {
        etNomeJuvenil.setText("");
        etDataNascimentoJuvenil.setText("");
        etBairroJuvenil.setText("");
        etQtdAnosPraticaOEsporte.setText("");

    }
}