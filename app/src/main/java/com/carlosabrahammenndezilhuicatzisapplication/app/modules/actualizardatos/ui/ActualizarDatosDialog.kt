package com.carlosabrahammenndezilhuicatzisapplication.app.modules.actualizardatos.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.base.BaseDialogFragment
import com.carlosabrahammenndezilhuicatzisapplication.app.databinding.DialogActualizarDatosBinding
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.actualizardatos.`data`.viewmodel.ActualizarDatosVM
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.iniciarsesion.ui.IniciarSesionActivity
import com.carlosabrahammenndezilhuicatzisapplication.app.modules.menu.ui.MenuActivity
import kotlin.String
import kotlin.Unit

class ActualizarDatosDialog :
    BaseDialogFragment<DialogActualizarDatosBinding>(R.layout.dialog_actualizar_datos) {
  private val viewModel: ActualizarDatosVM by viewModels<ActualizarDatosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.actualizarDatosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleFourteen.setOnClickListener {
      val destIntent = IniciarSesionActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageLogoDIROne.setOnClickListener {
      val destIntent = MenuActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "ACTUALIZAR_DATOS_DIALOG"

  }
}
