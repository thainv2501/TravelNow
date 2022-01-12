package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>TravelNow</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admincss.css\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <nav class=\"menu-top\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("          <img class=\"LogoTN\" src=\"images/LogoTN.jpg\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu-top-right\">Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.account}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <a href=\"login.jsp\">log Out</a>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("     \n");
      out.write("      <div class=\"all-option\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <img\n");
      out.write("            src=\"https://c8.alamy.com/comp/P994DY/vector-3d-realistic-travel-and-tour-creative-poster-design-with-realistic-airplane-world-map-passport-and-air-tickets-with-palm-tree-leaf-P994DY.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("            />\n");
      out.write("          <div class=\"card-content\">\n");
      out.write("          <div class=\"card-top\">\n");
      out.write("          \n");
      out.write("          <h4>Tours</h4>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("            <div class=\"card-bottom\">\n");
      out.write("              \n");
      out.write("              <a href=\"#\" class=\"setting\">Setting</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
