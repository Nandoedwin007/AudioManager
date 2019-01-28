package com.example.edwincoronado.audiomanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AudioMain : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_main)

        val btnmodo= findViewById<Button>(R.id.btnModo)
        val btnring= findViewById<Button>(R.id.btnRing)
        val btnsilencio= findViewById<Button>(R.id.btnSilencio)
        val btnvibrar= findViewById<Button>(R.id.btnVibrar)
        

    }
}
