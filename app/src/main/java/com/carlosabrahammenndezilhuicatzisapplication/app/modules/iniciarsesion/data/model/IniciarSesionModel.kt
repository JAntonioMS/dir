package com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IniciarSesionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciarsesion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_iniciar_sesion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciarsesionOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_iniciar_sesion)

)
