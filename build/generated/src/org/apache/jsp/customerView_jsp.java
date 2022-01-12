package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/customerView.css\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"hot-places\">\n");
      out.write("        <h1>Travel Tutorial</h1>\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <div>\n");
      out.write("            <img\n");
      out.write("              src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orders.place_img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("              alt=\"\"\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <div class=\"card-top\">\n");
      out.write("              <h4>VinWonders Nam Hội An</h4>\n");
      out.write("              <div class=\"card-description\">\n");
      out.write("                 <table>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>Brand :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                    <th>Brand :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                    <th>Brand :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                    <th>Brand :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>Address :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>Price :</th>\n");
      out.write("                    <td>\n");
      out.write("                      100\n");
      out.write("                      <input\n");
      out.write("                        type=\"number\"\n");
      out.write("                        id=\"hotel_price\"\n");
      out.write("                        value=\"100\"\n");
      out.write("                        hidden\n");
      out.write("                      />\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>So Luong :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>Danh gia :</th>\n");
      out.write("                    <td>asdfasdfasdf</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-bottom\"></div>\n");
      out.write("          </div>\n");
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
