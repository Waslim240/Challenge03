package binar.andlima.challengech03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen4.*

class Screen4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menerima data dari secreen 3
        val nama = arguments?.getParcelable<DataClass>("DATADIRI") as DataClass

        back_screen3.setOnClickListener {
            //mengambil data yang di inputkan oleh user
            val umur = masukan_usia.text.toString().toInt()
            val almt = masukan_alamat.text.toString()
            val pkrj = masukan_pekerjaan.text.toString()

            //berpindah dan mengirim data ke screen 3
            val data = DataClass(nama.nama, umur.toString(), almt, pkrj)
            val dataDiri = bundleOf("DATADIRI" to data)
            Navigation.findNavController(view).navigate(R.id.back_screen3, dataDiri)
        }
    }

}