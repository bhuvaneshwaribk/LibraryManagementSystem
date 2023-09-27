class BookIssuranceHistory{
    int memberId;
    String fullName;
    int age;
    String mobileNo;
    int issuedBooks;
    int bookId;
    String title;
   public BookIssuranceHistory(int memberId,String fullName,int age,String mobileNo,int issuedBooks,int bookId,String title)
  {
      this.memberId=memberId;
      this.fullName=fullName;
      this.age=age;
      this.mobileNo=mobileNo;
      this.issuedBooks=issuedBooks;
      this.bookId=bookId;
      this.title=title;
  }
}