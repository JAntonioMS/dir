package com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrarseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrarse: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrarse)
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
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrarseOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrarse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortySixValue: String? = null
)
