package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Adapter.CountryAdapter
import com.example.recycleview.Model.Country

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val countryList = ArrayList<Country>()

        countryList.add(
            Country(
                R.drawable.bangladesh_flag,
                R.string.bangladesh_name,
                R.string.bangladesh_short_details,
                R.string.bangladesh_long_details

            )
        )
        countryList.add(Country(R.drawable.india_flag,R.string.india_name,R.string.india_short_details,R.string.india_long_details))
        countryList.add(Country(R.drawable.pakistan_flag,R.string.pakistan_name,R.string.pakistan_short_Details,R.string.pakistan_long_details))
        countryList.add(Country(R.drawable.srilanka_flag,R.string.srilanka_name,R.string.srilanka_short_details,R.string.srilanka_long_details))
        countryList.add(Country(R.drawable.mayanmar_flag,R.string.mayanmar_name,R.string.mayanmar_short_details,R.string.mayanmar_long_details))
        countryList.add(Country(R.drawable.bhutan_flag,R.string.bhutan_name,R.string.bhutan_short_details,R.string.bhutan_long_details))
        countryList.add(Country(R.drawable.south_korea_flag,R.string.south_korea_name,R.string.south_kore_short_details,R.string.south_korea_long_details))
        countryList.add(Country(R.drawable.china_flag,R.string.china_name,R.string.china_short_details,R.string.china_long_details))
        countryList.add(Country(R.drawable.russia_flag,R.string.russia_name,R.string.russia_short_details,R.string.russia_long_details))
        countryList.add(Country(R.drawable.japan_flag,R.string.japan_name,R.string.japan_short_details,R.string.japan_long_details))


        val countryAdapter = CountryAdapter(countryList)
        recyclerView.adapter = countryAdapter
        countryAdapter.setOnItemClickListener {
            val intent = Intent(this@MainActivity,DetailsActivity::class.java)

            intent.putExtra("countryName",it.name)
            intent.putExtra("countryImage",it.image)
            intent.putExtra("countryLongDetails",it.longDetails)

            startActivity(intent)
            //Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        }


    }
}