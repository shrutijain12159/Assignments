import java.util.Scanner;
import java.lang.*;
public class BookManagementSystem
{
    class Node{
        String bookname;
        Node next;
        public Node(String bname)
        {
            this.bookname=bname;
            this.next=null;
        }
    }
    public int capacity;
    public Node head=null;
    public Node current=null;
    
    public  void InsertBookAtEnd(String bname) {
        Node newnode=new Node(bname);
        if(head==null)
        {
            head=newnode;
            current=newnode;
          	System.out.println("Book inserted successfully!");
        }
        else
        {
            current.next=newnode;
            current=newnode; 
            System.out.println("Book inserted successfully!");
        }
    }

    public  void InsertBookAtPosition(String bname,int pos) {
        Node newnode=new Node(bname);
        if(head==null)
        {
            head=newnode;
            current=newnode;
            System.out.println("Book inserted successfully!");
        }
        else if(pos>capacity || pos<1)
        {
            System.out.println("Invalid position , cannot insert");
        }
        else
        {
            if(pos==1)
            {
                newnode.next=head;
                head=newnode;
                System.out.println("Book inserted successfully!");
            }
            else
            {
                int i=1;
                Node temp=head;
                while(i<pos-1)
                {
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
                System.out.println("Book inserted successfully!");
            }
            
        }
    }

    public void ShowBooks() {
        if(head==null)
            System.out.println("No books in list");
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.bookname + " ");
                temp=temp.next;
            }
        }
        
    }

    public int GetSize() {
        int count=0;
        if(head==null)
        {
            System.out.println("No books in list ");
            return count;
        }
        else
        {   
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
        
    }

    public void SearchBook(String bname) {
        if(head==null)
            System.out.println("Empty List!!");
        else{
            Node temp=head;
            boolean found=false;
            while(temp!=null)
            {
                if(temp.bookname.equals(bname))
                {
                    found=true;
                    break;
                }
                temp=temp.next;
            }
            if(found==true)
                System.out.println("Book Found");
            else
            System.out.println("Book Not Found");
        }
        
    }

    public void DeleteBook(int pos) {
        if(pos>capacity || pos>GetSize() || pos<1)
            System.out.println("Can't delete!! No such position exsists");
        else
        {
            if(pos==1)
            {
                System.out.println(head.bookname + " Book deleted");
                head=head.next;
            }
            else{
                Node temp=head;
                int i=1;
                while(i<pos-1)
                {
                    temp=temp.next;
                    i++;
                }
                System.out.println(temp.next.bookname + " Book deleted");
                temp.next=temp.next.next;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        String name;
        
        int choice=0;
        int  size;
        int position=0;
        BookManagementSystem ob=new BookManagementSystem();
        System.out.println("Enter list max capacity");
        ob.capacity=sc.nextInt();

        while (flag) {
            System.out.println(" 1:Insert book at end of the list \n 2:Inert book at particular position \n 3:Delete book from position \n 4:Display Book names list \n 5:Display List size \n 6:Search for any book \n 7:Exit");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    if(ob.GetSize()<ob.capacity)
                    {
                        System.out.println("Enter book name - ");
                        sc.nextLine();
                        name=sc.nextLine();
                        ob.InsertBookAtEnd(name);
                    }
                    else
                        System.out.println("List full can't insert");
                    break;

                case 2:
                    System.out.println("Enter book name - ");
                    sc.nextLine();
                    name=sc.nextLine();
                    System.out.println("Enter insert position - ");
                    position=sc.nextInt();
                    ob.InsertBookAtPosition(name,position);
                    break;

                case 3:
                    System.out.println("Enter position you want to delete - ");
                    position=sc.nextInt();
                    ob.DeleteBook(position);
                    break;

                case 4:
                    System.out.println("Book List = ");
                    ob.ShowBooks();
                    break;

                case 5:
                    size=ob.GetSize();
                    System.out.println("Number of books present in the list are = "+size);
                    break;

                case 6:
                    System.out.println("Enter book name to search - ");
                    sc.nextLine();
                    name=sc.nextLine();
                    ob.SearchBook(name);
                    break;
                case 7:
                    flag=false;
                    break;
            }

        }
    }
}
