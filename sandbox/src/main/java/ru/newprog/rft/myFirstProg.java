package ru.newprog.rft;

public class myFirstProg {
public static void main(String[] args) {
  hello("Anna");
  hello("Benny");
  hello("IDEA");

  int len=5;
  System.out.println("Площадь  квадрата со стороной " + len + "=" +area (len));

  int a=5, b=4;
  System.out.println("Площадь прямоугольника со сторонами "+ a +" и "+ b + " = "+ area (a,b));
}
public static void hello(String name){
  System.out.println("Привет, " + name +"!");
}
public static double area (double l){
  return l*l;
}
public static double area (double a,double b){
 return a*b;
}
}