package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import spittr.data.*;

import javax.validation.Valid;
import spittr.Spitter;

import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpitterController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }

    @RequestMapping(value="/register",method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "register",method = POST)
    public String processRegistration(@RequestPart("profilePicture") MultipartFile profilePicture,
            @Valid Spitter spitter, Errors errors) throws IOException {
        if(errors.hasErrors()){
            return "registerForm";
        }
        profilePicture.transferTo(new File("data/spittr/"+profilePicture.getOriginalFilename()));
        spittleRepository.save(register);
        return "redirect:/spitter/"+spitter.getUsername();
    }

    @RequestMapping(value = "/{username}",method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model){
        Spitter spitter=spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}
