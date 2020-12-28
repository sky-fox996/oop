package edu.nf.demo2;

/**
 * @author wangl
 * @date 2020/11/20
 */
@WebFilter(order = 1)
public class FilterA implements Filter {

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("FilterA处理请求...");
        //FilterChain放行，将req和resp转到下一个过滤器中
        chain.doExecute(req, resp);
    }
}
