package com.wannabees.krestronic.ui.fragment.detailsfragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.DetailsRecyclerAdapter
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.ui.MyInterface
import kotlinx.android.synthetic.main.fragment_details.*

/**
 * Created by shailendra on 11/9/18.
 */

class DetailsFragment : Fragment(),MyInterface.DetailsFragmentView {


    lateinit var presenter:DetailsFragmentPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //
        return inflater.inflate(R.layout.fragment_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter=DetailsFragmentPresenter(this)
        presenter.getData()

    }



    override fun populateRecyclerView(details: WannaBeesDetail?,adapter:DetailsRecyclerAdapter) {
        rv_opening.layoutManager=LinearLayoutManager(activity)
        rv_opening.adapter=adapter
   }


   override fun showCurrentStatus(status:Boolean){
        val statusText=if(status)"Open Now" else "Closed Now"
        tv_status.setText(statusText)
    }






}