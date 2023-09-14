package com.jamirodev.contadormvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.jamirodev.contadormvvm.ui.theme.ContadorMVVMTheme
import com.jamirodev.contadormvvm.viewModels.LotteryViewModel
import com.jamirodev.contadormvvm.views.LotteryView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewModel: CounterViewModel by viewModels()
        val viewModel: LotteryViewModel by viewModels()
        setContent {
            ContadorMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Counter(viewModel = viewModel)
                    LotteryView(viewModel = viewModel)
                }
            }
        }
    }
}

