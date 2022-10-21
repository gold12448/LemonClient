package clientkit;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Gui;
import net.lax1dude.eaglercraft.TextureLocation;

public class GuiItem extends Gui {
    public final static Minecraft mc = Minecraft.getMinecraft();
    public int x;
    public int y;
    public int itemid;
    public int itemamt;
    public int itemname;
    public GuiItem(int x, int y, int itemid) {
        this.x = x;
        this.y = y;
        this.itemid = itemid;
        this.itemamt = 0;
    }
    public void draw() {
        this.mc.renderEngine.bindTexture(this.texture);
        // draw item icon and item count if the player has the item in their inventory
        this.drawTexturedModalRect(this.x, this.y, 0, 0, 16, 16);
        this.drawCenteredString(this.fontRenderer, "0", this.x + 8, this.y + 8, 0xFFFFFF);
        // update the item count every tick if they have the item
        while (minecraft.isRunning()) {
            if (!minecraft.isGamePaused()) {
                // check if player has the item in their inventory
                // if they do, update the item count
                if (mc.thePlayer.inventory.hasItem(this.itemid)) {
                    // get the item count
                    this.itemamt = mc.thePlayer.inventory.getInventoryItemCount(this.itemid);
                    this.drawCenteredString(this.fontRenderer, this.itemamt, this.x + 8, this.y + 8, 0xFFFFFF);
                } else {
                    this.drawCenteredString(this.fontRenderer, "0", this.x + 8, this.y + 8, 0xFFFFFF);
                }
            }
        }
    }
}
