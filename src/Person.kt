import kotlin.random.Random

data class PersonAuth(val email: String, val password: String)

fun authPerson(personAuth: PersonAuth) : Boolean = Random.nextBoolean()

fun changePersonPassword(email: String, newPassword: String) : Boolean = Random.nextBoolean()