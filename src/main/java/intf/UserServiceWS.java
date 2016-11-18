package intf;
/*
просто так
*/
import gen.SportType;
import gen.Sports;
import gen.UserDDD;
import gen.UserResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Sergey on 13.11.2016.
 */
//22222222222
//22222222222
//22222222222
//33333333

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserServiceWS
{
    @WebMethod(operationName="createUser1")
    @SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public UserResponse CreateUser(@WebParam(mode = WebParam.Mode.IN) UserDDD userDDD);

    @WebMethod(operationName="createCreateSport")
    @SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SportType CreateSport(@WebParam(mode = WebParam.Mode.IN) SportType sportType);


}
// Проверка связи
//222222
//222222
