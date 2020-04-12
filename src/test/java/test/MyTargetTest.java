package test;
import annotation.MyTarget;

import java.lang.reflect.Method;
public class MyTargetTest  
{  
 @MyTarget
 public void doSomething()  
 {  
  System.out.println("hello world");  
 }  
   
 public static void main(String[] args) throws Exception {
   Method method = MyTargetTest.class.getMethod("doSomething",null);
   if(method.isAnnotationPresent(MyTarget.class)){
    //如果doSomething方法上存在注解@MyTarget，则为true
    System.out.println("反射获取到。。。。。。。。。。"+method.getAnnotation(MyTarget.class));
   }else {
       System.out.println("反射没有获取到。。。。。。。。。。");
   }
  }  
}