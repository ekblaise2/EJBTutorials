/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity.rela;

import entity.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ek
 */
@Remote
public interface LibraryPersistentBeanLocal {
    void addBook(Book bookName);  
   List<Book> getBooks();
}
