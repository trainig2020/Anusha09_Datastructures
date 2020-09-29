package io.anusha;

import java.util.Scanner;

public class SortedLinkedList
{
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList(); 
        System.out.println("Sorted Circular Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSorted Circular Singly Linked List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. delete at position");
            System.out.println("3. check empty");
            System.out.println("4. get size");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 3 : 
                System.out.println("Empty status = "+ list.isEmpty()+"\n");
                break;                   
            case 4 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
 
        } while (ch == 'Y'|| ch == 'y');               
    }
}
