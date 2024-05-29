package fateczl.aps.aula09_mobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fateczl.aps.aula09_mobile.model.AtletasOutros;


public class AtletasOutrosFragment extends Fragment {

    private View view;
    private EditText etNomeOutros;
    private EditText etDataNascimentoOutros;
    private EditText etBairroOutros;
    private EditText etAcademiaOutros;
    private EditText etRecordeOutros;
    private Button btnCadastrarOutros;

    public AtletasOutrosFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atletas_outros, container, false);
        etNomeOutros = view.findViewById(R.id.etNomeOutros);
        etDataNascimentoOutros = view.findViewById(R.id.etDataNascimentoOutros);
        etBairroOutros = view.findViewById(R.id.etBairroOutros);
        etAcademiaOutros = view.findViewById(R.id.etAcademiaOutros);
        etRecordeOutros = view.findViewById(R.id.etRecordeOutros);
        btnCadastrarOutros = view.findViewById(R.id.btnCadastrarOutros);

        btnCadastrarOutros.setOnClickListener(click -> cadastrarAtleta());

        return view;
    }

    private void cadastrarAtleta() {
        AtletasOutros atleta = new AtletasOutros();
        atleta.setNome(etNomeOutros.getText().toString());
        atleta.setDataNascimento(etDataNascimentoOutros.getText().toString());
        atleta.setBairro(etBairroOutros.getText().toString());
        atleta.setAcademiaQueCompete(etAcademiaOutros.getText().toString());
        atleta.setRecordeEmSegundos(Integer.parseInt(etRecordeOutros.getText().toString()));

        Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeOutros.setText("");
        etDataNascimentoOutros.setText("");
        etBairroOutros.setText("");
        etAcademiaOutros.setText("");
        etRecordeOutros.setText("");
    }

}