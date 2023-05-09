package com.nokhyun.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.nokhyun.settings.databinding.FragmentSettingsTwoBinding

class SettingsTwoFragment : Fragment() {

    private var binding: FragmentSettingsTwoBinding? = null
    private val navArgs: SettingsTwoFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSettingsTwoBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(this.javaClass.simpleName, "id: ${navArgs.id} :: myArg: ${navArgs.myarg} :: name: ${navArgs.name}")
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}