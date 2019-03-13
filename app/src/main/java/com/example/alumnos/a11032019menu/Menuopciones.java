package com.example.alumnos.a11032019menu;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.example.alumnos.a11032019menu.R.*;

public class Menuopciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_menuopciones);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case id.mAcerca:
                Intent intentAcerca=new Intent(Menuopciones.this,activity_acerca_de.class);
                startActivity(intentAcerca);
                Toast.makeText(this,"Seleccionaste Acerca de",Toast.LENGTH_LONG).show();
                break;

            case id.mAlbum:
                Intent intentAlbum=new Intent(Menuopciones.this,Album.class);
                startActivity(intentAlbum);
                Toast.makeText(this,"Seleccionaste Album",Toast.LENGTH_LONG).show();
                break;
            case id.mBuscar:
                Intent intentBuscar=new Intent(Menuopciones.this,Buscar.class);
                startActivity(intentBuscar);
                Toast.makeText(this,"Seleccionaste Buscar",Toast.LENGTH_LONG).show();
                break;
            default:

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
