package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConsultarResultadosSsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultarresul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consultar_resul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsnecesarioin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_es_necesario_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrarse: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrarse)

)
