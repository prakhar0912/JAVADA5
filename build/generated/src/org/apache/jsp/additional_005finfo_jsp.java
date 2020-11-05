package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class additional_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>\n");
      out.write("\tStudent Login\n");
      out.write("\t</title>\n");
      out.write("\t\t<style type = \"text\\css\">\n");
      out.write("\t\t\t.container{\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar{\n");
      out.write("\t\t\t\tcounter-reset: step;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li{\n");
      out.write("\t\t\t\tlist-style-type: none;\n");
      out.write("\t\t\t\tfloat: left;\n");
      out.write("\t\t\t\twidth: 25%;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li:before{\n");
      out.write("\t\t\t\tcontent: counter(step);\n");
      out.write("\t\t\t\tcounter-increment: step;\n");
      out.write("\t\t\t\twidth: 30px;\n");
      out.write("\t\t\t\theight: 30px;\n");
      out.write("\t\t\t\tline-height: 30px;\n");
      out.write("\t\t\t\tborder: 1px solid #ddd;\n");
      out.write("\t\t\t\tdisplay: block;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tmargin: 0 auto 10px auto;\n");
      out.write("\t\t\t\tborder-radius: 50%;\n");
      out.write("\t\t\t\tbackground-color: white;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li:after {\n");
      out.write("\t\t\t\tcontent: '';\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\theight: 1px;\n");
      out.write("\t\t\t\tbackground-color: #ddd;\n");
      out.write("\t\t\t\ttop: 15px;\n");
      out.write("\t\t\t\tleft: -50%;\n");
      out.write("\t\t\t\tz-index: -1;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li:first-child:after{\n");
      out.write("\t\t\t\tcontent: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li.active{\n");
      out.write("\t\t\t\tcolor: limegreen;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li.complete{\n");
      out.write("\t\t\t\tcolor: green;\n");
      out.write("\t\t\t\tborder-color: limegreen;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li.active:before{\n");
      out.write("\t\t\t\tborder-color: green;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.progressbar li.active + li:after{\n");
      out.write("\t\t\t\tborder-color: limegreen;\n");
      out.write("\t\t\t\tbackground-color: green;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class= \"container\">\n");
      out.write("\t\t<ul class= \"progressbar\">\n");
      out.write("\t\t\t<li class= \"active\"> Personal <br/> Details </li>\n");
      out.write("\t\t\t<li> Educational <br/> Information </li>\n");
      out.write("\t\t\t<li> Family <br/> Information </li>\n");
      out.write("\t\t\t<li> Additional <br/> Information </li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t&nbsp;\n");
      out.write("\t<form action= \"register\" method= \"post\" name= \"RegisterForm\">\n");
      out.write("\t<center>\n");
      out.write("\t<h1> Personal Details </h1>\n");
      out.write("\t<table cellspacing= 10 cellpadding= 5>\n");
      out.write("\t<tr><td>\n");
      out.write("\t\tFirst Name:</td><td>\n");
      out.write("\t\t<input type= \"text\" name= \"fname\" size= \"35\"/>\n");
      out.write("\t\t<tr><td>\n");
      out.write("\t\t\n");
      out.write("\t\tLast Name:</td><td>\n");
      out.write("\t\t<input type= \"text\" name= \"lname\" size= \"35\"/>\n");
      out.write("\t\t<tr><td>\n");
      out.write("\t\t\n");
      out.write("\t\tGender:</td><td>\n");
      out.write("\t\t<input type= \"radio\" name= \"gender\" value= \"Male\" /> Male\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n");
      out.write("\t\t<input type= \"radio\" name= \"gender\" value= \"Female\" /> Female\n");
      out.write("\t\t</td></tr><tr><td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\tDate of Birth:</td><td>\n");
      out.write("\t\t<select name= \"day\">\n");
      out.write("\t\t\t<option value= \"Day\"> Day</option>\n");
      out.write("\t\t\t<option value= \"Day\"> Day</option>\n");
      out.write("\t\t\t");
 for(int i=1; i<=31; i++){
      out.write("\n");
      out.write("\t\t\t<option value= \"");
out.print(i);
      out.write('"');
      out.write('>');
out.print(i);
      out.write("</option>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</select>\n");
      out.write("\t\t\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp;\n");
      out.write("\t\t\n");
      out.write("\t\t<select name= \"month\">\n");
      out.write("\t\t\t<option value= \"Month\"> Month</option>\n");
      out.write("\t\t\t");
 String string[]= {"January", "February", "March", "April", "May", "June",
								"July", "August", "September", "October", "November",
								"December"};
			for(String str:string){
				
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<option value= \"");
out.print(str);
      out.write('"');
      out.write('>');
out.print(str);
      out.write("</option>\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\t\t</select>\n");
      out.write("\t\t\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp;\n");
      out.write("\t\t\n");
      out.write("\t\t<select name= \"year\">\n");
      out.write("\t\t\t<option value= \"Year\"> Year</option>\n");
      out.write("\t\t\t");
for(int i= 2020; i>=1970; i--){
      out.write("\n");
      out.write("\t\t\t<option value= \"");
out.print(i);
      out.write('"');
      out.write('>');
out.print(i);
      out.write("</option>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</select>\n");
      out.write("\n");
      out.write("\t\t</td></tr><tr><td>\n");
      out.write("\n");
      out.write("\t\tEmail ID: </td><td>\n");
      out.write("\t\t<input type= \"text\" name= \"email\" size= \"35\" />\n");
      out.write("\t\t<tr><td>\n");
      out.write("\t\t</td></tr><tr><td>\n");
      out.write("\t\t\n");
      out.write("\t\tPassword:</td><td>\n");
      out.write("\t\t<input type= \"text\" name= \"pass\" size= \"35\"/>\n");
      out.write("\t\t<tr><td>\n");
      out.write("\t\t</td></tr><tr><td>\t\n");
      out.write("\n");
      out.write("\t\tConfirm Password:</td><td>\n");
      out.write("\t\t<input type= \"text\" name= \"cnfrmpass\" size= \"35\"/>\n");
      out.write("\t\t<tr><td>\n");
      out.write("\t\t\n");
      out.write("\t\t</td></tr><tr><td align= \"center\">\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp;\n");
      out.write("\t\t<input type= \"submit\" value= \"Save\"/></td><td>\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n");
      out.write("\t\t<input type=\"button\" name=\"nextbtn\" value=\"Next\" onclick=\"location.href='educational_details.jsp'\"/>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</center>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
