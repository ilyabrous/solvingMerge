data class Admin(val name: String, val password: String, val rule: AdminRule )

enum class AdminRule {
    TOP_ADMIN,
    ADMINISTRATOR,
    LOCAL_ADMIN
}