package mejshukeji.com.servlet02;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 解决中文乱码的三句话
		// 请求对像的字符集编码
		request.setCharacterEncoding("utf-8");
		// 响应对像的字符集编码
		response.setCharacterEncoding("utf-8");
		// 设置响应对像响应到客户端浏览器，浏 览器选择以哪种编码来显示
		response.setContentType(" text/html;charset=UTF-8");
		
		//表示过滤器链继续向下，这句话之前处理请求，这句话之后处理响应
		chain.doFilter(request, response);
		
		// 解决中文乱码的三句话
		// 请求对像的字符集编码
		request.setCharacterEncoding("utf-8");
		// 响应对像的字符集编码
		response.setCharacterEncoding("utf-8");
		// 设置响应对像响应到客户端浏览器，浏 览器选择以哪种编码来显示
		response.setContentType(" text/html;charset=UTF-8");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
