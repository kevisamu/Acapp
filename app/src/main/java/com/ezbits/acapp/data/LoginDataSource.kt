package com.ezbits.acapp.data

import com.ezbits.acapp.data.model.LoggedInUser
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String, firebaseAuth: FirebaseAuth): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val loggedInUser = LoggedInUser(
                firebaseAuth.currentUser!!.uid
                , firebaseAuth.currentUser!!.displayName.toString()
                , firebaseAuth.currentUser!!.providerId)
            return Result.Success(loggedInUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }

    fun setLoggedInUser(it: FirebaseUser) {
    }
}