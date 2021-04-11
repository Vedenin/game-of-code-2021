package eu.gameofcode.endgame.controllers;

import eu.gameofcode.endgame.dto.SupermarketDto;
import eu.gameofcode.endgame.dto.SupermarketsFilterDto;
import eu.gameofcode.endgame.service.SupermarketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/supermarkets")
public class SuperMarketController {

    private final SupermarketService supermarketService;
    private SupermarketsFilterDto filter = new SupermarketsFilterDto();

    public SuperMarketController(SupermarketService supermarketService) {
        this.supermarketService = supermarketService;
    }

    @GetMapping
    public String getAll(Model model) {
        List<SupermarketDto> list = supermarketService.findAll().stream()
                .filter(p -> filterItem(p, filter)).collect(Collectors.toList());
        model.addAttribute("filter", filter);
        model.addAttribute("supermarketsDto", list);
        return "supermarkets";
    }

    private static boolean filterItem(SupermarketDto supermarketDto, SupermarketsFilterDto filter) {
        String type = supermarketDto.getName().toLowerCase(Locale.ROOT);
        if(!filter.isAldi() && type.contains("aldi")) return false;
        if(!filter.isAlima() && type.contains("alima")) return false;
        if(!filter.isAuchan() && type.contains("auchan")) return false;
        if(!filter.isCactus() && type.contains("cactus")) return false;
        if(!filter.isColruyt() && type.contains("colruyt")) return false;
        if(!filter.isDelhaize() && type.contains("delhaize")) return false;
        if(!filter.isMonop() && type.contains("monop")) return false;
        if(!filter.isSmatch() && type.contains("match")) return false;
        if(!filter.isLidl() && type.contains("lidl")) return false;
        if(!filter.getKeyword().isEmpty() && !type.contains(filter.getKeyword())) return false;
        return true;
    }
    @PostMapping("/filter")
    public String getWithFilter(Model model, SupermarketsFilterDto filterDto) {
        this.filter = filterDto;
        return "redirect:/supermarkets";
    }
}
