package com.wannabees.krestronic.dependency

import com.wannabees.krestronic.ui.fragment.DetailsFragment
import com.wannabees.krestronic.ui.fragment.HomeFragment
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by shailendra on 11/9/18.
 */
@Singleton
@Component(modules = arrayOf(RetrofitModule::class))
interface RetrofitComponent{
  fun inject(detailsFragment:DetailsFragment)


}