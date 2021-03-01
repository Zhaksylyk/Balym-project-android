package com.zhaks.balym.ui.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zhaks.balym.R
import com.zhaks.balym.adapter.DataListAdapter
import com.zhaks.balym.data.model.Data
import com.zhaks.balym.databinding.FragmentDataListBinding
import com.zhaks.balym.util.SwipeToDelete
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator

class DataListFragment : Fragment() {

    private var _binding: FragmentDataListBinding? = null
    private val binding get() = _binding!!
    private val dataListAdapter: DataListAdapter by lazy { DataListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDataListBinding.inflate(inflater, container, false)

        binding.dataListRecyclerView.adapter = dataListAdapter
        binding.dataListRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        dataListAdapter.setData(
            arrayListOf(
                Data(
                    1,
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    1,
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    1,
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    1,
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
            )
        )
        binding.dataListRecyclerView.itemAnimator = SlideInUpAnimator().apply {
            addDuration = 300
        }

        setHasOptionsMenu(true)

        // Swipe to Delete
        swipeToDelete(binding.dataListRecyclerView)

        return binding.root
    }

    private fun swipeToDelete(recyclerView: RecyclerView) {
        val swipeToDeleteCallback = object : SwipeToDelete() {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                dataListAdapter.dataList.removeAt(position)
                dataListAdapter.notifyItemRemoved(position)
                dataListAdapter.notifyItemRangeChanged(position, dataListAdapter.dataList.size)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.create_item_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}