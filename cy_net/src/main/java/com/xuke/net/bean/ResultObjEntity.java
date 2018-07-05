package com.xuke.net.bean;

/**
 * 这个是把数据放在obj里面的结果
 */
public class ResultObjEntity<T, V> {

    /**
     * code : 200
     * msg : 发送成功
     * data : null
     * total : null
     * success : true
     * obj :
     */

    private Object code;
    private String msg;
    private V data;
    private Object total;
    private boolean success;
    private T obj;

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
