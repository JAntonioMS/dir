package com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityEnviarBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.`data`.viewmodel.EnviarVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import kotlin.String
import kotlin.Unit

class EnviarActivity : BaseActivity<ActivityEnviarBinding>(R.layout.activity_enviar) {
  private val viewModel: EnviarVM by viewModels<EnviarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enviarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENVIAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnviarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
