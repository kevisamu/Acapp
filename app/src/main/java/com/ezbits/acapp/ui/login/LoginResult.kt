package com.ezbits.acapp.ui.login

/**
 * Authentication result : success or error message.
 */
data class LoginResult(

    /**val success: LoggedInUserView? = null,**/
    val error: Int? = null
)