package com.example.lemonadeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemonadeapp.ui.theme.LemonadeAppTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeAppTheme {
                // A surface container using the 'background' color from the theme
                LemonApp()
                }
            }
        }
    }

@Composable
fun StepsUiDesign(modifier: Modifier) {

    Column(modifier = Modifier,

        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Image(painter = painterResource(id = R.drawable.lemon_tree),
            contentDescription = "1" )
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Step 1")
    }
}

@Preview(showBackground = true)
@Composable
fun LemonApp() {
    LemonadeAppTheme {
        StepsUiDesign(modifier = Modifier.fillMaxSize().wrapContentSize())
    }

}

