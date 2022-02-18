fun main() {
    val personAuth = PersonAuth("google@google.by", "bestHash")
    authPerson(personAuth)
    changePersonPassword(personAuth.email, "md5Hash")
}