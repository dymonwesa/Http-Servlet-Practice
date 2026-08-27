package servlet;

public class JspHelper {
    private static final String JSP_FOLDER = "/WEB-INF/jsp/";
    private static final String JSP_EXTENSION = ".jsp";

    private JspHelper() { }

    public static String getPath(String jspName) {
        return JSP_FOLDER + jspName + JSP_EXTENSION;
    }
}