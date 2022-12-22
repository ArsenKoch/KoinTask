package com.example.mvvmytproject.di

import com.example.mvvmytproject.data.repository.UserRepositoryImpl
import com.example.mvvmytproject.data.storage.UserStorage
import com.example.mvvmytproject.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.mvvmytproject.domain.repository.UserRepository
import org.koin.dsl.module


val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}