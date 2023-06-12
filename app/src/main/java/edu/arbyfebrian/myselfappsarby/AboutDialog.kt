package edu.arbyfebrian.myselfappsarby

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import edu.arbyfebrian.myselfappsarby.databinding.DialogAboutBinding

//12 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class AboutDialog : DialogFragment() {
    private var _binding: DialogAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        _binding = DialogAboutBinding.inflate(LayoutInflater.from(context))
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        return dialog
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}