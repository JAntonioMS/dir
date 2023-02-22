package com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerReportesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReporteinsufic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reporte_insufic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResultadosInsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resultados_insu7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPacienteNombr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paciente_nombr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20decontraer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_20_de_contraer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contemplando_lo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAceptar: String? = MyApp.getInstance().resources.getString(R.string.lbl_aceptar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnviar: String? = MyApp.getInstance().resources.getString(R.string.lbl_enviar)

)
