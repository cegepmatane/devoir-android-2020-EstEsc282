package com.example.projet.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.projet.R;

public class VueAjouterManga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue_ajouter_manga);


        Button vueAjouterMangaActionAnnuler = (Button)findViewById(R.id.vueAjouterMangaActionAnnuler);

        vueAjouterMangaActionAnnuler.setOnClickListener(

                new View.OnClickListener() {

                    public void onClick(View arg0) {
                        //TODO : +tard
                        /*
                        Toast message = Toast.makeText(
                                getApplication(),
                                "Action annuler",
                                Toast.LENGTH_SHORT);
                        message.show();
                        */
                        naviguerRetourManga();
                    }
                }
        );
    }

    public void naviguerRetourManga(){
        this.finish();
    }
}