package com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityCuentaDeUsuarioBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.`data`.viewmodel.CuentaDeUsuarioVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.ui.IniciarSesionActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.ui.RegistrarseActivity
import kotlin.String
import kotlin.Unit

class CuentaDeUsuarioActivity :
    BaseActivity<ActivityCuentaDeUsuarioBinding>(R.layout.activity_cuenta_de_usuario) {
  private val viewModel: CuentaDeUsuarioVM by viewModels<CuentaDeUsuarioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cuentaDeUsuarioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowhome.setOnClickListener {
      val destIntent = IniciarSesionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowuserOne.setOnClickListener {
      val destIntent = RegistrarseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CUENTA_DE_USUARIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CuentaDeUsuarioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
