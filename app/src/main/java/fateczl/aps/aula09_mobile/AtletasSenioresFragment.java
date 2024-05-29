package fateczl.aps.aula09_mobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import fateczl.aps.aula09_mobile.model.AtletasJuvenis;
import fateczl.aps.aula09_mobile.model.AtletasSeniores;


public class AtletasSenioresFragment extends Fragment {

    private View view;
    private EditText etNomeSenior;
    private EditText etDataNascimentoSenior;
    private EditText etBairroSenior;
    private RadioButton rbProblemasCardiacosSim;
    private RadioButton rbProblemasCardiacosNao;

    private Button btnCadastrarSenior;

    public AtletasSenioresFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atletas_seniores, container, false);
        etNomeSenior = view.findViewById(R.id.etNomeSenior);
        etDataNascimentoSenior = view.findViewById(R.id.etDataNascimentoSenior);
        etBairroSenior = view.findViewById(R.id.etBairroSenior);

        rbProblemasCardiacosSim = view.findViewById(R.id.rbProblemaCardiacoSim);
        rbProblemasCardiacosNao = view.findViewById(R.id.rbProblemaCardiacoNao);
        btnCadastrarSenior = view.findViewById(R.id.btnCadastrarSenior);

        btnCadastrarSenior.setOnClickListener(click -> cadastrarAtleta());
        return view;
    }

    private void cadastrarAtleta() {
        AtletasSeniores senior = new AtletasSeniores();
        senior.setNome(etNomeSenior.getText().toString());
        senior.setDataNascimento(etDataNascimentoSenior.getText().toString());
        senior.setBairro(etBairroSenior.getText().toString());

        if(rbProblemasCardiacosSim.isChecked()){
            senior.setProblemasCardiacos("Sim");
        }else{
            senior.setProblemasCardiacos("Não");
        }

        Toast.makeText(view.getContext(), senior.toString(), Toast.LENGTH_LONG).show();
        limparCampos();
    }
    private void limparCampos() {
        etNomeSenior.setText("");
        etDataNascimentoSenior.setText("");
        etBairroSenior.setText("");
        rbProblemasCardiacosSim.setChecked(false);
        rbProblemasCardiacosNao.setChecked(false);
    }
}