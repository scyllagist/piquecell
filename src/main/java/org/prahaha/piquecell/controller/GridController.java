package org.prahaha.piquecell.controller;

import org.prahaha.piquecell.Grid;
import org.prahaha.piquecell.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grid")
public class GridController {

    @RequestMapping("/load")
    public GridResponse load() {
        return new GridResponse(new Grid(), new User());
    }

    @RequestMapping("/occupy")
    public GridResponse occupy() {
        return new GridResponse(new Grid(), new User());
    }
}
