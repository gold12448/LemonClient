package net.minecraft.client;

public class ClientBrandRetriever {
	private static String clientModName = "eaglercraft";
	public static String getClientModName() {
		return clientModName;
	}
	public static void setClientModName(String par0Str) {
		clientModName = par0Str;
	}
}
