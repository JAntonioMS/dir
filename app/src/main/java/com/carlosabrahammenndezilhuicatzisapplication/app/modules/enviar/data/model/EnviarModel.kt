package com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnviarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnviarreportes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enviar_reportes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paciente_nombr2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnviar: String? = MyApp.getInstance().resources.getString(R.string.lbl_enviar)

)
