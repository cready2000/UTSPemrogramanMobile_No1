package com.example.utsmobileno1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.upn,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer terbilang muda ketimbang fakultas-fakultas lain di lingkungan UPN 'Veteran' Jawa Timur. Awalnya, Program Studi Teknik Informatika dan Sistem Informasi bergabung dengan Fakultas Teknik Industri yang berganti nama menjadi Fakultas Teknik. Namun, dua prodi tersebut kini bernaung di bawah fakultas tersendiri. \n\n" +
                        "Fakultas Ilmu Komputer terdiri dari 2 program studi, yaitu : \n",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.upn,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik merupakan fakultas dengan program studi terbanyak di lingkungan kampus UPN 'Veteran' Jawa Timur. Pada awal berdirinya di tahun 1968, fakultas ini bernama Fakultas Teknik Kimia. Tak heran, Program Studi Teknik Kimia UPN 'Veteran' Jawa Timur jadi favorit dan telah terakreditasi A. \n\n" +
                        "Fakultas Teknik terdiri dari 5 program studi, yaitu : \n",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            FacData(
                R.drawable.upn,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi UPN 'Veteran' Jawa Timur merupakan salah satu fakultas tertua dan memiliki mahasiswa terbanyak di lingkungan kampus. Fakultas ini didirikan tahun 1956 dengan nama Akademi Administrasi Perusahaan 'Veteran' (AAPV). Nama ini kemudian menjadi cikal bakal nama kampus UPN 'Veteran' Jawa Timur yang memang bermaksud mengenang para veteran pejuang pembela kemerdekaan. Dekan pertama fakultas ini adalah Letkol Umar Usman. \n\n" +
                        "Fakultas Ekonomi dan Bisnis terdiri dari 3 program studi, yaitu :",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            FacData(
                R.drawable.upn,
                "FAKULTAS PERTANIAN",
                "Didirikan sejak 17 Mei 1968, Fakultas Pertanian UPN 'Veteran' Jawa Timur sudah berusia separuh abad lebih. \n\n" +
                        "Fakultas Pertanian terdiri dari 2 program studi, yaitu :",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            FacData(
                R.drawable.cready,
                "PROFIL SINGKAT",
                "Nama : Cready Celgie Gildbrandsen\n"+
                        "TTL : Surabaya, 17 Maret 2000\n" +
                        "Alamat : Jl. Medokan Asri Utara V/12\n" +
                        "No. HP : 082230013246\n" +
                        "Email : creadycelgie03@gmail.com\n" +
                        "Github : https://github.com/cready2000\n",
                "Riwayat Pendidikan : \n" +
                        "1. SDN Kalirungkut IV Surabaya\n" +
                        "2. SMPN 35 Surabaya \n" +
                        "3. SMA Dr. Soetomo Surabaya \n\n" +
                        "Penghargaan : \n" +
                        "1. Juara 1 Kejurnas III Hapkido Indonesia (2018) \n" +
                        "2. Juara 1 Kejurnas Taekwondo Profesional Bela Negara 2020 Jabar Open (2020)"
            )
        )
        return rvList
    }
}
