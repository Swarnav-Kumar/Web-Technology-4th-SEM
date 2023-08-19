/*. Write a program in Java to define a class Number with appropriate data 
members and member functions to input n number of integers and swap the 
biggest and smallest elements. Use member functions read(), swap() and 
display().*/

import java.util.Scanner;
class Number{
    int n;
    int no[];
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array\n");
        n=sc.nextInt();
        no=new int[n];
        System.out.println("Enter the numbers\n");
        for(int i=0;i<n;i++){
            no[i]=sc.nextInt();
        }
    }
    void swap(){
        int n1;
        n1=no[0];
        no[0]=no[n-1];
        no[n-1]=n1;
    }
    void display(){
        System.out.println("The array after swapping values is");
        for(int i=0;i<n;i++){
            System.out.print(" "+no[i]);
        }
    }
}
class program4_5{
    public static void main(String args[]){
        Number n=new Number();
        n.read();
        n.swap();
        n.display();
    }
}
