package com.example.music_library.controller;

import com.example.music_library.dto.MusicCreateDTO;
import com.example.music_library.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("")
    public String showMusic(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("music", musicService.list(PageRequest.of(page, 2)));
        return "list";
    }

    @GetMapping("/add")
    public String showAddMusic(Model model) {
        model.addAttribute("music", new MusicCreateDTO());
        return "add";
    }

    @PostMapping("/add")
    public String addMusic(@Valid @ModelAttribute MusicCreateDTO musicCreateDTO,
                           BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("music",musicCreateDTO);
            return "add";
        }
        else {
            musicService.create(musicCreateDTO);
            redirectAttributes.addFlashAttribute("msg","thêm mới thành công");
            return "redirect:/music";
        }
    }
}
