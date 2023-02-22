package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.model.ConsultarResultadosSiModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.model.ListlanguageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConsultarResultadosSiVM : ViewModel(), KoinComponent {
  val consultarResultadosSiModel: MutableLiveData<ConsultarResultadosSiModel> =
      MutableLiveData(ConsultarResultadosSiModel())

  var navArguments: Bundle? = null

  val listlanguageList: MutableLiveData<MutableList<ListlanguageRowModel>> =
      MutableLiveData(mutableListOf())
}
