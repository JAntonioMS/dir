package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListedadRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEdad: String? = MyApp.getInstance().resources.getString(R.string.lbl_edad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_edad2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPesoKg: String? = MyApp.getInstance().resources.getString(R.string.lbl_peso_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeso: String? = MyApp.getInstance().resources.getString(R.string.lbl_peso)

)
