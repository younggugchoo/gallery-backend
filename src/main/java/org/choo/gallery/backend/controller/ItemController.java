package org.choo.gallery.backend.controller;

import org.choo.gallery.backend.entity.Item;
import org.choo.gallery.backend.repostory.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItems(){

        //aaasdfsdafas
        return itemRepository.findAll();
        //return items;

    }
}
