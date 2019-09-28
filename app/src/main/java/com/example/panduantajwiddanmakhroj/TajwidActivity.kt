package com.example.panduantajwiddanmakhroj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.tajwid.*

class TajwidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tajwid)
        ghunnah.setOnClickListener { startActivity(Intent(this, ghunnahActivity::class.java)) }
        idzhar.setOnClickListener { startActivity(Intent(this, idhwajibActivity::class.java)) }
        ra.setOnClickListener { startActivity(Intent(this, raActivity::class.java)) }
        allah.setOnClickListener { startActivity(Intent(this, lafdzActivity::class.java)) }
        qalqalah.setOnClickListener { startActivity(Intent(this, qlqlActivity::class.java)) }
        idgham.setOnClickListener { startActivity(Intent(this,idghamActivity::class.java)) }

        sq.setOnClickListener { startActivity(Intent(this, sqActivity::class.java)) }
        mad.setOnClickListener { startActivity(Intent(this, madActivity::class.java)) }
        nun.setOnClickListener { startActivity(Intent(this, nunActivity::class.java)) }
        mim.setOnClickListener { startActivity(Intent(this, mimActivity::class.java)) }
    }
}
