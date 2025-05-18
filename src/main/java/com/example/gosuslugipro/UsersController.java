package com.example.gosuslugipro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
public class UsersController {
    @Autowired
    private UsersService service;
    @GetMapping("/test")
    public String test(Model model) {return "appointment";}
    @RequestMapping("/") // Наша главная страница
    public String index(Model model, @Param("keyword") String keyword) {
        List<Users> listUsers = service.listAll(keyword);
        model.addAttribute("listUsers", listUsers);
        model.addAttribute("keyword", keyword);
        return "index";}
    @RequestMapping("/passport-appointment")
    public String passportAppointment(Model model) {
        model.addAttribute("service", "Получение паспорта");
        model.addAttribute("date", "22 мая 2025 г.");
        model.addAttribute("time", "10:00");
        model.addAttribute("address", "ул. Пушкина, д. 1, г. Москва");
        return "appointment";}
    @RequestMapping("/car-registration")
    public String carRegistration(Model model) {
        model.addAttribute("service", "Регистрация автомобиля");
        model.addAttribute("date", "21 апреля 2025 г.");
        model.addAttribute("time", "11:30");
        model.addAttribute("address", "ул. Лермонтова, д. 2, г. Москва");
        return "appointment";}
    @RequestMapping("/license-appointment")
    public String licenseAppointment(Model model) {
        model.addAttribute("service", "Выдача водительских прав");
        model.addAttribute("date", "17 мая 2025 г.");
        model.addAttribute("time", "12:00");
        model.addAttribute("address", "ул. Есенина, д. 3, г. Москва");
        return "appointment";}}
