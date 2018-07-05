package com.xuke.net.contant;

/**
 * 接口命令.
 */
public interface Commands {
    //String UPLOAD_FILE = "1";//文件上传
    String GET_USER_LIST = "2";//根据姓名获取与此姓名对应的基础信息数据库id编号、身份证号(同班同名的时候)、账号列表
    String GET_REGISTER_CODE = "3";//根据手机号获取注册码
    String REGISTER = "4";//提交注册信息
    //String UPDATE_USER_PROFILE = "5";//用户信息更改
    String UPLOAD_IMAGE_FILE = "6";//用户图像上传
    //String NOTICE_AUTHENTICATED = "7";//后台用于通知某用户获得认证
    //String GET_CLASSMATES_LIST = "8";//获取班级同学id、姓名、账号列表
    //String SEARCH_FOR_USERS = "9";//搜索用户,已过时
    String GET_USER_PROFILE = "10";//手机登陆接口
    String SAVA_USER = "10x";//手机登陆接口
    //String GET_FRIEND_PROFILE = "11";//根据账号和密码获取用户好友的基本信息
    //String UPDATE_GROUP_INFO = "12";//修改Web服务器上群表
    //String GET_GROUP_INFO = "13";//根据账号、密码、群名获取群成员账号信息
    //String UPDATE_CLASSMATE_TEL = "14";//数据挖掘更新班级同学手机号，并发送注册邀请短信
    String AUTHENTICATED = "15";//用户认证
    String CHANGE_PASSWORD = "16";//修改密码
    //String GET_GROUP_MEMBERS = "17";//批量获取群组非好友成员的信息  账号，姓名，图片地址
    //String GET_DEPART_FULL_NAME = "18";//根据机构id获取机构名称
    String GET_SUPPORTED_SCHOOLS = "19";//获取窗友支持的学校
    String GET_SCHOOL_CONFIGS = "20";//根据学校编号获取学校配置信息
    //String SEARCH_FOR_USERS_NEW = "22";//根据姓名查询，该姓名对应的注册用户信息
    String UPDATE_USER_PROFILE_NEW = "23";//用户个人资料修改
    String GET_NEWS_TAB = "24";//获取新闻页
    //String GET_QR_URL = "25";//生成二维码地址
    String SEARCH_FOR_NEARBY = "26";//根据GPS的经纬度，完成附近人搜索功能
    String SEARCH_FOR_CODE = "27";//根据账号accountNum查询用户详细信息
    String USER_INFO = "2711";//根据账号accountNum查询用户详细信息
    String GET_ALUMNI = "28";//查询所有的校友会
    //String GET_CLASSMATE_INFO_LIST = "29";//根据班级id查询班级认证用户的详细信息
    //String GET_GUILD = "30";//查询行业校友会
    //String GET_VERSION = "31";//获取版本信息

    String REGISTER_PHONE_NEW = "R001";//手机注册
    String REGISTER_EMAIL_NEW = "R002";//邮箱注册


    String GET_USER_CONTACTS_LIST = "41TX";//查询好友列表
    String SEARCH_USER = "42TX";//搜索好友接口接口
    String ADD_FRIEND = "43TX";//添加好友接口
    String TEST_FRIEND = "43TX";//验证申请好友接口
    String DEL_FRIEND = "44TX";//删除好友接口
    String GET_FRIEND_INFO = "45TX";//查询好友信息
    String CREATE_GROUP = "46TX";//创建群组接口
    String DELETE_GROUP = "47TX";//删除群组
    String GET_GROUP_DETAIL = "49TX";//查询群组信息接口
    String DELETE_GROUP_MEMBER = "50TX";//删除群组成员
    //String ADD_GROUP = "53";//添加群组成员[申请]
    String GET_GROUP_LIST = "54TX";//查询用户参与的群组列表
    String CHANGE_GROUP_NAME = "55TX";//修改群名称接口
    String SCAN_GROUP = "56TX";//二维码加群
    String EXIT_GROUP = "57TX";//退出群
    String SELECT_FRIEND = "241TX";//查询好友列表
    String GROUP_ADD_MEMBERS = "103TX";//群添加多个好友
    String GET_GROUPID = "490TX";//根据腾讯id获取后台groupId


    String EVENT_LIST = "61";//活动列表
    String DONATION_LIST = "71";//捐赠列表
    String DISCOVER_PUSH_MSG = "88";//获取朋友圈消息推送接口
    String DISCOVER_UNREAD = "85";//朋友圈未读数
    String RESPORT_SEND = "86";//朋友圈举报接口
    String DISCOVER_PUSH_MSG_CLEAN = "87";//朋友圈消息清除接口
    String DISCOVER_PUSH_MSG_READ = "89";//朋友圈消息已读接口
    String DISCOVER_PUBLISH = "90";//朋友圈发布
    String DISCOVER_SHOW = "91";//朋友圈展示
    String DISCOVER_OPERATE = "92";//朋友圈操作
    String DISCOVER_DEL = "93";//朋友圈删除
    String DISCOVER_UPLOAD_ALBUM = "94";//朋友圈背景上传
    String DISCOVER_GET_ALBUM = "95";//朋友圈背景获取
    String JOB_LIST = "97";//招聘列表
    String DISCOVER_REPLY = "98";//朋友圈回复
    String DISCOVER_SHOW_DETAIL = "99";//朋友圈展示个人详情
    String GET_EXPERIENCE = "101";//查询学习经历
    String EXCAVATE_CONTACTS = "102";//挖掘好友接口
    String CHANGE_PHONE = "201";//更换手机号
    String AUTH_BY_SCHOOL_ID = "202";//学号认证
    String AUTH_BY_USER_ID = "203";//身份证认证
    String INVITE = "204";//发送邀请短信
    String AUTH_BY_INVITE_CODE = "205";//邀请码认证
    String EXIT_CLASS = "206";//退出班级
    String REMOVE_CLASS = "207";//移除班级


    String JOIN_ORG = "208";//加入行会
    String EXIT_ORG = "209";//退出行会
    String EDIT_MEMBERS_INFO = "210";//修改群成员信息
    String GET_DATA_LIST = "211";//获取学校、学院、年级、班级
    String APPLY_JOIN_CLASS = "212";//申请加入班级
    String SMART_MATCH_PHONE = "213";//智能匹配班级  姓名+手机号/邮箱
    String SMART_CERTIFY = "216";  //一键认证
    String SMART_MATCH_NAME = "214";//智能匹配班级  姓名
    String GET_CLASSMATE_NEW = "215";//新9选3名单
    String AUTH_CHOICE_NEW = "217";//新认证班级9选3
    String AUTH_CLASSMATE= "218";//手动输入3个同班同学认证

    String GET_CLASSMATE = "218";//9选3名单
    String SUGGESTION = "220";//意见反馈接口
    String NEWS_DETAILS = "236";//221查询新闻内容--->236
    String NEWS_CONTENT = "237";//新闻详情页面
    String NEWS_TITLE = "239";//查询新闻标题

    //String GET_CLASS_MEMBER = "242";//获取班级成员
    String SELECT_CITY = "245";//查询城市列表
    String SELECT_PROFESSION = "246";//查询好友列表
    String GET_PEERALUMNI = "247";//根据校友编号查询同级校友
    String NOTICE_ALL_READ = "249";//所有推送设置已读
    String ADD_GROUPMEMBERS = "250";//添加群成员的接口
    String GET_UNAUTHED_EXPERIENCE = "301";//获取未认证班级
    String SEARCH_SUB = "403";//消息订阅
    String SAVE_SUB = "404";//保存订阅
    String SEEK_NOTICE = "405";//推送通知接口
    String NOTICE_READ = "407";//推送设置已读
    String GET_UNREAD_NOTICE_NUM = "408";//获取未读通知条数
    //String SET_SIGN = "409";//二维码扫描签到
    String DELETE_ALL_SYS_NOTICE = "410";//清除系统通知
    String CHAT_LOGIN = "500";//修改环信登录密码
    String GET_WEIXINPAY = "783";//微信支付接口
    String GET_WEB_SMALL_TITLE = "794";//惠校友首页栏目获取接口
    String SAVE_WEB_SMALL_TITLE = "795";//惠校友首页栏目保存接口
    String WEB_SERVER = "796";//惠校友首页栏目获取接口
    String GET_MAIN_TAB = "816";
    String UPDOWN_RECORDER = "815";//上传录音文件
    String UPDATETOKEN = "821";//刷新token
    String KNOWPEOPLE = "1000";//获取认识的人
    String DEPTID = "1011";//管理员获取校友会组织id
    String GROUPLIST = "1012";//管理员获取校友会组织id
    String REQUESTDETAIL = "1013";//管理员获取校友会组织id
    String ALLOWADDGROUP = "1014";//入会审批
    String PRESSMESSAGE = "1015";//获取留言列表
    String PRESSDETAILS = "1016";//获取留言列表
    String REPLYMESSAGE = "1017";//获取留言列表
    String DEALMEMBER = "1019";//获取留言列表
    String DELETEMEMBER = "1021";//删除成员
    String DEALCOMPLAIN = "1022";//投诉列表
    String COMPLAINDETAIL = "1023";//投诉详情
    String DODEALCOMPLAIN = "1024";//投诉处理
    String EVENTLIST = "1025";//活动管理
    String DELETEEVENT = "1027";//活动管理
    String NEWS_TIPS = "1028";//获取新消息新提示


}
