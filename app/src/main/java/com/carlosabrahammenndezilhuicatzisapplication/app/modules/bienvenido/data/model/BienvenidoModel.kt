package com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BienvenidoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBienvenido: String? = MyApp.getInstance().resources.getString(R.string.lbl_bienvenido)
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
  var txtResultados: String? = MyApp.getInstance().resources.getString(R.string.lbl_resultados)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCuenta: String? = MyApp.getInstance().resources.getString(R.string.lbl_cuenta)

)
