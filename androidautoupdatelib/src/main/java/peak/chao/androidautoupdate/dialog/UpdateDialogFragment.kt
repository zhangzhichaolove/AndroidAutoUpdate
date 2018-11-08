package peak.chao.androidautoupdate.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import peak.chao.androidautoupdate.R


/**
 * 升级弹窗
 */
class UpdateDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //设置背景透明
        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return inflater.inflate(R.layout.dialog_update, container)
    }

    override fun onStart() {
        super.onStart()
        dialog?.let {
            val dm = DisplayMetrics()
            //val params = dialog.window.attributes
            //params.gravity = Gravity.CENTER
            //dialog.window.attributes = params
            activity!!.windowManager.defaultDisplay.getMetrics(dm)
            dialog.window.setLayout((dm.widthPixels * 0.75).toInt(), (dm.heightPixels * 0.75).toInt())
        }
    }
}