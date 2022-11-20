package com.example.bdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bdd.datos.Base
import com.example.bdd.models.Producto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var elproducto = Producto("cocacola",22)
        val mibase = Base(this,null,null,null)
        mibase.adProducto(elproducto)
    }
}