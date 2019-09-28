package com.example.panduantajwiddanmakhroj
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.mad.*

class madActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mad)
        tobii.setOnClickListener {startActivity(Intent(this,tobiiActivity::class.java))}
        fari.setOnClickListener {startActivity(Intent(this,fariiActivity::class.java))}
    }
}
