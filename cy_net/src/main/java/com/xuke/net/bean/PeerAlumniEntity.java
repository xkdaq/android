package com.xuke.net.bean;


import java.util.List;

/**
 * 作者：song on 2016/10/28 12:26
 * 根据校友编号查询同级校友接口 247号接口
 */

public class PeerAlumniEntity {

    /**
     * msg : 成功获取同级生
     * obj : [{"name":"许文慧","className":"窗友科技大学,研发部,2014级,研发部一班","baseInfoId":"0019910010201401001"},{"name":"消失了才珍惜","className":"窗友科技大学,研发部,2014级,研发部一班","baseInfoId":"0019910010201401002"},{"name":"宋举","className":"窗友科技大学,研发部,2014级,研发部一班","baseInfoId":"0019910010201401003"},{"name":"叶晓欢","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402001"},{"name":"张杨","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402002"},{"name":"罗仁贵","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402003"},{"name":"祁鹏","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402004"},{"name":"杨鹏举","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402005"},{"name":"张丽娟","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402006"},{"name":"刘志锁","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402007"},{"name":"亓鹏飞","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402008"},{"name":"许文慧","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402009"},{"name":"李逊","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402010"},{"name":"刘振","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402012"},{"name":"李玲","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402013"},{"name":"刁荣祥","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402014"},{"name":"郭亚斌","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402015"},{"name":"邓芸","className":"窗友科技大学,研发部,2014级,研发1班","baseInfoId":"0019910010201402016"},{"name":"亓鹏飞","className":"窗友科技大学,研发部,2016级,研发部一班","baseInfoId":"0019910010201601001"},{"name":"王傲辉","className":"窗友科技大学,研发部,2016级,研发部一班","baseInfoId":"0019910010201601002"},{"name":"姜玲","className":"窗友科技大学,研发部,2016级,研发部一班","baseInfoId":"0019910010201601003"},{"name":"姜玲","className":"窗友科技大学,研发部,2016级,研发部一班","baseInfoId":"0019910010201601004"},{"name":"金波","className":"窗友科技大学,研发部,2016级,研发部一班","baseInfoId":"0019910010201601005"}]
     * success : true
     */

    private String msg;
    private boolean success;
    /**
     * name : 许文慧
     * className : 窗友科技大学,研发部,2014级,研发部一班
     * baseInfoId : 0019910010201401001
     */

    private List<ObjBean> obj;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ObjBean> getObj() {
        return obj;
    }

    public void setObj(List<ObjBean> obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "PeerAlumniEntity{" +
                "msg='" + msg + '\'' +
                ", success=" + success +
                ", obj=" + obj +
                '}';
    }

    public static class ObjBean {
        private String name;
        private String phoneNum;
        private String className;
        private String baseInfoId;
        private int hasRecord;

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getBaseInfoId() {
            return baseInfoId;
        }

        public void setBaseInfoId(String baseInfoId) {
            this.baseInfoId = baseInfoId;
        }

        public int getHasRecord() {
            return hasRecord;
        }

        public void setHasRecord(int hasRecord) {
            this.hasRecord = hasRecord;
        }

        @Override
        public String toString() {
            return "ObjBean{" +
                    "name='" + name + '\'' +
                    ", phoneNum='" + phoneNum + '\'' +
                    ", className='" + className + '\'' +
                    ", baseInfoId='" + baseInfoId + '\'' +
                    ", hasRecord=" + hasRecord +
                    '}';
        }
    }
}
