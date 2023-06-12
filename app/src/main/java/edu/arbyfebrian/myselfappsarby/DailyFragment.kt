package edu.arbyfebrian.myselfappsarby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.arbyfebrian.myselfappsarby.databinding.FragmentDailyBinding
//10 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class DailyFragment : Fragment() {

    private lateinit var binding: FragmentDailyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // Retrieve arguments if needed
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDailyBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.recyclerView
        val adapter = DailyActivityAdapter(createShapeItems())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter


        val recyclerView2: RecyclerView = binding.recyclerView2
        val adapter2 = FriendActivityAdapter(createShapeItems2())
        recyclerView2.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter2

        return view
    }

    private fun createShapeItems(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.daily_workout, "Olahraga jam 5 Sore"))
        shapeItems.add(ShapeItem(R.drawable.daily_rest, "Istirahat jam 6 Petang"))
        shapeItems.add(ShapeItem(R.drawable.daily_sleep, "Tidur jam 2 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_wakeup, "Bangun jam 4 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_mandi, "Mandi jam 5 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_sarapan2, "Sarapan jam 6 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_repeat, "Daily Repeat"))
        shapeItems.add(ShapeItem(R.drawable.daily_workout, "Olahraga jam 5 Sore"))
        shapeItems.add(ShapeItem(R.drawable.daily_rest, "Istirahat jam 6 Petang"))
        shapeItems.add(ShapeItem(R.drawable.daily_sleep, "Tidur jam 2 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_wakeup, "Bangun jam 4 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_mandi, "Mandi jam 5 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_sarapan2, "Sarapan jam 6 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_repeat, "Daily Repeat"))


        return shapeItems
    }

    private fun createShapeItems2(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.fl_rafly, "Rafly"))
        shapeItems.add(ShapeItem(R.drawable.fl_david, "David"))
        shapeItems.add(ShapeItem(R.drawable.fl_ghifar, "Ghifar"))
        shapeItems.add(ShapeItem(R.drawable.fl_dimass, "Dimas"))
        shapeItems.add(ShapeItem(R.drawable.fl_hanung, "Hanung"))
        shapeItems.add(ShapeItem(R.drawable.fl_zulfik, "Zulfikar"))
        shapeItems.add(ShapeItem(R.drawable.fl_gadingg, "Gading"))
        shapeItems.add(ShapeItem(R.drawable.fl_yanwar, "Yanwar"))
        shapeItems.add(ShapeItem(R.drawable.fl_cindy, "Cindy"))
        shapeItems.add(ShapeItem(R.drawable.fl_kayla, "Kayla"))
        shapeItems.add(ShapeItem(R.drawable.fl_rivaldy, "Rivaldy"))


        return shapeItems
    }

    data class ShapeItem(val shapeRes: Int, val text: String)

}