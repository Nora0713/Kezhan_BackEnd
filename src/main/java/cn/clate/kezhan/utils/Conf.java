package cn.clate.kezhan.utils;

import org.nutz.conf.NutConf;

import java.lang.reflect.Type;

public class Conf {
    
    private static Conf mConfigInstance;
    
    public static Conf getConfig(){
        if(mConfigInstance == null){
            mConfigInstance = new Conf();
        }
        return mConfigInstance;
    }
    
    private boolean isLoaded = false;

    private void load(){
        NutConf.load("/conf/");
        isLoaded = true;
    }

    public Object get(String key){
        return get(key, null);
    }

    public Object get(String key, Type type){
        if(!isLoaded){
            load();
        }
        return NutConf.get(key, type);
    }
    
    private Conf(){
        
    }
}
