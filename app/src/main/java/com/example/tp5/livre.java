 /*package com.example.tp5;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class livre extends AppCompatActivity {
    Database db =null ;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
        db = new Database(this) ;
    }



public void afficher (View v)
{
    ListView ls  = (ListView)findViewById(R.id.listview);
    // Database db = new Database(this) ;

    ArrayList<String> listt =  db.getAllrecord() ;
    ls.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , listt)) ;


}




}
*/

