package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.practice.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

    private lateinit var binding:FragmentSayfaYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding=FragmentSayfaYBinding.inflate(inflater, container, false)



        val backpress= object : OnBackPressedCallback(true){
            override fun handleOnBackPressed(){
                //geri tuşuna basaıldığında yapılacak işlemler bu süslü parantez arasına yazılır.
                Navigation.findNavController(binding.textView2).navigate(R.id.y_to_anasayfa)

            }
        }
            


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backpress)



        return binding.root



    }




}





