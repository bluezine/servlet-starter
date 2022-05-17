package kr.co.bluezine.web;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 6713314972003278872L;
	private final String MODIFY = "1";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer out = new StringBuffer();
		out.append("{");
		out.append("\"timestamp\":");
		out.append("\"" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\"");
		out.append(",");
		out.append("\"value\":\"" + MODIFY + "\"");
		out.append("}");
		resp.addHeader("Content-Type", "application/json;charset=utf-8");
		resp.getWriter().print(out.toString());
	}
}
