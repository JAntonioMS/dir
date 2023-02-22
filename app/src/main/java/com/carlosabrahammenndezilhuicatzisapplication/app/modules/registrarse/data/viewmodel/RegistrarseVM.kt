package com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.`data`.model.RegistrarseModel
import org.koin.core.KoinComponent

class RegistrarseVM : ViewModel(), KoinComponent {
  val registrarseModel: MutableLiveData<RegistrarseModel> = MutableLiveData(RegistrarseModel())

  var navArguments: Bundle? = null
}
