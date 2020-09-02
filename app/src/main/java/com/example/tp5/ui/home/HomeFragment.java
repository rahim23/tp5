package com.example.tp5.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tp5.Database;
import com.example.tp5.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    View root ;
    Database db = null;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
         root = inflater.inflate(R.layout.fragment_home, container, false);

        //   final TextView textView = root.findViewById(R.id.text_home);

      final  ListView ls  = (ListView)root.findViewById(R.id.listview);
        final Button affiche = root.findViewById(R.id.button3);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //         textView.setText(s);


/*                affiche.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //EditText deletelivree = (EditText) root.findViewById(R.id.editText6) ;

                        //     Database db = new Database() ;
                        // db.deletee(deletelivree.getText().toString()) ;


                        ArrayList<String> listt =  db.getAllrecord() ;
                        ls.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , listt)) ;

                    }
                });*/


            }
        });
        return root;
    }



    public void afficher (View v)
    {
        ListView ls  = (ListView)root.findViewById(R.id.listview);
        // Database db = new Database(this) ;

        ArrayList<String> listt =  db.getAllrecord() ;
        ls.setAdapter(new ArrayAdapter<String>(root.getContext(),android.R.layout.simple_list_item_1 , listt)) ;


    }







}




