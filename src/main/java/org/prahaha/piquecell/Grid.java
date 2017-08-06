package org.prahaha.piquecell;

public class Grid {

    private final Point origin;
    private final Cell[][] cells;

    public Grid(Point origin, Cell[][] cells) {
        this.origin = origin;
        this.cells = cells;
    }

    public Point getOrigin() {
        return origin;
    }

    public Cell[][] getCells() {
        return cells;
    }
}
