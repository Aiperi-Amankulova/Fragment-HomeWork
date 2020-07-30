package com.example.fragmenthomew

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

@Suppress("UNREACHABLE_CODE")
class RemoveFragments: Fragment() {

    private var list: FragmentL? = null
    private var btnRemove: Button? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        list= context as FragmentL
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.remove_fragments, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRemove = view.findViewById(R.id.btnRemove)

        btnRemove?.setOnClickListener {
            list?.forRemove()
        }
    }
}