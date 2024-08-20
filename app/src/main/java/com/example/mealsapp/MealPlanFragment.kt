package com.example.mealsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mealsapp.databinding.FragmentMealPlanBinding
import com.example.mealsapp.databinding.FragmentMyCartBinding

class MealPlanFragment : Fragment() {


    private lateinit var binding : FragmentMealPlanBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMealPlanBinding.inflate(inflater,container,false)
        return binding.root
    }
    }



