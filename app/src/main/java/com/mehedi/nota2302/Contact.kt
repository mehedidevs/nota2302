package com.mehedi.nota2302

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity
data class Contact(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo("full_name")
    val name: String,
    val email: String,
    val mobile: String

) : Parcelable
