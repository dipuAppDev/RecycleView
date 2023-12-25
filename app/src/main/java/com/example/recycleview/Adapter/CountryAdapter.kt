package com.example.recycleview.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Model.Country
import com.example.recycleview.R


class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        val listItemPosition = countryList[position]
        holder.image.setImageResource(listItemPosition.image)
        holder.name.setText(listItemPosition.name)
        holder.shortDetails.setText(listItemPosition.shortDetails)

        holder.itemView.setOnClickListener {
            onItemClickListener?.let {
                it(listItemPosition)
            }
        }

    }
    private var onItemClickListener : ((Country)->Unit)?=null
    fun setOnItemClickListener(listener:(Country)->Unit){
        onItemClickListener = listener
    }
}

class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val image: ImageView = view.findViewById(R.id.countryImage)
    val name: TextView = view.findViewById(R.id.countryName)
    val shortDetails: TextView = view.findViewById(R.id.countryShortDetails)


}