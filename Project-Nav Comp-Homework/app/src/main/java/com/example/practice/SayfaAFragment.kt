package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.practice.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var binding:FragmentSayfaABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentSayfaABinding.inflate(inflater, container, false)


        binding.butonBGecis.setOnClickListener{
           Navigation.findNavController(it).navigate(R.id.gecis_B)
        }




        return binding.root
    }
}
