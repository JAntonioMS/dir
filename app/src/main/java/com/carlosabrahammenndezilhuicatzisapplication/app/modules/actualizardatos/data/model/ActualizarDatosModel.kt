package com.carlosabrahammenndezilhuicatzisapplication.app.modules.actualizardatos.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ActualizarDatosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActualizardato: String? =
      MyApp.getInstance().resources.getString(R.string.msg_actualizar_dato)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_cmenendez344_gm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActualizar: String? = MyApp.getInstance().resources.getString(R.string.lbl_actualizar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyValue: String? = null
)
