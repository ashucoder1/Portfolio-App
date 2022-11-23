package com.example.ankuapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class template_selection : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template_selection)

        //get all variable
        var personname:TextView=findViewById(R.id.personName)
        var collegename:TextView=findViewById(R.id.collegeName)
        var aim:TextView=findViewById(R.id.yourTarget)
        var tenthmarks:TextView=findViewById(R.id.tenthMarks)
        var twelthmarks:TextView=findViewById(R.id.twelthMarks)
        var skill1:TextView=findViewById(R.id.skill1)
        var skill2:TextView=findViewById(R.id.skill2)
        var skill3:TextView=findViewById(R.id.skill3)
        var hobby1:TextView=findViewById(R.id.hobby1)
        var hobby2:TextView=findViewById(R.id.hobby2)
        var hobby3:TextView=findViewById(R.id.hobby3)
        var project1:TextView=findViewById(R.id.project1)
        var project2:TextView=findViewById(R.id.project2)
        var bio:TextView=findViewById(R.id.yourBio)
        var linkedin:TextView=findViewById(R.id.linkedIn)



        //image import



        //finaltickbtn inatialize
        var tickbtn:FloatingActionButton=findViewById(R.id.tickBtn)

        tickbtn.setOnClickListener{

            //convert to string and int
            var personnameText=personname.text.toString()
            var collegenameText=collegename.text.toString()
            var bioText=bio.text.toString()
            var tenthmarksText=tenthmarks.text.toString()
            var twelthmarksText=twelthmarks.text.toString()
            var skill1Text=skill1.text.toString()
            var skill2Text=skill2.text.toString()
            var skill3Text=skill3.text.toString()
            var hobby1Text=hobby1.text.toString()
            var hobby2Text=hobby2.text.toString()
            var hobby3Text=hobby3.text.toString()
            var linkedInText=linkedin.text.toString()
            var project1Text=project1.text.toString()
            var project2Text=project2.text.toString()
            var aimText=aim.text.toString()



            //new intent and its location
            val intent=Intent(this,finalview::class.java)

            //loading data to intent of each variable
            intent.putExtra("id1",personnameText)
            intent.putExtra("id2",collegenameText)
            intent.putExtra("id3",bioText)
            intent.putExtra("id4",tenthmarksText)
            intent.putExtra("id5",twelthmarksText)
            intent.putExtra("id6",skill1Text)
            intent.putExtra("id7",skill2Text)
            intent.putExtra("id8",skill3Text)
            intent.putExtra("id9",hobby1Text)
            intent.putExtra("id10",hobby2Text)
            intent.putExtra("id11",hobby3Text)
            intent.putExtra("id12",linkedInText)
            intent.putExtra("id13",project1Text)
            intent.putExtra("id14",project2Text)
            intent.putExtra("id15",aimText)


            startActivity(intent)                                //start of next intent screen


        }
        }

}