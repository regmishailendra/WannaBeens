package com.wannabees.krestronic.ui.activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.HomePagerAdapter
import com.wannabees.krestronic.ui.fragment.DetailsFragment
import com.wannabees.krestronic.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager(vp)
    }

    private fun setupViewPager(vp:ViewPager){
       val adapter= HomePagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(DetailsFragment(),"Details")
        vp.adapter=adapter
        tabs.setupWithViewPager(vp)

    }
}
