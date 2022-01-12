package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005finfor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>TravelNow</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/customer.css\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("      integrity=\"sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("    <script src=\"/js/support.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"detail\">\n");
      out.write("      <h1>Finish Order</h1>\n");
      out.write("      <div class=\"card-detail\">\n");
      out.write("\n");
      out.write("        <div class=\"detail-right\">\n");
      out.write("          <div class=\"detail-right-top\">\n");
      out.write("            <h2>Fill Your Information</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"detail-right-content\">\n");
      out.write("              <form action=\"customerInfor\" method=\"post\">\n");
      out.write("                  \n");
      out.write("                  <table>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>CMND :</th>\n");
      out.write("                      <td><input type=\"text\" name=\"customerId\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Full Name : </th>\n");
      out.write("                      <td><input type=\"text\" name=\"cusName\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Address</th>\n");
      out.write("                      <td>\n");
      out.write("                        \n");
      out.write("                        <input type=\"text\" name=\"address\" required />\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Phone : </th>\n");
      out.write("                      <td><input type=\"number\" name=\"phone\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("              \n");
      out.write("                  </table>\n");
      out.write("                  \n");
      out.write("                  <div class=\"detail-bottom\">           \n");
      out.write("                      <button\n");
      out.write("                      class=\"item login\"\n");
      out.write("                      id=\"next\"\n");
      out.write("                      type=\"submit\"\n");
      out.write("                      >\n");
      out.write("                      Next\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                  </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
