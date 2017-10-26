package br.com.heiderlopes.androidiotkotlin

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId


class AppFirebaseInstanceIDService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        // Get updated InstanceID token.
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d("FCM Token", "Refreshed token: " + refreshedToken!!)
        sendRegistrationToServer(refreshedToken)
    }

    private fun sendRegistrationToServer(token: String?) {
        // TODO: Implement this method to send any registration to app's server.
    }
}
