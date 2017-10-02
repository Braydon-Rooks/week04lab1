/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userService;

/**
 *
 * @author 671978
 */
public class UserService {
    
    String user1 = "adam";
    String user2 = "betty";
    String passwords = "password";
    
   User newUser = new User();
    
    public User login(String user,String pass)
    {
        if((user1.equals(user)||user2.equals(user))&&passwords.equals(pass))
        {
            newUser.setUserName(user);
            newUser.setPassWord(null);
            return newUser;
            
        }
        return null;
    }
}
