package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_resultados_insu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVer: String? = MyApp.getInstance().resources.getString(R.string.lbl_ver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnviar: String? = MyApp.getInstance().resources.getString(R.string.lbl_enviar)

)
