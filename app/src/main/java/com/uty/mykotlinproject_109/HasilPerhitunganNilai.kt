package com.uty.mykotlinproject_109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasil_perhitungan_nilai.*

class HasilPerhitunganNilai : AppCompatActivity() {
    private lateinit var tvNim : TextView
    private lateinit var tvNamaLengkap : TextView
    private lateinit var tvNilai : TextView
    private lateinit var tvKeterangan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_perhitungan_nilai)

        tvNim = findViewById(R.id.tv_nim)
        tvNamaLengkap = findViewById(R.id.tv_nama_lengkap)
        tvNilai = findViewById(R.id.tv_nilai)
        tvKeterangan = findViewById(R.id.tv_keterangan)

        if (intent.extras != null){
            val bundle = intent.extras
            val  nim = bundle?.getString("nim")
            val  nama_lengkap = bundle?.getString("nama_lengkap")
            val  nilai = bundle?.getString("nilai")
            val  n = nilai?.toInt() ?: 0
            var keterangan = ""

            if (n >= 80 && n <= 100){
                keterangan = "A"
            }else if (n >= 60 && n < 80){
                keterangan = "B"
            }else if (n >= 40 && n < 60){
                keterangan = "C"
            }else if(n >= 20 && n < 40){
                keterangan = "D"
            }else if(n >= 0 && n < 20){
                keterangan = "E"
            }else{
                keterangan = "Tidak diketahui"
            }

            tvNim.setText("NIM : "+nim)
            tvNamaLengkap.setText("Nama Lengkap : "+nama_lengkap)
            tvNilai.setText("Nilai : "+nilai)
            tvKeterangan.setText("Keterangan : "+keterangan)

        }

        btn_kembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
