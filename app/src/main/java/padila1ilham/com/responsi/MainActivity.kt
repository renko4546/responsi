package padila1ilham.com.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login1.setOnClickListener(){
            intent= Intent(this,activity_main2::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language_value"language)
            startActivity(intent)
        }
    }
}
