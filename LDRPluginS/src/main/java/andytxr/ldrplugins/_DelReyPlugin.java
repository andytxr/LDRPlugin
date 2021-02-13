package andytxr.ldrplugins;

import org.bukkit.plugin.java.JavaPlugin;

    public final class _DelReyPlugin extends JavaPlugin
    {

         PlayerListening playerListening = new PlayerListening();
         PlayerNightmare playerNightmare = new PlayerNightmare();
         PlayerCursed playerCursed = new PlayerCursed();

         @Override
         public void onEnable(){
             getLogger().info("O plugin LDRPlugin Spigot foi carregado com sucesso!");
             getServer().getPluginManager().registerEvents(playerListening, this);
             getServer().getPluginManager().registerEvents(playerNightmare, this);
             getServer().getPluginManager().registerEvents(playerCursed, this);
             getCommand("albums").setExecutor(new CommandAlbums());
             getCommand("bencao").setExecutor(new CommandBlessed());
             getCommand("randomlocal").setExecutor(new CommandLocation());
         }

         public void onDisable(){
                getLogger().info("O plugin LDRPlugin Spigot foi descarregado com sucesso!");
         }

    }






