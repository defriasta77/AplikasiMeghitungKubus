package id.ac.polbeng.defri.aplikasimenghitungkubus

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvVolumeResult = findViewById<TextView>(R.id.tvVolumeResult)

        val volume = intent.getDoubleExtra("VOLUME_RESULT", 0.0)
        tvVolumeResult.text = "Volume Kkubus: $volume"
    }
}
