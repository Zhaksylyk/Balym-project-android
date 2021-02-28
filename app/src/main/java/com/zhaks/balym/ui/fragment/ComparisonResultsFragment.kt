package com.zhaks.balym.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhaks.balym.databinding.FragmentComparisonResultsBinding


class ComparisonResultsFragment : Fragment() {

    private var _binding: FragmentComparisonResultsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentComparisonResultsBinding.inflate(inflater, container, false)


        return binding.root
    }
}