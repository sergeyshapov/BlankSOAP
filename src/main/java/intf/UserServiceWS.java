package intf;

import gen.UserDDD;
import gen.UserResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Sergey on 13.11.2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserServiceWS
{
    @WebMethod(operationName="createUser")
    @SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public UserResponse CreateUser(@WebParam(mode = WebParam.Mode.IN) UserDDD userDDD);
}
