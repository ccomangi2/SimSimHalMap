package com.example.simsimhalmap

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_map.*
import net.daum.mf.map.api.MapView

class MapActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)


        val mapView = MapView(this)
        val mapViewContainer = map_view as ViewGroup

        mapViewContainer.addView(mapView)
    }

    override fun onClick(v: View?) {
        when(v?.id) {

        }
    }
}