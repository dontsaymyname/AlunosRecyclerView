package com.example.alunoslista.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alunoslista.R;
import com.example.alunoslista.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunosAdapter extends RecyclerView.Adapter<AlunosAdapter.ViewHolder>{

    private List<Aluno> listaAluno;

    public AlunosAdapter (List<Aluno> listaAluno){
        this.listaAluno = listaAluno;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aluno_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    Aluno aluno = listaAluno.get(i);
    viewHolder.setupAluno(aluno);

    }

    @Override
    public int getItemCount() {
        return listaAluno.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView fotoImageView;
        private TextView nomeTextView;
        private TextView cursoTextView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoImageView = itemView.findViewById(R.id.foto_image_view);
            nomeTextView = itemView.findViewById(R.id.nome_text_view);
            cursoTextView = itemView.findViewById(R.id.curso_text_view);
        }

        public void setupAluno (Aluno aluno){
            nomeTextView.setText(aluno.getNome());
            cursoTextView.setText(aluno.getCurso());
        }
    }



}
