package com.example.dalsiapp.controllers;

import com.example.dalsiapp.dto.AssetDto;
import com.example.dalsiapp.entities.AssetEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssetController {

    // metoda ktera vykresluje html

    // Chci vyvorit stranku ktera bude mit formular?

    // Ano -> Vytvorite k metode, ktera vykresluje html
    // dalsi metodu ktera bude zpracovavat data z formulare

    // /markets/1/assets
    // /markets/2/assets
    // /markets/55/assets

    @GetMapping("/markets/{marketId}/assets") // vypis vsech assetu
    public String getAssetsPage(@PathVariable("marketId") int marketId) {
//        model.addAttribute("marketId", marketId);

        return "assets";
    }

    @GetMapping("/assets/create") // vytvareni noveho assetu -> tu bude select ze ktereho si vyberu market
    public String getCreateAssetsPage(Model model) {
        var asset = new AssetEntity();
        model.addAttribute("asset", asset);

        return "assets";
    }

    @PostMapping("/assets/create") // zpracovani dat z formulare
    public String createNewAsset(@ModelAttribute("asset") AssetDto assetDto) {
        return "redirect:/assets";
    }

    // Jak se udela redirect?
    // jak bych ziskal marketId z url - "/markets/{marketId}/assets"
}
