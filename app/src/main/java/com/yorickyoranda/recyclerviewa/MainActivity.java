package com.yorickyoranda.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Negara ini menggunakan bendera berwarna merah.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/125px-Flag_of_Albania.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDeskripsi("Negara ini bernama Hungaria dalam bahasa Indonesia.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Flag_of_Hungary.svg/125px-Flag_of_Hungary.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Negara ini terdapat di sebelah utara negara Amerika Serikat.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/125px-Flag_of_Canada_%28Pantone%29.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Indonesia");
        nm.setDeskripsi("Indonesia, dengan nama resmi Republik Indonesia,[a] adalah sebuah negara kepulauan di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Oseania sehingga dikenal sebagai negara lintas benua, serta antara Samudra Pasifik dan Samudra Hindia.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Russia");
        nm.setDeskripsi("Rusia, dengan nama resmi Federasi Rusia (bahasa Rusia: Росси́йская Федера́ция, translit. Rossíyskaya Federátsiya), adalah sebuah negara federasi yang bersistem semi-presidensial dengan bentuk republik konstitusional di Eropa Timur dan Asia Utara atau Eurasia bagian utara yang dari barat laut sampai ke tenggara.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Russia_with_border.svg/125px-Flag_of_Russia_with_border.svg.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }


}