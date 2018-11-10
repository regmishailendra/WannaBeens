package com.wannabees.krestronic.ui.activity.mainactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.HomePagerAdapter
import com.wannabees.krestronic.listeners.DataFetchListener
import com.wannabees.krestronic.listeners.DataPassListener
import com.wannabees.krestronic.ui.MyInterface
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), MyInterface.MainActivityView, DataFetchListener {

    private val presenter: MainActivityPresenter = MainActivityPresenter(this)
    private lateinit var listener: DataPassListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.setupViewPager()
    }


    override fun setupViewPager(adapter: HomePagerAdapter) {
        vp.adapter = adapter
        tabs.setupWithViewPager(vp)
        setUpTabsIcons()
    }

    fun setUpTabsIcons() {
        tabs.getTabAt(0)?.setIcon(R.drawable.ic_home)
        tabs.getTabAt(1)?.setIcon(R.drawable.ic_detail)
    }

    override fun onDataFetched() {
        listener.onDataPassed()
    }

    fun setListenerForHome(listener: DataPassListener) {
        this.listener = listener
    }
}
