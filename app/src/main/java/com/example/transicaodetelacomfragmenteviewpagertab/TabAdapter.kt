package com.example.transicaodetelacomfragmenteviewpagertab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
     return when(position){
          0 -> PrimeiraFragment()
          1 -> SegundaFragment()
         else -> PrimeiraFragment()
      }
    }

    override fun getItemCount(): Int {
        return 2
    }




}