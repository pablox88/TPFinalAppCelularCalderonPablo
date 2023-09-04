package com.example.CalderonPablo.View

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.CalderonPablo.Model.ComparacionResultado

class MainViewModel: ViewModel() {

    val resultado = MutableLiveData<ComparacionResultado>()

    fun compararTextos(texto1: String, texto2: String){
        val sonIguales = texto1 == texto2
        resultado.value = ComparacionResultado(sonIguales)
    }

}