package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vehicalDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>TravelNow</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("<link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("      integrity=\"sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("<script src=\"js/support_vehical.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"detail\">\n");
      out.write("            <h1>Vehical Details</h1>\n");
      out.write("                <div class=\"card-detail\">\n");
      out.write("                <div class=\"detail-left\">\n");
      out.write("                    <img\n");
      out.write("                        src=\"https://interactive-examples.mdn.mozilla.net/media/cc0-images/grapefruit-slice-332-332.jpg\"\n");
      out.write("                        alt=\"\"\n");
      out.write("                        />   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail-between\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail-right\">\n");
      out.write("                    <div class=\"detail-right-top\">\n");
      out.write("                        <h2>Quar Cam Sieu To</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"detail-right-content\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Brand : </th>\n");
      out.write("                                <td>asdfasdfasdf</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Address : </th>\n");
      out.write("                                <td>asdfasdfasdf</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Price : </th>\n");
      out.write("                                <td>asdfasdfasdf\n");
      out.write("                                <input type=\"number\" id=\"price\" value=\"100\" hidden /></td></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>So Luong : </th>\n");
      out.write("                                <td>asdfasdfasdf</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Danh gia : </th>\n");
      out.write("                                <td>asdfasdfasdf</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"detail-bottom\">\n");
      out.write("                        <!-- <div class=\"detail-price\">Price : </div>\n");
      out.write("                        <div class=\"detail-price2\">$1000</div>\n");
      out.write("                        <a href=\"#\" class=\"book-now\">Book now</a> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form class=\"buy-form\" action=\"\">\n");
      out.write("                            So Luong : <i class=\"fa fa-minus\" onclick=\"plusMinus(-1)\"></i>\n");
      out.write("                            <input type=\"number\" id=\"soluong\" name=\"soluong\" placeholder=\"Nhap so luong\" value=\"0\" min=\"0\" max=\"100\" onchange=\"countPrice()\" >\n");
      out.write("                            <i class=\"fa fa-plus\" onclick=\"plusMinus(1)\"></i>\n");
      out.write("\n");
      out.write("                            <div id=\"price\">0 VND</div>\n");
      out.write("                            <button class=\"item login\" id=\"next\" type=\"submit\" disabled>Next</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
