package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.practice.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.butonAGecis.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gecis_a)
        }

        binding.butonXGecis.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gecis_x)
        }


        return binding.root
    }
}
