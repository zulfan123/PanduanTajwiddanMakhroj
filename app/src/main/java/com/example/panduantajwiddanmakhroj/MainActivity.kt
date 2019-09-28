package com.example.panduantajwiddanmakhroj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton1.setOnClickListener {pindahlayout() }
        imageButton.setOnClickListener { pindahlayout1() }
        about.setOnClickListener { startActivity(Intent(this,AboutActivity::class.java)) }
}

    private fun pindahlayout1() {
        val intent = Intent(this, MakhrajActivity::class.java)
        startActivity(intent)
    }

    private fun pindahlayout() {
        val intent = Intent(this, TajwidActivity::class.java)
    startActivity(intent)
    }
}




