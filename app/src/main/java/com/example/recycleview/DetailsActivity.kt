package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailsActivity : AppCompatActivity() {
    private lateinit var countryName:TextView
    private lateinit var countryImage:ImageView
    private lateinit var countryLongDetails:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        countryName = findViewById(R.id.countryNameD)
        countryName.setText(intent.getIntExtra("countryName",0))
        countryImage = findViewById(R.id.countryImageD)
        countryImage.setImageResource(intent.getIntExtra("countryImage",0))
        countryLongDetails = findViewById(R.id.countryLongDetails)
        countryLongDetails.setText(intent.getIntExtra("countryLongDetails",0))


    }
}