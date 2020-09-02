package com.example.tp5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp5.Database;
import com.example.tp5.R;

public class ajouter_livre extends AppCompatActivity {
    Database db =null ;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajouter_livre);
        db = new Database(this) ;
    }

    public void click(View v)
    {
        EditText name = (EditText)findViewById(R.id.editText) ;
        EditText titre = (EditText)findViewById(R.id.editText2) ;
        EditText motcle = (EditText)findViewById(R.id.editText3) ;
        EditText resume = (EditText)findViewById(R.id.editText4) ;

        db.InsertRowAdmin(name.getText().toString(),titre.getText().toString(),motcle.getText().toString(),resume.getText().toString());

       // ListView ls  = (ListView)findViewById(R.id.listview);
        // Database db = new Database(this) ;

         /*        ArrayList<String> listt =  db.getAllrecord() ;
        ls.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , listt)) ;
                                */


       Intent goo = new Intent(this,MainActivity.class) ;
        startActivity(goo);

    }





}
