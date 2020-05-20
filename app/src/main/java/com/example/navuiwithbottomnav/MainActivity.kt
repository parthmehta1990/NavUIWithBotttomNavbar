package com.example.navuiwithbottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

import androidx.navigation.fragment.NavHostFragment
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.fragment.app.Fragment
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting the Navigation Controller
        navController=Navigation.findNavController(this,R.id.nav_host_fragment)

        //Setting the navigation controller to Bottom Nav
        bottom_nav!!.setupWithNavController(navController)

        //Setting up the action bar
        //NavigationUI.setupActionBarWithNavController(this,navController)
    }

    //Setting Up the back button
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }

    /*
    * NOTE:
    * To Apply navigation in bottom navigation usig Navigation UI controller make sure that menu file id
    * are same as navigation graph file's fragment id
    *
    * */
}
