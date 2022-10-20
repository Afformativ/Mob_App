package com.app.udeposits.ui.author;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.app.udeposits.R;
import com.app.udeposits.ui.home.HomeViewModel;

public class AuthorFragment extends Fragment {
    private AuthorViewModel authorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        authorViewModel =
                ViewModelProviders.of(this).get(AuthorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_author, container, false);

        return root;
    }

}
