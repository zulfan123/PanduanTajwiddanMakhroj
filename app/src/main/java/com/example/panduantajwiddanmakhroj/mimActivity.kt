package com.example.panduantajwiddanmakhroj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.hkmmim.*

class mimActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hkmmim)
        idgmits.setOnClickListener {startActivity(Intent(this,idgmtsActivity::class.java))}
        ikfsf.setOnClickListener {startActivity(Intent(this,ikfsfActivity::class.java))}
        idhsf.setOnClickListener {startActivity(Intent(this,idhsfActivity::class.java))}
    }
}
