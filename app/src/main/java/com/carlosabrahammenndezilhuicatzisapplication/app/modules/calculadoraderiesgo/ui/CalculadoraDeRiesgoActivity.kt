package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityCalculadoraDeRiesgoBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model.ListedadRowModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.viewmodel.CalculadoraDeRiesgoVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalculadoraDeRiesgoActivity :
    BaseActivity<ActivityCalculadoraDeRiesgoBinding>(R.layout.activity_calculadora_de_riesgo) {
  private val viewModel: CalculadoraDeRiesgoVM by viewModels<CalculadoraDeRiesgoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listedadAdapter = ListedadAdapter(viewModel.listedadList.value?:mutableListOf())
    binding.recyclerListedad.adapter = listedadAdapter
    listedadAdapter.setOnItemClickListener(
    object : ListedadAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListedadRowModel) {
        onClickRecyclerListedad(view, position, item)
      }
    }
    )
    viewModel.listedadList.observe(this) {
      listedadAdapter.updateData(it)
    }
    binding.calculadoraDeRiesgoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListedad(
    view: View,
    position: Int,
    item: ListedadRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALCULADORA_DE_RIESGO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CalculadoraDeRiesgoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
