package com.wannabees.krestronic.ui.fragment.detailsfragment
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.DetailsRecyclerAdapter
import com.wannabees.krestronic.listeners.DataFetchListener
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.ui.MyInterface
import com.wannabees.krestronic.ui.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_details.*

/**
 * Created by shailendra on 11/9/18.
 */

class DetailsFragment : BaseFragment(),MyInterface.DetailsFragmentView {


    lateinit var presenter:DetailsFragmentPresenter
    var listener:DataFetchListener? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter=DetailsFragmentPresenter(this)
        presenter.getData()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
          listener=context as DataFetchListener
    }

    override fun onDetach() {
        super.onDetach()
       listener=null
    }

    override fun populateRecyclerView(details: WannaBeesDetail?,adapter:DetailsRecyclerAdapter) {
        rv_opening.layoutManager=LinearLayoutManager(activity!!)
        rv_opening.adapter=adapter
        hideProgressBar()
        listener?.onDataFetched()
   }

   override fun showCurrentStatus(status:Boolean){
        val statusText=if(status)"Open Now" else "Closed Now"
        tv_status.setText(statusText)
    }




}