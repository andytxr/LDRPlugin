package andytxr.ldrplugins;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Random;

public class PlayerListening implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {

        String[] albums = new String[] {"Born to Die", "Ultraviolence", "Honeymoon", "Lust for Life", "Norman F. Rockwell"};
        Random r = new Random();

        event.setJoinMessage(ChatColor.DARK_BLUE+"Um(a) Lanafa chamado: "+ event.getPlayer().getDisplayName()+" acabou de entrar!");
        event.getPlayer().sendMessage(ChatColor.DARK_PURPLE+"Que tal experimentar um novo album da Lana hoje? Te recomendo esse: " + albums[r.nextInt(albums.length - 1)]);

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event)
    {

        event.setQuitMessage(ChatColor.DARK_RED+"Um(a) Lanafa chamado(a): " +event.getPlayer().getDisplayName()+" acabou de sair! Que Lana o abencoe!");


    }

}
