class pokemonEau {
    var nom = ""
    var hp = 0
    var atk = 0

    fun isDead(): Boolean {
        var statut = false

        if (this.hp == 0) {
            statut = true
        }

        return statut
    }
}