package edu.nf.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangl
 * @date 2020/11/20
 */
public class FilterChain {

    private Iterator<Filter> iterator;

    /**
     * 下构造方法中初始化所有的过滤器，并存入集合中
     */
    public FilterChain() {
        /*List<Filter> filters = new ArrayList<>();
        filters.add(new FilterA());
        filters.add(new FilterB());
        filters.add(new FilterC());*/
        //初始化所有过滤器
        List<Filter> filters = initFilters();
        //排序
        sort(filters);
        //从集合中获取迭代器
        iterator = filters.iterator();
    }

    /**
     * 解析并初始化所有的过滤器
     */
    private List<Filter> initFilters() {
        //扫描所有的类
        List<String> classesName = ScanUtils.scanPackage();
        List<Filter> filters = new ArrayList<>();
        //循环遍历找出带有@WebFilter注解的类
        classesName.forEach(className -> {
            try {
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(WebFilter.class)) {
                    //将Filter实例化并保存到List中
                    filters.add((Filter) clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return filters;
    }

    /**
     * 排序
     *
     * @param filters
     */
    private void sort(List<Filter> filters) {
        Collections.sort(filters, (filter1, filter2) -> {
            Integer order1 = filter1.getClass().getAnnotation(WebFilter.class).order();
            Integer order2 = filter2.getClass().getAnnotation(WebFilter.class).order();
            return order1.compareTo(order2);
        });
    }

    public void doExecute(HttpServletRequest req, HttpServletResponse resp) {
        //先判断是否有下一个过滤器
        if (iterator.hasNext()) {
            //取出下一个过滤器
            Filter filter = iterator.next();
            //执行filter的doFilter方法处理请求
            //注意：每一个过滤器都需要用到FilterChain这个对象
            //因此，doFilter方法的this就是将当前对象（FilterChain）
            //传递给过滤器
            filter.doFilter(req, resp, this);
        }
    }
}
