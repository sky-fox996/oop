package edu.nf.demo2;

/**
 * @author wangl
 * @date 2020/11/20
 */
public interface Filter {

    /**
     * @param req   请求对象
     * @param resp  响应对象
     * @param chain 整个过滤链维护者，
     *              它提供一个doExecute方法，将请求放行，然后找出下一个过滤器
     *              继续处理请求
     */
    void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain);
}
