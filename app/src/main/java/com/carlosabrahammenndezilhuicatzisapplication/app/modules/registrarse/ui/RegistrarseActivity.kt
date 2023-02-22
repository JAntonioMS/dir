package com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityRegistrarseBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.ui.IniciarSesionActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.registrarse.`data`.viewmodel.RegistrarseVM
import kotlin.String
import kotlin.Unit

class RegistrarseActivity : BaseActivity<ActivityRegistrarseBinding>(R.layout.activity_registrarse)
    {
  private val viewModel: RegistrarseVM by viewModels<RegistrarseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrarseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFourteen.setOnClickListener {
      val destIntent = IniciarSesionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRARSE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrarseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
