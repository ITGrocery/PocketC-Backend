package cn.itgrocery.pocketc.base;

/**
 * @ author chenxl
 * @ date 2017/12/29 15:31
 * @ describe
 */
public class BaseResponse<T> {

    //操作成功
    public static final int BASERESPONSE_CODE_SUCCESS = 200;
    //服务器异常
    public static final int BASERESPONSE_CODE_EXCEPTION = 300;
    //用户操作错误
    public static final int BASERESPONSE_CODE_ERROR = 400;

    private T data;
    private int code;
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
