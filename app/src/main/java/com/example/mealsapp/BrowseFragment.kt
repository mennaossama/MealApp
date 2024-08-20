package com.example.mealsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mealsapp.databinding.FragmentBrowseBinding
import com.example.mealsapp.MealModel
import com.example.mealsapp.MealAdapter



class BrowseFragment : Fragment(),MealAdapter.MealClickListener {
    lateinit var binding : FragmentBrowseBinding
    var meals: MutableList<MealModel> = mutableListOf()
    lateinit var mealAdapter: MealAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBrowseBinding.inflate(inflater,container,false)
         meals=mutableListOf(
            MealModel(R.drawable.burger,"Burger"),
            MealModel(R.drawable.filletsteak,"Steak"),
            MealModel(R.drawable.pancakes,"PanCakes"),
            MealModel(R.drawable.pizza,"Pizza"),
            MealModel(R.drawable.shawerma,"Shawerma"),
            MealModel(R.drawable.waffles,"Waffles"),
        )
        mealAdapter=MealAdapter(meals,this)
        binding.rvMeals.adapter=mealAdapter
        return binding.root
    }
    override fun onMealClicked(meal: MealModel) {
        val action = BrowseFragmentDirections.actionBrowseFragmentToMealDetailesFragment(meal)
        findNavController().navigate(action)
    }
}