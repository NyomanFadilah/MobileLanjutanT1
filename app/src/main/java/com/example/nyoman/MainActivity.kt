package com.example.nyoman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn)
        val btnIntentData = findViewById<Button>(R.id.btn2)
        val btnIntentObjek = findViewById<Button>(R.id.btn3)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.btn -> run {
                val intentBiasa =  Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(intentBiasa)
    }
            R.id.btn2 -> run {
                val  intentData = Intent(this@MainActivity,  PindahDataActivity::class.java)
                intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "Halo, saya Nyoman Fadilah")
                startActivity(intentData)
            }
            R.id.btn3 -> run {
                val cars = Cars(
                    "Toyota Yaris",
                    2020,
                    "BM 2020 SAR"
                )
                val intentObjek = Intent(this@MainActivity, PindahObjekActivity::class.java)
                intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS, cars)
                startActivity(intentObjek)
            }
}}}