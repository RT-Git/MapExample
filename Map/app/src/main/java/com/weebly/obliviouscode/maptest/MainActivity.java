package com.weebly.obliviouscode.maptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    public LatLng show;
    public Bundle args = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        Button tech_park = (Button) findViewById(R.id.tech_park);
        Button java = (Button) findViewById(R.id.java);
        Button ub = (Button) findViewById(R.id.ub);
        Button biotech = (Button) findViewById(R.id.biotech);
        Button tp = (Button) findViewById(R.id.tp);


        tech_park.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    show = new LatLng(12.8245927, 80.0448947);
                    args.putParcelable("show", show);
                    Intent i = new Intent(MainActivity.this,MapsActivity.class);

                    i.putExtra("bundle", args);
                    i.putExtra("name", "Tech Park");
                    startActivity(i);
                    //Do stuff here
                }
            });

        biotech.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                show = new LatLng(12.824712, 80.043898);
                args.putParcelable("show", show);
                Intent i = new Intent(MainActivity.this,MapsActivity.class);

                i.putExtra("bundle", args);
                i.putExtra("name", "Bio Tech");
                startActivity(i);
                //Do stuff here
            }
        });

        ub.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                show = new LatLng(12.823208, 80.042253);
                args.putParcelable("show", show);
                Intent i = new Intent(MainActivity.this,MapsActivity.class);

                i.putExtra("bundle", args);
                i.putExtra("name", "University Block");
                startActivity(i);
                //Do stuff here
            }
        });

        java.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                show = new LatLng(12.823332, 80.044504);
                args.putParcelable("show", show);
                Intent i = new Intent(MainActivity.this,MapsActivity.class);

                i.putExtra("bundle", args);
                i.putExtra("name", "Java");
                startActivity(i);
                //Do stuff here
            }
        });

        tp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                show = new LatLng(12.824679, 80.046606);
                args.putParcelable("show", show);
                Intent i = new Intent(MainActivity.this,MapsActivity.class);

                i.putExtra("bundle", args);
                i.putExtra("name", "TP Ganesan");
                startActivity(i);
                //Do stuff here
            }
        });


    }
}
