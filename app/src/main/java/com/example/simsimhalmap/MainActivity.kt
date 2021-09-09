package com.example.simsimhalmap

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        map_btn.setOnClickListener(this)
        nfc_btn.setOnClickListener(this)
        bus_btn.setOnClickListener(this)
        train_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.map_btn -> {
                val intent = Intent(this, MapActivity::class.java)
                startActivity(intent)
            }
            R.id.nfc_btn -> {
                val intent = Intent(this, NfcActivity::class.java)
                startActivity(intent)
            }
            R.id.bus_btn -> {
                val intent = Intent(this, BusActivity::class.java)
                startActivity(intent)
            }
            R.id.train_btn -> {
                val intent = Intent(this, TrainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}