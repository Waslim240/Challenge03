package binar.andlima.challengech03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen3.*


class Screen3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // menerima data nama dari screen 2
        val nama = arguments?.getParcelable<DataClass>("DATADIRI") as DataClass

        //menerima data dari screen 4
        val data = arguments?.getParcelable("DATADIRI") as DataClass?

        //cek kondisi jika data null
        if (data?.usia == null){
            untuk_nama2.text = nama.nama
        } else {
            untuk_nama.text = data.nama
            untuk_usia.text = data.usia
            untuk_alamat.text = data.alamat
            untuk_pekerjaan.text = data.pekerjaan
        }

//        if (data != null){
//            untuk_nama.text = data.nama
//            untuk_usia.text = data.usia
//            untuk_alamat.text = data.alamat
//            untuk_pekerjaan.text = data.pekerjaan
//        }

        pergi_screen4.setOnClickListener {

            //berpindah dan mengirim data dari screen 3 ke screen 4
            val dataNama = DataClass(nama.nama, null, null, null)
            val dataDiri = bundleOf("DATADIRI" to dataNama)
            Navigation.findNavController(view).navigate(R.id.go_screen4, dataDiri)

        }
    }


}