package pl.javastart.Zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/toSanta")
public class SantaClausWishes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String textarea = request.getParameter("textarea");

        TextStats textStats = new TextStats();
        textStats.countSigns(textarea);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Całkowita liczba znaków to: "+textStats.countSigns(textarea)+".");
        writer.println();
        writer.println("Całkowita liczba znaków bez spacji to: "+textStats.countSignsWoBlanks(textarea)+".");
        writer.println();
        writer.println("Całkowita liczba wyrazów to: "+textStats.countWords(textarea)+".");
        writer.println();
        writer.println(textStats.isPalindrome(textarea));
    }
}
