package com.example.rangeseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RangeSeekBar.OnIndicatorChanged {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seek_bar.setOnIndicatorChangedListener(this)
        id_5.setOnClickListener {
            seek_bar.setRange(1, 6, true)
        }
        id_50.setOnClickListener {
            seek_bar.setRange(4, 5, false)
        }
    }

    override fun onLeftIndicatorChanged(value: Int) {
        left.text = "${value}"
    }

    override fun onRightIndicatorChanged(value: Int) {
        right.text = "${value}"
    }
}