package com.example.coddinginflow_fragment_new_instance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val ARG_TEXT="argText"
    val ARG_NUM="argNum"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val fragment=Fragment1().newInstance("new one",10)

      /*  var args=Bundle()
        args.putString(ARG_TEXT," example text ")
        args.putInt(ARG_NUM,123)
        myFragment.arguments=args*/

        supportFragmentManager.beginTransaction().replace(R.id.main_container,fragment).commit()
    }
}
