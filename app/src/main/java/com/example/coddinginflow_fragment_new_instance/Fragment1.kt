package com.example.coddinginflow_fragment_new_instance


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fragment_1.view.*


class Fragment1 : Fragment() {

    companion object {
        const val ARG_TEXT = "argText"
        const val ARG_NUM = "argNum"
    }

    private var text1=""
    private var num1=2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_fragment_1, container, false)
      if (arguments!=null){
           text1= arguments!!.getString(ARG_TEXT)
           num1= arguments!!.getInt(ARG_NUM)
      }

    //    view.text_view_fragment.text=" Hi I Come Again"
        view.text_view_fragment.text=" $text1  $num1  "
        return view
    }

    fun newInstance( text:String, num:Int):Fragment1{
        var fragment1=Fragment1()
        var args=Bundle()
        args.putString(ARG_TEXT,text)
        args.putInt(ARG_NUM,num)
        fragment1.arguments=args
        return fragment1
    }
}
