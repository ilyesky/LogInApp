package com.example.loginapp.repository

import com.example.loginapp.network.AuthApi

class AuthRepository(
    private val api: AuthApi
) : BaseRepository(){

    suspend fun login(
        email: String,
        password: String
    ) = safeApiCall {
        api.login(email, password)
    }

}