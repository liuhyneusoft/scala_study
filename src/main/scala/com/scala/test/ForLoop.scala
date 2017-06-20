package com.scala.test

import scala.util.control.Breaks

object ForLoop {


  def forLoop1(): Unit = {
    var a = 10;
    while (a < 20) {
      println("Value of a: " + a)
      a = a + 1;
    }
  }

  def forLoop2(): Unit ={
    var a = 20;
    do{
      println( "Value of a: " + a );
      a = a + 1;
    }while( a < 26 )
  }

  def forLoop3(): Unit ={
    var a = 0;
    for( a <-  1 to 10){
      println( "Value of a: " + a );
    }
  }

  def forLoop4(): Unit ={
    var a = 0;
    for( a <- 1 until 6){
      println( "Value of a: " + a );
    }
  }
  //排列组合
  def forLoop5(): Unit ={
    var a = 1;
    var b = 4;
    for( a <- 1 to 3; b <- 4 to 6){
      println( "Value of a: " + a );
      println( "Value of b: " + b );
    }
  }

  //for list
  def forLoop6(): Unit ={
    var a = 0;
    val numList = List(1,3,5,6);
    for( a <- numList ){
      println( "Value of a: " + a );
    }
  }

  //for list + condition
  def forLoop7(): Unit ={
    var a = 0;
    val numList = List(1,3,5,6);
    for( a <- numList if a != 3; if a < 6 ){
      println( "Value of a: " + a );
    }
  }

  //for list + yield
  def forLoop8(): Unit ={
    var a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);

    //循环 numList，构造一个新的list
    var retVal = for{
                      a <- numList if a != 3; if a < 8
                  }yield a

    for( a <- retVal){
      println( "Value of a: " + a );
    }
  }

  //break for loop
  def forLoop9(): Unit ={
    var a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);

    val loop = new Breaks;
    loop.breakable {
      for( a <- numList){
        println( "Value of a: " + a );
        if( a == 4 ){
          loop.break;
        }
      }
    }
    println( "After the loop" );
  }

  //break nested for loop
  def forLoop10(): Unit ={
    var a = 0;
    var b = 0;
    val numList1 = List(1,2,3,4);
    val numList2 = List(11,12,13);

    val outer = new Breaks;
    val inner = new Breaks;

    outer.breakable {
      for( a <- numList1){
        if( a == 3 ){
          outer.break;
        }
        println( "Value of a: " + a );
        inner.breakable {
          for( b <- numList2){
            if( b == 12 ){
              inner.break;
            }
            println( "Value of b: " + b );
          }
        }
      }
    }
  }
  def main(args: Array[String]): Unit = {
    forLoop10();
  }
}
