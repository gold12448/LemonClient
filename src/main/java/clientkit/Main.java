package clientkit;

import net.minecraft.client.Minecraft;

import java.util.List;

import net.minecraft.client.ClientBrandRetriever;

class Main {
    public static List customRecords = new ArrayList();
    public final static Minecraft mc = Minecraft.getMinecraft();
    public static boolean isLoadedInWorld = false;
    public static void init() {
        // set the client name to "clientkit" so that the server knows that the client is using clientkit
        ClientBrandRetriever.setClientModName("clientkit");
        // register the custom records
        for (int i = 0; i < customRecords.size(); i++) {
            CustomRecord record = (CustomRecord) customRecords.get(i);
            mc.renderEngine.registerTextureFX(record);
            // register the record to the sound manager
            mc.sndManager.addSound(record.getSoundName(), record);
        }
        // ticker that runs every gametick
        while (minecraft.running == true) {
            // check if the game is paused
            if (!minecraft.isGamePaused == true) {
                self.tick();
            }
        }
    }
    public static void tick() {
        // do stuff
    }
    public static void addCustomRecord(CustomRecord record) {
        // add a custom record to the list of custom records
        customRecords.add(record);
    }

}