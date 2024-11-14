import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.example.jetpackcompose.R

@Preview
@Composable
fun App(modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = colorResource(id = R.color.DarkGreen))
        ) {
            Text(
                text = stringResource(R.string.Inicio),
                modifier = Modifier
                    .weight(2f)
                    .align(Alignment.CenterVertically)
                    .padding(5.dp),
                color = Color.White,
                style = TextStyle(fontSize = 24.sp)
                
            )

            Image(
                painter = painterResource(R.drawable.camara),
                contentDescription = "Camara Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f)
                    .size(20.dp),
            )

            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                tint = Color.White

            )
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Search Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                tint = Color.White

            )
        }

        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona1),
            Modifier
                .background(Color.White)
                .weight(5f)
                .padding(5.dp)
                .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
    }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona2),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona3),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona4),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona5),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona6),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona7),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona8),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona9),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona10),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
        Row(
            modifier=Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Image(
                painter = painterResource(R.drawable.wassap2),
                contentDescription = "Wassap Icon",
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .size(200.dp)
            )

            Text(  text = stringResource(R.string.Persona11),
                Modifier
                    .background(Color.White)
                    .weight(5f)
                    .padding(5.dp)
                    .clickable { },
                style = TextStyle(fontSize = 20.sp)


            )
        }
}
}