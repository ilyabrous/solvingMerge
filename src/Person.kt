import kotlin.random.Random

data class PersonAuth(val email: String, val password: String)
data class PersonRegister(val name: String, val email: String, val password: String)

fun authPerson(personAuth: PersonAuth) : Boolean = Random.nextBoolean()

fun changePersonPassword(email: String, newPassword: String) : Boolean = Random.nextBoolean()

fun registerPerson(personRegister: PersonRegister): Boolean = Random.nextBoolean()

fun deleteUser(email: String) : Boolean = Random.nextBoolean()