package com.msjo.cleanarchitest.bread

import androidx.lifecycle.ViewModel
import com.msjo.cleanarchitest.domain.usecase.BreadOrderDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class BreadViewModel @Inject constructor(
    private val breadOrderDetail: BreadOrderDetail
) : ViewModel() {
}