package com.wannabees.krestronic.dependency;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wannabees.krestronic.ApplicationClass;

/**
 * Created by shailendra on 11/9/18.
 */

public class Acfd extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((ApplicationClass)getActivity().getApplication()).getRetrofitComponent();
        return super.onCreateView(inflater, container, savedInstanceState);

    }

}
