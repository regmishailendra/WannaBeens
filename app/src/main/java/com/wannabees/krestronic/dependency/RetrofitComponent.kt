package com.wannabees.krestronic.dependency

import com.wannabees.krestronic.ui.fragment.detailsfragment.DetailsFragment
import com.wannabees.krestronic.ui.fragment.detailsfragment.DetailsFragmentPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by shailendra on 11/9/18.
 */
@Singleton
@Component(modules = arrayOf(RetrofitModule::class))
interface RetrofitComponent{
  fun inject(detailsFragment: DetailsFragment)
  fun inject(detailsFragment: DetailsFragmentPresenter) {
  }


}