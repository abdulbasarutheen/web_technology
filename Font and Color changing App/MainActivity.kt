package com.example.eventlistener

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat


class MainActivity : AppCompatActivity() {
    var count=0;
    val colorIds = listOf(
        R.color.red,
        R.color.green,
        R.color.blue,
        R.color.orange,
        R.color.purple,
        R.color.lightblue
        )
    var count1=0;
    val fonts= listOf(
        R.font.font,
        R.font.font1
    )
    lateinit var old_font:android.graphics.Typeface;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text: TextView = findViewById(R.id.text);
        old_font=text.typeface;
    }

    fun font(view: View) {

        val text: TextView = findViewById(R.id.text);
        val newFont=ResourcesCompat.getFont(this,fonts[count1%fonts.size])
        text.typeface = newFont;
        count1++
        Toast.makeText(getApplicationContext(), "Font Changed", Toast.LENGTH_SHORT).show();
    }
    fun color(view: View) {
        val text: TextView = findViewById(R.id.text);
        val color= ContextCompat.getColor(this,colorIds[count%colorIds.size]);
        text.setTextColor(color);
        count++;
        Toast.makeText(getApplicationContext(), "Color Changed", Toast.LENGTH_SHORT).show();

    }
    fun text(view: View) {
        val textView: TextView = findViewById(R.id.textview);
        val output: String=textView.text.toString();
        textView.setText("");
        val text: TextView = findViewById(R.id.text);
        text.setText(output);
        text.typeface=old_font;

    }
}
