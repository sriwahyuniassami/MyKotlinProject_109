package com.uty.mykotlinproject_109

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etNim:EditText
    private lateinit var etNamaLengkap : EditText
    private lateinit var etNilai : EditText
    private lateinit var btnHitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNim = findViewById(R.id.et_nim)
        etNamaLengkap = findViewById(R.id.et_nama_lengkap)
        etNilai = findViewById(R.id.et_nilai)
        btnHitung = findViewById(R.id.btn_hitung)

        btnHitung.setOnClickListener(){
            val intent = Intent(this, HasilPerhitunganNilai::class.java)
            intent.putExtra("nim", etNim.text.toString())
            intent.putExtra("nama_lengkap", etNamaLengkap.text.toString())
            intent.putExtra("nilai", etNilai.text.toString())
            startActivity(intent)
        }
    }
}
