package nacc.sergey.testforfocusstart.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import nacc.sergey.testforfocusstart.R
import nacc.sergey.testforfocusstart.model.Currency

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var currencyList = emptyList<Currency>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.short_name_currency.text = currencyList[position].charCode
        holder.itemView.name_currency.text = currencyList[position].name
        holder.itemView.value_currency.text = currencyList[position].value.toString()
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }

    @SuppressLint("notifyDataSetChanged")
    fun setList(list: List<Currency>) {
        currencyList = list
        notifyDataSetChanged()
    }

}