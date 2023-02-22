package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CalculadoraDeRiesgoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCalculadorade: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calculadora_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadeseobstruc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_padese_obstruc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadecediabete: String? =
      MyApp.getInstance().resources.getString(R.string.msg_padece_diabete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadeceinsufic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_padece_insufic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadeceohapa: String? = MyApp.getInstance().resources.getString(R.string.msg_padece_o_ha_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnterior: String? = MyApp.getInstance().resources.getString(R.string.lbl_anterior)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSiguiente: String? = MyApp.getInstance().resources.getString(R.string.lbl_siguiente)

)
