package com.daniel_yc.moleculecraft.handler;

import java.io.File;

import com.daniel_yc.moleculecraft.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean configvalue = false;

	public static void init(File configfile)
	{
		//create the config object from the given config file
		if(configuration == null)
		{
		configuration = new Configuration(configfile);
		loadConfigurations();
		}
	}
	
	
	private static void loadConfigurations()
	{
		configvalue = configuration.getBoolean(Configuration.CATEGORY_GENERAL, Configuration.CATEGORY_GENERAL, false, "example");
	
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}		
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfigurations();
		}
	}

	
}
