package clientkit;

import net.minecraft.client.Minecraft;
import net.minecraft.src.IconRegister;
import net.minecraft.src.ItemRecord;

public class CustomRecord extends ItemRecord {
    public final static Minecraft mc = Minecraft.getMinecraft();
    public String recordArtist;
    public String recordTitle;
    public CustomRecord(int par1, String recordArtist, String recordTitle) {
        super(par1, "wait");
        this.recordArtist = recordArtist;
        this.recordTitle = recordTitle;
    }
    public string getRecordTitle() {
        // return the record's artist and title
        return this.recordArtist + " - " + this.recordTitle;
    }
    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon("recordcustom_" + this.recordTitle);
    }
}
