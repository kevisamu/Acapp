package com.ezbits.acapp.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    private val uuid: String,
    val displayName: String,
    private val status: String


)