package clientkit;

import net.minecraft.src.Gui;

public class GuiLabel extends Gui {
    public int x;
    public int y;
    public String text;
    public int color;
    public GuiLabel(int x, int y, String text, int color) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.color = color;
    }
    public void draw() {
        this.drawString(this.fontRenderer, this.text, this.x, this.y, this.color);
    }
}