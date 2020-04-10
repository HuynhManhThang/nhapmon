package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Load;
import java.util.List;
import model.LoginBean;

public final class NewLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Edmin</title>\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("            <div class=\"navbar-inner\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\">\r\n");
      out.write("                        <i class=\"icon-reorder shaded\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"brand\" href=\"index.html\">\r\n");
      out.write("                        Admin\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav-collapse collapse navbar-inverse-collapse\">\r\n");
      out.write("                        <ul class=\"nav nav-icons\">\r\n");
      out.write("                            <li class=\"active\"><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-envelope\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            <li><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-eye-open\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            <li><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-bar-chart\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"navbar-search pull-left input-append\" action=\"#\">\r\n");
      out.write("                            <input type=\"text\" class=\"span3\">\r\n");
      out.write("                            <button class=\"btn\" type=\"button\">\r\n");
      out.write("                                <i class=\"icon-search\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"nav pull-right\">\r\n");
      out.write("<!--                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">Item No. 1</a></li>\r\n");
      out.write("\r\n");
      out.write("                                    <li><a href=\"#\">Don't Click</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li class=\"nav-header\">Example Header</li>\r\n");
      out.write("                                    <li><a href=\"#\">A Separated link</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>-->\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"showcart.jsp\">\r\n");
      out.write("                                    Giỏ hàng\r\n");
      out.write("                                </a></li>\r\n");
      out.write("<!--                            <li class=\"nav-user dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <img src=\"images/user.png\" class=\"nav-avatar\" />\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">Your Profile</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Edit Profile</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Account Settings</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">Logout</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>-->\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div><!-- /.nav-collapse -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /navbar-inner -->\r\n");
      out.write("        </div><!-- /navbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"span3\">\r\n");
      out.write("                        <div class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"widget widget-menu unstyled\">\r\n");
      out.write("                                <li class=\"active\">\r\n");
      out.write("                                    <a href=\"Trangchu.jsp\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-dashboard\"></i>\r\n");
      out.write("                                        Trang chủ\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"Thanhvien.jsp\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-bullhorn\"></i>\r\n");
      out.write("                                        Quản lý tài khoản\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"SanPham.jsp\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-inbox\"></i>\r\n");
      out.write("                                        Quản lý sản phẩm\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-tasks\"></i>\r\n");
      out.write("                                        Thông báo\r\n");
      out.write("                                        <b class=\"label orange pull-right\">19</b>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!--/.widget-nav-->\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"widget widget-menu unstyled\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"menu-icon icon-bold\"></i> </a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"menu-icon icon-book\"></i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"menu-icon icon-paste\"></i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"menu-icon icon-table\"></i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"menu-icon icon-bar-chart\"></i></a></li>\r\n");
      out.write("                            </ul><!--/.widget-nav-->\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"widget widget-menu unstyled\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"collapsed\" data-toggle=\"collapse\" href=\"#togglePages\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-cog\"></i>\r\n");
      out.write("                                        <i class=\"icon-chevron-down pull-right\"></i><i class=\"icon-chevron-up pull-right\"></i>\r\n");
      out.write("\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <ul id=\"togglePages\" class=\"collapse unstyled\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"other-login.html\">\r\n");
      out.write("                                                <i class=\"icon-inbox\"></i>\r\n");
      out.write("                                                Login\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"other-user-profile.html\">\r\n");
      out.write("                                                <i class=\"icon-inbox\"></i>\r\n");
      out.write("                                                Profile\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"other-user-listing.html\">\r\n");
      out.write("                                                <i class=\"icon-inbox\"></i>\r\n");
      out.write("                                                All Users\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"menu-icon icon-signout\"></i>\r\n");
      out.write("                                        Logout\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </div><!--/.sidebar-->\r\n");
      out.write("                    </div><!--/.span3-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"span9\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"module\">\r\n");
      out.write("                                <div class=\"module-head\">\r\n");
      out.write("                                    <button class=\"btn btn-info\" style=\"margin-left: 700px;\">\r\n");
      out.write("                                        <a href=\"NewLogin.jsp\" style=\"color: white\">Thêm thành viên</a>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"module-body table\">\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div><!--/.module-->\r\n");
      out.write("\r\n");
      out.write("                            <br />\r\n");
      out.write("\r\n");
      out.write("                        </div><!--/.content-->\r\n");
      out.write("                    </div><!--/.span9-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/.container-->\r\n");
      out.write("                 \r\n");
      out.write("        </div><!--/.wrapper-->\r\n");
      out.write("        <!-- Button trigger modal -->       \r\n");
      out.write("\r\n");
      out.write("        <!-- Modal -->     \r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <b class=\"copyright\">&copy; 2014 Edmin - EGrappler.com </b> All rights reserved.\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"scripts/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts/jquery-ui-1.10.1.custom.min.js\"></script>\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"scripts/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("<!--        <script>\r\n");
      out.write("                                                        $(document).ready(function () {\r\n");
      out.write("                                                            $('.datatable-1').dataTable();\r\n");
      out.write("                                                            $('.dataTables_paginate').addClass(\"btn-group datatable-pagination\");\r\n");
      out.write("                                                            $('.dataTables_paginate > a').wrapInner('<span />');\r\n");
      out.write("                                                            $('.dataTables_paginate > a:first-child').append('<i class=\"icon-chevron-left shaded\"></i>');\r\n");
      out.write("                                                            $('.dataTables_paginate > a:last-child').append('<i class=\"icon-chevron-right shaded\"></i>');\r\n");
      out.write("                                                        });\r\n");
      out.write("        </script>-->\r\n");
      out.write("    </body>\r\n");
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
