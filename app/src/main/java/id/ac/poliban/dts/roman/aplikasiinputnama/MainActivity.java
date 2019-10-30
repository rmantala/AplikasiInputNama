package id.ac.poliban.dts.roman.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(getSupportActionBar()!=null)
            setTitle("Aplikasi Mobile");  //mengubah judul di Action Bar

        //daftarkan view yang mau di manipulasi
        EditText etNama = findViewById(R.id.etNama);
        Button btTampil = findViewById(R.id.btTampilkan);

        //tangani kejadian ketika pengguna
        //mengklik tombol btTampil (jangan lupa aktifkan java 1.8)
        btTampil.setOnClickListener(v -> {
            Toast.makeText(this, "Selamat Ujian " +
                    etNama.getText().toString(), Toast.LENGTH_SHORT).show();
        });

    }
}
