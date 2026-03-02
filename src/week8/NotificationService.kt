package week8

import java.net.InetAddress

class NotificationService {
    fun sendEmail(emailAddress: String,) {
        println("Mengirim email to $emailAddress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {

            sendEmail(user.email!!)

        } else{

            println("User  ${user.email} tidak memiliki email")
        }
    }
}