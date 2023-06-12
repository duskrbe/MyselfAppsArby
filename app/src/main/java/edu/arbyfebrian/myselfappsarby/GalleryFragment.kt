package edu.arbyfebrian.myselfappsarby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.arbyfebrian.myselfappsarby.databinding.FragmentGalleryBinding


//10 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2,RecyclerView.VERTICAL, false)
        recyclerView.adapter = GalleryActivityAdapter(getImageList())

        return view
    }

    private fun getImageList(): List<Int> {
        return listOf(
            R.drawable.ft_1,
            R.drawable.ft_2,
            R.drawable.ft_3,
            R.drawable.ft_12,
            R.drawable.ft_4,
            R.drawable.ft_5,
            R.drawable.ft_6,
            R.drawable.ft_8,
            R.drawable.ft_9,
            R.drawable.ft_10,
            R.drawable.profile_picture_1,
            R.drawable.profile_picture_2,
        )
    }
}