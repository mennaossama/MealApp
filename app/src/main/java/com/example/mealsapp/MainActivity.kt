package com.example.mealsapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mealsapp.databinding.ActivityLoginBinding
import com.example.mealsapp.databinding.ActivityMainBinding
import com.example.mealsapp.ui.theme.MealsAppTheme

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        val fragHost = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = fragHost.navController
        setupWithNavController(binding.bottomNavigation, navController)

        binding.floatingbutton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
            }
                startActivity(intent)
        }
}
}