package com.example.tp5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Database db =null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment2);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        db = new Database(this) ;
    }


/*    public void click(View v)
    {
        EditText name = (EditText)findViewById(R.id.editText) ;
        EditText titre = (EditText)findViewById(R.id.editText2) ;
        EditText motcle = (EditText)findViewById(R.id.editText3) ;
        EditText resume = (EditText)findViewById(R.id.editText4) ;

        db.InsertRowAdmin(name.getText().toString(),titre.getText().toString(),motcle.getText().toString(),resume.getText().toString());

        ListView ls  = (ListView)findViewById(R.id.listview);
        // Database db = new Database(this) ;

         /*        ArrayList<String> listt =  db.getAllrecord() ;
        ls.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , listt)) ;
                                */


      /*  Intent go_to_chercher_livre = new Intent(this,livre.class) ;
        startActivity(go_to_chercher_livre);
            */
   // }


   /* public void rechercherlivre(View v)
    {
        //      EditText chercher = (EditText)findViewById(R.id.editText5) ;

        //    int test = db.recherche(chercher.getText().toString()) ;

        //   if(test ==1 ){
        //   Toast.makeText(this,"livre existe",Toast.LENGTH_LONG).show();
        Intent go_to_chercher = new Intent(this,chercherlivre.class) ;
        startActivity(go_to_chercher);


        //   }
        //else{  Toast.makeText(this,"livre n'existe pas",Toast.LENGTH_LONG).show();   }


    }


    */
    public void deletelivre(View v)
    {
        EditText deletelivree = (EditText)findViewById(R.id.editText6) ;

        Database db = new Database(this) ;
        // db.deletee(deletelivree.getText().toString()) ;

        int supp = db.deletee(deletelivree.getText().toString()) ;

     /*   if(supp ==1 ){
         Toast.makeText(this,"livre est supprimer",Toast.LENGTH_LONG).show();



         }
      else
        {

            Toast.makeText(this,"livre n'existe pas",Toast.LENGTH_LONG).show();

        }

  */



   }


    public void afficher (View v)
    {
        ListView ls  = (ListView)findViewById(R.id.listview);
        // Database db = new Database(this) ;

        ArrayList<String> listt =  db.getAllrecord() ;
        ls.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , listt)) ;


    }

    public void supprimerr (View v)
    {
        final EditText deletelivree = findViewById(R.id.editText6);
        int supp = db.deletee(deletelivree.getText().toString());


    }




    public void afficher2 (View v)
    {

        EditText cherche = (EditText)findViewById(R.id.editText7) ;


        int test = db.recherche(cherche.getText().toString()) ;

        if(test ==1 ){
            //   Toast.makeText(this,"livre existe",Toast.LENGTH_LONG).show();
            //    Intent go_to_chercher = new Intent(this,chercherlivre.class) ;
            //  startActivity(go_to_chercher);
            ListView ls2  = (ListView)findViewById(R.id.listview2);
            Database db = new Database(this) ;

            ArrayList<String> list =  db.getAllrecord2(cherche.getText().toString()) ;
            ls2.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , list)) ;



        }
        else{  Toast.makeText(this,"livre n'existe pas",Toast.LENGTH_LONG).show();   }



    }



}
