package com.example.mvvmytproject.data.storage

import com.example.mvvmytproject.data.storage.models.User

interface UserStorage {
    fun save(user: User): Boolean

    fun get(): User
}