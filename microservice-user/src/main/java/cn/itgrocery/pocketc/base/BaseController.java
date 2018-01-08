package cn.itgrocery.pocketc.base;

/**
 * @ author chenxl
 * @ date 2018/1/2 10:26
 * @ describe
 */
public interface BaseController {

    default <T> BaseResponse getResponse(T t){
        BaseResponse baseResponse = new BaseResponse();
        if(t == null){
            baseResponse.setCode(BaseResponse.BASERESPONSE_CODE_ERROR);
            baseResponse.setMsg("操作失败");

        } else{
            baseResponse.setCode(BaseResponse.BASERESPONSE_CODE_SUCCESS);
            baseResponse.setMsg("操作成功");

        }
        baseResponse.setData(t);
        return baseResponse;
    }
}
