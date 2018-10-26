package com.lubsh.config;

/**
 * Created by lubsh on 2018/10/26.
 */
public class AliPayContig {

    //合作身份者ID，以2088开头由16位纯数字组成的字符串
    private static String partner = "2088131951569336";
    //身份appid
    private static String appid = "2018071760652281";
    //请求使用的编码格式
    private static String charset = "UTF-8";
    //商户生成签名字符串所使用的签名算法类型
    private static String sign_type = "RSA2";
    //调用的接口版本
    private static String version = "1.0";
    //网站支付接口名称
    private static String wap_url = "https://openapi.alipay.com/gateway.do";
    //接收支付宝支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数
    private static String ali_wap_notify_url = "http://39.104.168.167:8094/api/wx/pay/aliPayByCodeNotify";
    //页面跳转同步通知页面路径
    private static String ali_wap_return_url = "";
    //销售产品码，商家和支付宝签约的产品码，为固定值QUICK_MSECURITY_PAY
    private static String product_code = "QUICK_MSECURITY_PAY";
    //该笔订单允许的最晚付款时间
    private static String timeout_express = "90m";
    //签约支付宝账号或卖家收款支付宝帐户
    private static String seller_email = "51848878@qq.com";
    //收款方名称，如：公司名称、网站名称、收款人姓名等
    private static String mainname = "UserName";
    //访问模式,根据自己的服务器是否支持ssl访问，若支持请选择https；若不支持请选择http
    private static String transport = "http";
    //请求数据格式
    private static String format = "JSON";
    //支付宝公钥
    private static String ali_public_key = "";
    //应用公钥
    private static String public_key = "";
    //应用私钥-pkcs8
    private static String private_key = "";

    public static String getPartner() {
        return partner;
    }

    public static void setPartner(String partner) {
        AliPayContig.partner = partner;
    }

    public static String getAppid() {
        return appid;
    }

    public static void setAppid(String appid) {
        AliPayContig.appid = appid;
    }

    public static String getCharset() {
        return charset;
    }

    public static void setCharset(String charset) {
        AliPayContig.charset = charset;
    }

    public static String getSign_type() {
        return sign_type;
    }

    public static void setSign_type(String sign_type) {
        AliPayContig.sign_type = sign_type;
    }

    public static String getVersion() {
        return version;
    }

    public static void setVersion(String version) {
        AliPayContig.version = version;
    }

    public static String getWap_url() {
        return wap_url;
    }

    public static void setWap_url(String wap_url) {
        AliPayContig.wap_url = wap_url;
    }

    public static String getAli_wap_notify_url() {
        return ali_wap_notify_url;
    }

    public static void setAli_wap_notify_url(String ali_wap_notify_url) {
        AliPayContig.ali_wap_notify_url = ali_wap_notify_url;
    }

    public static String getAli_wap_return_url() {
        return ali_wap_return_url;
    }

    public static void setAli_wap_return_url(String ali_wap_return_url) {
        AliPayContig.ali_wap_return_url = ali_wap_return_url;
    }

    public static String getProduct_code() {
        return product_code;
    }

    public static void setProduct_code(String product_code) {
        AliPayContig.product_code = product_code;
    }

    public static String getTimeout_express() {
        return timeout_express;
    }

    public static void setTimeout_express(String timeout_express) {
        AliPayContig.timeout_express = timeout_express;
    }

    public static String getSeller_email() {
        return seller_email;
    }

    public static void setSeller_email(String seller_email) {
        AliPayContig.seller_email = seller_email;
    }

    public static String getMainname() {
        return mainname;
    }

    public static void setMainname(String mainname) {
        AliPayContig.mainname = mainname;
    }

    public static String getTransport() {
        return transport;
    }

    public static void setTransport(String transport) {
        AliPayContig.transport = transport;
    }

    public static String getFormat() {
        return format;
    }

    public static void setFormat(String format) {
        AliPayContig.format = format;
    }

    public static String getAli_public_key() {
        return ali_public_key;
    }

    public static void setAli_public_key(String ali_public_key) {
        AliPayContig.ali_public_key = ali_public_key;
    }

    public static String getPublic_key() {
        return public_key;
    }

    public static void setPublic_key(String public_key) {
        AliPayContig.public_key = public_key;
    }

    public static String getPrivate_key() {
        return private_key;
    }

    public static void setPrivate_key(String private_key) {
        AliPayContig.private_key = private_key;
    }
}
