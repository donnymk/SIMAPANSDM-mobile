package id.go.jatengprov.bpsdmd.simapansdm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void webviewportal(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id");
        webviewactivity.putExtra("title", "Portal Berita");
        startActivity(webviewactivity);
    }

    public void webviewppid(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/v2/ppid");
        webviewactivity.putExtra("title", "Portal PPID");
        startActivity(webviewactivity);
    }

    public void webviewopendata(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://data.jatengprov.go.id/organization/badan-pengembangan-sumber-daya-manusia-provinsi-jawa-tengah");
        webviewactivity.putExtra("title", "Open Data");
        startActivity(webviewactivity);
    }


    public void webviewagenda(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/siagnes/");
        webviewactivity.putExtra("title", "Agenda Kegiatan");
        startActivity(webviewactivity);
    }
}