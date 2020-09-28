package id.putraprima.mobile06siplecalcsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    private Button button_kali, button_tambah,button_kurang, button_bagi;
    private TextView text_hasil;
    private EditText edit_text_angka_pertama,edit_text_angka_kedua;
    private static final String TAG = "MainActivity";
    private int angka_pertama = 0, angka_kedua = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kali = findViewById(R.id.button_kali);
        button_bagi = findViewById(R.id.button_bagi);
        button_kurang = findViewById(R.id.button_kurang);
        button_tambah = findViewById(R.id.button_tambah);
        text_hasil = findViewById(R.id.text_hasil);
        edit_text_angka_kedua = findViewById(R.id.edit_text_angka_kedua);
        edit_text_angka_pertama = findViewById(R.id.edit_text_angka_pertama);

            //TODO 02 Buatlah kode program untuk menambahkan event klik dari tombol kali dan tombol bagi
            button_kali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAngkaMasukan();
                    text_hasil.setText(String.valueOf(angka_pertama*angka_kedua));
                    Log.d(TAG, "perkalian 2 angka");
                }
            });

            button_bagi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAngkaMasukan();
                    text_hasil.setText(String.valueOf(angka_pertama/angka_kedua));
                    Log.d(TAG, "pembagian 2 angka");
                }
            });

            //TODO 03 Gunakanlah Log Cat Untuk memperbaiki kesalahan program


            //TODO 04 Gunakanlah Debugger untuk mencari kesalahan program (program berjalan dengan baik namun hasilnya salah)

            //TODO 05 Buatlah Validasi input agar masukan yang di isi oleh user tidak membuat program Force Close

            button_kurang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAngkaMasukan();
                    text_hasil.setText(String.valueOf(angka_pertama-angka_kedua));
                    Log.d(TAG, "pengurangan 2 angka");
                }
            });

            button_tambah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAngkaMasukan();
                    text_hasil.setText(String.valueOf(angka_pertama+angka_kedua));
                    Log.d(TAG, "penambahan 2 angka");
                }
            });
    }

    public void getAngkaMasukan(){
        //TODO 01 Buatlah kode program untuk mengambil nilai input dari edit text
        try {
        this.angka_pertama = Integer.parseInt(edit_text_angka_pertama.getText().toString());
        this.angka_kedua = Integer.parseInt(edit_text_angka_kedua.getText().toString());
        }catch (NumberFormatException e){
            Toast toast1 = Toast.makeText(MainActivity.this, "Invalid input",Toast.LENGTH_SHORT);
            toast1.show();
        }catch (ArithmeticException e){
            Toast toast1 = Toast.makeText(MainActivity.this, "Invalid output",Toast.LENGTH_SHORT);
            toast1.show();
        }
    }
}