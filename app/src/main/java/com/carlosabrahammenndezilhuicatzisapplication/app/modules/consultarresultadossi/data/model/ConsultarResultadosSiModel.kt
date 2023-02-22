package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConsultarResultadosSiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultarresul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consultar_resul)

)
