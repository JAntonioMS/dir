package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityConsultarResultadosSsBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadosss.`data`.viewmodel.ConsultarResultadosSsVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.cuentadeusuario.ui.CuentaDeUsuarioActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.ui.RegistrarseActivity
import kotlin.String
import kotlin.Unit

class ConsultarResultadosSsActivity :
    BaseActivity<ActivityConsultarResultadosSsBinding>(R.layout.activity_consultar_resultados_ss) {
  private val viewModel: ConsultarResultadosSsVM by viewModels<ConsultarResultadosSsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.consultarResultadosSsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowuser.setOnClickListener {
      val destIntent = RegistrarseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnesnecesarioin.setOnClickListener {
      val destIntent = CuentaDeUsuarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONSULTAR_RESULTADOS_SS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsultarResultadosSsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
