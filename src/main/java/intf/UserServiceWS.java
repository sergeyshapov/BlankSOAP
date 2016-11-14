package intf;
/*
просто так
*/
import gen.UserDDD;
import gen.UserResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserServiceWS
{
    @WebMethod(operationName="createUser1")
    @SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public UserResponse CreateUser(@WebParam(mode = WebParam.Mode.IN) UserDDD userDDD);
  
}
// Проверка связи
