import java.util.*;
class CentralLibrary
  {
    ArrayList<Book> bookList=new ArrayList<Book>();
    ArrayList<LibraryMember> memberList=new ArrayList<LibraryMember>();
    ArrayList<BookIssuranceHistory> historyList=new ArrayList<BookIssuranceHistory>();
    Scanner sc=new Scanner(System.in);
    public void addBook()
    {
      int id;
      while(true)
        {
           System.out.println("enter book id");
           id=sc.nextInt();
          boolean isUnique=true;
          for(Book value:bookList)
            {
              if(value.bookId==id)
              {
                isUnique=false;
                System.out.println("Book id must be unique");
                break;
              }
            }
          if(isUnique)
          {
            System.out.println("id is valid");
            break;
          }
        }
      sc.nextLine();
      System.out.println("enter title of the book");
      String title=sc.nextLine();
      System.out.println("enter author name");
      String author=sc.nextLine();
      System.out.println("enter book genre");
      String genre=sc.next();
      System.out.println("enter quantity of the book");
      int quantity=sc.nextInt();
      sc.nextLine();
      System.out.println("enter book publishing date in the format of (dd-mm-yyyy");
      String publishing_date=sc.nextLine();
      double price;
      while(true)
        {
      System.out.println("enter book price");
      price=sc.nextDouble();
          if(price>0)
          {
            System.out.println("valid price");
            break;
          }
          else{
            System.out.println("invalid price");
          }
        }
      Book book=new Book(id,title,author,genre,quantity,publishing_date,price);
      bookList.add(book);
      System.out.println("one book is added");
    }
    public void viewAllBooks()
    {
      if(bookList.size()>0)
      {
      System.out.println("All book details are");
      for(Book value:bookList)
        {
          System.out.println("Book id: "+value.bookId);
          System.out.println("Book title: "+value.title);
          System.out.println("Author: "+value.author);
          System.out.println("Genre of the book: "+value.genre);
          System.out.println("Number of copies of the book: "+value.quantity);
           System.out.println("Book publication date: "+value.publish_year);
           System.out.println("Book price: "+value.price);
          System.out.println("-----------");
        }
      }
      else
      {
        System.out.println("The list of the books is empty");
      }
    }
    public void searchForBookById()
    {
      if(bookList.size()>0)
      {
      boolean bookFound=false;
      System.out.println("enter the book id to search");
      int id=sc.nextInt();
      for(Book value:bookList)
        {
          if(value.bookId==id)
          {
          System.out.println("Book id: "+value.bookId);
          System.out.println("Book title: "+value.title);
          System.out.println("Author: "+value.author);
          System.out.println("Genre of the book: "+value.genre);
          System.out.println("Number of copies of the book: "+value.quantity);
          bookFound=true;
          }
        }
      if(bookFound==false)
      {
        System.out.println("No such type of book with the given id");
      }
      }
      else{
        System.out.println("The list of the books is empty");
      }
    }
    public void searchForBookByTitle()
    {
      if(bookList.size()>0)
      {
      sc.nextLine();
      System.out.println("enter the book title to search");
      String title=sc.nextLine();
      boolean bookFound=false;
      for(Book value:bookList)
        {
           String data=value.title;
          if(data.equalsIgnoreCase(title))
          {
          System.out.println("Book id: "+value.bookId);
          System.out.println("Book title: "+value.title);
          System.out.println("Author: "+value.author);
          System.out.println("Genre of the book: "+value.genre);
          System.out.println("Number of copies of the book: "+value.quantity);
          bookFound=true;
          }
        }
      if(bookFound==false)
      {
        System.out.println("There is no such type of book with the given book title");
      }
      }
      else
      {
        System.out.println("The list of the books is empty");
      }
    }
    public void searchForBookByAuthor()
    {
      if(bookList.size()>0)
      {
        sc.nextLine();
      System.out.println("enter the author name to search a book");
      String author=sc.nextLine();
      boolean bookFound=false;
      for(Book value:bookList)
        {
           String data=value.author;
          if(data.equalsIgnoreCase(author))
          {
          System.out.println("Book id: "+value.bookId);
          System.out.println("Book title: "+value.title);
          System.out.println("Author: "+value.author);
          System.out.println("Genre of the book: "+value.genre);
          System.out.println("Number of copies of the book: "+value.quantity);
          bookFound=true;
          }
        }
      if(bookFound==false)
      {
        System.out.println("There is no such type of book with the given author name");
      }
      }
      else
      {
        System.out.println("The list of the books is empty");
      }
    }
    public void searchForBookByGenre()
    {
      if(bookList.size()>0)
      {
        sc.nextLine();
      System.out.println("enter the type of genre to search a book");
      String genre=sc.nextLine();
      boolean bookFound=false;
      for(Book value:bookList)
        {
           String data=value.genre;
          if(data.equalsIgnoreCase(genre))
          {
          System.out.println("Book id: "+value.bookId);
          System.out.println("Book title: "+value.title);
          System.out.println("Author: "+value.author);
          System.out.println("Genre of the book: "+value.genre);
          System.out.println("Number of copies of the book: "+value.quantity);
          bookFound=true;
          }
        }
      if(bookFound==false)
      {
        System.out.println("There is no such type of book with the given genre type");
      }
      }
      else
      {
        System.out.println("The list of the books is empty");
      }
    }
    public void addLibraryMember()
    {
      int id;
      while(true)
        {
           System.out.println("enter member id");
           id=sc.nextInt();
          boolean isUnique=true;
          for(LibraryMember value:memberList)
            {
              if(value.memberId==id)
              {
                isUnique=false;
                System.out.println("Member id must be unique");
                break;
              }
            }
          if(isUnique)
          {
            System.out.println(" member id is valid");
            break;
          }
        }
      sc.nextLine();
      System.out.println("enter the full name");
      String fullName=sc.nextLine();
      // System.out.println("enter the age");
      //int age=sc.nextInt();
      int age;
      while(true)
        {
          System.out.println("enter age");
          age=sc.nextInt();
          if(age>=15&&age<=99)
          {
            System.out.println("valid age");
            break;
          }
          else{
            System.out.println("invalid age");
          }
        }
      String mobileNo;
      while(true)
        {
      System.out.println("enter mobile number");
          mobileNo=sc.next();
          if(mobileNo.length()==10 && (mobileNo.startsWith("9")||mobileNo.startsWith("8")||mobileNo.startsWith("7")||mobileNo.startsWith("6")))
          {
            System.out.println("Mobile number is valid");
            break;
          }
          else{
            System.out.println("Invalid mobile number");
          }
       }
      int issuedBooks=0;
      /*while(true)
        {
          System.out.println("enter issued books");
          issuedBooks=sc.nextInt();
          if(issuedBooks>0 && issuedBooks<=2)
          {
            System.out.println("valid issurance");
            break;
          }
          else{
            System.out.println("Invalid issurance");
          }
        }*/
      LibraryMember member=new LibraryMember(id,fullName,age,mobileNo,issuedBooks);
      memberList.add(member);
      System.out.println("one member record is added");
    }
    public void displayAllLibraryMembers()
    {
      if(memberList.size()>0)
      {
         System.out.println("All library members details are");
        for(LibraryMember value:memberList)
          {
            System.out.println("Member id: "+value.memberId);
            System.out.println("Name: "+value.fullName);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.mobileNo);
            System.out.println("Issued books: "+value.issuedBooks);
          }
      }
      else{
        System.out.println("Members list is empty");
      }
    }
    public void searchForMemberById()
    {
      if(memberList.size()>0)
      {
       System.out.println("enter member id to search");
        int id=sc.nextInt();
        boolean memberFound=false;
        for(LibraryMember value:memberList)
          {
            if(value.memberId==id)
            {
              System.out.println("Member id is :"+value.memberId);
              System.out.println("Member name: "+value.fullName);
              System.out.println("Age of the member: "+value.age);
              System.out.println("Mobile number: "+value.mobileNo);
              memberFound=true;
            }
          }
        if(memberFound==false)
        {
          System.out.println("There is no library member with the given id");
        }
      }
      else
      {
        System.out.println("Members list is empty");
      }
    }
    public void searchForMemberByName()
    {
      if(memberList.size()>0)
      {
        sc.nextLine();
       System.out.println("enter the name to search"); 
       String name=sc.nextLine();
       boolean memberFound=false;
        for(LibraryMember value:memberList)
          {
            String data=value.fullName;
            if(data.equalsIgnoreCase(name))
            {
              System.out.println("Member id is :"+value.memberId);
              System.out.println("Member name: "+value.fullName);
              System.out.println("Age of the member: "+value.age);
              System.out.println("Mobile number: "+value.mobileNo);
              memberFound=true;
            }
          }
        if(memberFound=false)
        {
          System.out.println("There is no library member with the given name");
        }
      }
      else{
        System.out.println("Members list is empty");
      }
    }
    public void searchForMemberByAgeRange()
    {
      if(memberList.size()>0)
      {
        boolean memberFound=false;
        System.out.println("Enter starting age");
        int startAge=sc.nextInt();
        System.out.println("Enter ending age");
        int endAge=sc.nextInt();
        for(LibraryMember value:memberList)
          {
            if(value.age>=startAge && value.age<=endAge)
            {
              System.out.println("Member id is :"+value.memberId);
              System.out.println("Member name: "+value.fullName);
              System.out.println("Age of the member: "+value.age);
              System.out.println("Mobile number: "+value.mobileNo);
              memberFound=true;
            }
          }
        if(memberFound==false)
        {
          System.out.println("No such type of members within the given age range");
        }
      }
      else{
        System.out.println("Members list is empty");
      }
    }
    public void borrowBook() throws MemberNotFoundException
    {
      System.out.println("enter library member id");
      int id=sc.nextInt();
      boolean memberFound=false;
      boolean bookFound=false;
      for(LibraryMember value:memberList)
        {
          if(value.memberId==id)
          {
            memberFound=true;
            if(value.issuedBooks<2)
            {
           System.out.println("enter book id to borrow");
            int bid=sc.nextInt();
            for(Book data:bookList)
              {
                if(data.bookId==bid)
                {
                  bookFound=true;
                  if(data.quantity>0)
                  {
                    data.quantity=data.quantity-1;
                    System.out.println("Book Issued successfully");
                    value.issuedBooks=value.issuedBooks+1;//BookIssuranceHistory
                              int memberId=value.memberId;
                             String fullName=value.fullName;
                             int age=value.age;
                            String mobileNo=value.mobileNo;
                             int issuedBooks=value.issuedBooks;
                            int bookId=data.bookId;
                              String title=data.title;
                              BookIssuranceHistory obj=new BookIssuranceHistory(memberId,fullName,age,mobileNo,issuedBooks,bookId,title);
                              historyList.add(obj);
                      }
                  else{
              System.out.println("Currently we can not issue the book because your issurance books limit is exceeded");
            }
                  }
                
                }
              }
            }
        }
            if(bookFound==false)
            {
              System.out.println("There is no such type of book with given id");
            }
          if(memberFound==false){
            throw new MemberNotFoundException("There is no such type of member with the given id");
          }
      
    }
     public void returnBook() throws MemberNotFoundException
    {
      System.out.println("enter library member id");
      int id=sc.nextInt();
      boolean memberFound=false;
      for(LibraryMember value:memberList)
        {
          if(value.memberId==id)
          {
            memberFound=true;
            System.out.println("enter book id to return the book and to update the number of copies");
            int bid=sc.nextInt();
            boolean bookFound=false;
            for(Book data:bookList)
              {
                if(data.bookId==bid)
                {
                  bookFound=true;
                  data.quantity=data.quantity+1;
                  value.issuedBooks=value.issuedBooks-1;
                  System.out.println("Book retuned successfully");
                }
              }
            if(bookFound==false)
            {
              System.out.println("There is no such type of book with given id");
            }
          }
        }
          if(memberFound==false){
            throw new MemberNotFoundException("There is no such type of member with the given id");
          }
        }
    public void displayIssuranceHistory()
    {
      if(historyList.size()>0)
      {
        for(BookIssuranceHistory value:historyList)
          {
            System.out.println("Member id: "+value.memberId);
            System.out.println("Name: "+value.fullName);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.mobileNo);
            System.out.println("Issued books: "+value.issuedBooks);
            System.out.println("book id: "+value.bookId);
            System.out.println("title: "+value.title);
          }
      }
      else
      {
        System.out.println("No History");
      }
    }
    public void loginPage()
    {
      String nextStep="";
      do{
      System.out.println(" 1.Admin/Librarian \n 2.Library member");
      System.out.println("enter your choice");
      int login=sc.nextInt();
      if(login==1)
        {
          String next="";
    do{
      System.out.println(" 1.Adding one Book \n 2.Display all books details \n 3.Searching for a book by using book id \n 4.Searching for a book by using book title \n 5.Searching for a book by using author name \n 6.Searching for a book by using genre type \n 7.Add a library member \n 8.Display all member details \n 9.Searching for a member by using member id \n 10.Searching for a member by using name \n 11.Searching for a member by using specified age range \n 12.To display the book issurance history");
        System.out.println("**************************");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        //sc.nextLine();
        switch(choice)
          {
            case 1:
              System.out.println("Enter the book details");
              addBook();
              break;
            case 2:
              viewAllBooks();
              break;
            case 3:
              searchForBookById();
              break;
            case 4:
              searchForBookByTitle();
              break;
            case 5:
              searchForBookByAuthor();
              break;
            case 6:
              searchForBookByGenre();
              break;
            case 7:
              addLibraryMember();
              break;
            case 8:
              displayAllLibraryMembers();
              break;
            case 9:
              searchForMemberById();
              break;
            case 10:
              searchForMemberByName();
              break;
            case 11:
              searchForMemberByAgeRange();
              break;
            case 12:
              displayIssuranceHistory();
              break;
           /* case 13:
              System.exit(0);
              break;*/
            default:
              System.out.println("enter valid option");
              break;
          }
      System.out.println("do you want to logout");
      next=sc.next();
    }while(next.equalsIgnoreCase("no"));
        }
          else if(login==2){
            String next2="";
            do{
      System.out.println(" 1.Display all books details \n 2.Searching for a book by using book id \n 3.Searching for a book by using book title \n 4.Searching for a book by using author name \n 5.Searching for a book by using genre type \n 6.Borrow a book \n 7.Return a book");
        System.out.println("**************************");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        //sc.nextLine();
        switch(choice)
          {
            case 1:
              viewAllBooks();
              break;
            case 2:
              searchForBookById();
              break;
            case 3:
              searchForBookByTitle();
              break;
            case 4:
              searchForBookByAuthor();
              break;
            case 5:
              searchForBookByGenre();
              break;
            case 6:
              try{
              borrowBook();
              }
              catch(Exception e)
                {
                  System.out.println(e);
                }
              break;
            case 7:
              try{
                returnBook();
              }
              catch(Exception e)
                {
                  System.out.println(e);
                }
              break;
           /* case 8:
              System.exit(0);
              break;*/
            default:
              System.out.println("enter valid option");
              break;
          }
              System.out.println("do you want to logout");
              next2=sc.next();
    }while(next2.equalsIgnoreCase("no"));
          }
         else
            System.out.println("enter valid option");
        System.out.println("Do you want to close the window");
        nextStep=sc.next();
  }while(nextStep.equalsIgnoreCase("no"));
        }
    
     public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      CentralLibrary obj=new CentralLibrary();
      obj.loginPage();
    }
}