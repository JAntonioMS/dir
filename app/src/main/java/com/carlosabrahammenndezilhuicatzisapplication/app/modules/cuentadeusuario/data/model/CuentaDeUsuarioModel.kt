package com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CuentaDeUsuarioModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCuentadeusuar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cuenta_de_usuar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciarsesion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_iniciar_sesion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrarse: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrarse)

)
