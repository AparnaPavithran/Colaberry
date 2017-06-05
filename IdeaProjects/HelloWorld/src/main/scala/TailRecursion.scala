/**
  * Created by APARNA on 6/1/17.
  */
object TailRecursion extends App{

  //tail recursion
  println("Tail recursion "+fibTailRec(100000))
  println("Tail recursion2 "+fibTailRec2(100000))
  //regular recursion
//  println("Regular fib "+fib(100))

  def fib(n:Int): Int = {
    if (n > 1)
       fib(n - 1)+fib(n - 2)
    else n
  }




  def fibTailRec(n:Int): Int = {
    if (n > 1)
      fibItr(1,1,n - 2)
    else n
  }

  import scala.annotation.tailrec
  def fibItr(prev:Int, current:Int, n:Int): Int ={
    if(n==0) current
    else{
      fibItr(current,prev+current,n-1)
    }
  }

  def fibTailRec2(n:Int):Int =  {

@annotation.tailrec
    def loop(n:Int, prev:Int, cur:Int): Int ={
      if(n<=1) prev
      else loop(n-1, cur, prev+cur)
    }
    loop(n,1,1)
  }
}
