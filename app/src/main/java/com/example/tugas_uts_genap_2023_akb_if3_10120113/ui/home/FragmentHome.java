package com.example.tugas_uts_genap_2023_akb_if3_10120113.ui.home;

/*
 * NIM : 10119084
 *Nama : Muhammad Idris Merdefi
 *Kelas : IF2
 *Email : muhammadidrismerdefi23@gmail.com
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugas_uts_genap_2023_akb_if3_10120113.R;

public class FragmentHome extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
