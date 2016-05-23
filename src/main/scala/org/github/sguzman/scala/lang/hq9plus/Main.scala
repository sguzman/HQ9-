package org.github.sguzman.scala.lang.hq9plus

/**
  * @author Salvador Guzman - sguzman
  * @group ScHQ9+
  * @version org.github.sguzman.scala.lang.hq9plus.impl
  *
  * @note HQ9+ intepreter
  *
  * @since 5/22/16 9:48 PM
  */
object Main {
  /**
    * Damn it all!
    */
  private def damnItAll() = System.exit(0)

  /**
    * Faithfully represent counter
    */
  var counter = 0

  /**
    * Handle input file
    *
    * @param args: Array[String]
    */
  def main(args: Array[String]) = {
    if (args.length < 2) {
      println(s"usage: ${args.head} <file>")
      damnItAll()
    }
  }
}