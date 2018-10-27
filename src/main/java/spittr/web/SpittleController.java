package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spittr.data.SpittleRepository;
import spittr.Spittle;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam("max") long max,
                                  @RequestParam(value="count",defaultValue = "20") int count) {
        return spittleRepository.findSpittles(Long.MAX_VALUE,20);
    }

    @RequestMapping(value="/{spittleId}",method=RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId,
                          Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveSpittle(SpittleForm form,Model model) {
        spittleRepository.save(new Spittle(form.getMessage(),new Date(),
                form.getLongitude(),form.getLatitude()));
        return "redirect:/spittles";
    }

}