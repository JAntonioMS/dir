package com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.`data`.model.EnviarModel
import org.koin.core.KoinComponent

class EnviarVM : ViewModel(), KoinComponent {
  val enviarModel: MutableLiveData<EnviarModel> = MutableLiveData(EnviarModel())

  var navArguments: Bundle? = null
}
