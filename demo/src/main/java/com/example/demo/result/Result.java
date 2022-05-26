package com.example.demo.result;

import lombok.Data;

@Data
public class Result {
    public boolean flag;

    private String message;
    private Object data;

    public Result(boolean flag, String message){
        this.flag = flag;
        this.message = message;
    }

    /**
     * 返回结果的信息
     * @param flag    返回是否成功
     * @param message 返回的信息
     * @param data    返回结果
     */
    public Result (boolean flag, String message, Object data){
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回
     * @param message
     * @param data
     * @return
     */
    public static Result success(String message,Object data){
        return new Result(true,message,data);
    }
    public static Result success(String message) {
        return new Result(true, message);
    }

    /**
     * 失败返回
     * @param message
     * @param data
     * @return
     */
    public static Result fail(String message, Object data){
        return new Result(false,message,data);
    }

    public static Result fail (String message){
        return new Result(false,message);
    }
}
