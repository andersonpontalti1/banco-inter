package alura.com.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*


class Home : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //chamando a proxima activity
        button_conta.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            //validation CPF/CNPJ
            val regex = Regex("/(^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}\$)|(^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}\$)/")
            println(regex.containsMatchIn("123.456.789-11"))




        }

    }

}

