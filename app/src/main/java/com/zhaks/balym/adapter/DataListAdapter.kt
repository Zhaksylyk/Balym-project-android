package com.zhaks.balym.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.zhaks.balym.data.model.Data
import com.zhaks.balym.databinding.DataCardBinding
import com.zhaks.balym.util.MainDiffUtil
import com.zhaks.balym.view.OnSelectItem

class DataListAdapter(val iOnSelectItem: OnSelectItem) : RecyclerView.Adapter<DataListAdapter.DataListViewHolder>() {

    val dataList = mutableListOf<Data>()

    inner class DataListViewHolder(val binding: DataCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data) {
            binding.data = data
            binding.executePendingBindings()

            binding.card.setOnClickListener {
                iOnSelectItem.selectItem(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataCardBinding.inflate(layoutInflater, parent, false)
        return DataListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataListViewHolder, position: Int) {
        val data: Data = dataList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = dataList.size

    fun setData(dataList: ArrayList<Data>) {
        val dataDiffUtil = MainDiffUtil(dataList, dataList)
        val demoDiffResult = DiffUtil.calculateDiff(dataDiffUtil)
        this.dataList.clear()
        this.dataList.addAll(dataList)
        demoDiffResult.dispatchUpdatesTo(this)
    }
}