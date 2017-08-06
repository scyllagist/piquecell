package org.prahaha.piquecell.controller;

import org.prahaha.piquecell.Cell;
import org.prahaha.piquecell.Grid;
import org.prahaha.piquecell.Point;
import org.prahaha.piquecell.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grid")
public class GridController {

    @RequestMapping("/load")
    public GridResponse load() {
        return new GridResponse(new Grid(new Point(0, 0), new Cell[][]{}), new User(1, "John"));
    }

    @RequestMapping("/occupy")
    public GridResponse occupy() {
        return new GridResponse(new Grid(new Point(0, 0), new Cell[][]{}), new User(1, "John"));
    }
}
