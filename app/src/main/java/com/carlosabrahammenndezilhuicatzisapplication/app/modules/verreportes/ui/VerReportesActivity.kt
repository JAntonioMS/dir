package com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityVerReportesBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.bienvenido.ui.BienvenidoActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.ui.EnviarActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.ui.IniciarSesionActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.`data`.viewmodel.VerReportesVM
import kotlin.String
import kotlin.Unit

class VerReportesActivity : BaseActivity<ActivityVerReportesBinding>(R.layout.activity_ver_reportes)
    {
  private val viewModel: VerReportesVM by viewModels<VerReportesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verReportesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleTwentyOne.setOnClickListener {
      val destIntent = EnviarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnpacientenombr.setOnClickListener {
      val destIntent = IniciarSesionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleTwentyTwo.setOnClickListener {
      val destIntent = BienvenidoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VER_REPORTES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VerReportesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
