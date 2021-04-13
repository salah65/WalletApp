package com.example.walletapp.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.walletapp.R
import com.example.walletapp.databinding.HomeFragmentBinding


class HomeFragment : Fragment(R.layout.home_fragment) {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val snapHelper: SnapHelper = PagerSnapHelper()
        val snapHelper2: SnapHelper = PagerSnapHelper()
        binding.cardsRv.adapter = CardsAdapter()
        snapHelper.attachToRecyclerView(binding.cardsRv)
        binding.activitiesRv.adapter=ActivitiesAdapter()
        snapHelper2.attachToRecyclerView(binding.activitiesRv)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}