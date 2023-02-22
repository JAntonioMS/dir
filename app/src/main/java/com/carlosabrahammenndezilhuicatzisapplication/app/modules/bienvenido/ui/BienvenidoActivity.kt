package com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityBienvenidoBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.`data`.viewmodel.BienvenidoVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.ui.CalculadoraDeRiesgoActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.ui.ConsultarResultadosSsActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.ui.CuentaDeUsuarioActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import kotlin.String
import kotlin.Unit

class BienvenidoActivity : BaseActivity<ActivityBienvenidoBinding>(R.layout.activity_bienvenido) {
  private val viewModel: BienvenidoVM by viewModels<BienvenidoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bienvenidoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowuser.setOnClickListener {
      val destIntent = CuentaDeUsuarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowhomeTwo.setOnClickListener {
      val destIntent = ConsultarResultadosSsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowhomeOne.setOnClickListener {
      val destIntent = CalculadoraDeRiesgoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BIENVENIDO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BienvenidoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
