package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.delay
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var flag = 0
    var count = 0
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)

        tvResult = findViewById(R.id.tvResult)
    }

    fun check(view: View) {
        val btnCurrent = view as Button

        if (btnCurrent.text == "") {
            count++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "O"
                flag = 0
            }

            val b1 = btn1.text.toString()
            val b2 = btn2.text.toString()
            val b3 = btn3.text.toString()
            val b4 = btn4.text.toString()
            val b5 = btn5.text.toString()
            val b6 = btn6.text.toString()
            val b7 = btn7.text.toString()
            val b8 = btn8.text.toString()
            val b9 = btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()

                tvResult.text = "Winner is: $b1"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b4", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b4"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b7", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b7"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b1"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b2", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b2"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b3"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b1"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                tvResult.text = "Winner is: $b3"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
            else if (count == 9) {
                Toast.makeText(this@MainActivity, "Match is drawn", Toast.LENGTH_LONG).show()
                tvResult.text = "Match is Drawn"
                Handler(Looper.getMainLooper()).postDelayed({
                    tvResult.text = ""
                }, 4000)
                newGame()
            }
        }
    }

    fun newGame() = Handler(Looper.getMainLooper()).postDelayed({
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        flag = 0
        count = 0

    }, 4000)

}