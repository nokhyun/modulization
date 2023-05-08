package com.nokhyun.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nokhyun.settings.databinding.FragmentSettingsTwoBinding

class SettingsTwoFragment : Fragment() {

    private var binding: FragmentSettingsTwoBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSettingsTwoBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}