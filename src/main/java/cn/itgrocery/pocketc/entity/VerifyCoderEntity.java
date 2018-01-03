package cn.itgrocery.pocketc.entity;

import java.util.Date;

/**
 * @ author chenxl
 * @ date 2017/12/29 17:08
 * @ describe
 */
public class VerifyCoderEntity {

    private long id;
    private long phone_number;
    private int verification_code;
    private String request_ip;
    private Date crt_time;
    private Date use_time;
    private int is_used;

    public VerifyCoderEntity() {
    }

    public VerifyCoderEntity(long phone_number, int verification_code, String request_ip) {
        this.phone_number = phone_number;
        this.verification_code = verification_code;
        this.request_ip = request_ip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public int getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(int verification_code) {
        this.verification_code = verification_code;
    }

    public String getRequest_ip() {
        return request_ip;
    }

    public void setRequest_ip(String request_ip) {
        this.request_ip = request_ip;
    }

    public Date getCrt_time() {
        return crt_time;
    }

    public void setCrt_time(Date crt_time) {
        this.crt_time = crt_time;
    }

    public Date getUse_time() {
        return use_time;
    }

    public void setUse_time(Date use_time) {
        this.use_time = use_time;
    }

    public int getIs_used() {
        return is_used;
    }

    public void setIs_used(int is_used) {
        this.is_used = is_used;
    }
}
