package com.example.panduantajwiddanmakhroj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.hukumidgham.*

class idghamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hukumidgham)
        mutam.setOnClickListener {startActivity(Intent(this,mtmActivity::class.java))}
        mutaj.setOnClickListener {startActivity(Intent(this,mtjActivity::class.java))}
        mutaq.setOnClickListener {startActivity(Intent(this,mtqActivity::class.java))}
    }
}
