package com.example.maxime.b_appmobile_guerreromaxime_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    private final  String EXTRA_NOM = "nom";        //Récupération du nom
    private final  String EXTRA_PRENOM = "prénom";  //Récupération du prenom
    private TextView strNom;                        //Pour afficher le nom
    private TextView strPrenom;                     //Pour afficher le prenom
    private TextView textlist;                      //Pour récupérer le nom du choix de la liste
    private ImageView imglist;                      //Pour récupérer l'image du choix de la liste.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        strNom = (TextView) findViewById(R.id.rnom);            //Récupération des valeurs du nom.
        strPrenom = (TextView) findViewById(R.id.rprenom);      //Récupération des valeurs du prenom.
        textlist = (TextView) findViewById(R.id.recuplist);     //Récupération des valeurs
        imglist = (ImageView) findViewById(R.id.lemajor);       //Récupération des images

        Intent monIntent = getIntent();                           //Création de l'intent
        String strNom = monIntent.getStringExtra(EXTRA_NOM);      //Récupération des données de l'autre page pour le nom
        String strPrenom = monIntent.getStringExtra(EXTRA_PRENOM);//Récupération des données de l'autre page pour le prenom

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
