package binar.andlima.challengech03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen2.*

class Screen2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pergi_screen3.setOnClickListener {

            // mengambil data nama yang di inputkan oleh user
            val nm = masukan_nama.text.toString()

            // berpindah dan mengirim data ke screen 3
            val data = DataClass(nm, null,null,null)
            val dataNama = bundleOf("DATADIRI" to data)
            Navigation.findNavController(view).navigate(R.id.go_screen3, dataNama)
        }
    }

}