package com.example.mvvmytproject.domain.usecase

import com.example.mvvmytproject.domain.models.UserName
import com.example.mvvmytproject.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName{
        return userRepository.getName()
    }
}