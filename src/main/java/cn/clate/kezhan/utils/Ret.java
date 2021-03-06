package cn.clate.kezhan.utils;

import org.nutz.lang.util.NutMap;

import java.util.ArrayList;

public class Ret {
    public static NutMap json(int code, String msg, NutMap data) {
        NutMap ret = new NutMap();
        ret.addv("code", code);
        ret.addv("msg", msg);
        ret.addv("data", data);
        return ret;
    }

    public static NutMap json(int code, String msg, ArrayList data) {
        NutMap ret = new NutMap();
        ret.addv("code", code);
        ret.addv("msg", msg);
        ret.addv("data", data);
        return ret;
    }

    public static NutMap s(String msg, NutMap data) {
        return json(200, msg, data);
    }

    public static NutMap s(String msg, ArrayList data) {
        return json(200, msg, data);
    }

    public static NutMap s(String msg) {
        return json(200, msg, (NutMap) null);
    }

    public static NutMap s(NutMap data) {
        return json(200, "success", data);
    }

    public static NutMap e(int code, String msg, NutMap data) {
        return json(400 + code, msg, data);
    }

    public static NutMap e(int code, String msg, ArrayList data) {
        return json(400 + code, msg, data);
    }

    public static NutMap e(int code, String msg) {
        return e(code, msg, (NutMap) null);
    }

    public static NutMap e(String msg, NutMap data) {
        return e(0, msg, data);
    }

    public static NutMap e(String msg, ArrayList data) {
        return e(0, msg, data);
    }

    public static NutMap e(String msg) {
        return e(msg, (NutMap) null);
    }
}