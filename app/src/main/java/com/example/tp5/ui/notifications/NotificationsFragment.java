package com.example.tp5.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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


public class NotificationsFragment extends Fragment {

    View root ;
    Database db = null;

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
         root = inflater.inflate(R.layout.fragment_notifications, container, false);

     //   final TextView textView = root.findViewById(R.id.text_notifications);

        final EditText deletelivree = root.findViewById(R.id.editText6);
         final Button supp = root.findViewById(R.id.button2);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
             //   textView.setText(s);

        /*        supp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //EditText deletelivree = (EditText) root.findViewById(R.id.editText6) ;

                        //     Database db = new Database() ;
                        // db.deletee(deletelivree.getText().toString()) ;

                        int supp = db.deletee(deletelivree.getText().toString());

                    }
                });*/


            }
        });
        return root;
    }



    public void supprimerr (View v)
    {
        final EditText deletelivree = root.findViewById(R.id.editText6);
        int supp = db.deletee(deletelivree.getText().toString());


    }





}


