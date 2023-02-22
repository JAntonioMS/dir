package com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityMenuBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.ui.BienvenidoActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.ui.CalculadoraDeRiesgoActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.ui.ConsultarResultadosSsActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.ui.CuentaDeUsuarioActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.`data`.viewmodel.MenuVM
import kotlin.String
import kotlin.Unit

class MenuActivity : BaseActivity<ActivityMenuBinding>(R.layout.activity_menu) {
  private val viewModel: MenuVM by viewModels<MenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowhomeTwo.setOnClickListener {
      val destIntent = ConsultarResultadosSsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowhomeOne.setOnClickListener {
      val destIntent = CalculadoraDeRiesgoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowhome.setOnClickListener {
      val destIntent = BienvenidoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowuser.setOnClickListener {
      val destIntent = CuentaDeUsuarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
