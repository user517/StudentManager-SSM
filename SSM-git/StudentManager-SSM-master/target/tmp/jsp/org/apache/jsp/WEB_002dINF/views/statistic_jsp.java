/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-12-10 03:41:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class statistic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/echarts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <style>\r\n");
      out.write("body{\r\n");
      out.write("\r\n");
      out.write("background-position: center center;\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */\r\n");
      out.write("    background-attachment: fixed;  //此条属性必须设置否则可能无效/\r\n");
      out.write("    /* 让背景图基于容器大小伸缩 */\r\n");
      out.write("   background-size: cover;\r\n");
      out.write("   /* 设置背景颜色，背景图加载过程中会显示背景色 */\r\n");
      out.write("   background-color:\t#E6E6FA;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"clickButton()\">\r\n");
      out.write("<div id=\"main\" style=\"width:600px;height:400px;\"></div>\r\n");
      out.write("<input id=\"button\" type=\"button\" value=\"显示信息\">\r\n");
      out.write("  <a href=\"/index.jsp\">\r\n");
      out.write("    <button  class=\"btn btn-sucess\">返回主页面</button>\r\n");
      out.write("   </a>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function clickButton(){\r\n");
      out.write("\tvar button=document.getElementById('button');\r\n");
      out.write("\tbutton.click();\r\n");
      out.write("}\r\n");
      out.write("var prod1;\r\n");
      out.write("var prod2;\r\n");
      out.write("var prod3;\r\n");
      out.write("var prod4;\r\n");
      out.write("$(function(){\r\n");
      out.write("    $(\"input:button\").on(\"click\",function(){\r\n");
      out.write("        \r\n");
      out.write("        $.ajax({\r\n");
      out.write("           type: \"POST\",\r\n");
      out.write("           url: \"/getAll\",\r\n");
      out.write("           dataType: \"json\",\r\n");
      out.write("           success: function(data){  \r\n");
      out.write("               /* $.each(data,function(){\r\n");
      out.write("                    prod1 = this.prod1;\r\n");
      out.write("                    prod2 = this.prod2;\r\n");
      out.write("                    prod3 = this.prod3;\r\n");
      out.write("                    prod4 = this.prod4;    \r\n");
      out.write("                   \r\n");
      out.write("               }); */\r\n");
      out.write("               var x1 = data[0].year;\r\n");
      out.write("               var x2 = data[1].year;\r\n");
      out.write("               var  x3 = data[2].year;\r\n");
      out.write("               var  x4 = data[3].year;\r\n");
      out.write("                var y1 = data[0].count;\r\n");
      out.write("                var y2 = data[1].count;\r\n");
      out.write("                var  y3 = data[2].count;\r\n");
      out.write("                var y4 = data[3].count;\r\n");
      out.write("               //基于准备好的dom，初始化echarts实例\r\n");
      out.write("                var myChart = echarts.init(document.getElementById('main'),'light');\r\n");
      out.write("                //指定图标的配置和数据\r\n");
      out.write("                var option = {\r\n");
      out.write("                        //设置全局调色板\r\n");
      out.write("                        //color: [‘#c23531‘,‘#2f4554‘, ‘#61a0a8‘, ‘#d48265‘, ‘#91c7ae‘,‘#749f83‘,  ‘#ca8622‘, ‘#bda29a‘,‘#6e7074‘, ‘#546570‘, ‘#c4ccd3‘],\r\n");
      out.write("                        title : {text:'历年学生变化人数情况'},\r\n");
      out.write("                        tooltip:{},\r\n");
      out.write("                        legend:{\r\n");
      out.write("                            data:['销量']\r\n");
      out.write("                        },\r\n");
      out.write("                        xAxis:{data:[x1,x2,x3,x4]},\r\n");
      out.write("                        yAxis:{},\r\n");
      out.write("                        series:[{name:'学生人数',type:'bar',\r\n");
      out.write("                            //此系列自己的调色板\r\n");
      out.write("                            //color: [‘#c23531‘,‘#2f4554‘, ‘#61a0a8‘, ‘#d48265‘, ‘#91c7ae‘,‘#749f83‘,  ‘#ca8622‘, ‘#bda29a‘,‘#6e7074‘, ‘#546570‘, ‘#c4ccd3‘],\r\n");
      out.write("                            data:[y1,y2,y3,y4]}]\r\n");
      out.write("                };\r\n");
      out.write("                //使用刚指定的配置项和数据显示图标\r\n");
      out.write("                myChart.setOption(option);\r\n");
      out.write("           }\r\n");
      out.write("        });\r\n");
      out.write("    });    \r\n");
      out.write("});\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
