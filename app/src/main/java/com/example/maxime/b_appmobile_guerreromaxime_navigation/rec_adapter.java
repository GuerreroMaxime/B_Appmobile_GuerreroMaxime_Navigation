package com.example.maxime.b_appmobile_guerreromaxime_navigation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class rec_adapter extends RecyclerView.Adapter<rec_adapter.ViewHolder> {
    private String[] mDataSet; //Déclarer votre tableau de données

    @NonNull
    @Override
    public rec_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ressourcelist, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //Le viewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Y declarer les objets de la vue qui seront chargés (par le tableau de données)
        public TextView mTextView;

        //Constructeur du holder : le viewHolder a une reference vers tous les objets de la liste
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.title);
        }
    }
}