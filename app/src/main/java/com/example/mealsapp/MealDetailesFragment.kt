package com.example.mealsapp
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.mealsapp.databinding.FragmentMealDetailesBinding
import com.example.mealsapp.databinding.FragmentMyCartBinding

class MealDetailesFragment : Fragment() {

    private lateinit var binding : FragmentMealDetailesBinding
    private val args: MealDetailesFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMealDetailesBinding.inflate(inflater,container,false)
        val meal = args.meals
        binding.mealimg.setImageResource(meal.image)
        binding.mealtitle.text=meal.title
        return binding.root
    }
}
