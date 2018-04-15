package com.example.jp.musicadh;

import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MusicDTO> musicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        BottomNavigationViewHelper.removeShiftMode(navigationView);

        musicList = new ArrayList<>();
        musicList.add(new MusicDTO("XXXX","asdads.com"));
        musicList.add(new MusicDTO("DCAC","asdads.com"));
        musicList.add(new MusicDTO("ACDC","asdads.com"));
        musicList.add(new MusicDTO("ACDC","asdads.com"));

        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerMusic = (RecyclerView) findViewById(R.id.recyclerViewMainActivity);

        //Le decios que no va a variar el tamanio de la lista
        recyclerMusic.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerMusic.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        //Le pedimos que muestre las cosas en forma de grilla
        //recyclerViewPersonajes.setLayoutManager(new GridLayoutManager(this,2));




        //Creamos el adaptador del recycler
        AdapterMainRecycler adapter = new AdapterMainRecycler(this,musicList);


        //Al listView le seteo el adapter
        //unaViewList.setAdapter(unAdapterDePersonajes);

        //Le damos el adapter al Recycler
        //listViewJuguetes.setAdapter(adaptadorDeJuguetes);
        recyclerMusic.setAdapter(adapter);



    }
}


