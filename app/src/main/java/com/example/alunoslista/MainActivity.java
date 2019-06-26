package com.example.alunoslista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.alunoslista.Adapter.AlunosAdapter;
import com.example.alunoslista.interfaces.AlunosListener;
import com.example.alunoslista.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AlunosListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Aluno> listaAlunos = new ArrayList<>();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Relâmpago Marquinhos");
        aluno1.setCurso("Android");
        listaAlunos.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Zé Lampião");
        aluno2.setCurso("Android");
        listaAlunos.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Manda Chuva");
        aluno3.setCurso("Android");
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno3);


        AlunosAdapter alunosAdapter = new AlunosAdapter(listaAlunos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.alunos_recycler_view);
        recyclerView.setAdapter(alunosAdapter);
        recyclerView.setLayoutManager(layoutManager);




    }


    @Override
    public void onAlunoClicado(Aluno aluno) {
        Intent intent = new Intent(this, AlunoDetalhe.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("ALUNO", aluno);

        intent.putExtras(bundle);

        startActivity(intent);

    }
}
