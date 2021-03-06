package alura.com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class Splachscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splachscreen)

        val background = object : Thread(){
            override fun run() {

                    try {
                        Thread.sleep(2000)
                        val intent = Intent(baseContext, Home::class.java)
                        startActivity(intent)
                    } catch (e: Exception){
                        e.printStackTrace()

                    }
                }
            }

            background.start()
        }
    }
