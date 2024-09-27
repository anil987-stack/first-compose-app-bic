package com.android.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigateToLoginScreen()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun NavigateToLoginScreen() {
        val containerColor = Color(0xFF35373B)
        val placeHolderColor = Color(0xFFA7A7A7)
        val buttonColor = Color(0xFFDDB34D)
        val backgroundImage: Painter = painterResource(id = R.drawable.bg_ic)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            Image(
                painter = backgroundImage,
                contentDescription = "Background Image",
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.app_logo),
                contentDescription = "app_logo",
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp)
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Login with", color = placeHolderColor,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_svg),
                    contentDescription = "app_logo",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .padding(start = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.email_svg),
                    contentDescription = "app_logo",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .padding(start = 5.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                shape = RoundedCornerShape(6.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
                onClick = { /*TODO*/ }
            ) {

                Text(
                    text = "Login Now",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                shape = RoundedCornerShape(6.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = containerColor),
                onClick = { /*TODO*/ }
            ) {

                Text(
                    text = "Create Account",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(85.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = Color.Black)
                    .border(
                        1.dp,
                        buttonColor,
                        RoundedCornerShape(12.dp)
                    )
                    .clickable(onClick = {})
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Support Icon",
                        tint = buttonColor
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Support",
                        color = Color.White,
                    )
                }
            }
        }


    }


}

