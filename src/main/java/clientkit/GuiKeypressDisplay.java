package clientkit;

import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.Gui;
import net.minecraft.src.KeyBinding;

public class GuiKeypressDisplay extends Gui {
    public int x;
    public int y;
    public String text;
    public int color;
    protected FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
    public Minecraft mc = Minecraft.getMinecraft();
    public GuiKeypressDisplay(int x, int y, String text, int color) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.color = 0x000000;
    }
    public void draw() {
        this.drawString(this.fontRenderer, this.text, this.x, this.y, this.color);
        // check if the player is holding the key every tick, and update the background color to a lighter color if they are holding it.
        while (minecraft.running == true) {
            if (!minecraft.isGamePaused == true) {
                // check if the player is holding the key
                if (KeyBinding.isKeyDown(this.key)) {
                    // draw a lighter background color than the set one
                    this.drawRect(this.x, this.y, this.x + 100, this.y + 10, 0xAAAAAA);
                } else {
                    this.drawRect(this.x, this.y, this.x + 100, this.y + 10, 0x000000);
                }
            }
        }
    }
}