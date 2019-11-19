package padila1ilham.com.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle:Bundle=intent.extras
        val id=Bundle.get("id_value")
        val language = bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG).show()

    }
}
