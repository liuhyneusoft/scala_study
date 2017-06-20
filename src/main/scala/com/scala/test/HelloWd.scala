package com.scala.test

object HelloWd {
  def main(args: Array[String]): Unit = {
    println("Hello world !!!");
    handler("Print Hello World");
    println(handlerS("Hello world @@@"));
  }

  //Unit 等同于 void
  def handler(str:String):Unit = {
    println(str);
  }

  def handlerS(str:String):String = {
    var temp : String = "hehe";  //声明变量
    val pa = (40,"Foo");   //声明多个变量

    return pa._2;
  }




}
