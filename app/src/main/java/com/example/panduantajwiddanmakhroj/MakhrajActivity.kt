package com.example.panduantajwiddanmakhroj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.makhraj.*

class MakhrajActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.makhraj)
        jauf.setOnClickListener {startActivity(Intent(this,jaufActivity::class.java))}
        halq.setOnClickListener {startActivity(Intent(this,halqActivity::class.java))}
        lisan.setOnClickListener {startActivity(Intent(this,lisanActivity::class.java))}
        syafatain.setOnClickListener {startActivity(Intent(this,safatainActivity::class.java))}
        khaisyum.setOnClickListener {startActivity(Intent(this,kaisumActivity::class.java))}
    }
}
