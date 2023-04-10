package com.example.book_borrowing_application.controller;

import com.example.book_borrowing_application.dto.BorrowBookCreateDTO;
import com.example.book_borrowing_application.model.BorrowBookModel;
import com.example.book_borrowing_application.service.impl.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/book")
public class ManagerBorrowController {

    @Autowired
    public BookService bookService;

    @GetMapping("")
    public String showBorrowBook(Model model) {
        model.addAttribute("book", bookService.list());
        return "list";
    }

    @GetMapping("/update/{id}")
    public String showUpdateBook(@PathVariable int id, Model model) {
        model.addAttribute("borrowBookCreateDTO", bookService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateBook(RedirectAttributes redirectAttributes,
                             @Valid @ModelAttribute BorrowBookCreateDTO borrowBookCreateDTO,
                             BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("borrowBookCreateDTO", borrowBookCreateDTO);
        } else {
            bookService.update(borrowBookCreateDTO);
            redirectAttributes.addFlashAttribute("msg", "update");
        }
        return "redirect:/book";
    }

    @GetMapping("/borrow")
    public String performBorrow (@RequestParam Integer id,Model model) {
        BorrowBookCreateDTO bookDTO = bookService.findById(id);
        bookDTO.borrow();
        bookService.update(bookDTO);
        model.addAttribute("borrowBookCreateDTO",bookDTO);
        return "redirect:/book";
    }

    @GetMapping("/giveBack")
    public String performGiveBack (@RequestParam String borrowCode, int id,
                                   RedirectAttributes redirectAttributes,Model model)  {
        BorrowBookCreateDTO bookDTO = bookService.findById(id);
        model.addAttribute("borrowBookCreateDTO", bookDTO);
        bookDTO.giveBack(borrowCode);
        bookService.update(bookDTO);
        return "redirect:/book";
    }
}
