package com.kayise.petpalconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView


class MainActivity2 : AppCompatActivity() {

    private lateinit var petImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




        //Declaration of the buttons
        val feedButton = findViewById<Button>(R.id.feedbutton)
        val playButton = findViewById<Button>(R.id.playbutton)
        val cleanButton = findViewById<Button>(R.id.cleanbutton)
        val image = findViewById<ImageView>(R.id.petImage)


        //Initialization of Feed button
        feedButton.setOnClickListener{
            Log.i( "buttonClicked", "Feed button clicked")

            //make the image change
            image.setImageResource(R.drawable.eating)

            //Initialization of the Play Button
            playButton.setOnClickListener {
                Log.i( "buttonClicked", "Play button clicked")

                //make the image change
                image.setImageResource(R.drawable.playing)

                //Initialization of the Clean Button
                cleanButton.setOnClickListener {
                    Log.i( "buttonClicked", "Clean button clicked")

                    //make the image change
                    image.setImageResource(R.drawable.bathing)
                }
            }

        }


    }
}
