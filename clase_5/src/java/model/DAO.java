/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class DAO {

    public User exist(User u) {
//     if(u.getMail().equalsIgnoreCase("andresinsuastyd10@gmail.com")
//             && u.getPass().equalsIgnoreCase("123456")){
//         return new User(u.getMail(), u.getPass(), "Andres Insuasty");
//     }else{
//         return null;
//     }
        if (u.getMail().equalsIgnoreCase("andresinsuastyd10@gmail.com")) {
           /*Ok*/
           if(u.getPass().equalsIgnoreCase("123")){
               /*OK*/
               return new User(u.getMail(), u.getPass(), "Andres Insuasty");
           }else{
               /*Pass incorrecta*/
               User newUser = new User(u.getMail(), u.getPass(), "Andres Insuasty");
               newUser.addError(new Error(100,"Pass Incorrecta"));
               return newUser;
           }
        }else{
            /*Email incorrecto*/
            User newUser = new User(u.getMail(), u.getPass(), "Andres Insuasty");
               newUser.addError(new Error(200,"Email Incorrecta"));
               return newUser;
        }
    }
}
