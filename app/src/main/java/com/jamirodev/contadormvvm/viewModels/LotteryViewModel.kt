package com.jamirodev.contadormvvm.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LotteryViewModel: ViewModel() {
    private val _lotteNumbers = mutableStateOf(emptyList<Int>())
    val lottoNumbers: State<List<Int>> = _lotteNumbers

    fun generateLotteNumbers() {
        _lotteNumbers.value = (1..60).shuffled().take(6).sorted()
    }
}