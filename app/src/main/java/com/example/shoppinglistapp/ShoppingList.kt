package com.example.shoppinglistapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class ShoppingItem(val id:Int,
                        var name:String,
                        var isEditing: Boolean = false
)

@Composable

fun ShoppingListApp(){
    // Variable that holds the state and list of shop items
    var shopItems by remember{ mutableStateOf(listOf<ShoppingItem>()) }
    //Column grid that holds all widgets in a column space.
    Column (
        //Modifier is used to fill the entire screen
        modifier= Modifier.fillMaxSize(),
        //Arranges the column to be in the center of the screen
        verticalArrangement = Arrangement.Center)
    {
        Button(
            onClick = {},
            //Aligns button in the middle of the screen.
            modifier= Modifier.align(Alignment.CenterHorizontally))
        {
            Text("Add Item")
        }
        LazyColumn(
            modifier= Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            items(shopItems){

            }
        }
    }
}