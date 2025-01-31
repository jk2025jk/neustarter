package de.syntax_institut.syntaxchat.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.syntaxchat.R

@Composable
fun TopAppBarView() {
    Box(modifier = Modifier.fillMaxWidth().height(120.dp) // Bestimme die Größe für das Banner
    ) {
        Image(
            painter = painterResource(id = R.drawable.neustarter_banner), // Bannerbild aus drawable
            contentDescription = "Banner Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "\uD83D\uDE80 Chatters",
            color = Color.White,
            fontSize = 24.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            letterSpacing = 2.sp,
            textDecoration = TextDecoration.None,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(start = 16.dp, top = 80.dp)
        )
    }
}
@Preview(showSystemUi = true)
@Composable
fun TopAppBarViewPreview() {
    TopAppBarView()
}

