package com.example.yzdehesaplayc

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


        fun About(view: View) {
            Toast.makeText(this@MainActivity, getString(R.string.AuthorText)+getString(R.string.authorname), Toast.LENGTH_SHORT).show()
            println("hakkinda çağrıldı")
    }

    fun Hesapla(view: View) {
        val sayiobj : TextView = findViewById(R.id.sayi)
        val yuzdeobj : TextView = findViewById(R.id.yuzde)
        val sonucobj : TextView = findViewById(R.id.sonuc)
        sonucobj.text = (getString(R.string.result)+(sayiobj.text.toString().toDouble()*yuzdeobj.text.toString().toDouble())/100).toString()
        println("Başarılı")
    }

}


