package org.prahaha.piquecell.controller;

import org.prahaha.piquecell.Grid;
import org.prahaha.piquecell.User;

public class GridResponse {

    private final Grid grid;
    private final User user;

    public GridResponse(Grid grid, User user) {
        this.grid = grid;
        this.user = user;
    }

    public Grid getGrid() {
        return grid;
    }

    public User getUser() {
        return user;
    }
}
