package com.nokhyun.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.nokhyun.home.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnSettingsTwo?.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/settingsTwoFragment/id=4?myarg=${"aa"}?name=${"Kim"}}".toUri())
                .build()
            findNavController().navigate(request)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}