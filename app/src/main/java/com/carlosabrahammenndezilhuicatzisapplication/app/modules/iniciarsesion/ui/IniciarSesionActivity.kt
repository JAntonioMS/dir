package com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityIniciarSesionBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.ui.ConsultarResultadosSiActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.`data`.viewmodel.IniciarSesionVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import kotlin.String
import kotlin.Unit

class IniciarSesionActivity :
    BaseActivity<ActivityIniciarSesionBinding>(R.layout.activity_iniciar_sesion) {
  private val viewModel: IniciarSesionVM by viewModels<IniciarSesionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iniciarSesionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtIniciarsesionOne.setOnClickListener {
      val destIntent = ConsultarResultadosSiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INICIAR_SESION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IniciarSesionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
