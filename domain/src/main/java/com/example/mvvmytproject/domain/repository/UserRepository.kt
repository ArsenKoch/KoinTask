package com.example.mvvmytproject.domain.repository

import com.example.mvvmytproject.domain.models.SaveUserNameParam
import com.example.mvvmytproject.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName

}