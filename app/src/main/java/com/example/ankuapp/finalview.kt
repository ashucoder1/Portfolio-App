package com.example.ankuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class finalview : AppCompatActivity() {

    private lateinit var imageView: ImageView

    companion object{
        val IMAGE_REQUEST_CODE=100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalview)

        //hide action bar
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        //get values from intent
        //name
        var bundle:Bundle?=intent.extras
        val personname=bundle?.getString("id1")
        val Personname:TextView=findViewById(R.id.personNamefinal)
        Personname.text=personname

        //college
        val collegename=bundle?.getString("id2")
        val Collegename:TextView=findViewById(R.id.collegeNamefinal)
        Collegename.text="College:"+collegename

        //bio
        var bio=bundle?.getString("id3")
        val Bio:TextView=findViewById(R.id.bioFinal)
        Bio.text=bio


        //10th
        var tenthmarks=bundle?.getString("id4")
        val Tenthmarks:TextView=findViewById(R.id.tenthfinal)
        Tenthmarks.text="10th Marks:"+ tenthmarks

        //12th
        var twelthmarks=bundle?.getString("id5")
        val Twelthmarks:TextView=findViewById(R.id.twelthFinal)
        Twelthmarks.text="12th Marks:"+ twelthmarks

        //skill1
        var skill1=bundle?.getString("id6")
        val Skill1:TextView=findViewById(R.id.skill1Final)
        Skill1.text=skill1

        //skill2
        var skill2=bundle?.getString("id7")
        val Skill2:TextView=findViewById(R.id.skill2Final)
        Skill2.text=skill2

        //skill3
        var skill3=bundle?.getString("id8")
        val Skill3:TextView=findViewById(R.id.skill3Final)
        Skill3.text=skill3

        //hobby1
        var hobby1=bundle?.getString("id9")
        val Hobby1:TextView=findViewById(R.id.hobby1Final)
        Hobby1.text=hobby1

        //hobby2
        var hobby2=bundle?.getString("id10")
        val Hobby2:TextView=findViewById(R.id.hobby2Final)
        Hobby2.text=hobby2

        //hobby3
        var hobby3=bundle?.getString("id11")
        val Hobby3:TextView=findViewById(R.id.hobby3Final)
        Hobby3.text=hobby3

        //linkedIN
        var linkedIn=bundle?.getString("id12")
        val LinkedIN:TextView=findViewById(R.id.linkedInFinal)
        LinkedIN.text=linkedIn

        //project 1
        var project1=bundle?.getString("id13")
        val Project1:TextView=findViewById(R.id.project1Final)
        Project1.text=project1

        //project2
        var project2=bundle?.getString("id14")
        val Project2:TextView=findViewById(R.id.project2Final)
        Project2.text=project2

        //aim
        var aim=bundle?.getString("id15")
        val Aim:TextView=findViewById(R.id.aimFinal)
        Aim.text=aim

        //image
        imageView=findViewById(R.id.imageView)

        imageView.setOnClickListener {
           pickImageGallery()
        }

    }
    private fun pickImageGallery(){
        val intent= Intent(Intent.ACTION_PICK)
        intent.type="image/*"
        startActivityForResult(intent,IMAGE_REQUEST_CODE)

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== IMAGE_REQUEST_CODE && resultCode== RESULT_OK){
            imageView.setImageURI(data?.data)
        }
    }
}


