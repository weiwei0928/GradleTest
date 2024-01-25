package com.ww.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
class Person {
    lateinit var name: String

    fun initializeName() {
        println(this::name.isInitialized)
        name = "MindOrks" // initializing name
        println(this::name.isInitialized)
    }
}
fun main(args: Array<String>) {
    Person().initializeName()
}
