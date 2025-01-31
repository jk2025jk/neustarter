package de.syntax_institut.syntaxchat.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.syntaxchat.USER_NAME
import de.syntax_institut.syntaxchat.ui.theme.chatBlue

@Composable
fun MessageView(userName: String, text: String, time: String) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            shadowElevation = 4.dp
        ) {

        Column {
            Row {
            Text(text = userName,
                modifier = Modifier.padding(16.dp),
                color = Color.Black,
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif ,
                letterSpacing = 0.sp,
                textDecoration = TextDecoration.None,
                textAlign = TextAlign.Left)
            Text(text = time,
                modifier = Modifier.padding(16.dp),
                color = Color.Black,
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif ,
                letterSpacing = 0.sp,
                textDecoration = TextDecoration.None,
                textAlign = TextAlign.Left)
            }
            Text(text = text,
                modifier = Modifier.padding(16.dp),
                color = Color.Black,
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.SansSerif ,
                letterSpacing = 0.sp,
                textDecoration = TextDecoration.None,
                textAlign = TextAlign.Left)
        }
    }


}

@Preview
@Composable
fun MessageViewPreview() {
    MessageView(
        userName = "MaxMustermann",
        text = "Hallo wie geht es dir heute? 😊",
        time = "10:00"
    )
}