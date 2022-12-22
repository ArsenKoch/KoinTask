package com.example.mvvmytproject.data.repository

import com.example.mvvmytproject.data.storage.UserStorage
import com.example.mvvmytproject.data.storage.models.User
import com.example.mvvmytproject.domain.models.SaveUserNameParam
import com.example.mvvmytproject.domain.models.UserName
import com.example.mvvmytproject.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam)
        val result = userStorage.save(user)
        return result
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return mapToDomain(user)
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(user.firstName, user.lastName)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(saveParam.name, "")
    }
}