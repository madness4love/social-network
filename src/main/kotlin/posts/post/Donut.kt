package posts.post

import enums.EditModeEnum

data class Donut(
    val isDonut: Boolean?,
    val paidDuration : Int,
    val placeholder : String?,
    val canPublishFreeCopy : Boolean,
    val editMode : EditModeEnum
)