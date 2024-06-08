package com.example.romerocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity1_3romero.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Act1()
            //Act2()
            Act3()
        }
    }
}


@Composable
fun Act1()
{
    Column {
        Image(
            painter = painterResource(id = R.drawable.picact1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text( //eto una
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building " +
                    "native Android Ul. Compose simplifies and " +
                    "accelerates Ul development on Android with less " +
                    "code, powerful tools, and intuitive Kotlin APls.",

            lineHeight = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp,end = 16.dp),

            )

        Text(
            text = "In this tutorial, you build a simple Ul component " +
                    "with declarative functions. You call Compose " +
                    "functions to say what elements you want and the " +
                    "Compose compiler does the rest. Compose is " +
                    "built around Composable functions. These " +
                    "functions let you define your app's Ul " +
                    "programmatically because they let you describe " +
                    "how it should look and provide data " +
                    "dependencies, rather than focus on the process of " +
                    "the UI's construction, such as initializing an " +
                    "element and then attaching it to a parent. To " +
                    "create a Composable function, you add the " +
                    "@Composable annotation to the function name.",
            lineHeight = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp),

            )
    }

}

@Composable
fun Act2()
{
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.approved),
            contentDescription = null,
            modifier = Modifier
                .width(280.dp)
                .height(280.dp)
        )
        Text(
            text ="All tasks Completed",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }

}

@Composable
fun Act3() {
    Box (
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
    ){
        Card( //q1
            colors = CardDefaults.cardColors(
                containerColor = Color(235, 214, 52),


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f),


            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Text composable",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "Display text and follows the recommended Material Design guidelines.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card( //q2
            colors = CardDefaults.cardColors(
                containerColor = Color(222, 235, 52),


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.TopEnd),



            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Image Composable",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "Creates a composable that lays out and draws a given Painter class Object.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card( //q3
            colors = CardDefaults.cardColors(
                containerColor = Color(52, 107, 235),


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomStart),



            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Row composable",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card( //q4
            colors = CardDefaults.cardColors(
                containerColor = Color(235, 52, 52),
            ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomEnd),

            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Column composable",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "A layout composable that places its children in a vertical sequence",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Act3()

}
