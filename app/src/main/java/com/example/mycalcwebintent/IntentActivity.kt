package com.example.mycalcwebintent

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var btncamera:Button
    lateinit var btncall:Button
    lateinit var btnshare:Button
    lateinit var btnstk:Button
    lateinit var btnsms:Button
    lateinit var btndial:Button
    lateinit var btnemail:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        btncamera=findViewById(R.id.btn_camera)
        btncall=findViewById(R.id.btn_call)
        btnshare=findViewById(R.id.btn_share)
        btnstk=findViewById(R.id.btn_stk)
        btnsms=findViewById(R.id.btn_sms)
        btndial=findViewById(R.id.btn_dial)
        btnemail=findViewById(R.id.btn_email)

        btncamera.setOnClickListener {
            val takepic=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takepic,1)

        }
        btncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254701575518"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }
        btnshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }
        btnstk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        btnsms.setOnClickListener {
            val uri=Uri.parse("smsto:0701575518")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Hello","Good morning")
            startActivity(intent)
        }
        btndial.setOnClickListener {
            val nambari="+254786358527"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts("Tel",nambari,null))
            startActivity(intent)
        }
        btnemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
            
        }
    }
}