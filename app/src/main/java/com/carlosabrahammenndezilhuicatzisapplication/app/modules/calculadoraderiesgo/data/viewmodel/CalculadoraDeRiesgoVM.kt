package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model.CalculadoraDeRiesgoModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model.ListedadRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalculadoraDeRiesgoVM : ViewModel(), KoinComponent {
  val calculadoraDeRiesgoModel: MutableLiveData<CalculadoraDeRiesgoModel> =
      MutableLiveData(CalculadoraDeRiesgoModel())

  var navArguments: Bundle? = null

  val listedadList: MutableLiveData<MutableList<ListedadRowModel>> =
      MutableLiveData(mutableListOf())
}
