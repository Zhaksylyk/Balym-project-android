package com.zhaks.balym.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zhaks.balym.R
import com.zhaks.balym.adapter.DataListAdapter
import com.zhaks.balym.databinding.FragmentDatabaseListBinding

class DatabaseListFragment : Fragment() {

    private var _binding: FragmentDatabaseListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDatabaseListBinding.inflate(inflater, container, false)

        return binding.root
    }
}