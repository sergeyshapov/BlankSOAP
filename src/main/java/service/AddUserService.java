package service;

import gen.UserDDD;
import gen.UserResponse;
import intf.UserServiceWS;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Sergey on 13.11.2016.
 */
@WebService(endpointInterface = "intf.UserServiceWS")
public class AddUserService implements UserServiceWS
{
    public UserResponse CreateUser(UserDDD userDDD)
    {
        final UserResponse userResponse = new UserResponse();
        userResponse.setUserId(150);
        userResponse.setUserName(userDDD.getName() + "-"+ userDDD.getLastname());
        return userResponse;
    }
}
