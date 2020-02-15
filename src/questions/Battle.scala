package questions

class Battle(from: Pokemon, on: Pokemon) {
  //water 1, fire 2, grass 3
  def hit(): Unit = {
    if (on.HP > 0 && from.HP > 0) {
      from.pkmnType match {
        case 1 =>
          on.pkmnType match {
            case 2 => on.HP -= 50; if (on.HP > 0) println("Super effective \n" + on.name + "'s current HP: " + on.HP)
            case 3 => on.HP -= 10; if (on.HP > 0) println("Not very effective \n" + "current HP: " + on.HP)
          }
        case 2 =>
          on.pkmnType match {
            case 3 => on.HP -= 50; if (on.HP > 0) println("Super effective \n"+ on.name + "'s current HP: " + on.HP)
            case 1 => on.HP -= 10; if (on.HP > 0) println("Not very effective \n"+ on.name + "'s current HP: " + on.HP)
          }
        case 3 =>
          on.pkmnType match {
            case 1 => on.HP -= 50; if (on.HP > 0) println("Super effective \n"+ on.name + "'s current HP: " + on.HP)
            case 2 => on.HP -= 10; if (on.HP > 0) println("Not very effective \n"+ on.name + "'s current HP: " + on.HP)
          }
      }
    }
    else if (on.HP < 0){
      println(on.name + " fainted! Game over")
    }
    else {
      println(from.name + " can't battle")
    }
  }

}
