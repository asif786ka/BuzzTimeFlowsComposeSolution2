package com.andkotl.buzzer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TimerDisplay(timerState: TimerState, toggleStartStop: () -> Unit) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(100.dp).size(400.dp).height(800.dp)) {
        CircularProgressIndicator(
            timerState.progressPercentage,
            modifier = Modifier
                .size(200.dp).clickable {toggleStartStop()})
        Text(text = timerState.displaySeconds, fontSize = 32.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTimerDisplay() {
    TimerDisplay(timerState = TimerState(60)) {}
}