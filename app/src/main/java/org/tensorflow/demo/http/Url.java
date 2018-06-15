package org.tensorflow.demo.http;

/**
 * Created by Administrator on 2017/4/28.
 */

public class Url {
    /**
     * base_Url  http://cncare.net/common/api_doctor/api.php
     */
    public final static String Base_Url = "http://cncare.net/common/api_doctor/api.php";
    public final static String Base_IMAGE_Url = "http://cncare.net/";
    /**
     * 固定加密 MD5
     */
    public final static String  SIGN= "&netcncarecxzs";
    /**
     * 轮播图
     */
    public final static String  banner= Base_Url+"?ac=index_show&sign=4bc436ce4861c94dd78db4834f5b6b49";
    /**
     * 首页的更新提醒
     *
     * index_update_num,这个是首页会员档案更新人数的接口名,
        逻辑上是点首页这一条进入会员档案,然后有会员档案的添加一个有更新标识,后续我会在会员档案查询接口里面加一个标识,你先试试上面这个接口行不行
        请求参数为doctorid
     */
    public final static String  index_update_num = Base_Url +"?ac=index_update_num";

}
