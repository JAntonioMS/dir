package com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.`data`.model.VerReportesModel
import org.koin.core.KoinComponent

class VerReportesVM : ViewModel(), KoinComponent {
  val verReportesModel: MutableLiveData<VerReportesModel> = MutableLiveData(VerReportesModel())

  var navArguments: Bundle? = null
}
