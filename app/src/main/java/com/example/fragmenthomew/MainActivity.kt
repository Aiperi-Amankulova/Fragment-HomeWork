package com.example.fragmenthomew


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(), FragmentL {

    private var btnAdd: Button?=null

    private var replaceFragments = ReplaceFragments()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd=findViewById(R.id.btnAdd)
        forAdd()


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
                .replace(R.id.fragmentInActivity, replaceFragments)
                .commit()
    }

    override fun forRemove() {
        supportFragmentManager
                .beginTransaction()
                .remove(replaceFragments )
                .commit()
    }


}