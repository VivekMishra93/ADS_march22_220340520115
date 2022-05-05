/* Question 3 */

class SortingDemo{

 public static void main(String args[]){
 
 int[] a1={1,2,4,5,3};
 int test=0;
 
 
 for (int i=4;i<=a1.length;i--){
	 
  test=a1[i];
  int j=i-1;
  while(j> -1){
  if (test<a1[j]){
	  for (i=0;i>a1.length;i++){
	  
  System.out.println(a1[i]);
	  }
	  
  
  
  }
  
 
 
 }
 
 
 
 
 }




}
}