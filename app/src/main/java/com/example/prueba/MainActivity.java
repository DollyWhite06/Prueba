package com.example.prueba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.prueba.adapter.PermisosAdapter;
import com.example.prueba.models.Permisos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <Permisos> permisosList= new ArrayList<>();

        permisosList.add(new Permisos("Kiara", "#775447"));
        permisosList.add(new Permisos("Jordy", "#775447"));
        permisosList.add(new Permisos("Giselle", "#775447"));
        permisosList.add(new Permisos("Catalina", "#775447"));
        permisosList.add(new Permisos("Amicia", "#775447"));


        RecyclerView rv= findViewById(R.id.rc);
        rv.setAdapter(new PermisosAdapter(permisosList));
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        num = findViewById(R.id.num);
        num.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CALL_PHONE}, 2002);
        } else {
            Intent llamar = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8714012390"));
            startActivity(llamar);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
