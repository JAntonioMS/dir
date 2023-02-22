package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.RowListedadBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model.ListedadRowModel
import kotlin.Int
import kotlin.collections.List

class ListedadAdapter(
  var list: List<ListedadRowModel>
) : RecyclerView.Adapter<ListedadAdapter.RowListedadVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListedadVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listedad,parent,false)
    return RowListedadVH(view)
  }

  override fun onBindViewHolder(holder: RowListedadVH, position: Int) {
    val listedadRowModel = ListedadRowModel()
    // TODO uncomment following line after integration with data source
    // val listedadRowModel = list[position]
    holder.binding.listedadRowModel = listedadRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListedadRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListedadRowModel
    ) {
    }
  }

  inner class RowListedadVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListedadBinding = RowListedadBinding.bind(itemView)
  }
}
