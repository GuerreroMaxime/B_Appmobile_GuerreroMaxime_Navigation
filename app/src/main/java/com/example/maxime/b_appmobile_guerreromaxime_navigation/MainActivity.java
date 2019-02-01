package com.example.maxime.b_appmobile_guerreromaxime_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button valider;                         //Récupère le button
    private final  String EXTRA_NOM = "nom";        //Permet de stocker les données de nom
    private final  String EXTRA_PRENOM = "prénom";  //Permet de stocket les données de prenom
    private EditText Nom;                           //Récupère le nom
    private EditText Prenom;                        //Récupère le prenom
    private String[] Choisie = {"Earthbound: Mother", "Earthbound: Mother 2", "Mother 3"}; //Affichage de la liste
    private String Recupchoisieduturfu = "";        //Récupère le nom de l'élément de la liste
    private ListView Recupchoisie;                  //Récupère les choix de la liste
    private int compteur;                           //Compteur de la liste




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        valider = (Button) findViewById(R.id.button3);              //Récuparation du boutton
        Nom = (EditText) findViewById(R.id.monom);                  //Récuperation du nom de la personne
        Prenom = (EditText) findViewById(R.id.monprenom);           //Récuperation du prenom de la personne
        Recupchoisie = (ListView) findViewById(R.id.datlist);       //Récupération de la liste

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Choisie); //Permet d'adapter la liste pour tout les valeurs rentrée
        Recupchoisie.setAdapter(adapter);       //On set l'adapter



        valider.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {      //Permet d'envoyer les données du nom et du prénom
                Intent monIntent = new Intent(MainActivity.this, Main2Activity.class);  //Création de l'intent qui permet d'envoyer d'une interface à une autre
                monIntent.putExtra(EXTRA_NOM, Nom.getText().toString());        //Récupération des valeurs du nom.
                monIntent.putExtra(EXTRA_PRENOM, Prenom.getText().toString());  //Récupération des valeurs du prenom.
                startActivity(monIntent);   //Execution de l'intent
            }

            ;
         } );



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

