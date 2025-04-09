package com.kita.monstercorp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

fun Modifier.drawStarryBackground() = this.then(
    Modifier.drawBehind {
        val canvasWidth = size.width
        val canvasHeight = size.height * 0.6f

        val random = Random(System.currentTimeMillis())
        val starCount = 200

        repeat(starCount) {
            val x = random.nextFloat() * canvasWidth
            val y = random.nextFloat() * canvasHeight
            val radius = random.nextFloat() * 4f

            drawCircle(
                color = Color.White,
                radius = radius,
                center = Offset(x, y)
            )
        }
    }
)

@Composable
fun StartScreen(modifier: Modifier = Modifier, onClickGame: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xff06131D),
                            Color(0xff071925),
                            Color(0xff103550),
                            Color(0xff1C5B85),
                        )
                    )
                )
                .drawStarryBackground()
                .padding(innerPadding)
                .padding(vertical = 64.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Text(
                    text = "MONSTERCORP",
                    color = Color(0xFFFDC336),
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Black,
                        fontSize = 78.sp,
                        letterSpacing = 1.sp,
                        // Add yellow stroke border
                        drawStyle = Stroke(
                            miter = 10f,
                            width = 16f,
                            join = StrokeJoin.Round,
                            cap = StrokeCap.Round
                        ),
                        // Add Pink Shadow
                        shadow = Shadow(
                            offset = Offset(4f, 14f),
                            color = Color(0xFFF4767F),
                            blurRadius = 2f
                        )
                    )
                )

                Text(
                    text = "MONSTERCORP",
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Black,
                        fontSize = 78.sp,
                        letterSpacing = 1.sp,
                        color = Color.White
                    )
                )
            }
            Image(
                painter = painterResource(R.drawable.img_house), "House",
                Modifier.size(340.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp)
            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 2.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFF4767F),
                        shape = RoundedCornerShape(size = 12.dp)
                    )
                ){}
                Button(
                    onClick = { onClickGame() },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(size = 12.dp),
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = Color(0xFFFDC336),
                        contentColor = Color(0xff06131D)
                    ),
                    border = BorderStroke(
                        width = 6.dp,
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFFBDD9F),
                                Color(0xFFFEBC17),
                            )
                        )
                    )
                ) {
                    Text(
                        text = "START",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 36.sp,
                    )
                }
            }
        }
    }
}