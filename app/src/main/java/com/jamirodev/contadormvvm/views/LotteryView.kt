package com.jamirodev.contadormvvm.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jamirodev.contadormvvm.viewModels.CounterViewModel
import com.jamirodev.contadormvvm.viewModels.LotteryViewModel

@Composable
fun LotteryView(viewModel: LotteryViewModel) {
    val lotteNumbers = viewModel.lottoNumbers.value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (lotteNumbers.isEmpty()) {
            Text(text = "Lottery!", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        } else {
            LotteryNumbers(numbers = lotteNumbers)
        }
        Button(onClick = { viewModel.generateLotteNumbers() }) {
            Text(text = "Generate", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun LotteryNumbers(
    numbers: List<Int>
) {
    LazyRow(
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp
        )
    ) {
        items(numbers) { number ->
            Box(
                contentAlignment =
                Alignment.Center,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(48.dp)
                    .background(Color.Magenta, CircleShape)
            ) {
                Text(
                    text = number.toString(),
                    color = Color.White,
                    fontSize = 24.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LotteryViewPreview() {
    LotteryView(viewModel = LotteryViewModel())
}