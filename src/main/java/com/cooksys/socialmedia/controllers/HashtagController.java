package com.cooksys.socialmedia.controllers;

import com.cooksys.socialmedia.services.HashtagServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tags")
public class HashtagController {

    private HashtagServices hashtagServices;



    //@GetMapping("/{label}") //retrieves all  non-deleted tweets contain given hashtag



}
