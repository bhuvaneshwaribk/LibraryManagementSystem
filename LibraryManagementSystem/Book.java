class Book
  {
    int bookId;
    String title;
    String author;
    String genre;
    int quantity;
    String publish_year;
    double price;
    Book(int bookId,String title,String author,String genre,int quantity,String publish_year,double price)
    {
      this.bookId=bookId;
      this.title=title;
      this.author=author;
      this.genre=genre;
      this.quantity=quantity;
      this.publish_year=publish_year;
      this.price=price;
    }
 }