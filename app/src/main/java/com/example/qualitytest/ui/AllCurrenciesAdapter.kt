package com.example.qualitytest.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qualitytest.R
import com.example.qualitytest.data.local.model.LocalFavouriteData
import kotlinx.android.synthetic.main.item_all_currencies.view.*

class AllCurrenciesAdapter(private val onItemClicked: () -> Unit) :
    RecyclerView.Adapter<AllCurrenciesAdapter.ViewHolder>() {

    private val items = mutableListOf<LocalFavouriteData>()

    fun addItems(listOfItems: List<LocalFavouriteData>) {
        items.addAll(listOfItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        View.inflate(parent.context, R.layout.item_all_currencies, null)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        with(holder.itemView) {
            setOnClickListener { onItemClicked.invoke() }
        }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: LocalFavouriteData) =
            with(itemView) {
                all_currency_name.text = item.rates.toString()
            }
    }
}