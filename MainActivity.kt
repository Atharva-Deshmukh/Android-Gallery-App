package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ye apni main image display screen ka variable hai
        var imagedisplay=findViewById<ImageView>(R.id.imageview)


        //abhi yaha likho ki jis bhi image ko click kiya vo green background me display ho

        //image 1 ke liye
        var img1=findViewById<ImageView>(R.id.image1)
        img1.setOnClickListener {

            //isko dabaane pe image view (imagedisplay) aana chaiye
            imagedisplay.setImageResource(R.drawable.g)
        }

        //image 2 ke liye
        var img2=findViewById<ImageView>(R.id.image2)
        img2.setOnClickListener {

            //isko dabaane pe image view (imagedisplay) aana chaiye
            imagedisplay.setImageResource(R.drawable.string)
        }

        //image 3 ke liye
        var img3=findViewById<ImageView>(R.id.image3)
        img3.setOnClickListener {

            //isko dabaane pe image view (imagedisplay) aana chaiye
            imagedisplay.setImageResource(R.drawable.images)
        }

        //image 4 ke liye
        var img4=findViewById<ImageView>(R.id.image4)
        img4.setOnClickListener {

            //isko dabaane pe image view (imagedisplay) aana chaiye
            imagedisplay.setImageResource(R.drawable.zd)
        }

        //image 5 ke liye
        var img5=findViewById<ImageView>(R.id.image5)
        img5.setOnClickListener {

            //isko dabaane pe image view (imagedisplay) aana chaiye
            imagedisplay.setImageResource(R.drawable.matrix)
        }

    }
}