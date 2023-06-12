package edu.arbyfebrian.myselfappsarby

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//9 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments = listOf(
        Walkthrough1Fragment(),
        Walkthrough2Fragment(),
        Walkthrough3Fragment()
    )


    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }
    override fun getCount(): Int {
        return fragments.size
    }



}