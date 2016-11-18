package service;


import gen.SportType;
import gen.Sports;
import gen.UserDDD;
import gen.UserResponse;
import intf.UserServiceWS;

import javax.jws.WebService;

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


    public SportType CreateSport(SportType composition)
    {
        final SportType composition1 = new SportType();
        composition1.setGender (composition.getGender()+"_T");
        composition1.setType(composition.getType()+"_VAL");
        return composition1;
    }
}
