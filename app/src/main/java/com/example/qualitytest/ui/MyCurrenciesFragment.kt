package com.example.qualitytest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.qualitytest.R
import com.example.qualitytest.databinding.FragmentMyCurrenciesBinding

class MyCurrenciesFragment : Fragment(R.layout.fragment_my_currencies) {

    private var _binding: FragmentMyCurrenciesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMyCurrenciesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}