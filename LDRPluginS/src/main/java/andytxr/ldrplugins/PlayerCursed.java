package andytxr.ldrplugins;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.potion.PotionEffectType;

public class PlayerCursed implements Listener {

    @EventHandler
    public void onPlayerCL(PlayerLevelChangeEvent event)
    {

        if(event.getPlayer().getLevel()>30)
        {
            event.getPlayer().sendMessage(ChatColor.RED+"Voce foi amaldicoado!");
            event.getPlayer().addPotionEffect(PotionEffectType.WITHER.createEffect(600, 1));
            event.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE+"Lana diz:"+ChatColor.AQUA+" Sempre leve um balde de leite por ai, voce nao sabe o que pode acontecer.");
        }

    }

    @EventHandler
    public void onPlayerCW(PlayerChangedWorldEvent event)
    {

        event.getPlayer().sendMessage(ChatColor.DARK_PURPLE+"Um estado de confusao assola voce apos ter utilizado o portal.");
        event.getPlayer().addPotionEffect(PotionEffectType.CONFUSION.createEffect(1000,2));
        event.getPlayer().addPotionEffect(PotionEffectType.BLINDNESS.createEffect(1000,3));
        event.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE+"Lana te abencoa e instaura uma aura de protecao temporaria em voce.");
        event.getPlayer().addPotionEffect(PotionEffectType.REGENERATION.createEffect(2000,0));

    }

}
