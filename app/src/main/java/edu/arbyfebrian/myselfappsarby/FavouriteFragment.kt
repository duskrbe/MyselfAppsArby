package edu.arbyfebrian.myselfappsarby
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import edu.arbyfebrian.myselfappsarby.databinding.FragmentFavouriteBinding

//10 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class FavouriteFragment : Fragment() {

    private lateinit var binding: FragmentFavouriteBinding

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
        binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.rv1
        val adapter = FavouriteMusicActivityAdapter(createShapeItems())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val youTubePlayerView: YouTubePlayerView = binding.youtubePlayerView
        lifecycle.addObserver(youTubePlayerView)

        val videoId = "1If81Irp-gU" // Replace with your YouTube video ID
        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })

        return view
    }

    private fun createShapeItems(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.msc_44p, "Hurricane", "44Phantom"))
        shapeItems.add(ShapeItem(R.drawable.msc_lontalius, "Sleep Thru Ur Alarms", "Lontalius"))
        shapeItems.add(ShapeItem(R.drawable.msc_octane, "Octane","Until I Wake"))
        shapeItems.add(ShapeItem(R.drawable.msc_lost, "LosT","Bring Me The Horizon"))
        shapeItems.add(ShapeItem(R.drawable.msc_koiiro, "Koiiro","Mosawo"))


        return shapeItems
    }

    data class ShapeItem(val shapeRes: Int, val title: String, val artist: String)

}