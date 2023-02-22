package com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.ActivityConsultarResultadosSiBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.model.ListlanguageRowModel
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.consultarresultadossi.`data`.viewmodel.ConsultarResultadosSiVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.enviar.ui.EnviarActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.verreportes.ui.VerReportesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ConsultarResultadosSiActivity :
    BaseActivity<ActivityConsultarResultadosSiBinding>(R.layout.activity_consultar_resultados_si) {
  private val viewModel: ConsultarResultadosSiVM by viewModels<ConsultarResultadosSiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageAdapter =
    ListlanguageAdapter(viewModel.listlanguageList.value?:mutableListOf())
    binding.recyclerListlanguage.adapter = listlanguageAdapter
    listlanguageAdapter.setOnItemClickListener(
    object : ListlanguageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageRowModel) {
        onClickRecyclerListlanguage(view, position, item)
      }
    }
    )
    viewModel.listlanguageList.observe(this) {
      listlanguageAdapter.updateData(it)
    }
    binding.consultarResultadosSiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguage(
    view: View,
    position: Int,
    item: ListlanguageRowModel
  ): Unit {
    when(view.id) {
      R.id.viewRectangleFourteen ->  {
        val destIntent = VerReportesActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.viewRectangleFifteen ->  {
        val destIntent = EnviarActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CONSULTAR_RESULTADOS_SI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsultarResultadosSiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
