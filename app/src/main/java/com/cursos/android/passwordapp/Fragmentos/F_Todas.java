package com.cursos.android.passwordapp.Fragmentos;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursos.android.passwordapp.OpcionesPassword.Agregar_Password;
import com.cursos.android.passwordapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class F_Todas extends Fragment {

    FloatingActionButton FAB_AgregarPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f__todas, container, false);

        FAB_AgregarPassword = view.findViewById(R.id.FAB_AgregarPassword);

        FAB_AgregarPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Agregar_Password.class));
            }
        });


        return view;
    }
}