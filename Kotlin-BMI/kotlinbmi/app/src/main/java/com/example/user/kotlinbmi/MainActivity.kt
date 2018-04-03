package com.example.user.kotlinbmi

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var ButtonEnter: Button? = null
    var ButtonClean: Button? = null
    var textview_Name: TextView? = null
    var textview_Weight: TextView? = null
    var textview_Height: TextView? = null
    var edittext_Name: EditText? = null
    var edittext_Weight: EditText? = null
    var edittext_Height: EditText? = null
    private var mListeners: ArrayList<TextWatcher>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setAllView()

        this.ButtonEnter?.setOnClickListener {

            edittext_Name?.text
            var WeightResult: Bundle? = edittext_Weight?.getInputExtras()
            edittext_Height?.text.toString().trim()

            Log.d("BT ", "ID = " + this.ButtonEnter?.id +
                    edittext_Name?.text +
                    edittext_Weight?.text.toString().trim() +
                    edittext_Height?.text.toString().trim())
        }

        this.ButtonClean?.setOnClickListener {
            Log.d("BT ", "ID = " + this.ButtonClean?.id)

            edittext_Name?.setText("")
            edittext_Weight?.setText("")
            edittext_Height?.setText("")
        }
        edittext_Weight?.addTextChangedListener(new TextWatcher)

        }
    }

    fun setAllView() {
        ButtonEnter = this.findViewById(R.id.bt_enter)
        ButtonClean = this.findViewById(R.id.bt_clean)
        textview_Name = this.findViewById(R.id.tv_name)
        textview_Weight= this.findViewById(R.id.tv_weight)
        textview_Height = this.findViewById(R.id.tv_height)
        edittext_Name = this.findViewById(R.id.et_name)
        edittext_Weight= this.findViewById(R.id.et_weight)
        edittext_Height = this.findViewById(R.id.et_hight)
    }

}

private fun EditText.getInputExtras(): Bundle? {

}
