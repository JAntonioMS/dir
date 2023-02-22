package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.`data`.model.ConsultarResultadosSsModel
import org.koin.core.KoinComponent

class ConsultarResultadosSsVM : ViewModel(), KoinComponent {
  val consultarResultadosSsModel: MutableLiveData<ConsultarResultadosSsModel> =
      MutableLiveData(ConsultarResultadosSsModel())

  var navArguments: Bundle? = null
}
