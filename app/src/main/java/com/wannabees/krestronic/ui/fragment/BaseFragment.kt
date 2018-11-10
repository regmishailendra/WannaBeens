package com.wannabees.krestronic.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.ProgressBar
import com.wannabees.krestronic.R
import com.wannabees.krestronic.ui.MyInterface


/**
 * Created by shailendra on 11/10/18.
 */
open class BaseFragment: Fragment(),MyInterface.ProgressBar {

    lateinit var pb: ProgressBar
    override fun hideProgressBar() {
            pb.visibility=View.GONE
    }

    override fun showProgressBar() {
        pb.visibility=View.VISIBLE

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pb=view.findViewById(R.id.pb)

    }



}