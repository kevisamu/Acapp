package com.ezbits.acapp.data

import com.ezbits.acapp.data.model.LoggedInUser
import com.ezbits.acapp.data.model.User
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class LoginRepository(val dataSource: LoginDataSource) {

    // in-memory cache of the loggedInUser object
    var loggedInUser: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = loggedInUser != null

    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    private lateinit var user: User
    private var task: Task<AuthResult>? = null

    init {


        if (firebaseAuth.currentUser != null){
            //user = firebaseAuth.currentUser!!
        } else{
            //TODO-- HANDLE START LOGIN ACTIVITY

        }
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        
    }

    fun logout() {
        loggedInUser = null

    }

    fun login(username: String, password: String, firebaseAuth: FirebaseAuth): Task<AuthResult>? {
        // handle login with FirebaseAuth
        val result = firebaseAuth.signInWithEmailAndPassword(username, password)

        return result
    }

    private fun setLoggedInUser(firebaseUser: FirebaseUser?) {
        this.loggedInUser = loggedInUser

        firebaseUser?.let {

        }


        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }

    fun getCurrentUser(): User? {
        return this.user
    }
}

