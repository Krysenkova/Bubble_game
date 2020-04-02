package com.example.bubblegame;

public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
