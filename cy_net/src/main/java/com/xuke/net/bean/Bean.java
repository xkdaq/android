package com.xuke.net.bean;

import java.util.List;

/**
 * Created by xuke on 2018/6/21.
 */

public class Bean {

    private String msg;
    private boolean success;
    private List<ObjBean> obj;  //国家

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

    public static class ObjBean {

        private boolean checkable;
        private boolean checked;
        private String id;
        private String pid;
        private String state;
        private String text;
        private List<ChildrenBeanX> children;  //省

        public boolean isCheckable() {
            return checkable;
        }

        public void setCheckable(boolean checkable) {
            this.checkable = checkable;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<ChildrenBeanX> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBeanX> children) {
            this.children = children;
        }

        public static class ChildrenBeanX {
            /**
             * checkable : false
             * checked : false
             * children : [{"checkable":false,"checked":false,"id":"1.1","pid":"2.1","state":"open","text":"北京市"}]
             * id : 2.1
             * pid : 3.1
             * state : open
             * text : 北京
             */

            private boolean checkable;
            private boolean checked;
            private String id;
            private String pid;
            private String state;
            private String text;
            private List<ChildrenBean> children;

            public boolean isCheckable() {
                return checkable;
            }

            public void setCheckable(boolean checkable) {
                this.checkable = checkable;
            }

            public boolean isChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public List<ChildrenBean> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenBean> children) {
                this.children = children;
            }

            public static class ChildrenBean {
                /**
                 * checkable : false
                 * checked : false
                 * id : 1.1
                 * pid : 2.1
                 * state : open
                 * text : 北京市
                 */

                private boolean checkable;
                private boolean checked;
                private String id;
                private String pid;
                private String state;
                private String text;

                public boolean isCheckable() {
                    return checkable;
                }

                public void setCheckable(boolean checkable) {
                    this.checkable = checkable;
                }

                public boolean isChecked() {
                    return checked;
                }

                public void setChecked(boolean checked) {
                    this.checked = checked;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }
            }
        }
    }
}
