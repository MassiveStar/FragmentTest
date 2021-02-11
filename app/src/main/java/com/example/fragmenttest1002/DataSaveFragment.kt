package com.example.fragmenttest1002

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fragmenttest1002.databinding.FragmentDataSaveBinding

/**
 * A simple [Fragment] subclass.
 * Use the [DataSaveFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DataSaveFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDataSaveBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_data_save,container,false)

        binding.volverInicioButton.setOnClickListener {
            it.findNavController().
            navigate(DataSaveFragmentDirections.actionDataSaveFragmentToWelcomeFragment())
        }

        val args = DataSaveFragmentArgs.fromBundle(requireArguments())

        binding.apply {
            nombreIngresadoText.text = args.nombreArg
            fechaIngresadoText.text = args.fechaNacimientoArg
            passwordIngresadoText.text = args.passwordArg
        }

        return binding.root
    }
}