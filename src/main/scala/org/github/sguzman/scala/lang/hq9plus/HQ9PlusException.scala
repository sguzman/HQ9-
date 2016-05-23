package org.github.sguzman.scala.lang.hq9plus

import java.io.{PrintStream, PrintWriter}

/**
  * @author Salvador Guzman - sguzman
  * @group ScHQ9+
  * @version org.github.sguzman.scala.lang.hq9plus
  * @note These are exceptions that are caused by improper syntax in the language.
  * @since 5/23/16 12:21 PM
  */
class HQ9PlusException extends Exception("No.") {
  override def fillInStackTrace(): Throwable = super.fillInStackTrace()

  override def getMessage: String = super.getMessage

  override def getStackTrace: Array[StackTraceElement] = super.getStackTrace

  override def getCause: Throwable = super.getCause

  override def setStackTrace(stackTrace: Array[StackTraceElement]): Unit = super.setStackTrace(stackTrace)

  override def getLocalizedMessage: String = super.getLocalizedMessage

  override def printStackTrace(): Unit = super.printStackTrace()

  override def printStackTrace(s: PrintStream): Unit = super.printStackTrace(s)

  override def printStackTrace(s: PrintWriter): Unit = super.printStackTrace(s)

  override def initCause(cause: Throwable): Throwable = super.initCause(cause)

  override def toString: String = super.toString
}
