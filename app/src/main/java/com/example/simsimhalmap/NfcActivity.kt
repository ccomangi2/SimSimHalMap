package com.example.simsimhalmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_nfc.*
import net.daum.mf.map.api.MapView

class NfcActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nfc)

    }

    override fun onClick(v: View?) {
        when(v?.id) {

        }
    }
}