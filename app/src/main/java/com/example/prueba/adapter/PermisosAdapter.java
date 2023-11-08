package com.example.prueba.adapter;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba.Listener;
import com.example.prueba.R;
import com.example.prueba.models.Permisos;

import java.util.List;

public class PermisosAdapter extends RecyclerView.Adapter<PermisosAdapter.ViewHolder> {

    private List<Permisos> pmLista;
    private Listener listener;

    public PermisosAdapter(List<Permisos> permisosList)
    {
        this.pmLista=permisosList;
    }


    @NonNull
    @Override
    public PermisosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.activity_main2, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PermisosAdapter.ViewHolder holder, int position) {
        Permisos p = pmLista.get(holder.getAdapterPosition());
        holder.setdata(p);

        holder.num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(pmLista.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pmLista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        Button name;
        Button num;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            num=itemView.findViewById(R.id.num);


        }

        public void setdata(Permisos p) {
            Permisos permisos=p;
            name.setText(p.getNombre());
            num.setText(p.getNum());

        }
    }
}