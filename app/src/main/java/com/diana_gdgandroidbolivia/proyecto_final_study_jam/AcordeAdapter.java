package com.diana_gdgandroidbolivia.proyecto_final_study_jam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AcordeAdapter extends RecyclerView.Adapter<AcordeAdapter.AcordeViewholder>implements View.OnClickListener{
    ArrayList<Acorde> listaAcorde;
    private View.OnClickListener listener;

    public AcordeAdapter(ArrayList<Acorde> listaAcorde) {
        this.listaAcorde = listaAcorde;
    }
    @Override
    public AcordeViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_acorde,null,false);
        view.setOnClickListener(this);
        return new AcordeViewholder(view);
    }

    @Override
    public void onBindViewHolder(AcordeViewholder holder, int position) {
        holder.etiNombre.setText(listaAcorde.get(position).getNombre());
        holder.foto.setImageResource(listaAcorde.get(position).getFoto());

    }

    @Override
    public int getItemCount() {

            return listaAcorde.size();
    }
    public void setOnClickListener(View.OnClickListener listener){
            this.listener=listener;
        }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class AcordeViewholder extends RecyclerView.ViewHolder {
        TextView etiNombre;
        ImageView foto;
        public AcordeViewholder(View itemView) {
            super(itemView);
                etiNombre=(TextView) itemView.findViewById(R.id.idNombre);
                foto=(ImageView) itemView.findViewById(R.id.idImagen);
            }
    }

}