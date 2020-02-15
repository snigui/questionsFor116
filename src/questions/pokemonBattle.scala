package questions

object pokemonBattle {
  def main(args: Array[String]): Unit = {
    val scorbunny: Pokemon = new Scorbunny
    val grookey: Pokemon = new Grookey
    val scorbunnyHits: Battle = new Battle(scorbunny, grookey)
    scorbunnyHits.hit()
    scorbunnyHits.hit()
    scorbunnyHits.hit()
    val grookeyHits: Battle = new Battle(grookey, scorbunny)
    grookeyHits.hit()
    scorbunnyHits.hit()
    grookeyHits.hit()
  }
}
