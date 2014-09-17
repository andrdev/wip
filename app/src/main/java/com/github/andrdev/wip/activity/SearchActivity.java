package com.github.andrdev.wip.activity;

import android.app.Fragment;

import com.github.andrdev.wip.fragment.SearchFragment;


public class SearchActivity extends SingleFragmentActivity {
    @Override
    Fragment createFragment() {
        return new SearchFragment();
    }
}
