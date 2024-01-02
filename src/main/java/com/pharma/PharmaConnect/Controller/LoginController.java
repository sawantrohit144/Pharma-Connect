package com.pharma.PharmaConnect.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharma.PharmaConnect.Entity.Admin;
import com.pharma.PharmaConnect.Entity.User;
import com.pharma.PharmaConnect.Service.UserService;
import jakarta.servlet.http.HttpSession;


@Controller
@RestController("/api/v1/")
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public String userLogin(){
        return "user/userlogin";
    }

    @PostMapping("/user/login")
    public String userCredential(@RequestParam String email, @RequestParam String password, HttpSession session){
        User user = userService.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("user", user);
            return "redirect:/user/dashboard";
        } else {
            return "redirect:/user/login?error";
        }
    }

    @GetMapping("/user/dashboard")
    public String showUserDashboard(HttpSession session) {
        session.getAttribute("user");
        return "user/userdashboard";
    }

    @GetMapping("/user/register")
    public String userRegister(Model model){
        model.addAttribute("user", new User());
        return "user/userregister";
    }

    @PostMapping("/user/register")
    public String userRegisterCredential(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/user/register?success";
    }

    @GetMapping("/user/logout")
    public String userLogout(HttpSession session) {
        // Invalidate the session to log out the user
        session.invalidate();
        return "redirect:/user/login";
    }

    @GetMapping("/admin/login")
    public String adminLogin(){
        return "admin/adminlogin";
    }

    @GetMapping("/admin/dashboard")
    public String showAdminDashboard(HttpSession session) {
        session.getAttribute("admin");
        return "admin/admindashboard";
    }

    @PostMapping("/admin/login")
    public String adminCredential(@RequestParam String username, @RequestParam String password, HttpSession session){
        Admin admin = userService.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            session.setAttribute("admin", admin);
            return "redirect:/admin/dashboard";
        } else {
            return "redirect:/admin/login?error";
        }
    }

    @GetMapping("/admin/logout")
    public String adminLogout(HttpSession session) {
        // Invalidate the session to log out the user
        session.invalidate();
        return "redirect:/admin/login";
    }
}
