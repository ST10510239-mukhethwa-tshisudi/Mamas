package za.ac.iie.bursaryapp2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    enum class Programme {
        It, Education , Engineering , business

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Etname = findViewById<EditText>(R.id.Etname)
        val Etage = findViewById<EditText>(R.id.Etage)
        val Etaveragemark = findViewById<EditText>(R.id.Etaveragemark)

        val Spselctprogramme = findViewById<Spinner>(R.id.Spselectprogramme)
        Spselctprogramme.adapter = ArrayAdapter<MainActivity.Programme> (this ,
            android.R.layout.simple_list_item_1, Programme.values())

        val  Swselectprograme = findViewById<Switch>(R.id.Swreturningstudents)
        val Cbacceptbursartoffer = findViewById<CheckBox>(R.id.Cbacceptbursaryoffer)
        val Btncheckelibility = findViewById<Button>(R.id.Btncheckeligilbility)
        val Tvresults = findViewById<TextView>(R.id.Tvresults)

        Btncheckelibility.setOnClickListener {
            //Rule 1
            val name = Etname.text.toString()
            val age = Etage . text.toString()
            val averagemark = Etaveragemark.text

        if (!name.isEmpty() && 

        }

    }

}