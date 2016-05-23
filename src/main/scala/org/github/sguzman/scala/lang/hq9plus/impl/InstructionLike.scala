package org.github.sguzman.scala.lang.hq9plus.impl

/**
  * @author Salvador Guzman - sguzman
  * @group ScHQ9+
  * @version org.github.sguzman.scala.lang.hq9plus.impl
  *
  * @note This trait struction represents what any eager instructions in the HQ9+
  *       language should conform to. Each implementing class should have a method
  *       called `execute`. This will be the main logic of the instruction.
  *
  *       In addition there will also be a `getDirective` method that returns the
  *       character that the instruction expects. When the driver program sees,
  *       this character, the proper instruction will be executed.
  *
  * @since 5/22/16 9:39 PM
  */
abstract class InstructionLike {
  /**
    * Return the expected character that the instruction expects
    * @return Char
    */
  abstract def getDirective: Char

  /**
    * Execute the logic of the instruction
    */
  abstract def execute(): Unit
}
