package com.example.edwincoronado.audiomanager

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.media.AudioManager.*
import android.provider.MediaStore
import android.view.View
import android.widget.Toast


class AudioMain : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_main)

        val btnmodo= findViewById<Button>(R.id.btnModo)
        val btnring= findViewById<Button>(R.id.btnRing)
        val btnsilencio= findViewById<Button>(R.id.btnSilencio)
        val btnvibrar= findViewById<Button>(R.id.btnVibrar)

        val myAudioManager:AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        btnring.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                myAudioManager.ringerMode = AudioManager.RINGER_MODE_NORMAL
                Toast.makeText(getBaseContext(), "Se ha colocado en modo sonido", Toast.LENGTH_LONG).show()

            }
        })

        btnsilencio.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                myAudioManager.ringerMode = AudioManager.RINGER_MODE_SILENT
                Toast.makeText(getBaseContext(), "Se ha colocado en modo silencio", Toast.LENGTH_LONG).show()

            }
        })

        btnvibrar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                myAudioManager.ringerMode = AudioManager.RINGER_MODE_VIBRATE
                Toast.makeText(getBaseContext(), "Se ha colocado en modo vibración", Toast.LENGTH_LONG).show()

            }
        })

        btnmodo.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val modo = myAudioManager.ringerMode
                if (modo==AudioManager.RINGER_MODE_VIBRATE){
                    Toast.makeText(getBaseContext(), "El dispositivo se encuentra en modo VIBRADOR", Toast.LENGTH_LONG).show()
                }
                else if (modo==AudioManager.RINGER_MODE_NORMAL){
                    Toast.makeText(getBaseContext(), "El dispositivo se encuentra en modo SONIDO", Toast.LENGTH_LONG).show()
                }
                else if (modo==AudioManager.RINGER_MODE_SILENT){
                    Toast.makeText(getBaseContext(), "El dispositivo se encuentra en modo SILENCIO", Toast.LENGTH_LONG).show()
                }


            }
        })

    }
}
