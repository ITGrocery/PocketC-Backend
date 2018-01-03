package cn.itgrocery.pocketc.app.config.exception;

import cn.itgrocery.pocketc.base.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ author chenxl
 * @ date 2017/12/29 15:34
 * @ describe 统一异常处理
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResponse handleException(Exception exception){
        BaseResponse baseResponse = new BaseResponse();
        if(exception instanceof MyException){

            baseResponse.setCode(BaseResponse.BASERESPONSE_CODE_ERROR);
            baseResponse.setMsg(exception.getMessage());
        }else{
            baseResponse.setCode(BaseResponse.BASERESPONSE_CODE_ERROR);
            baseResponse.setMsg("服务器异常");
        }

        exception.printStackTrace();

        return baseResponse;
    }
}
