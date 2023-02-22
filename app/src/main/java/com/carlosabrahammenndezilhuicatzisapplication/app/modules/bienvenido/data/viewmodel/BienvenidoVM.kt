package com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.`data`.model.BienvenidoModel
import org.koin.core.KoinComponent

class BienvenidoVM : ViewModel(), KoinComponent {
  val bienvenidoModel: MutableLiveData<BienvenidoModel> = MutableLiveData(BienvenidoModel())

  var navArguments: Bundle? = null
}
