package edu.nf.demo2;

/**
 * @author wangl
 * @date 2020/11/20
 */
@WebFilter(order = 2)
public class FilterB implements Filter {

    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("FilterB处理请求...");
        //放行
        chain.doExecute(req, resp);
    }
}
