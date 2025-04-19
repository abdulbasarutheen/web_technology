package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    var firstNumber:Double=0.0;
    var isadd:Boolean=false;
    var issub:Boolean=false;
    var ismul:Boolean=false;
    var isdiv:Boolean=false;
    var ismod:Boolean=false;


    fun perclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            firstNumber=output.toDouble();
            ismod=true;
            textView.text="0";
        }
    }
    fun ceclicked(view: View) {}
    fun clearclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        textView.setText("0");

    }
    fun backclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            textView.text=output.substring(0,output.length-1);
        }
        else{
            textView.text="0";
        }

    }
    fun sevenclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("7");
        }
        else {
            textView.setText(output + "7");
        }
    }
    fun eightclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("8");
        }
        else {
            textView.setText(output + "8");
        }
    }
    fun nineclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("9");
        }
        else {
            textView.setText(output + "9");
        }
    }
    fun divclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            firstNumber=output.toDouble();
            isdiv  =true;
            textView.text="0";
        }
    }
    fun fourclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("4");
        }
        else {
            textView.setText(output + "4");
        }
    }
    fun fiveclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("5");
        }
        else {
            textView.setText(output + "5");
        }
    }
    fun sixclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("6");
        }
        else {
            textView.setText(output + "6");
        }
    }
    fun mulclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            firstNumber=output.toDouble();
            ismul=true;
            textView.text="0";
        }
    }
    fun oneclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("1");
        }
        else {
            textView.setText(output + "1");
        }
    }
    fun twoclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("2");
        }
        else {
            textView.setText(output + "2");
        }
    }
    fun threeclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("3");
        }
        else {
            textView.setText(output + "3");
        }
    }
    fun subclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            firstNumber=output.toDouble();
            issub=true;
            textView.text="0";
        }
    }
    fun equalclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val secondNumber=textView.text.toString().toDouble();
        if(isadd){
            textView.text=(firstNumber+secondNumber).toString();
            isadd=false;
        }
        if(issub){
            textView.text=(firstNumber-secondNumber).toString();
            issub=false;
        }
        if(ismul){
            textView.text=(firstNumber*secondNumber).toString();
            ismul=false;
        }
        if(isdiv){
            textView.text=(firstNumber/secondNumber).toString();
            isdiv=false;
        }
        if(ismod){
            textView.text=(firstNumber%secondNumber).toString();
            ismod=false;
        }
    }
    fun zeroclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText("0");
        }
        else {
            textView.setText(output + "0");
        }
    }
    fun decclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output=="0"){
            textView.setText(".");
        }
        else {
            textView.setText(output + ".");
        }
    }

    fun addclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val output: String=textView.text.toString();
        if(output.isNotEmpty()){
            firstNumber=output.toDouble();
            isadd=true;
            textView.text="0";
        }

    }
}
