package com.carlosabrahammenndezilhuicatzisapplication.app.modules.actualizardatos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.actualizardatos.`data`.model.ActualizarDatosModel
import org.koin.core.KoinComponent

class ActualizarDatosVM : ViewModel(), KoinComponent {
  val actualizarDatosModel: MutableLiveData<ActualizarDatosModel> =
      MutableLiveData(ActualizarDatosModel())

  var navArguments: Bundle? = null
}
