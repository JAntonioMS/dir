package com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMenuOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInicio: String? = MyApp.getInstance().resources.getString(R.string.lbl_inicio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalculadorade: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calculadora_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultarresul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consultar_resul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCuentadeusuar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cuenta_de_usuar)

)
