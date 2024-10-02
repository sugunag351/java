/**
 * @author suguna
 * @version 2.0
 * @since 2015
 */
package javadocdemo;
/**
 * @author suguna
 * class for library book
 */
public class Book
{
    /**
     * @value 10
     */
 static int val=10;

    /**
     * parameterized constructor
     * @param s book name
     */
 public Book(String s){}

    /**
     * issue a book toa student
     * @param roll roll number of astudent
     * @throws Exception if book is not available throws exception
     */
 public void issue(int roll)throws Exception{}

    /**
     * check if book is available
     * @param str book name
     * @return if book is available return true else false
     */
 public boolean available(String str){return true;}

    /**
     * get book name
     * @param id book id
     * @return returns book name
     */
 public String getName(int id){return "";}
 }

