package com.diana_gdgandroidbolivia.proyecto_final_study_jam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class AcorMayoresFragment extends Fragment{
    ArrayList<Acorde> listaAcorde;
    RecyclerView recyclerViewAcorde;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =inflater.inflate(R.layout.fragment_acormayores, container, false);

        listaAcorde = new ArrayList<>();
        recyclerViewAcorde=(RecyclerView) vista.findViewById(R.id.recycler);
        recyclerViewAcorde.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarEquipos();

        AcordeAdapter adapter=new AcordeAdapter(listaAcorde);
        recyclerViewAcorde.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "seleccionar :"+listaAcorde.get(recyclerViewAcorde.getChildAdapterPosition(view)).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });


        return vista;
    }
    public void  llenarEquipos(){
        listaAcorde.add(new Acorde("DO MAYOR",R.drawable.ma1));
        listaAcorde.add(new Acorde("RE MAYOR",R.drawable.ma2));
        listaAcorde.add(new Acorde("MI MAYOR",R.drawable.ma3));
        listaAcorde.add(new Acorde("FA MAYOR",R.drawable.ma4));
        listaAcorde.add(new Acorde("SOL MAYOR",R.drawable.ma5));
        listaAcorde.add(new Acorde("LA MAYOR",R.drawable.ma6));
        listaAcorde.add(new Acorde("SI MAYOR",R.drawable.ma7));

    }
}

