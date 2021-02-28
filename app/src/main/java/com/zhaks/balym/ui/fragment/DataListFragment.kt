package com.zhaks.balym.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.zhaks.balym.R
import com.zhaks.balym.adapter.DataListAdapter
import com.zhaks.balym.data.model.Data
import com.zhaks.balym.databinding.FragmentDataListBinding

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
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
                Data(
                    "ASASAS",
                    "18.02.2020",
                    "sfaefefe@gmail.com",
                    2
                ),
            )
        )

        return binding.root
    }
}