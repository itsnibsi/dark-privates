package com.darkprivates;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DarkPrivatesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DarkPrivatesPlugin.class);
		RuneLite.main(args);
	}
}