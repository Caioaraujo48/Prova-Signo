package com.has.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.signoprova.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonDate: Button = findViewById(R.id.buttonConfirm)
        ButtonDate.setOnClickListener {
            val MonthBirthday: TextView  = findViewById(R.id.MêsNascimento)
            val DayBirthday: TextView = findViewById(R.id.DataNascimento)
            DateTrue(DayBirthday.text.toString().toInt(), MonthBirthday.text.toString().toInt())
            YourSign(DayBirthday.text.toString().toInt(), MonthBirthday.text.toString().toInt())

        }
    }
    fun DateTrue(day : Int, month : Int){
        if(day < 1 || day > 31) {
            if (month < 1 || month > 12) {
                RESULT_OK
            }
        }
        else{
            val toast = Toast.makeText(this, "Data Inexistente ", Toast.LENGTH_SHORT).show()
            RESULT_CANCELED
        }
    }

    fun YourSign(day : Int, month : Int){
        val SignImage: ImageView = findViewById((R.id.Sign))

        if((day >= 21 && month == 3) || (day <= 19 && month == 4)){
            SignImage.setImageResource(R.drawable.aries)
        }
        else if((day >= 20 && month == 4) || (day <= 20 && month == 5)){
            SignImage.setImageResource(R.drawable.aries)
        }
        else if((day >= 21 && month == 5) || (day <= 21 && month == 6)) {
            SignImage.setImageResource(R.drawable.gemeos)
        }
        else if((day >= 22 && month == 6) || (day <= 22 && month == 7)) {
            SignImage.setImageResource(R.drawable.cancer)
        }
        else if((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
            SignImage.setImageResource(R.drawable.leao)
        }
        else if((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
            SignImage.setImageResource(R.drawable.virgem)
        }
        else if((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
            SignImage.setImageResource(R.drawable.libra)
        }
        else if((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
            SignImage.setImageResource(R.drawable.escorpiao)
        }
        else if((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
            SignImage.setImageResource(R.drawable.sagitario)
        }
        else if((day >= 22 && month == 12) || (day <= 19 && month == 1)) {
            SignImage.setImageResource(R.drawable.sagitario)
        }
        else if((day >= 20 && month == 1) || (day <= 18 && month == 2)) {
            SignImage.setImageResource(R.drawable.aquario)
        }
        else if((day >= 19 && month == 2) || (day <= 20 && month == 3)) {
            SignImage.setImageResource(R.drawable.peixe)
        }
    }
}
