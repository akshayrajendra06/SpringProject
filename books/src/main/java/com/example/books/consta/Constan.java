package com.example.books.consta;

public class Constan {


    public static final String TABLE_NAME_BOOKS ="books";
    public static final String TABLE_NAME_Available ="available_books";
    public static final String Exception_constructor ="Resource Not Found Exception";
    public static final String Books_Not_Found ="Book  Not Found Exception.";
    public static final String Query_By_Book ="Select p from Books p where p.titles=?1";
    
    
    
//    APIs
    
	public static final String BASE_URL_Books ="/books";	
	public static final String Enter_Books ="/enterBooksData";
	public static final String Get_Book_By_Title ="/{titles}";
	public static final String Get_ALL_BOOKS ="/getallBooks";

}
