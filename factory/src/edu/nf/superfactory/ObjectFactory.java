package edu.nf.superfactory;

/**
 * @author wangl
 * @date 2020/11/17
 */
public class ObjectFactory {

    public static <T> T build(String className){
        Object instance = null;
        try {
            Class<?> clazz = Class.forName(className);
            instance = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)instance;
    }
}
