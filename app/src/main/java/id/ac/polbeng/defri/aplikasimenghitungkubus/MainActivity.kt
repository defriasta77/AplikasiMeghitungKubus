

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSideLength = findViewById<EditText>(R.id.et_side_length)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        btnCalculate.setOnClickListener {
            val sideLengthText = etSideLength.text.toString()

            if (sideLengthText.isNotEmpty()) {
                val sideLength = sideLengthText.toDouble()
                val volume = sideLength * sideLength * sideLength
                tvResult.text = "Volume kubus: $volume"
            } else {
                Toast.makeText(this, "Masukkan panjang sisi kubus terlebih dahulu", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
