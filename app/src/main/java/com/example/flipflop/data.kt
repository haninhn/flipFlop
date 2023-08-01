package com.example.flipflop

import androidx.annotation.DrawableRes

data class CardItem(  val id: Int,
                      val correct: String,
                      val number: String,
                      @DrawableRes val image: Int
)

val choicesList = listOf(
    CardItem(1, "",   R.drawable.choice_5),
    CardItem(2, "5",  R.drawable.choice_4),
    CardItem(3, "7",  R.drawable.choice_3),
    CardItem(3, "6",  R.drawable.choice_2),
    CardItem(3, "4",  R.drawable.choice_1),
)

