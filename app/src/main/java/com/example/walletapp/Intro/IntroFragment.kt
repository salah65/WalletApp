package com.example.walletapp.Intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.walletapp.R
import com.example.walletapp.databinding.IntroFragmentBinding

class IntroFragment : Fragment() {
    private var _binding: IntroFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = IntroFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener { findNavController().navigate(R.id.action_introFragment_to_homeFragment) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}