/**
 * Exception's class.
 * When a user does not exists.
 *
 * @author A89262
 * @author A48091
 * @author A89266
 * @version 20190406
 */

package Exceptions;

public class UserNullException extends Exception{
    public UserNullException(){
    }

    public UserNullException(String message){
        super(message);
    }
}
