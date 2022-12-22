package com.example.mvvmytproject.di

import com.example.mvvmytproject.domain.usecase.GetUserNameUseCase
import com.example.mvvmytproject.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module


val domainModule = module {

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}