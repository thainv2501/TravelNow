package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"/css/style.css\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <nav class=\"menu-top\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("          <img class=\"LogoTN\" src=\"/images/LogoTN.jpg\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("          <a href=\"#\">Travel Tutorial</a>\n");
      out.write("          <a href=\"#\">Travel Idea</a>\n");
      out.write("          <a href=\"#\">Create Junior</a>\n");
      out.write("          <a href=\"#\">About</a>\n");
      out.write("          <a href=\"#\">Support</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"signUp-login\">\n");
      out.write("          <a class=\"signUp\" href=\"#\">Sign Up</a>\n");
      out.write("          <a class=\"login\" href=\"#\">Login</a>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"tiltle\">\n");
      out.write("        <h1>Make a trip in a second!</h1>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"search\">\n");
      out.write("        <form action=\"\" class=\"customer selection\">\n");
      out.write("          <input class=\"item\" id=\"cus-place\" type=\"text\" placeholder=\"Where want to go \">\n");
      out.write("          <button class=\"item login\" type=\"submit\" >Let's go</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"hot-places\">\n");
      out.write("          <h1>Hot Places</h1>\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://www.dntour.vn/uploads/images/0023241_ve-vinwonders-nam-hoi-an.jpeg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>S\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://experitour.com/wp-content/uploads/2018/02/Cinque-Terre-Italy.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://experitour.com/wp-content/uploads/2018/02/Cinque-Terre-Italy.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://experitour.com/wp-content/uploads/2018/02/Cinque-Terre-Italy.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs.  Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://experitour.com/wp-content/uploads/2018/02/Cinque-Terre-Italy.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"place\">\n");
      out.write("          <img\n");
      out.write("            src=\"https://experitour.com/wp-content/uploads/2018/02/Cinque-Terre-Italy.jpg\"\n");
      out.write("            alt=\"\"\n");
      out.write("          />\n");
      out.write("          <h4>Cinque Terre</h4>\n");
      out.write("          <p class=\"description\">\n");
      out.write("            Explore the breathtaking Ligurian coast on a tour of Cinque Terre, a\n");
      out.write("            small corner of paradise divided into five villages suspended on\n");
      out.write("            steep cliffs\n");
      out.write("          </p>\n");
      out.write("          <p class=\"price\">50$ - 100$</p>\n");
      out.write("          <a href=\"#\" class=\"book-now\">Book now</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"tiltle\">\n");
      out.write("        <h4>Let make your life color full</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"contact links\">\n");
      out.write("        <h3>Social Medial</h3>\n");
      out.write("          <ul class=\"social-icon\">\n");
      out.write("            <li><span>\n");
      out.write("                <a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("            </span>\n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contact information\">\n");
      out.write("<h3>Contact for more information</h3>\n");
      out.write("<p><i class=\"fa fa-phone\"></i> 0398655613</p>\n");
      out.write("<p><i class=\"fa fa-map\">KHoi 4 Thu Thuy Cua Lo</i></p>\n");
      out.write("<p><i class=\"fa fa-envelope\">thainvhe153793@fpt.edu.vn</i></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("S\n");
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
