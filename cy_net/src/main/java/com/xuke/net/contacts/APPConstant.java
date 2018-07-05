package com.xuke.net.contacts;

public final class APPConstant {
    /**
     * 隐藏构造方法.
     */
    private APPConstant() {
    }

    /**
     * 所在行业.
     */
    public static final String[] profession1 = {"互联网通信", "会计金融", "贸易消费", "制药医疗",
            "广告媒体", "房地产建筑", "教育培训", "物流运输", "能源原材料", "服务餐饮", "政府",
            "其他"};


    public static final String[] Province1 = new String[]{
            "北京市", "天津市", "上海市", "重庆市", "河北省",
            "河南省", "云南省", "辽宁省", "黑龙江省", "湖南省", "安徽省", "山东省", "新疆", "江苏省",
            "浙江省", "江西省", "湖北省", "广西省", "甘肃省", "山西省", "内蒙古", "陕西省", "吉林省",
            "福建省", "贵州省", "广东省", "青海省", "西藏", "四川省", "宁夏", "海南省", "台湾", "香港",
            "澳门"
    };


//    public static final String[] country1 = new String[]{"中国", "美国"};
//
//    public static final String[][] Province1 = new String[][]{
//            new String[]{"北京市", "天津市", "上海市", "重庆市", "河北省",
//                    "河南省", "云南省", "辽宁省", "黑龙江省", "湖南省", "安徽省", "山东省", "新疆", "江苏省",
//                    "浙江省", "江西省", "湖北省", "广西省", "甘肃省", "山西省", "内蒙古", "陕西省", "吉林省",
//                    "福建省", "贵州省", "广东省", "青海省", "西藏", "四川省", "宁夏", "海南省", "台湾", "香港",
//                    "澳门"},
//            new String[]{"暂无数据"}
//    };
    public static final String[][][] City1 = new String[][][]{

            new String[][]{ // 北京
                    new String[]{"东城区", "西城区", "朝阳区", "丰台区", "石景山区", "海淀区", "门头沟区", "房山区",
                            "通州区", "顺义区", "昌平区", "大兴区", "平谷区", "怀柔区", "密云区", "延庆区"},
                    // 天津
                    new String[]{"和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "东丽区", "西青区",
                            "津南区", "北辰区", "宁河区", "武清区", "静海区", "宝坻区", "蓟县区", "滨海新区"},
                    // 上海
                    new String[]{"黄浦区", "卢湾区", "徐汇区", "长宁区", "静安区", "普陀区", "闸北区", "虹口区",
                            "杨浦区", "闵行区", "宝山区", "嘉定区", "浦东新区", "金山区", "松江区", "奉贤区", "青浦区", "崇明区"},
                    // 重庆
                    new String[]{"万州区", "涪陵区", "渝中区", "大渡口区", "江北区", "沙坪坝区", "九龙坡区", "南岸区",
                            "北碚区", "万盛区", "双桥区", "渝北区", "巴南区", "长寿区", "綦江区", "潼南区", "铜梁大足区",
                            "荣昌区", "璧山区", "梁平区", "城口区", "丰都区", "垫江区", "武隆区", "忠县区", "开县区", "云阳区",
                            "奉节区", "巫山区", "巫溪区", "黔江区", "石柱区", "秀山区", "酉阳区", "彭水区", "江津区", "合川区",
                            "永川", "南川", "两江新区"},
                    // 河北
                    new String[]{"承德市", "张家口市", "保定市", "石家庄市", "邢台市", "邯郸市", "衡水市", "沧州市",
                            "廊坊市", "唐山市", "秦皇岛市"},
                    // 河南
                    new String[]{"郑州市", "洛阳市", "商丘市", "安阳市", "开封市", "平顶山市", "焦作市", "新乡市",
                            "鹤壁市", "濮阳市", "许昌市", "漯河市", "三门峡市", "信阳市", "周口市", "驻马店市", "济源市"},
                    // 云南
                    new String[]{"昆明市", "曲靖市", "玉溪市", "保山市", "昭通市", "丽江市", "普洱市", "临沧市",
                            "楚雄市", "红河市", "文山市", "西双版纳市", "大理市", "德宏市", "怒江市", "迪庆市"},
                    // 辽宁
                    new String[]{"沈阳市", "大连市", "鞍山市", "抚顺市", "本溪市", "丹东市", "锦州市", "营口市",
                            "阜新市", "辽阳市", "盘锦市", "铁岭市", "朝阳市", "葫芦岛市"},
                    // 黑龙江
                    new String[]{"哈尔滨市", "齐齐哈尔市", "鸡西市", "鹤岗市", "双鸭山市", "大庆市", "伊春市", "佳木斯市",
                            "七台河市", "牡丹江市", "黑河市", "绥化市", "大兴安岭市"},
                    // 湖南
                    new String[]{"长沙市", "株洲市", "湘潭市", "衡阳市", "邵阳市", "岳阳市", "常德市", "张家界市",
                            "益阳市", "郴州市", "永州市", "怀化市", "娄底市", "湘西市"},
                    // 安徽
                    new String[]{"合肥市", "芜湖市", "蚌埠市", "淮南市", "马鞍山市", "淮北市", "铜陵市", "安庆市",
                            "黄山市", "滁州市", "阜阳市", "宿州市", "巢湖市", "六安市", "亳州市", "池州市", "宣城市"},
                    // 山东
                    new String[]{"济南市", "青岛市", "淄博市", "枣庄市", "东营市", "烟台市", "潍坊市", "济宁市",
                            "泰安市", "威海市", "日照市", "莱芜市", "临沂市", "德州市", "聊城市", "滨州市", "菏泽市"},
                    // 新疆
                    new String[]{"乌鲁木齐市", "克拉玛依市", "吐鲁番市", "哈密市", "昌吉市", "博尔塔拉市", "库尔勒市",
                            "阿克苏市", "阿图什市", "喀什市", "和田市", "伊犁市", "塔城市", "阿勒泰市", "自治区直辖县级行政单位"},
                    // 江苏
                    new String[]{"南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市",
                            "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市"},
                    // 浙江
                    new String[]{"杭州市", "宁波市", "温州市", "嘉兴市", "湖州市", "绍兴市", "金华市", "衢州市",
                            "舟山市", "台州市", "丽水市"},
                    // 江西
                    new String[]{"南昌市", "景德镇市", "萍乡市", "九江市", "新余市", "鹰潭市", "赣州市", "吉安市",
                            "宜春市", "抚州市", "上饶市"},
                    // 河北
                    new String[]{"武汉市", "黄石市", "十堰市", "宜昌市", "襄樊市", "鄂州市", "荆门市", "孝感市",
                            "荆州市", "黄冈市", "咸宁市", "随州市", "恩施市", "省直辖县级行政单位"},
                    // 广西
                    new String[]{"南宁市", "柳州市", "桂林市", "梧州市", "北海市", "防城港市", "钦州市", "贵港市",
                            "玉林市", "百色市", "贺州市", "河池市", "来宾市", "崇左市"},
                    // 甘肃
                    new String[]{"兰州市", "嘉峪关市", "金昌市", "白银市", "天水市", "武威市", "张掖市", "平凉市",
                            "酒泉市", "庆阳市", "定西市", "陇南市", "临夏市", "甘南市"},
                    // 山西
                    new String[]{"太原市", "大同市", "阳泉市", "长治市", "晋城市", "朔州市", "晋中市", "运城市",
                            "忻州市", "临汾市", "吕梁市"},
                    // 内蒙古
                    new String[]{"呼和浩特市", "包头市", "乌海市", "赤峰市", "通辽市", "鄂尔多斯市", "呼伦贝尔市",
                            "巴彦淖尔市", "乌兰察布市", "兴安盟市", "锡林郭勒市", "阿拉善盟市"},
                    // 陕西
                    new String[]{"西安市", "铜川市", "宝鸡市", "咸阳市", "渭南市", "延安市", "汉中市", "榆林市",
                            "安康市", "商洛市"},
                    // 吉林
                    new String[]{"长春市", "吉林市", "四平市", "辽源市", "通化市", "白山市", "松原市", "白城市", "延边市"},
                    // 福建
                    new String[]{"福州市", "厦门市", "莆田市", "三明市", "泉州市", "漳州市", "南平市", "龙岩市", "宁德市"},
                    // 贵州
                    new String[]{"贵阳市", "六盘水市", "遵义市", "安顺市", "铜仁市", "兴义市", "毕节市", "凯里市",
                            "都匀市"},
                    // 广东
                    new String[]{"广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市", "江门市", "湛江市",
                            "茂名市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "东莞市", "中山市",
                            "潮州市", "揭阳市", "云浮市"},
                    // 青海
                    new String[]{"西宁市", "海东市", "海晏市", "共和市", "德令哈市", "同仁市", "玛沁市", "玉树市"},
                    // 西藏
                    new String[]{"拉萨市", "昌都市", "山南市", "日喀则市", "那曲市", "阿里市", "林芝市"},
                    // 四川
                    new String[]{"成都市", "自贡市", "攀枝花市", "泸州市", "德阳市", "绵阳市", "广元市", "遂宁市",
                            "内江市", "乐山市", "南充市", "眉山市", "宜宾市", "广安市", "达州市", "雅安市", "巴中市", "资阳市",
                            "阿坝市", "甘孜市", "凉山市"},
                    // 宁夏
                    new String[]{"银川市", "石嘴山市", "吴忠市", "固原市", "中卫市"},
                    // 海南
                    new String[]{"海口市", "三亚市", "三沙市", "五指山市", "琼海市", "儋州市", "文昌市", "万宁市",
                            "东方市", "定安市", "屯昌市", "澄迈市", "临高市", "白沙市", "昌江市", "乐东市", "陵水市", "保亭市",
                            "琼中市"},
                    // 台湾
                    new String[]{"台北市", "高雄市", "基隆市", "台中市", "台南市", "新竹市", "嘉义市"},
                    // 香港
                    new String[]{"中西区", "东区", "九龙城区", "观塘区", "南区", "深水埗区", "黄大仙区",
                            "湾仔区", "油尖旺区", "离岛区", "葵青区", "北区", "西贡区", "沙田区", "屯门区",
                            "大浦区", "荃湾区", "元朗区"},
                    // 澳门
                    new String[]{"花地玛堂区", "圣安多尼堂区", "大堂区", "望德堂区", "风顺堂区", "氹仔", "路环"},
                    new String[]{"不限"}
            },

            new String[][]{
                    new String[]{"暂无数据"}
            }

    };
}
