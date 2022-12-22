package com.example.mvvmytproject.domain.usecase


import com.example.mvvmytproject.domain.models.SaveUserNameParam
import com.example.mvvmytproject.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        val result: Boolean = userRepository.saveName(param)
        return result
    }
}