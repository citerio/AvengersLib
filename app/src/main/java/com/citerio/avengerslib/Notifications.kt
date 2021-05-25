package com.citerio.avengerslib

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide

object Notifications {


    fun showPopUp(context: Context?){

        val dialogView = LayoutInflater.from(context).inflate(R.layout.avenger_notification, null)
        val alert = AlertDialog.Builder(context!!)
        alert.setView(dialogView)

        /*****************************installation date*****************************/
        var installDate = Preferences.getString(context, Settings.Preferences.installationDate)
        if (installDate.isEmpty()){
            installDate = DatesAndTimes.FormatIso8601ToSimpleDate(DatesAndTimes.Now().toString())
            Preferences.saveString(context, Settings.Preferences.installationDate, installDate)
        }
        dialogView.findViewById<TextView>(R.id.install_date).text = "AvengersLib Installed on ${installDate}"
        /*****************************installation date*****************************/


        /*****************************glide image load*****************************/
        Glide.with(context).load(Settings.urlMain).into(dialogView.findViewById<ImageView>(R.id.logo))
        /*****************************glide image load*****************************/

        /*****************************dialog background*****************************/
        val dialog = alert.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        /*****************************dialog background*****************************/

        /*****************************dialog animation*****************************/
        dialog.window?.attributes!!.windowAnimations = R.style.SlidingDialogAnimation;
        /*****************************dialog animation*****************************/

        /*****************************dialog dimensions*****************************/
        val width = (context.resources.displayMetrics.widthPixels * 0.70).toInt()
        //val height = (context.resources.displayMetrics.heightPixels * 0.70).toInt()
        val height = WindowManager.LayoutParams.WRAP_CONTENT
        /*****************************dialog dimensions*****************************/

        /*****************************join us button event*****************************/
        dialogView.findViewById<Button>(R.id.avenger).setOnClickListener {
            dialogView.findViewById<Button>(R.id.avenger).text = context.getString(R.string.thank_you)
            Glide.with(context).load(Settings.urlSecondary).into(dialogView.findViewById<ImageView>(R.id.logo))
        }
        /*****************************join us button event*****************************/


        dialog.show()
        dialog.window?.setLayout(width, height)

    }

}