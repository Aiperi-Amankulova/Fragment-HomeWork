package com.example.fragmenthomew


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(), FragmentL {

    private var removeFragments = RemoveFragments()
    private var btnAdd: Button?=null 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewId()
        onClick()
        forAdd()
    }

    private fun viewId() {
        btnAdd=findViewById(R.id.btnAdd)
    }

    private fun onClick() {
        btnAdd?.setOnClickListener {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentInActivity, ReplaceFragments())
                    .commit()
        }
    }

    override fun forAdd() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentInActivity, removeFragments)
                .commit()
    }

    override fun forRemove() {
        supportFragmentManager
                .beginTransaction()
                .remove(removeFragments)
                .commit()
    }
}