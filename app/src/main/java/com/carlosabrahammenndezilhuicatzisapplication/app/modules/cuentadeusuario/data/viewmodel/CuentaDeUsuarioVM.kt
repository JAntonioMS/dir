package com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.`data`.model.CuentaDeUsuarioModel
import org.koin.core.KoinComponent

class CuentaDeUsuarioVM : ViewModel(), KoinComponent {
  val cuentaDeUsuarioModel: MutableLiveData<CuentaDeUsuarioModel> =
      MutableLiveData(CuentaDeUsuarioModel())

  var navArguments: Bundle? = null
}
