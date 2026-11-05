package com.telusko.courseapp.controller;

import com.telusko.courseapp.model.Course;
import com.telusko.courseapp.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/courses";
    }

    @GetMapping("/courses")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courselist";
    }

    @GetMapping("/courses/new")
    public String showCreateForm(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("pageTitle", "Add Course");
        return "courseform";
    }

    @PostMapping("/courses")
    public String saveCourse(@Valid @ModelAttribute("course") Course course,
                             BindingResult bindingResult,
                             Model model,
                             RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("pageTitle", course.getId() == null ? "Add Course" : "Edit Course");
            return "courseform";
        }
        courseService.saveCourse(course);
        redirectAttributes.addFlashAttribute("successMessage", "Course saved successfully.");
        return "redirect:/courses";
    }

    @GetMapping("/courses/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model,
                               RedirectAttributes redirectAttributes) {
        return courseService.getCourseById(id)
                .map(course -> {
                    model.addAttribute("course", course);
                    model.addAttribute("pageTitle", "Edit Course");
                    return "courseform";
                })
                .orElseGet(() -> {
                    redirectAttributes.addFlashAttribute("errorMessage", "Course not found.");
                    return "redirect:/courses";
                });
    }

    @PostMapping("/courses/delete/{id}")
    public String deleteCourse(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (courseService.getCourseById(id).isPresent()) {
            courseService.deleteCourse(id);
            redirectAttributes.addFlashAttribute("successMessage", "Course deleted successfully.");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "Course not found.");
        }
        return "redirect:/courses";
    }
}
