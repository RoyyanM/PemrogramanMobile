package com.example.midsemester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Blanja.com");
        model.setDescription("Blanja.com merupakan situs toko online terbaik atau market place online murah, aman dan terpercaya. Situ jual beli ini merupakan sebuah Joint-venture antara Telkom Indonesia dan eBay yang bernaung di bawah payung PT. Metra Plasa dan sudah memiliki lebih dari ribuan merchant yang menawarkan berbagai produk dari bermacam kategori seperti fashion, gadget, komputer, kesehatan, otomotif, properti dan masih banyak lagi. Toko online ini juga sudah memiliki aplikasi untuk smartphone dengan OS Android dan iOS dan untuk sistem pembayaran sangat mudah dan lengkap karena memiliki hubungan kerja sama dengan sejumlah bank terdepan di tanah air seperti Mandiri, BNI, BCA, BRI, BTN, Mega, Niaga, ANZ, BII, dan lain sebagainya.");
        model.setImg(R.drawable.blanja);
        models.add(model);

        model = new Model();
        model.setTitle("Bukalapak");
        model.setDescription("Bukalapak merupakan salah satu toko online (online marketplace) terkemuka dan terbaik di Indonesia (biasa dikenal juga dengan jaringan toko online) yang dimiliki dan dijalankan oleh PT. Bukalapak. Seperti halnya situs layanan jual – beli online dengan model bisnis consumer to consumer (C2C ), Bukalapak menyediakan sarana penjualan dari konsumen-ke-konsumen di mana pun. Siapa pun bisa membuka toko online untuk kemudian melayani calon pembeli dari seluruh Indonesia baik satuan ataupun dalam jumlah banyak. Pengguna perorangan ataupun perusahaan dapat membeli dan menjual produk, baik baru maupun bekas, seperti sepeda, ponsel, perlengkapan bayi, gadget, aksesoris gadget, komputer, tablet, perlengkapan rumah tangga, busana, elektronik, dan lain-lain.");
        model.setImg(R.drawable.bukalapak);
        models.add(model);

        model = new Model();
        model.setTitle("Lazada");
        model.setDescription("Lazada Indonesia adalah pusat belanja online yang menawarkan berbagai macam jenis produk mulai dari elektronik, buku, mainan anak dan perlengkapan bayi, alat kesehatan dan produk kecantikan, peralatan rumah tangga, dan perlengkapan traveling dan olah raga. LAZADA Indonesia didirikan pada tahun 2012 dan merupakan salah satu cabang dari jaringan retail online LAZADA di Asia Tenggara. Grup LAZADA International di Asia Tenggara terdiri dari LAZADA_Indonesia, LAZADA Malaysia, LAZADA Vietnam, LAZADA Thailand, LAZADA Filipina.");
        model.setImg(R.drawable.lazada);
        models.add(model);

        model = new Model();
        model.setTitle("Tokopedia");
        model.setDescription("Tokopedia.com merupakan salah satu toko online terbaik di Indonesia yang mengusung model bisnis marketplace. Sejak diluncurkan hingga akhir 2015, layanan dasar Tokopedia bisa digunakan oleh semua orang secara gratis. Dengan visi untuk “Membangun Indonesia yang Lebih Baik Lewat Internet”, Tokopedia memiliki program untuk mendukung para pelaku Usaha Mikro Kecil dan Menengah (UMKM) dan perorangan untuk mengembangkan usaha mereka dengan memasarkan produk secara online. Tokopedia berhasil menjadi salah satu perusahaan internet Indonesia dengan pertumbuhan yang sangat pesat. Tokopedia juga berhasil mencetak sejarah sebagai perusahaan teknologi pertama di Asia Tenggara, yang menerima investasi sebesar USD 100 juta atau sekitar Rp 1,2 triliun dari Sequoia Capital dan SoftBank Internet and Media Inc.");
        model.setImg(R.drawable.tokopedia);
        models.add(model);

        model = new Model();
        model.setTitle("OLX");
        model.setDescription("OLX Indonesia (sebelumnya bernama tokobagus.com) adalah sebuah situs web iklan baris di Indonesia yang difokuskan untuk tempat membeli dan menjual produk serta jasa secara online dan gratis untuk penjual maupun pembeli yang menggunakan jasa dari OLX indonesia ini. OLX Indonesia adalah tempat untuk mencari barang baru atau bekas berkualitas seperti produk elektronik, otomotif, olahraga, rumah, peralatan rumah tangga, aneka jasa, lowongan kerja dan produk lainnya. Sebenarnya terdapat juga situs semacam ini bernama berniaga yang juga sangat terkenal dan memiliki user yang tak kalah banyaknya dengan olx. Namun, pada tanggal 14 November 2014, OLX Indonesia mengumumkan bahwa berniaga akan merger dengan OLX Indonesia pada tahun 2015 dan akhirnya proses merger tersebut sudah selesai pada bulan Februari 2015.");
        model.setImg(R.drawable.olx);
        models.add(model);

        model = new Model();
        model.setTitle("Blibli");
        model.setDescription("Blibli.com adalah salah satu E-commerce di Indonesia dengan konsep belanja online ala mall. Dengan konsep tersebut blibli mengharapkan masyarakat Indonesia yang terbiasa belanja di mall bisa menemukan barang yang mereka cari dengan mudah dan menyenangkan dimanapun dan kapanpun. Blibli adalah produk pertama PT Global Digital Niaga yang merupakan anak perusahaan Djarum dibidang digital yang didirikan pada tahun 2010. Blili bekerja sama dengan teknologi provider kelas dunia, mitra logistik, banking partner serta merchant partner dengan standar tertentu untuk menciptakan sistem back-end yang bisa memenuhi kebutuhan pengguna blibli.");
        model.setImg(R.drawable.blibli);
        models.add(model);

        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
