package com.learnscala

/**
  * Created by zhhy on 2018/8/15.
  */
object Variable {

  def main(args: Array[String]): Unit = {

//    val a1=Array(1,2,3)  // 用val修饰引用变量 引用不变 引用指向的内容可以变
//    val a2=Array(2,3,1)
//    //  a1=a2 错误 引用不能变
//    a1(0)=10  // 引用的内容可以变
//    for(e<-a1)
//      print(e+" ")
//
//    lazy val a=10  // lazy 只能修饰 val


//    for(i<- 1 to 3;j<- 1 to 3){
//      println(i+j)
//    }

    //  生成一个集合
   // val res=for(a<-1 to 10) yield a*10

//    for(b<-res)println(b)

    println(add(1, 2))



  }

  //定义方法
  def add(x:Int,y:Int)=x+y

  // 方法默认参数
  def love(str:String="dj")=println(str)
  love()



}
