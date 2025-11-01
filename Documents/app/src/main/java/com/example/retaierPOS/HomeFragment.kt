package com.example.retailerPOS

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.retaierPOS.R
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnAddProduct = view.findViewById<MaterialButton>(R.id.btnAddProduct)
        val btnReports = view.findViewById<MaterialButton>(R.id.btnReports)

        btnAddProduct.setOnClickListener {
            Toast.makeText(requireContext(), "Add Product clicked", Toast.LENGTH_SHORT).show()
        }

        btnReports.setOnClickListener {
            Toast.makeText(requireContext(), "Reports clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}

