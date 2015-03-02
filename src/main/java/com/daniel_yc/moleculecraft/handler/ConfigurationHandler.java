package com.daniel_yc.moleculecraft.handler;

import java.io.File;

import com.daniel_yc.moleculecraft.reference.Reference;

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
	
	@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
	public void onConfigurationChangedEvent(net.minecraftforge.fml.client.event.ConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfigurations();
		}
	}

	
}
