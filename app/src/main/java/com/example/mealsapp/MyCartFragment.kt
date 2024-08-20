package com.example.mealsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mealsapp.databinding.FragmentMyCartBinding

class MyCartFragment : Fragment() {
    private lateinit var binding : FragmentMyCartBinding
    override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMyCartBinding.inflate(inflater,container,false)
        return binding.root
    }
}