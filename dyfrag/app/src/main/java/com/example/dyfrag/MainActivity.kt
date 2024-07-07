package com.example.dyfrag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.dyfrag.databinding.ActivityMainBinding
import com.example.dyfrag.databinding.FragmentOneBinding
import com.example.dyfrag.databinding.FragmentTwoBinding

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentManager:FragmentManager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bf1.setOnClickListener {
            goToFragment(FragmentOne())
        }
        binding.bf2.setOnClickListener {
            goToFragment(FragmentTwo())
        }
    }
    private fun goToFragment(fragment: Fragment) {
        fragmentManager=supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }
}