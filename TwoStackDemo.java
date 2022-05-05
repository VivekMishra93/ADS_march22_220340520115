/*Question 3----
java program to implement two stack in a single array */

import java.util.Scanner;
class TwoStack{
 int [] a;
 int size;
 int top1,top2;
   TwoStack(int n)
   {
     size=n;
	 a=new int[n];
     top1=n/2+1;
     top2=n/2;
	 
   
   }
   void push1(int x){
   
   if(top1>0){
   top1--;
   a[top1]=x;
   
   
   }
   else{
   System.out.println("Stack overflow" + " by element :" + x +"\n");
   return ;
   
   }
   }
   void push2(int x){
   
   if(top2<size-1){
   top2++;
   a[top2]=x;
   
   
   }
   else{
   System.out.println("Stack overflow" + " by element :" + x +"\n");
   return ;
   
   }
   }
   int pop1()
   {
     if(top1<=size/2){
	 int x=a[top1];
	 top1++;
	 return x;
	 
	 
	 }
	 else{
	   System.out.println("Stack underflow");
	   System.exit(1);
	 
	 }
	 return 0;
     
   }
   int pop2()
   {
     if(top2>=size/2+1){
	 int x=a[top2];
	 top2--;
	 return x;
	 
	 
	 }
	 else{
	   System.out.println("Stack underflow");
	   System.exit(1);
	 
	 }
	 return 1;
   
   }

}

class TwoStackDemo{
 public static void main(String args[]){
 
   TwoStack t= new TwoStack(5);
   t.push1(5);
   t.push2(10);
   t.push2(40);
   t.push1(11);
   t.push2(7);
   
  
   
   System.out.println("popped element from stack1 is " + " : " + t.pop1() + "\n");
    t.push2(15);
   System.out.println("popped element from stack2 is " + " : " + t.pop2() + "\n");

 
 
 }

}

