package com.example.panduantajwiddanmakhroj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.hkmnun.*
import kotlinx.android.synthetic.main.tajwid.*

class nunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hkmnun)
        idgbig.setOnClickListener {startActivity(Intent(this,idgbigActivity::class.java))}
        idgbil.setOnClickListener {startActivity(Intent(this,idgbilActivity::class.java))}
        iqlab.setOnClickListener {startActivity(Intent(this,iqlabActivity::class.java))}
        idar.setOnClickListener {startActivity(Intent(this,idzharActivity::class.java))}
        ikfa.setOnClickListener {startActivity(Intent(this,ikfaActivity::class.java))}
    }
}
